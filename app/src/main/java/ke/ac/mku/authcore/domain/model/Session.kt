package ke.ac.mku.authcore.domain.model

/**
 * Session - SESSION-001
 *
 * Represents an authenticated user session with full metadata.
 * Stored encrypted in SESSIONS domain via ISecureStorageManager.
 *
 * @property user The authenticated user
 * @property cookies Session cookies from portal authentication
 * @property loginTimestamp When the session was created (milliseconds since epoch)
 * @property sessionId Unique session identifier (UUID)
 * @property deviceId Device identifier bound to this session
 * @property lastRefreshTimestamp When the session was last refreshed
 * @property refreshCount Number of times session has been refreshed
 * @property expiryTimestamp When the session will expire (milliseconds since epoch)
 * @property isEncrypted Whether session data is encrypted
 */
data class Session(
    val user: User,
    val cookies: Map<String, String>,
    val loginTimestamp: Long,
    val sessionId: String,
    val deviceId: String? = null,
    val lastRefreshTimestamp: Long = loginTimestamp,
    val refreshCount: Int = 0,
    val expiryTimestamp: Long = loginTimestamp + SESSION_TIMEOUT_MS,
    val isEncrypted: Boolean = true
) {
    companion object {
        const val SESSION_TIMEOUT_MS = 1800000L // 30 minutes
        const val REFRESH_BEFORE_EXPIRY_MS = 300000L // 5 minutes
        const val MAX_REFRESH_COUNT = 24
    }

    /**
     * Check if this session has expired.
     */
    fun isExpired(): Boolean {
        return System.currentTimeMillis() >= expiryTimestamp
    }

    /**
     * Check if this session should be refreshed.
     */
    fun shouldRefresh(): Boolean {
        val timeUntilExpiry = expiryTimestamp - System.currentTimeMillis()
        return timeUntilExpiry <= REFRESH_BEFORE_EXPIRY_MS && refreshCount < MAX_REFRESH_COUNT
    }

    /**
     * Create a refreshed copy of this session.
     */
    fun refreshed(): Session {
        return copy(
            lastRefreshTimestamp = System.currentTimeMillis(),
            refreshCount = refreshCount + 1,
            expiryTimestamp = System.currentTimeMillis() + SESSION_TIMEOUT_MS
        )
    }
}