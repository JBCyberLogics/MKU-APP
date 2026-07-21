package ke.ac.mku.authcore.recovery

/**
 * RecoveryState - CORE-011
 *
 * Represents the current state of the RecoveryManager including:
 * - Active recoveries in progress
 * - Circuit breaker states per service
 * - Recovery history
 */
data class RecoveryState(
    val isRecovering: Boolean = false,
    val activeRecoveries: Map<String, ActiveRecovery> = emptyMap(),
    val circuitBreakerStates: Map<String, CircuitState> = emptyMap(),
    val recoveryHistory: List<RecoveryRecord> = emptyList(),
    val lastRecoveryTime: Long = 0L,
    val consecutiveFailures: Int = 0
) {
    companion object {
        const val MAX_HISTORY_SIZE = 1000
    }
}

/**
 * Represents an active recovery operation in progress.
 */
data class ActiveRecovery(
    val serviceName: String,
    val failureCategory: FailureCategory,
    val startTime: Long,
    val currentAttempt: Int,
    val maxAttempts: Int,
    val strategy: RecoveryStrategy
)

/**
 * Recovery strategy being used.
 */
enum class RecoveryStrategy {
    RETRY,
    RESTART,
    REINITIALIZE,
    ROLLBACK,
    FULL_RECOVERY
}

/**
 * State of a circuit breaker for a service.
 */
data class CircuitState(
    val serviceName: String,
    val state: CircuitBreakerState,
    val failureCount: Int,
    val lastFailureTime: Long,
    val lastStateChange: Long,
    val successCountInHalfOpen: Int = 0
)

/**
 * Circuit breaker states.
 */
enum class CircuitBreakerState {
    CLOSED,  // Normal operation
    OPEN,    // Failing, reject requests
    HALF_OPEN  // Testing if service recovered
}

/**
 * Record of a completed recovery attempt.
 */
data class RecoveryRecord(
    val serviceName: String,
    val failureCategory: FailureCategory,
    val strategy: RecoveryStrategy,
    val success: Boolean,
    val startTime: Long,
    val endTime: Long,
    val errorMessage: String?,
    val attempts: Int
)