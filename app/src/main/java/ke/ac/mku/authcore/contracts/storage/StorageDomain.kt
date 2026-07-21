package ke.ac.mku.authcore.contracts.storage

/**
 * StorageDomain - SECURITY-003
 *
 * Enumeration of secure storage domains.
 * Each domain has its own encrypted SharedPreferences file.
 */
enum class StorageDomain(
    val prefsName: String,
    val encrypted: Boolean = true,
    val autoExpire: Boolean = false
) {
    /**
     * Session storage - holds authentication session data.
     * Uses hardware-backed encryption via ICryptoManager.
     */
    SESSIONS("mku_secure_sessions", encrypted = true, autoExpire = true),

    /**
     * AUTH_STATE - AUTH-003
     * 
     * Authentication state persistence domain.
     * Stores the current AuthenticationState for recovery on app restart.
     * Uses AES-256-GCM encryption via ISecureStorageManager.
     * Cleared on logout, restored on startup unless clear_on_logout was set.
     */
    AUTH_STATE("mku_auth_state", encrypted = true, autoExpire = false),

    /**
     * AUTH_EVENTS - AUTH-004
     * 
     * Authentication event persistence domain.
     * Stores authentication lifecycle events for auditing, replay, and correlation.
     * Uses AES-256-GCM encryption via ISecureStorageManager.
     * Supports automatic expiration for event rotation.
     */
    AUTH_EVENTS("mku_auth_events", encrypted = true, autoExpire = true),

    /**
     * Cookie storage - holds HTTP cookies from portal authentication.
     * Uses hardware-backed encryption via ICryptoManager.
     */
    COOKIES("mku_secure_cookies", encrypted = true, autoExpire = false),

    /**
     * Token storage - holds OAuth tokens, API keys, etc.
     * Uses hardware-backed encryption via ICryptoManager.
     */
    TOKENS("mku_secure_tokens", encrypted = true, autoExpire = false),

    /**
     * Credential storage - holds sensitive credentials.
     * Uses hardware-backed encryption via ICryptoManager.
     * Never allows plaintext storage.
     */
    CREDENTIALS("mku_secure_credentials", encrypted = true, autoExpire = false),

    /**
     * Preference storage - holds encrypted user preferences.
     * Uses hardware-backed encryption via ICryptoManager.
     */
    PREFERENCES("mku_secure_preferences", encrypted = true, autoExpire = false),

    /**
     * Cache storage - holds temporary encrypted data with TTL.
     * Uses hardware-backed encryption via ICryptoManager.
     * Supports automatic expiration.
     */
    CACHE("mku_secure_cache", encrypted = true, autoExpire = true);

    companion object {
        /**
         * Get domain by name, case-insensitive.
         */
        fun fromName(name: String): StorageDomain? {
            return entries.find { it.name.equals(name, ignoreCase = true) }
        }

        /**
         * Get all domains that support auto-expiration.
         */
        fun expirables(): List<StorageDomain> {
            return entries.filter { it.autoExpire }
        }
    }
}