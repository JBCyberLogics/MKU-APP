package ke.ac.mku.authcore.contracts.endpoint

/**
 * ENDPOINT-002: Endpoint Health Manager Contract
 *
 * Central authority responsible for continuously monitoring the health and reliability 
 * of every registered portal endpoint.
 */
interface IEndpointHealthManager {

    /**
     * Begin continuous endpoint health monitoring.
     */
    fun startMonitoring()

    /**
     * Stop monitoring engine.
     */
    fun stopMonitoring()

    /**
     * Execute an immediate health check on a specific endpoint.
     */
    suspend fun checkEndpointHealth(identifier: String): EndpointHealthReport

    /**
     * Return the current health status for an endpoint.
     */
    fun getEndpointHealth(identifier: String): EndpointHealthReport?

    /**
     * Return health reports for every registered endpoint.
     */
    fun getAllHealthReports(): List<EndpointHealthReport>

    /**
     * Mark an endpoint as unavailable.
     */
    fun markEndpointUnavailable(identifier: String)

    /**
     * Initiate the endpoint recovery workflow.
     */
    fun triggerRecovery(identifier: String)
}

/**
 * Represents the health status report of an endpoint.
 */
data class EndpointHealthReport(
    val identifier: String,
    val state: EndpointHealthState,
    val lastChecked: Long,
    val averageLatencyMs: Long,
    val availabilityPercent: Float,
    val consecutiveFailures: Int,
    val certificateExpiringSoon: Boolean
)

/**
 * Represents the current health state of an endpoint.
 */
enum class EndpointHealthState {
    UNKNOWN,
    HEALTHY,
    DEGRADED,
    UNREACHABLE,
    RECOVERING,
    FAILED,
    DISABLED
}
