package ke.ac.mku.authcore.recovery

/**
 * RecoveryEvent - CORE-011
 *
 * Internal events published by RecoveryManager.
 * These are received by LifecycleManager to perform actual recovery actions.
 */
sealed class RecoveryEvent {
    /** RecoveryManager is ready */
    object RecoveryManagerReady : RecoveryEvent()

    /** A recovery operation has started */
    data class RecoveryStarted(
        val serviceName: String,
        val strategy: RecoveryStrategy,
        val attempt: Int
    ) : RecoveryEvent()

    /** A recovery operation completed successfully */
    data class RecoveryCompleted(
        val serviceName: String,
        val strategy: RecoveryStrategy,
        val durationMs: Long
    ) : RecoveryEvent()

    /** A recovery operation failed */
    data class RecoveryFailed(
        val serviceName: String,
        val strategy: RecoveryStrategy,
        val error: String,
        val attempts: Int
    ) : RecoveryEvent()

    /** Request to restart a service (RecoveryManager -> LifecycleManager) */
    data class ServiceRestartRequested(val serviceName: String) : RecoveryEvent()

    /** Service was restarted (LifecycleManager -> RecoveryManager) */
    data class ServiceRestarted(val serviceName: String) : RecoveryEvent()

    /** Request to reinitialize a service */
    data class ReinitializeServiceRequested(val serviceName: String) : RecoveryEvent()

    /** Request to rollback a service to previous state */
    data class RollbackRequested(val serviceName: String) : RecoveryEvent()

    /** Rollback completed */
    object RollbackCompleted : RecoveryEvent()

    /** Retry started for an operation */
    data class RetryStarted(
        val serviceName: String,
        val attempt: Int,
        val maxAttempts: Int
    ) : RecoveryEvent()

    /** Retry failed */
    data class RetryFailed(
        val serviceName: String,
        val error: String,
        val attempts: Int
    ) : RecoveryEvent()

    /** Circuit breaker opened for a service */
    data class CircuitOpened(val serviceName: String) : RecoveryEvent()

    /** Circuit breaker closed for a service */
    data class CircuitClosed(val serviceName: String) : RecoveryEvent()

    /** System has recovered from a degraded state */
    object SystemRecovered : RecoveryEvent()

    /** Circuit breaker state changed */
    data class CircuitStateChanged(
        val serviceName: String,
        val previousState: CircuitBreakerState,
        val newState: CircuitBreakerState
    ) : RecoveryEvent()
}