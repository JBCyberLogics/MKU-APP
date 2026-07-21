package ke.ac.mku.authcore.contracts.storage;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u001e\u001a\u00020\tH&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H&J\u001e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH&J\u0018\u0010-\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006/"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "", "clear", "Lke/ac/mku/authcore/contracts/storage/StorageResult;", "", "domain", "Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "clearExpiredCache", "delete", "", "key", "", "deleteCache", "deleteCookie", "deleteCredential", "deletePreference", "deleteSession", "deleteToken", "exists", "getAllStorageMetrics", "Lke/ac/mku/authcore/contracts/storage/StorageMetrics;", "getCache", "getCookie", "getCount", "getCredential", "getPreference", "getSession", "getStorageHealth", "Lke/ac/mku/authcore/contracts/storage/StorageHealth;", "getToken", "isInitialized", "listKeys", "", "retrieve", "store", "data", "storeCache", "ttlMs", "", "storeCookie", "storeCredential", "storePreference", "storeSession", "storeToken", "update", "verifyIntegrity", "Lke/ac/mku/authcore/contracts/storage/IntegrityStatus;", "app_debug"})
public abstract interface ISecureStorageManager {
    
    /**
     * Securely store encrypted data.
     *
     * @param domain The storage domain
     * @param key Unique key for this data
     * @param data Plaintext data to encrypt and store
     * @return StorageResult with success status
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> store(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve and decrypt stored data.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @return StorageResult with decrypted data or null if not found
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> retrieve(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Update existing secure data.
     * Fails if key does not exist.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @param data New plaintext data to encrypt and store
     * @return StorageResult with success status
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> update(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Securely delete stored data.
     * Overwrites data before deletion for secure removal.
     *
     * @param domain The storage domain
     * @param key Unique key for the data
     * @return StorageResult with success status
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> delete(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Check if a key exists in the domain.
     *
     * @param domain The storage domain
     * @param key Unique key to check
     * @return true if key exists
     */
    public abstract boolean exists(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Clear all data in a storage domain.
     *
     * @param domain The storage domain to clear
     * @return StorageResult with count of cleared items
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Integer> clear(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain);
    
    /**
     * Verify integrity of stored data.
     *
     * @param domain The storage domain
     * @param key Unique key to verify
     * @return IntegrityStatus of the stored data
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.IntegrityStatus verifyIntegrity(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Get storage health metrics for a domain.
     *
     * @param domain The storage domain
     * @return StorageHealth with current metrics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageHealth getStorageHealth(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain);
    
    /**
     * Get storage metrics for all domains.
     *
     * @return StorageMetrics with aggregated metrics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageMetrics getAllStorageMetrics();
    
    /**
     * Store session data.
     * Convenience method using SESSIONS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storeSession(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve session data.
     * Convenience method using SESSIONS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getSession(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete session data.
     * Convenience method using SESSIONS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deleteSession(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Store cookie data.
     * Convenience method using COOKIES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storeCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve cookie data.
     * Convenience method using COOKIES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete cookie data.
     * Convenience method using COOKIES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deleteCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Store token data.
     * Convenience method using TOKENS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storeToken(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve token data.
     * Convenience method using TOKENS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getToken(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete token data.
     * Convenience method using TOKENS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deleteToken(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Store credential data.
     * Convenience method using CREDENTIALS domain.
     * Credentials are never stored in plaintext.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storeCredential(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve credential data.
     * Convenience method using CREDENTIALS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getCredential(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete credential data.
     * Convenience method using CREDENTIALS domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deleteCredential(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Store preference data.
     * Convenience method using PREFERENCES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storePreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    /**
     * Retrieve preference data.
     * Convenience method using PREFERENCES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete preference data.
     * Convenience method using PREFERENCES domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deletePreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Store cache data with TTL.
     * Convenience method using CACHE domain.
     *
     * @param key Unique key for the data
     * @param data Plaintext data to cache
     * @param ttlMs Time-to-live in milliseconds
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> storeCache(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String data, long ttlMs);
    
    /**
     * Retrieve cache data if not expired.
     * Convenience method using CACHE domain.
     * Returns null if key doesn't exist or is expired.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.String> getCache(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Delete cache data.
     * Convenience method using CACHE domain.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.StorageResult<java.lang.Boolean> deleteCache(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Clear all expired cache entries.
     *
     * @return Count of cleared entries
     */
    public abstract int clearExpiredCache();
    
    /**
     * Check if storage is initialized and ready.
     */
    public abstract boolean isInitialized();
    
    /**
     * Get list of all keys in a domain.
     *
     * @param domain The storage domain
     * @return List of keys
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> listKeys(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain);
    
    /**
     * Get count of items in a domain.
     *
     * @param domain The storage domain
     * @return Count of items
     */
    public abstract int getCount(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain);
}