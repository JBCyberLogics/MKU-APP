package ke.ac.mku.authcore.contracts.session

/**
 * SessionManagerMetrics - SESSION-001
 *
 * Metrics for session management operations.
 * Tracks session lifecycle statistics.
 *
 * @property totalSessions Total sessions created
 * @property activeSessions Currently active sessions
 * @property expiredSessions Total sessions that expired
 * @property averageSessionDurationMs Average session duration in milliseconds
 * @property totalRefreshCount Total refresh operations
 * @property failedRefreshCount Failed refresh operations
 * @property lastSessionTimestamp Timestamp of last session activity
 */
data class SessionManagerMetrics(
    val totalSessions: Long,
    val activeSessions: Int,
    val expiredSessions: Long,
    val averageSessionDurationMs: Long,
    val totalRefreshCount: Long,
    val failedRefreshCount: Long,
    val lastSessionTimestamp: Long
)