package ke.ac.mku.authcore.contracts.session

/**
 * SESSION-003: Session Recovery Metrics
 *
 * Tracks recovery operation statistics for monitoring and debugging.
 */
data class SessionRecoveryMetrics(
    /** Total recovery attempts since app start */
    val totalAttempts: Int = 0,

    /** Successful recoveries */
    val successfulRecoveries: Int = 0,

    /** Failed recoveries */
    val failedRecoveries: Int = 0,

    /** Recoveries that required re-authentication */
    val reauthentications: Int = 0,

    /** Recoveries that recreated session from scratch */
    val sessionRecreations: Int = 0,

    /** Aborted recovery attempts */
    val abortedRecoveries: Int = 0,

    /** Average recovery time in milliseconds */
    val averageRecoveryTimeMs: Long = 0,

    /** Last recovery timestamp */
    val lastRecoveryAttempt: Long = 0,

    /** Last successful recovery timestamp */
    val lastSuccessfulRecovery: Long = 0,

    /** Last failed recovery timestamp */
    val lastFailedRecovery: Long = 0,

    /** Current recovery state */
    val currentState: RecoveryState = RecoveryState.IDLE,

    /** Whether circuit breaker is open */
    val circuitBreakerOpen: Boolean = false,

    /** Number of consecutive failures */
    val consecutiveFailures: Int = 0
) {
    /** Success rate as percentage */
    val successRate: Float
        get() = if (totalAttempts > 0) {
            (successfulRecoveries.toFloat() / totalAttempts) * 100
        } else 0f

    /** Whether recovery is currently possible */
    val canRecover: Boolean
        get() = !circuitBreakerOpen && currentState == RecoveryState.IDLE
}