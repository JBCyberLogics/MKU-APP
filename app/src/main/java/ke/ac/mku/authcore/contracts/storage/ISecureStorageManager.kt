package ke.ac.mku.authcore.contracts.storage

/**
 * ISecureStorageManager - SECURITY-003
 *
 * Central secure storage contract for the Authentication Platform.
 * Provides encrypted persistence, integrity verification, and secure deletion
 * for all sensitive application data.
 *
 * All storage operations use ICryptoManager for encryption and HMAC
 * for integrity verification. No plaintext data is ever stored.
 *
 * Contract Reference: CORE-012, SECURITY-003
 */
interface ISecureStorageManager {

    // ==================== CORE OPERATIONS ====================

    /**
     * Securely store encrypted data.
     *
     * @param domain The storage domain
     * @param key Unique key for this data
     * @param data Plaintext data to encrypt and store
     * @return StorageResult with success status
     */
    fun store(domain: StorageDomain, key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve and decrypt stored data.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @return StorageResult with decrypted data or null if not found
     */
    fun retrieve(domain: StorageDomain, key: String): StorageResult<String?>

    /**
     * Update existing secure data.
     * Fails if key does not exist.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @param data New plaintext data to encrypt and store
     * @return StorageResult with success status
     */
    fun update(domain: StorageDomain, key: String, data: String): StorageResult<Boolean>

    /**
     * Securely delete stored data.
     * Overwrites data before deletion for secure removal.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @return StorageResult with success status
     */
    fun delete(domain: StorageDomain, key: String): StorageResult<Boolean>

    /**
     * Check if a key exists in the domain.
     *
     * @param domain The storage domain
     * @param key Unique key to check
     * @return true if key exists
     */
    fun exists(domain: StorageDomain, key: String): Boolean

    /**
     * Clear all data in a storage domain.
     *
     * @param domain The storage domain to clear
     * @return StorageResult with count of cleared items
     */
    fun clear(domain: StorageDomain): StorageResult<Int>

    /**
     * Verify integrity of stored data.
     *
     * @param domain The storage domain
     * @param key Unique key to verify
     * @return IntegrityStatus of the stored data
     */
    fun verifyIntegrity(domain: StorageDomain, key: String): IntegrityStatus

    /**
     * Get storage health metrics for a domain.
     *
     * @param domain The storage domain
     * @return StorageHealth with current metrics
     */
    fun getStorageHealth(domain: StorageDomain): StorageHealth

    /**
     * Get storage metrics for all domains.
     *
     * @return StorageMetrics with aggregated metrics
     */
    fun getAllStorageMetrics(): StorageMetrics

    // ==================== SESSION OPERATIONS ====================

    /**
     * Store session data.
     * Convenience method using SESSIONS domain.
     */
    fun storeSession(key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve session data.
     * Convenience method using SESSIONS domain.
     */
    fun getSession(key: String): StorageResult<String?>

    /**
     * Delete session data.
     * Convenience method using SESSIONS domain.
     */
    fun deleteSession(key: String): StorageResult<Boolean>

    // ==================== COOKIE OPERATIONS ====================

    /**
     * Store cookie data.
     * Convenience method using COOKIES domain.
     */
    fun storeCookie(key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve cookie data.
     * Convenience method using COOKIES domain.
     */
    fun getCookie(key: String): StorageResult<String?>

    /**
     * Delete cookie data.
     * Convenience method using COOKIES domain.
     */
    fun deleteCookie(key: String): StorageResult<Boolean>

    // ==================== TOKEN OPERATIONS ====================

    /**
     * Store token data.
     * Convenience method using TOKENS domain.
     */
    fun storeToken(key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve token data.
     * Convenience method using TOKENS domain.
     */
    fun getToken(key: String): StorageResult<String?>

    /**
     * Delete token data.
     * Convenience method using TOKENS domain.
     */
    fun deleteToken(key: String): StorageResult<Boolean>

    // ==================== CREDENTIAL OPERATIONS ====================

    /**
     * Store credential data.
     * Convenience method using CREDENTIALS domain.
     * Credentials are never stored in plaintext.
     */
    fun storeCredential(key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve credential data.
     * Convenience method using CREDENTIALS domain.
     */
    fun getCredential(key: String): StorageResult<String?>

    /**
     * Delete credential data.
     * Convenience method using CREDENTIALS domain.
     */
    fun deleteCredential(key: String): StorageResult<Boolean>

    // ==================== PREFERENCE OPERATIONS ====================

    /**
     * Store preference data.
     * Convenience method using PREFERENCES domain.
     */
    fun storePreference(key: String, data: String): StorageResult<Boolean>

    /**
     * Retrieve preference data.
     * Convenience method using PREFERENCES domain.
     */
    fun getPreference(key: String): StorageResult<String?>

    /**
     * Delete preference data.
     * Convenience method using PREFERENCES domain.
     */
    fun deletePreference(key: String): StorageResult<Boolean>

    // ==================== CACHE OPERATIONS ====================

    /**
     * Store cache data with TTL.
     * Convenience method using CACHE domain.
     *
     * @param key Unique key for the data
     * @param data Plaintext data to cache
     * @param ttlMs Time-to-live in milliseconds
     */
    fun storeCache(key: String, data: String, ttlMs: Long): StorageResult<Boolean>

    /**
     * Retrieve cache data if not expired.
     * Convenience method using CACHE domain.
     * Returns null if key doesn't exist or is expired.
     */
    fun getCache(key: String): StorageResult<String?>

    /**
     * Delete cache data.
     * Convenience method using CACHE domain.
     */
    fun deleteCache(key: String): StorageResult<Boolean>

    /**
     * Clear all expired cache entries.
     *
     * @return Count of cleared entries
     */
    fun clearExpiredCache(): Int

    // ==================== UTILITY OPERATIONS ====================

    /**
     * Check if storage is initialized and ready.
     */
    fun isInitialized(): Boolean

    /**
     * Get list of all keys in a domain.
     *
     * @param domain The storage domain
     * @return List of keys
     */
    fun listKeys(domain: StorageDomain): List<String>

    /**
     * Get count of items in a domain.
     *
     * @param domain The storage domain
     * @return Count of items
     */
    fun getCount(domain: StorageDomain): Int
}