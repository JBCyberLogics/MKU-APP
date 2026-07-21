package ke.ac.mku.authcore.lifecycle

/**
 * Tracks lifecycle information for a single service.
 *
 * @property serviceName The unique name identifying the service
 * @property state The current lifecycle state of the service
 * @property uptimeMillis The cumulative uptime in milliseconds
 * @property failureCount The number of times the service has failed
 * @property lastTransitionTime Timestamp of the last state transition
 */
data class ServiceLifecycle(
    val serviceName: String,
    var state: LifecycleState = LifecycleState.REGISTERED,
    var uptimeMillis: Long = 0,
    var failureCount: Int = 0,
    var lastTransitionTime: Long = 0
) {
    /**
     * Record a state transition to a new state.
     */
    fun transitionTo(newState: LifecycleState) {
        val currentTime = System.currentTimeMillis()
        if (state == LifecycleState.RUNNING && newState != LifecycleState.RUNNING) {
            // Accumulate uptime when leaving RUNNING state
            uptimeMillis += currentTime - lastTransitionTime
        }
        state = newState
        lastTransitionTime = currentTime
    }

    /**
     * Increment the failure counter.
     */
    fun recordFailure() {
        failureCount++
    }

    /**
     * Reset the failure counter after successful operation.
     */
    fun resetFailures() {
        failureCount = 0
    }

    /**
     * Get the current uptime (current time minus last transition if running).
     */
    fun getCurrentUptime(): Long {
        return if (state == LifecycleState.RUNNING) {
            uptimeMillis + (System.currentTimeMillis() - lastTransitionTime)
        } else {
            uptimeMillis
        }
    }
}