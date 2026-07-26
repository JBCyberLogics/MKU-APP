package ke.ac.mku.authcore.contracts.endpoint

/**
 * ENDPOINT-001: Endpoint Discovery Manager Contract
 *
 * Central authority responsible for discovering, validating, registering 
 * and maintaining every Student Portal endpoint.
 */
interface IEndpointDiscoveryManager {

    /**
     * Discover all available portal endpoints.
     */
    suspend fun discoverEndpoints()

    /**
     * Return a validated endpoint by identifier.
     */
    fun getEndpoint(identifier: String): PortalEndpoint?

    /**
     * Force rediscovery of all endpoints.
     */
    suspend fun refreshEndpoints()

    /**
     * Validate endpoint integrity and accessibility.
     */
    fun validateEndpoint(endpoint: PortalEndpoint): Boolean

    /**
     * Return all registered endpoints.
     */
    fun listEndpoints(): List<PortalEndpoint>

    /**
     * Return endpoint registry status.
     */
    fun getRegistryStatus(): RegistryStatus
}

/**
 * Represents a registered portal endpoint.
 */
data class PortalEndpoint(
    val identifier: String,
    val category: EndpointCategory,
    val url: String,
    val version: String,
    val httpsVerified: Boolean,
    val lastValidated: Long
)

/**
 * Categories for portal endpoints.
 */
enum class EndpointCategory {
    AUTHENTICATION,
    STUDENT_PROFILE,
    ACADEMIC_RECORDS,
    FINANCIAL_RECORDS,
    COURSE_REGISTRATION,
    EXAM_RESULTS,
    TIMETABLE,
    NOTIFICATIONS,
    DOWNLOADS,
    CONFIGURATION
}

/**
 * Status and metrics of the endpoint registry.
 */
data class RegistryStatus(
    val totalEndpoints: Int,
    val validEndpoints: Int,
    val invalidEndpoints: Int,
    val lastDiscoveryTimestamp: Long,
    val cacheHitRate: Float
)
