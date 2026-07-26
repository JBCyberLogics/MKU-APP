package ke.ac.mku.authcore.contracts.network

/**
 * NETWORK-003: Request Pipeline Manager Contract
 *
 * Central request orchestration engine responsible for validating, enriching, prioritizing 
 * and preparing every outbound request before execution by the Authentication Network Service.
 */
interface IRequestPipelineManager {

    /**
     * Process a request through the complete pipeline.
     */
    fun processRequest(request: OutboundRequest): ProcessedRequest?

    /**
     * Validate an outbound request before processing.
     */
    fun validateRequest(request: OutboundRequest): ValidatedRequest

    /**
     * Enrich a request with headers, cookies and metadata.
     */
    fun enrichRequest(request: OutboundRequest): EnrichedRequest

    /**
     * Assign execution priority to a request.
     */
    fun assignPriority(request: OutboundRequest): PrioritizedRequest

    /**
     * Prepare a request for execution by the HTTP client.
     */
    fun prepareExecution(request: OutboundRequest): ExecutionReadyRequest

    /**
     * Returns the current pipeline state and metrics.
     */
    fun getPipelineStatus(): PipelineStatus
}

/**
 * Represents a request after enrichment stage.
 */
data class EnrichedRequest(
    val original: OutboundRequest,
    val headers: Map<String, String>,
    val cookies: Map<String, String>,
    val metadata: Map<String, String>
)

/**
 * Represents a request with assigned priority.
 */
data class PrioritizedRequest(
    val original: OutboundRequest,
    val priority: PriorityLevel
)

/**
 * Represents a request ready for execution.
 */
data class ExecutionReadyRequest(
    val original: OutboundRequest,
    val finalUrl: String,
    val finalHeaders: Map<String, String>,
    val finalBody: String?,
    val signatures: Map<String, String> = emptyMap()
)

/**
 * Represents a processed request after all pipeline stages.
 */
data class ProcessedRequest(
    val original: OutboundRequest,
    val validated: ValidatedRequest,
    val enriched: EnrichedRequest,
    val prioritized: PrioritizedRequest,
    val executionReady: ExecutionReadyRequest
)

/**
 * Priority levels for request execution.
 */
enum class PriorityLevel {
    CRITICAL,
    HIGH,
    NORMAL,
    LOW,
    BACKGROUND
}

/**
 * Pipeline status and metrics.
 */
data class PipelineStatus(
    val totalProcessed: Int,
    val validationFailures: Int,
    val averageLatencyMs: Long,
    val priorityDistribution: Map<PriorityLevel, Int>,
    val securityRejections: Int
)
