package ke.ac.mku.authcore.security.crypto

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.crypto.EncryptedData
import ke.ac.mku.authcore.contracts.crypto.HashAlgorithm
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.crypto.KeyMetadata
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.audit.SecurityEvent
import java.nio.ByteBuffer
import java.security.*
import java.security.cert.Certificate
import javax.crypto.*
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CryptoManager - SECURITY-002
 *
 * Central cryptographic services using Android KeyStore.
 * Hardened with retry, recovery and software fallback logic for transient Keystore failures.
 */
@Singleton
class CryptoManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val auditLogger: SecurityAuditLogger,
    private val eventBus: EventBus
) : ICryptoManager {

    companion object {
        private const val TAG = "CryptoManager"
        private const val ANDROID_KEYSTORE = "AndroidKeyStore"
        private const val GCM_TAG_LENGTH = 128
        private const val AES_KEY_SIZE = 256
        private const val MAX_RETRIES = 3
    }

    private var keyStore: KeyStore? = null
    private val keyMetadata = mutableMapOf<KeyAlias, KeyMetadata>()
    private var isSoftwareFallbackActive = false

    init {
        try {
            loadKeyStore()
            initializeKeyMetadata()
            Log.i(TAG, "CryptoManager initialized successfully with Hardware support.")
        } catch (e: Exception) {
            Log.e(TAG, "Initial Keystore load failed, attempting recovery: ${e.message}")
            recoverKeystore()
        } finally {
            // Signal readiness regardless of hardware/software status to unblock platform
            eventBus.publish(BootstrapEvent.CryptoManagerReady)
        }
    }

    private fun loadKeyStore() {
        keyStore = KeyStore.getInstance(ANDROID_KEYSTORE).apply {
            load(null)
        }
    }

    private fun initializeKeyMetadata() {
        val ks = keyStore ?: return
        KeyAlias.entries.forEach { alias ->
            val ksAlias = alias.toKeyStoreAlias()
            if (ks.containsAlias(ksAlias)) {
                try {
                    val entry = ks.getEntry(ksAlias, null)
                    val creationDate = System.currentTimeMillis()
                    keyMetadata[alias] = KeyMetadata(
                        alias = alias,
                        createdAt = creationDate,
                        lastRotated = creationDate,
                        rotationCount = 0,
                        isHardwareBacked = isKeyHardwareBacked(alias)
                    )
                } catch (e: Exception) {
                    Log.w(TAG, "Could not read metadata for ${alias.name}: ${e.message}")
                }
            }
        }
    }

    private fun recoverKeystore() {
        Log.i(TAG, "Attempting Keystore recovery...")
        try {
            loadKeyStore()
            eventBus.publish(BootstrapEvent.KeystoreRecovered)
            Log.i(TAG, "Keystore recovered successfully.")
            isSoftwareFallbackActive = false
        } catch (e: Exception) {
            Log.e(TAG, "Keystore recovery failed, activating software fallback: ${e.message}")
            isSoftwareFallbackActive = true
            eventBus.publish(BootstrapEvent.KeystoreRecoveryFailed(e.message ?: "Unknown recovery error"))
        }
    }

    private fun <T> withRetry(action: () -> T): T {
        if (isSoftwareFallbackActive) return action()

        for (attempt in 1..MAX_RETRIES) {
            try {
                if (keyStore == null) loadKeyStore()
                return action()
            } catch (e: Exception) {
                Log.w(TAG, "Keystore operation failed (attempt $attempt/$MAX_RETRIES): ${e.message}")
                eventBus.publish(BootstrapEvent.KeystoreOperationRetried(attempt))
                
                if (attempt < MAX_RETRIES) {
                    recoverKeystore()
                    Thread.sleep(100 * attempt.toLong()) 
                }
            }
        }
        
        Log.e(TAG, "Keystore permanently failed. Switching to software fallback.")
        isSoftwareFallbackActive = true
        return action()
    }

    private fun KeyAlias.toKeyStoreAlias(): String = when (this) {
        KeyAlias.SESSION -> "mku_session_key"
        KeyAlias.COOKIE -> "mku_cookie_key"
        KeyAlias.STORAGE -> "mku_storage_key"
        KeyAlias.SIGNATURE -> "mku_signature_key"
        KeyAlias.HMAC -> "mku_hmac_key"
    }

    private fun getOrCreateKey(alias: KeyAlias): Key = withRetry {
        if (isSoftwareFallbackActive) return@withRetry getSoftwareKey(alias)

        val ks = keyStore ?: throw IllegalStateException("Keystore not available")
        val ksAlias = alias.toKeyStoreAlias()
        return@withRetry if (ks.containsAlias(ksAlias)) {
            ks.getKey(ksAlias, null)
        } else {
            generateKey(alias)
        }
    }

    private fun getSoftwareKey(alias: KeyAlias): Key {
        val seed = (context.packageName + alias.name).toByteArray()
        return SecretKeySpec(seed.copyOf(32), "AES")
    }

    private fun generateKey(alias: KeyAlias): SecretKey {
        val ksAlias = alias.toKeyStoreAlias()
        val keyGenerator = KeyGenerator.getInstance(
            KeyProperties.KEY_ALGORITHM_AES,
            ANDROID_KEYSTORE
        )

        val builder = KeyGenParameterSpec.Builder(
            ksAlias,
            KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
        )
            .setKeySize(AES_KEY_SIZE)
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
            .setRandomizedEncryptionRequired(true)

        keyGenerator.init(builder.build())
        val key = keyGenerator.generateKey()

        val now = System.currentTimeMillis()
        keyMetadata[alias] = KeyMetadata(alias, now, now, 0, true)
        auditLogger.logSecurityEvent(SecurityEvent.KeyGenerated(ksAlias, "AES-256-GCM"))
        return key
    }

    private fun isKeyHardwareBacked(alias: KeyAlias): Boolean {
        return try {
            val ksAlias = alias.toKeyStoreAlias()
            keyStore?.containsAlias(ksAlias) ?: false
        } catch (e: Exception) {
            false
        }
    }

    // --- ICryptoManager Implementation ---

    override fun encrypt(plaintext: ByteArray, keyAlias: KeyAlias): EncryptedData = withRetry {
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, getOrCreateKey(keyAlias))
        EncryptedData(ciphertext = cipher.doFinal(plaintext), iv = cipher.iv)
    }

    override fun decrypt(encrypted: EncryptedData, keyAlias: KeyAlias): ByteArray = withRetry {
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        val spec = GCMParameterSpec(GCM_TAG_LENGTH, encrypted.iv)
        cipher.init(Cipher.DECRYPT_MODE, getOrCreateKey(keyAlias), spec)
        cipher.doFinal(encrypted.ciphertext)
    }

    override fun encryptString(plaintext: String, keyAlias: KeyAlias): String {
        return encodeEncryptedData(encrypt(plaintext.toByteArray(Charsets.UTF_8), keyAlias))
    }

    override fun decryptString(encoded: String, keyAlias: KeyAlias): String {
        val encrypted = decodeEncryptedData(encoded)
        return String(decrypt(encrypted, keyAlias), Charsets.UTF_8)
    }

    override fun hash(data: String, algorithm: HashAlgorithm): String {
        val digest = MessageDigest.getInstance(algorithm.name)
        return Base64.encodeToString(digest.digest(data.toByteArray(Charsets.UTF_8)), Base64.NO_WRAP)
    }

    override fun verifyHash(data: String, hash: String, algorithm: HashAlgorithm): Boolean = hash(data, algorithm) == hash

    override fun generateHmac(data: ByteArray, keyAlias: KeyAlias): ByteArray = withRetry {
        val mac = Mac.getInstance("HmacSHA256")
        val key = getOrCreateKey(keyAlias)
        mac.init(key)
        mac.doFinal(data)
    }

    override fun generateStringHmac(data: String, keyAlias: KeyAlias): String {
        return Base64.encodeToString(generateHmac(data.toByteArray(Charsets.UTF_8), keyAlias), Base64.NO_WRAP)
    }

    override fun verifyHmac(data: ByteArray, expectedHmac: ByteArray, keyAlias: KeyAlias): Boolean = generateHmac(data, keyAlias).contentEquals(expectedHmac)

    override fun verifyStringHmac(data: String, expectedHmac: String, keyAlias: KeyAlias): Boolean = generateStringHmac(data, keyAlias) == expectedHmac

    override fun sign(data: ByteArray, keyAlias: KeyAlias): ByteArray = withRetry {
        if (isSoftwareFallbackActive) throw SecurityException("Signatures not supported in software fallback")
        val ksAlias = keyAlias.toKeyStoreAlias()
        val privateKey = keyStore?.getKey(ksAlias, null) as? PrivateKey ?: throw SecurityException("Private key missing")
        val signature = Signature.getInstance("SHA256withRSA/PSS")
        signature.initSign(privateKey)
        signature.update(data)
        signature.sign()
    }

    override fun verifySignature(data: ByteArray, signature: ByteArray, keyAlias: KeyAlias): Boolean = withRetry {
        if (isSoftwareFallbackActive) return@withRetry false
        val ksAlias = keyAlias.toKeyStoreAlias()
        val cert = keyStore?.getCertificate(ksAlias) ?: throw SecurityException("Cert missing")
        val sig = Signature.getInstance("SHA256withRSA/PSS")
        sig.initVerify(cert.publicKey)
        sig.update(data)
        sig.verify(signature)
    }

    override fun generateSecureRandom(length: Int): ByteArray {
        val bytes = ByteArray(length)
        SecureRandom().nextBytes(bytes)
        return bytes
    }

    override fun rotateKey(keyAlias: KeyAlias): Boolean = withRetry {
        if (isSoftwareFallbackActive) return@withRetry false
        val ksAlias = keyAlias.toKeyStoreAlias()
        if (keyStore?.containsAlias(ksAlias) == true) keyStore?.deleteEntry(ksAlias)
        generateKey(keyAlias)
        true
    }

    override fun isKeyValid(keyAlias: KeyAlias): Boolean = withRetry { 
        if (isSoftwareFallbackActive) return@withRetry true
        keyStore?.containsAlias(keyAlias.toKeyStoreAlias()) ?: false 
    }

    override fun getKeyMetadata(keyAlias: KeyAlias): KeyMetadata? = keyMetadata[keyAlias]

    override fun getAllKeyMetadata(): List<KeyMetadata> = keyMetadata.values.toList()

    override fun isHardwareBacked(keyAlias: KeyAlias): Boolean = !isSoftwareFallbackActive && (keyMetadata[keyAlias]?.isHardwareBacked ?: false)

    override fun encodeEncryptedData(encrypted: EncryptedData): String {
        val bytes = ByteBuffer.allocate(4 + encrypted.iv.size + encrypted.ciphertext.size)
            .putInt(encrypted.iv.size).put(encrypted.iv).put(encrypted.ciphertext).array()
        return Base64.encodeToString(bytes, Base64.NO_WRAP)
    }

    override fun decodeEncryptedData(encoded: String): EncryptedData {
        val bytes = Base64.decode(encoded, Base64.NO_WRAP)
        val buffer = ByteBuffer.wrap(bytes)
        val ivSize = buffer.int
        val iv = ByteArray(ivSize)
        val cipher = ByteArray(bytes.size - 4 - ivSize)
        buffer.get(iv).get(cipher)
        return EncryptedData(cipher, iv)
    }
}
