package ke.ac.mku.authcore.security.storage

import android.content.Context
import android.content.SharedPreferences
import android.util.Base64
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.storage.IntegrityStatus
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.contracts.storage.StorageHealth
import ke.ac.mku.authcore.contracts.storage.StorageMetrics
import ke.ac.mku.authcore.contracts.storage.StorageResult
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.audit.SecurityEvent
import java.nio.ByteBuffer
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SecureStorageManager - SECURITY-003
 *
 * Central secure storage service for the Authentication Platform.
 * Provides encrypted persistence, integrity verification, and secure deletion
 * for all sensitive application data.
 *
 * Architecture:
 * - Facade pattern: delegates to domain-specific storage providers
 * - EncryptedSharedPreferences for each domain
 * - ICryptoManager for encryption/decryption
 * - HMAC-SHA256 for integrity verification
 * - EventBus for publishing storage events
 */
class SecureStorageManager constructor(
    @ApplicationContext private val context: Context,
    private val cryptoManager: ICryptoManager,
    private val auditLogger: SecurityAuditLogger,
    private val eventBus: ke.ac.mku.authcore.bootstrap.EventBus
) : ISecureStorageManager {

    companion object {
        private const val TAG = "SecureStorageManager"
        private const val MASTER_KEY_ALIAS = "mku_secure_storage_master"
        private const val VALUE_PREFIX = "v_"
        private const val HMAC_PREFIX = "h_"
        private const val TIMESTAMP_PREFIX = "t_"
        private const val TTL_PREFIX = "ttl_"
        private const val KEY_SEPARATOR = "|"
    }

    // Domain-specific encrypted SharedPreferences
    private val domainStores = mutableMapOf<StorageDomain, SharedPreferences>()

    // Health metrics per domain
    private val healthMetrics = mutableMapOf<StorageDomain, DomainHealthMetrics>()

    // Initialization flag
    @Volatile
    private var isInitialized = false

    private val masterKey: MasterKey by lazy {
        MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()
    }

    init {
        initialize()
    }

    /**
     * Initialize all domain storage providers.
     */
    private fun initialize() {
        if (isInitialized) return

        try {
            // Initialize each domain storage
            StorageDomain.entries.forEach { domain ->
                initializeDomain(domain)
                healthMetrics[domain] = DomainHealthMetrics(domain)
            }

            isInitialized = true
            Log.i(TAG, "SecureStorageManager initialized with ${StorageDomain.entries.size} domains")
            eventBus.publish(BootstrapEvent.SecureStorageReady)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize SecureStorageManager: ${e.message}")
            eventBus.publish(BootstrapEvent.StorageFailure("all", "Initialization failed: ${e.message}"))
        }
    }

    private fun initializeDomain(domain: StorageDomain) {
        val prefs = EncryptedSharedPreferences.create(
            context,
            domain.prefsName,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
        domainStores[domain] = prefs
        eventBus.publish(BootstrapEvent.StorageInitialized(domain.name))
    }

    private fun getDomainStore(domain: StorageDomain): SharedPreferences {
        return domainStores[domain] ?: throw SecurityException("Storage domain not initialized: ${domain.name}")
    }

    // ==================== CORE OPERATIONS ====================

    override fun store(domain: StorageDomain, key: String, data: String): StorageResult<Boolean> {
        return try {
            val store = getDomainStore(domain)
            val timestamp = System.currentTimeMillis()

            // Encrypt the data
            val encrypted = cryptoManager.encryptString(data, KeyAlias.STORAGE)

            // Generate integrity HMAC
            val hmacData = buildIntegrityData(domain, key, timestamp, data)
            val hmac = cryptoManager.generateStringHmac(hmacData, KeyAlias.HMAC)

            // Store encrypted value, HMAC, and timestamp
            store.edit().apply {
                putString(VALUE_PREFIX + key, encrypted)
                putString(HMAC_PREFIX + key, hmac)
                putLong(TIMESTAMP_PREFIX + key, timestamp)
                if (domain.autoExpire) {
                    // TTL is set separately via storeCache
                }
                apply()
            }

            auditLogger.logSecurityEvent(
                SecurityEvent.DataStored(domain.name, key)
            )
            eventBus.publish(BootstrapEvent.DataStored(domain.name, key))

            StorageResult.success(true, integrityValid = true)
        } catch (e: Exception) {
            Log.e(TAG, "Store failed for ${domain.name}/$key: ${e.message}")
            recordWriteFailure(domain)
            auditLogger.logSecurityEvent(
                SecurityEvent.SecurityError("Store failed: ${e.message}")
            )
            eventBus.publish(BootstrapEvent.StorageFailure(domain.name, e.message ?: "Unknown error"))
            StorageResult.failure("Store failed: ${e.message}")
        }
    }

    override fun retrieve(domain: StorageDomain, key: String): StorageResult<String?> {
        return try {
            val store = getDomainStore(domain)

            // Check if key exists
            val encrypted = store.getString(VALUE_PREFIX + key, null) ?: return StorageResult.success(null)

            // Check for expiration (cache domain)
            if (domain.autoExpire) {
                val ttl = store.getLong(TTL_PREFIX + key, 0L)
                if (ttl > 0 && System.currentTimeMillis() > ttl) {
                    // Expired - delete and return null
                    delete(domain, key)
                    eventBus.publish(BootstrapEvent.CacheExpired(key, ttl))
                    return StorageResult.success(null)
                }
            }

            // Decrypt the data
            val decrypted = cryptoManager.decryptString(encrypted, KeyAlias.STORAGE)

            // Verify integrity
            val storedHmac = store.getString(HMAC_PREFIX + key, null)
            val timestamp = store.getLong(TIMESTAMP_PREFIX + key, 0L)
            val hmacData = buildIntegrityData(domain, key, timestamp, decrypted)

            val integrityValid = storedHmac?.let {
                cryptoManager.verifyStringHmac(hmacData, it, KeyAlias.HMAC)
            } ?: false

            if (!integrityValid) {
                Log.w(TAG, "Integrity check failed for ${domain.name}/$key")
                recordIntegrityFailure(domain)
                eventBus.publish(BootstrapEvent.IntegrityFailed(domain.name, key))
                return StorageResult.integrityFailure("Integrity verification failed")
            }

            eventBus.publish(BootstrapEvent.IntegrityVerified(domain.name, key))
            eventBus.publish(BootstrapEvent.DataRetrieved(domain.name, key, true))

            StorageResult.success(decrypted, integrityValid = true)
        } catch (e: Exception) {
            Log.e(TAG, "Retrieve failed for ${domain.name}/$key: ${e.message}")
            recordReadFailure(domain)
            eventBus.publish(BootstrapEvent.DataRetrieved(domain.name, key, false))
            StorageResult.failure("Retrieve failed: ${e.message}")
        }
    }

    override fun update(domain: StorageDomain, key: String, data: String): StorageResult<Boolean> {
        // Check if key exists first
        if (!exists(domain, key)) {
            return StorageResult.failure("Key does not exist: $key")
        }
        return store(domain, key, data)
    }

    override fun delete(domain: StorageDomain, key: String): StorageResult<Boolean> {
        return try {
            val store = getDomainStore(domain)

            // Secure overwrite before deletion
            val currentValue = store.getString(VALUE_PREFIX + key, null)
            if (currentValue != null) {
                // Overwrite with random data first
                val randomBytes = cryptoManager.generateSecureRandom(32)
                val randomString = Base64.encodeToString(randomBytes, Base64.NO_WRAP)
                store.edit().putString(VALUE_PREFIX + key, randomString).apply()
            }

            // Remove all keys
            store.edit().apply {
                remove(VALUE_PREFIX + key)
                remove(HMAC_PREFIX + key)
                remove(TIMESTAMP_PREFIX + key)
                remove(TTL_PREFIX + key)
                apply()
            }

            auditLogger.logSecurityEvent(
                SecurityEvent.DataDeleted(domain.name, key)
            )
            eventBus.publish(BootstrapEvent.DataDeleted(domain.name, key))

            StorageResult.success(true)
        } catch (e: Exception) {
            Log.e(TAG, "Delete failed for ${domain.name}/$key: ${e.message}")
            StorageResult.failure("Delete failed: ${e.message}")
        }
    }

    override fun exists(domain: StorageDomain, key: String): Boolean {
        return try {
            val store = getDomainStore(domain)
            store.contains(VALUE_PREFIX + key)
        } catch (e: Exception) {
            false
        }
    }

    override fun clear(domain: StorageDomain): StorageResult<Int> {
        return try {
            val store = getDomainStore(domain)
            val keys = store.all.keys
                .filter { it.startsWith(VALUE_PREFIX) }
                .map { it.removePrefix(VALUE_PREFIX) }

            // Clear all secure storage keys
            store.edit().clear().apply()

            auditLogger.logSecurityEvent(
                SecurityEvent.StorageCleared(domain.name, keys.size)
            )
            eventBus.publish(BootstrapEvent.StorageCleared(domain.name, keys.size))

            StorageResult.success(keys.size)
        } catch (e: Exception) {
            Log.e(TAG, "Clear failed for ${domain.name}: ${e.message}")
            StorageResult.failure("Clear failed: ${e.message}")
        }
    }

    override fun verifyIntegrity(domain: StorageDomain, key: String): IntegrityStatus {
        return try {
            val store = getDomainStore(domain)

            val encrypted = store.getString(VALUE_PREFIX + key, null) ?: return IntegrityStatus.NOT_FOUND
            val storedHmac = store.getString(HMAC_PREFIX + key, null) ?: return IntegrityStatus.INVALID
            val timestamp = store.getLong(TIMESTAMP_PREFIX + key, 0L)

            // Decrypt to verify
            val decrypted = cryptoManager.decryptString(encrypted, KeyAlias.STORAGE)
            val hmacData = buildIntegrityData(domain, key, timestamp, decrypted)

            val isValid = cryptoManager.verifyStringHmac(hmacData, storedHmac, KeyAlias.HMAC)

            if (isValid) {
                eventBus.publish(BootstrapEvent.IntegrityVerified(domain.name, key))
                IntegrityStatus.VALID
            } else {
                recordIntegrityFailure(domain)
                eventBus.publish(BootstrapEvent.IntegrityFailed(domain.name, key))
                IntegrityStatus.INVALID
            }
        } catch (e: Exception) {
            Log.e(TAG, "Integrity check error for ${domain.name}/$key: ${e.message}")
            IntegrityStatus.ERROR
        }
    }

    override fun getStorageHealth(domain: StorageDomain): StorageHealth {
        val metrics = healthMetrics[domain] ?: return StorageHealth.unhealthy(domain)
        val store = try {
            getDomainStore(domain)
        } catch (e: Exception) {
            return StorageHealth.unhealthy(domain)
        }

        val totalKeys = store.all.keys.count { it.startsWith(VALUE_PREFIX) }
        val totalSize = store.all.values.sumOf { it.toString().length.toLong() }

        return StorageHealth(
            domain = domain,
            totalKeys = totalKeys,
            totalSizeBytes = totalSize,
            failedReads = metrics.failedReads,
            failedWrites = metrics.failedWrites,
            integrityFailures = metrics.integrityFailures,
            lastAccessed = metrics.lastAccessed,
            isHealthy = metrics.isHealthy
        )
    }

    override fun getAllStorageMetrics(): StorageMetrics {
        val domainHealth = StorageDomain.entries.associateWith { getStorageHealth(it) }
        return StorageMetrics(
            totalDomains = StorageDomain.entries.size,
            totalKeys = domainHealth.values.sumOf { it.totalKeys },
            totalSizeBytes = domainHealth.values.sumOf { it.totalSizeBytes },
            totalFailedReads = domainHealth.values.sumOf { it.failedReads },
            totalFailedWrites = domainHealth.values.sumOf { it.failedWrites },
            totalIntegrityFailures = domainHealth.values.sumOf { it.integrityFailures },
            domainHealth = domainHealth
        )
    }

    // ==================== SESSION OPERATIONS ====================

    override fun storeSession(key: String, data: String): StorageResult<Boolean> =
        store(StorageDomain.SESSIONS, key, data)

    override fun getSession(key: String): StorageResult<String?> =
        retrieve(StorageDomain.SESSIONS, key)

    override fun deleteSession(key: String): StorageResult<Boolean> =
        delete(StorageDomain.SESSIONS, key)

    // ==================== COOKIE OPERATIONS ====================

    override fun storeCookie(key: String, data: String): StorageResult<Boolean> =
        store(StorageDomain.COOKIES, key, data)

    override fun getCookie(key: String): StorageResult<String?> =
        retrieve(StorageDomain.COOKIES, key)

    override fun deleteCookie(key: String): StorageResult<Boolean> =
        delete(StorageDomain.COOKIES, key)

    // ==================== TOKEN OPERATIONS ====================

    override fun storeToken(key: String, data: String): StorageResult<Boolean> =
        store(StorageDomain.TOKENS, key, data)

    override fun getToken(key: String): StorageResult<String?> =
        retrieve(StorageDomain.TOKENS, key)

    override fun deleteToken(key: String): StorageResult<Boolean> =
        delete(StorageDomain.TOKENS, key)

    // ==================== CREDENTIAL OPERATIONS ====================

    override fun storeCredential(key: String, data: String): StorageResult<Boolean> =
        store(StorageDomain.CREDENTIALS, key, data)

    override fun getCredential(key: String): StorageResult<String?> =
        retrieve(StorageDomain.CREDENTIALS, key)

    override fun deleteCredential(key: String): StorageResult<Boolean> =
        delete(StorageDomain.CREDENTIALS, key)

    // ==================== PREFERENCE OPERATIONS ====================

    override fun storePreference(key: String, data: String): StorageResult<Boolean> =
        store(StorageDomain.PREFERENCES, key, data)

    override fun getPreference(key: String): StorageResult<String?> =
        retrieve(StorageDomain.PREFERENCES, key)

    override fun deletePreference(key: String): StorageResult<Boolean> =
        delete(StorageDomain.PREFERENCES, key)

    // ==================== CACHE OPERATIONS ====================

    override fun storeCache(key: String, data: String, ttlMs: Long): StorageResult<Boolean> {
        val result = store(StorageDomain.CACHE, key, data)
        if (result.success) {
            // Set TTL
            try {
                val store = getDomainStore(StorageDomain.CACHE)
                val expiresAt = if (ttlMs > 0) System.currentTimeMillis() + ttlMs else 0L
                store.edit().putLong(TTL_PREFIX + key, expiresAt).apply()
            } catch (e: Exception) {
                Log.w(TAG, "Failed to set cache TTL for $key: ${e.message}")
            }
        }
        return result
    }

    override fun getCache(key: String): StorageResult<String?> =
        retrieve(StorageDomain.CACHE, key)

    override fun deleteCache(key: String): StorageResult<Boolean> =
        delete(StorageDomain.CACHE, key)

    override fun clearExpiredCache(): Int {
        var cleared = 0
        try {
            val store = getDomainStore(StorageDomain.CACHE)
            val now = System.currentTimeMillis()

            store.all.keys
                .filter { it.startsWith(TTL_PREFIX) }
                .forEach { ttlKey ->
                    val dataKey = ttlKey.removePrefix(TTL_PREFIX)
                    val ttl = store.getLong(ttlKey, 0L)
                    if (ttl > 0 && now > ttl) {
                        delete(StorageDomain.CACHE, dataKey)
                        cleared++
                    }
                }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to clear expired cache: ${e.message}")
        }
        return cleared
    }

    // ==================== UTILITY OPERATIONS ====================

    override fun isInitialized(): Boolean = isInitialized

    override fun listKeys(domain: StorageDomain): List<String> {
        return try {
            val store = getDomainStore(domain)
            store.all.keys
                .filter { it.startsWith(VALUE_PREFIX) }
                .map { it.removePrefix(VALUE_PREFIX) }
        } catch (e: Exception) {
            emptyList()
        }
    }

    override fun getCount(domain: StorageDomain): Int {
        return listKeys(domain).size
    }

    // ==================== PRIVATE HELPERS ====================

    private fun buildIntegrityData(domain: StorageDomain, key: String, timestamp: Long, data: String): String {
        return listOf(domain.name, key, timestamp.toString(), data).joinToString(KEY_SEPARATOR)
    }

    private fun recordReadFailure(domain: StorageDomain) {
        healthMetrics[domain]?.let {
            it.failedReads++
            it.lastAccessed = System.currentTimeMillis()
        }
    }

    private fun recordWriteFailure(domain: StorageDomain) {
        healthMetrics[domain]?.let {
            it.failedWrites++
        }
    }

    private fun recordIntegrityFailure(domain: StorageDomain) {
        healthMetrics[domain]?.let {
            it.integrityFailures++
        }
    }

    /**
     * Health metrics tracking per domain.
     */
    private class DomainHealthMetrics(val domain: StorageDomain) {
        var failedReads: Int = 0
        var failedWrites: Int = 0
        var integrityFailures: Int = 0
        var lastAccessed: Long = System.currentTimeMillis()

        val isHealthy: Boolean
            get() = failedReads < 10 && failedWrites < 10 && integrityFailures < 5
    }
}