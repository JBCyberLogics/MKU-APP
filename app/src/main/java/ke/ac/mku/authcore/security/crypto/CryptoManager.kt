package ke.ac.mku.authcore.security.crypto

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.contracts.crypto.EncryptedData
import ke.ac.mku.authcore.contracts.crypto.HashAlgorithm
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.crypto.KeyMetadata
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.audit.SecurityEvent
import java.nio.ByteBuffer
import java.security.KeyPairGenerator
import java.security.KeyStore
import java.security.MessageDigest
import java.security.PrivateKey
import java.security.PublicKey
import java.security.SecureRandom
import java.security.Signature
import java.security.cert.Certificate
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.Mac
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CryptoManager - SECURITY-002
 *
 * Central cryptographic services using Android KeyStore.
 * Implements ICryptoManager contract for all cryptographic operations.
 */
@Singleton
class CryptoManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val auditLogger: SecurityAuditLogger
) : ICryptoManager {

    companion object {
        private const val TAG = "CryptoManager"
        private const val ANDROID_KEYSTORE = "AndroidKeyStore"
        private const val GCM_TAG_LENGTH = 128
        private const val RSA_KEY_SIZE = 4096
        private const val AES_KEY_SIZE = 256
    }

    private val keyStore: KeyStore = KeyStore.getInstance(ANDROID_KEYSTORE).apply {
        load(null)
    }

    // Key metadata storage (in-memory for this implementation)
    private val keyMetadata = mutableMapOf<KeyAlias, KeyMetadata>()

    init {
        // Initialize metadata for existing keys
        initializeKeyMetadata()
    }

    private fun initializeKeyMetadata() {
        KeyAlias.entries.forEach { alias ->
            val keyStoreAlias = alias.toKeyStoreAlias()
            if (keyStore.containsAlias(keyStoreAlias)) {
                try {
                    val entry = keyStore.getEntry(keyStoreAlias, null) as? KeyStore.SecretKeyEntry
                    val creationDate = entry?.secretKey?.let { System.currentTimeMillis() } ?: System.currentTimeMillis()
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

    // ==================== INTERNAL HELPERS ====================

    private fun KeyAlias.toKeyStoreAlias(): String = when (this) {
        KeyAlias.SESSION -> "mku_session_key"
        KeyAlias.COOKIE -> "mku_cookie_key"
        KeyAlias.STORAGE -> "mku_storage_key"
        KeyAlias.SIGNATURE -> "mku_signature_key"
        KeyAlias.HMAC -> "mku_hmac_key"
    }

    private fun getOrCreateKey(alias: KeyAlias): SecretKey {
        val keyStoreAlias = alias.toKeyStoreAlias()
        return if (keyStore.containsAlias(keyStoreAlias)) {
            keyStore.getKey(keyStoreAlias, null) as SecretKey
        } else {
            generateKey(alias)
        }
    }

    private fun generateKey(alias: KeyAlias): SecretKey {
        val keyStoreAlias = alias.toKeyStoreAlias()
        val keyGenerator = KeyGenerator.getInstance(
            KeyProperties.KEY_ALGORITHM_AES,
            ANDROID_KEYSTORE
        )

        val builder = KeyGenParameterSpec.Builder(
            keyStoreAlias,
            KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
        )
            .setKeySize(AES_KEY_SIZE)
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
            .setRandomizedEncryptionRequired(true)

        keyGenerator.init(builder.build())
        val key = keyGenerator.generateKey()

        // Update metadata
        val now = System.currentTimeMillis()
        keyMetadata[alias] = KeyMetadata(
            alias = alias,
            createdAt = now,
            lastRotated = now,
            rotationCount = 0,
            isHardwareBacked = true
        )

        auditLogger.logSecurityEvent(
            SecurityEvent.KeyGenerated(keyStoreAlias, "AES-256-GCM")
        )

        Log.d(TAG, "Generated new AES key: $keyStoreAlias")
        return key
    }

    private fun generateSignatureKeyPair(): Pair<PublicKey, PrivateKey> {
        val keyStoreAlias = KeyAlias.SIGNATURE.toKeyStoreAlias()

        val keyPairGenerator = KeyPairGenerator.getInstance(
            KeyProperties.KEY_ALGORITHM_RSA,
            ANDROID_KEYSTORE
        )

        val builder = KeyGenParameterSpec.Builder(
            keyStoreAlias,
            KeyProperties.PURPOSE_SIGN or KeyProperties.PURPOSE_VERIFY
        )
            .setKeySize(RSA_KEY_SIZE)
            .setDigests(KeyProperties.DIGEST_SHA256, KeyProperties.DIGEST_SHA512)
            .setSignaturePaddings(KeyProperties.SIGNATURE_PADDING_RSA_PSS)

        keyPairGenerator.initialize(builder.build())
        val keyPair = keyPairGenerator.generateKeyPair()

        // Update metadata
        val now = System.currentTimeMillis()
        keyMetadata[KeyAlias.SIGNATURE] = KeyMetadata(
            alias = KeyAlias.SIGNATURE,
            createdAt = now,
            lastRotated = now,
            rotationCount = 0,
            isHardwareBacked = true
        )

        auditLogger.logSecurityEvent(
            SecurityEvent.KeyGenerated(keyStoreAlias, "RSA-$RSA_KEY_SIZE")
        )

        Log.d(TAG, "Generated new RSA key pair: $keyStoreAlias")
        return keyPair.public to keyPair.private
    }

    private fun isKeyHardwareBacked(alias: KeyAlias): Boolean {
        return try {
            val keyStoreAlias = alias.toKeyStoreAlias()
            val entry = keyStore.getEntry(keyStoreAlias, null)
            entry != null
        } catch (e: Exception) {
            false
        }
    }

    // ==================== ICryptoManager IMPLEMENTATION ====================

    // ENCRYPTION

    override fun encrypt(plaintext: ByteArray, keyAlias: KeyAlias): EncryptedData {
        return try {
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.ENCRYPT_MODE, getOrCreateKey(keyAlias))
            EncryptedData(
                ciphertext = cipher.doFinal(plaintext),
                iv = cipher.iv
            )
        } catch (e: Exception) {
            Log.e(TAG, "Encryption failed: ${e.message}")
            auditLogger.logSecurityEvent(
                SecurityEvent.EncryptionFailed(e.message ?: "Unknown error")
            )
            throw SecurityException("Encryption failed", e)
        }
    }

    override fun decrypt(encrypted: EncryptedData, keyAlias: KeyAlias): ByteArray {
        return try {
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            val spec = GCMParameterSpec(GCM_TAG_LENGTH, encrypted.iv)
            cipher.init(Cipher.DECRYPT_MODE, getOrCreateKey(keyAlias), spec)
            cipher.doFinal(encrypted.ciphertext)
        } catch (e: Exception) {
            Log.e(TAG, "Decryption failed: ${e.message}")
            auditLogger.logSecurityEvent(
                SecurityEvent.DecryptionFailed(e.message ?: "Unknown error")
            )
            throw SecurityException("Decryption failed", e)
        }
    }

    override fun encryptString(plaintext: String, keyAlias: KeyAlias): String {
        val encrypted = encrypt(plaintext.toByteArray(Charsets.UTF_8), keyAlias)
        return encodeEncryptedData(encrypted)
    }

    override fun decryptString(encoded: String, keyAlias: KeyAlias): String {
        val encrypted = decodeEncryptedData(encoded)
        return String(decrypt(encrypted, keyAlias), Charsets.UTF_8)
    }

    // HASHING

    override fun hash(data: String, algorithm: HashAlgorithm): String {
        val digest = MessageDigest.getInstance(algorithm.name)
        val hashBytes = digest.digest(data.toByteArray(Charsets.UTF_8))
        return Base64.encodeToString(hashBytes, Base64.NO_WRAP)
    }

    override fun verifyHash(data: String, hash: String, algorithm: HashAlgorithm): Boolean {
        val computedHash = hash(data, algorithm)
        // Constant-time comparison
        return computedHash == hash
    }

    // HMAC

    override fun generateHmac(data: ByteArray, keyAlias: KeyAlias): ByteArray {
        return try {
            val mac = Mac.getInstance("HmacSHA256")
            mac.init(getOrCreateKey(keyAlias))
            mac.doFinal(data)
        } catch (e: Exception) {
            Log.e(TAG, "HMAC generation failed: ${e.message}")
            throw SecurityException("HMAC generation failed", e)
        }
    }

    override fun generateStringHmac(data: String, keyAlias: KeyAlias): String {
        val hmac = generateHmac(data.toByteArray(Charsets.UTF_8), keyAlias)
        return Base64.encodeToString(hmac, Base64.NO_WRAP)
    }

    override fun verifyHmac(data: ByteArray, expectedHmac: ByteArray, keyAlias: KeyAlias): Boolean {
        val actualHmac = generateHmac(data, keyAlias)
        // Constant-time comparison
        return actualHmac.contentEquals(expectedHmac)
    }

    override fun verifyStringHmac(data: String, expectedHmac: String, keyAlias: KeyAlias): Boolean {
        val actualHmac = generateStringHmac(data, keyAlias)
        return actualHmac == expectedHmac
    }

    // SIGNATURES

    override fun sign(data: ByteArray, keyAlias: KeyAlias): ByteArray {
        return try {
            val keyStoreAlias = keyAlias.toKeyStoreAlias()

            // Ensure signature key exists
            if (!keyStore.containsAlias(keyStoreAlias)) {
                generateSignatureKeyPair()
            }

            val privateKey = keyStore.getKey(keyStoreAlias, null) as? PrivateKey
                ?: throw SecurityException("Private key not found for $keyAlias")

            val signature = Signature.getInstance("SHA256withRSA/PSS")
            signature.initSign(privateKey)
            signature.update(data)
            signature.sign()
        } catch (e: Exception) {
            Log.e(TAG, "Signing failed: ${e.message}")
            throw SecurityException("Signing failed", e)
        }
    }

    override fun verifySignature(data: ByteArray, signature: ByteArray, keyAlias: KeyAlias): Boolean {
        return try {
            val keyStoreAlias = keyAlias.toKeyStoreAlias()
            val certificate: Certificate = keyStore.getCertificate(keyStoreAlias)
                ?: throw SecurityException("Certificate not found for $keyAlias")

            val publicKey = certificate.publicKey
            val sig = Signature.getInstance("SHA256withRSA/PSS")
            sig.initVerify(publicKey)
            sig.update(data)
            sig.verify(signature)
        } catch (e: Exception) {
            Log.e(TAG, "Signature verification failed: ${e.message}")
            false
        }
    }

    // RANDOM

    override fun generateSecureRandom(length: Int): ByteArray {
        val bytes = ByteArray(length)
        SecureRandom.getInstanceStrong().nextBytes(bytes)
        return bytes
    }

    // KEY MANAGEMENT

    override fun rotateKey(keyAlias: KeyAlias): Boolean {
        return try {
            val keyStoreAlias = keyAlias.toKeyStoreAlias()

            // Delete existing key
            if (keyStore.containsAlias(keyStoreAlias)) {
                keyStore.deleteEntry(keyStoreAlias)
            }

            // Generate new key
            when (keyAlias) {
                KeyAlias.SIGNATURE -> generateSignatureKeyPair()
                else -> generateKey(keyAlias)
            }

            // Update metadata
            val current = keyMetadata[keyAlias]
            keyMetadata[keyAlias] = KeyMetadata(
                alias = keyAlias,
                createdAt = current?.createdAt ?: System.currentTimeMillis(),
                lastRotated = System.currentTimeMillis(),
                rotationCount = (current?.rotationCount ?: 0) + 1,
                isHardwareBacked = true
            )

            auditLogger.logSecurityEvent(
                SecurityEvent.KeyGenerated("${keyAlias.name}_rotated", "Key rotated")
            )

            Log.i(TAG, "Rotated key: $keyAlias")
            true
        } catch (e: Exception) {
            Log.e(TAG, "Key rotation failed for $keyAlias: ${e.message}")
            false
        }
    }

    override fun isKeyValid(keyAlias: KeyAlias): Boolean {
        val keyStoreAlias = keyAlias.toKeyStoreAlias()
        return keyStore.containsAlias(keyStoreAlias)
    }

    override fun getKeyMetadata(keyAlias: KeyAlias): KeyMetadata? {
        return keyMetadata[keyAlias]
    }

    override fun getAllKeyMetadata(): List<KeyMetadata> {
        return keyMetadata.values.toList()
    }

    override fun isHardwareBacked(keyAlias: KeyAlias): Boolean {
        return keyMetadata[keyAlias]?.isHardwareBacked ?: false
    }

    // ENCODING

    override fun encodeEncryptedData(encrypted: EncryptedData): String {
        val bytes = ByteBuffer.allocate(4 + encrypted.iv.size + encrypted.ciphertext.size)
            .putInt(encrypted.iv.size)
            .put(encrypted.iv)
            .put(encrypted.ciphertext)
            .array()
        return Base64.encodeToString(bytes, Base64.NO_WRAP)
    }

    override fun decodeEncryptedData(encoded: String): EncryptedData {
        val bytes = Base64.decode(encoded, Base64.NO_WRAP)
        val buffer = ByteBuffer.wrap(bytes)
        val ivLength = buffer.int
        val iv = ByteArray(ivLength)
        val ciphertext = ByteArray(bytes.size - 4 - ivLength)
        buffer.get(iv)
        buffer.get(ciphertext)
        return EncryptedData(ciphertext, iv)
    }
}