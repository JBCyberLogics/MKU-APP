package ke.ac.mku.authcore.recovery

/**
 * CircuitBreaker - CORE-011
 *
 * Per-service circuit breaker implementation.
 * Prevents cascading failures by stopping requests to failing services.
 *
 * States:
 * - CLOSED: Normal operation, requests pass through
 * - OPEN: Service is failing, requests are rejected immediately
 * - HALF_OPEN: Testing if service has recovered, limited requests allowed
 */
class CircuitBreaker(
    private val serviceName: String,
    private val failureThreshold: Int = DEFAULT_FAILURE_THRESHOLD,
    private val recoveryTimeoutSeconds: Long = DEFAULT_RECOVERY_TIMEOUT,
    private val halfOpenRequests: Int = DEFAULT_HALF_OPEN_REQUESTS
) {
    companion object {
        const val DEFAULT_FAILURE_THRESHOLD = 5
        const val DEFAULT_RECOVERY_TIMEOUT = 60L
        const val DEFAULT_HALF_OPEN_REQUESTS = 3
    }

    @Volatile
    private var state: CircuitBreakerState = CircuitBreakerState.CLOSED

    @Volatile
    private var failureCount: Int = 0

    @Volatile
    private var lastFailureTime: Long = 0L

    @Volatile
    private var successCountInHalfOpen: Int = 0

    private val lock = Any()

    /**
     * Get current circuit breaker state.
     */
    fun getState(): CircuitBreakerState = synchronized(lock) { state }

    /**
     * Get failure count.
     */
    fun getFailureCount(): Int = synchronized(lock) { failureCount }

    /**
     * Check if requests can be executed.
     */
    fun canExecute(): Boolean = synchronized(lock) {
        when (state) {
            CircuitBreakerState.CLOSED -> true
            CircuitBreakerState.OPEN -> {
                // Check if recovery timeout has elapsed
                if (System.currentTimeMillis() - lastFailureTime >= recoveryTimeoutSeconds * 1000) {
                    // Transition to half-open
                    state = CircuitBreakerState.HALF_OPEN
                    successCountInHalfOpen = 0
                    true
                } else {
                    false
                }
            }
            CircuitBreakerState.HALF_OPEN -> {
                // Allow limited requests in half-open state
                successCountInHalfOpen < halfOpenRequests
            }
        }
    }

    /**
     * Record a successful execution.
     */
    fun recordSuccess() = synchronized(lock) {
        when (state) {
            CircuitBreakerState.CLOSED -> {
                // Reset failure count on success
                failureCount = 0
            }
            CircuitBreakerState.HALF_OPEN -> {
                successCountInHalfOpen++
                if (successCountInHalfOpen >= halfOpenRequests) {
                    // Enough successes, close the circuit
                    state = CircuitBreakerState.CLOSED
                    failureCount = 0
                    successCountInHalfOpen = 0
                }
            }
            CircuitBreakerState.OPEN -> {
                // Should not happen, but ignore
            }
        }
    }

    /**
     * Record a failed execution.
     */
    fun recordFailure() = synchronized(lock) {
        lastFailureTime = System.currentTimeMillis()
        failureCount++

        when (state) {
            CircuitBreakerState.CLOSED -> {
                if (failureCount >= failureThreshold) {
                    // Open the circuit
                    state = CircuitBreakerState.OPEN
                }
            }
            CircuitBreakerState.HALF_OPEN -> {
                // Any failure in half-open goes back to open
                state = CircuitBreakerState.OPEN
                successCountInHalfOpen = 0
            }
            CircuitBreakerState.OPEN -> {
                // Already open, reset timeout
            }
        }
    }

    /**
     * Get current state as CircuitState for exposure.
     */
    fun getCircuitState(): CircuitState = synchronized(lock) {
        CircuitState(
            serviceName = serviceName,
            state = state,
            failureCount = failureCount,
            lastFailureTime = lastFailureTime,
            lastStateChange = lastFailureTime
        )
    }

    /**
     * Reset the circuit breaker to closed state.
     */
    fun reset() = synchronized(lock) {
        state = CircuitBreakerState.CLOSED
        failureCount = 0
        successCountInHalfOpen = 0
        lastFailureTime = 0L
    }

    /**
     * Forcefully open the circuit.
     */
    fun forceOpen() = synchronized(lock) {
        state = CircuitBreakerState.OPEN
        lastFailureTime = System.currentTimeMillis()
    }
}