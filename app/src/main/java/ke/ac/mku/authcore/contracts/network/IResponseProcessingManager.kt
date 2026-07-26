package ke.ac.mku.authcore.contracts.network

/**
 * NETWORK-004: Response Processing Manager Contract
 *
 * Central authority responsible for processing, validating, sanitizing 
 * and distributing every HTTP response received from the network.
 */
interface IResponseProcessingManager {

    /**
     * Process an incoming HTTP response through the full pipeline.
     */
    fun processResponse(raw: RawResponse): ProcessedResponse

    /**
     * Validate response integrity and security.
     */
    fun validateResponse(raw: RawResponse): ValidationResult

    /**
     * Extract and synchronize response cookies with CookieManager.
     */
    fun extractCookies(raw: RawResponse)

    /**
     * Update session state using validated response data.
     */
    fun updateSession(processed: ProcessedResponse)

    /**
     * Convert raw HTTP response into platform model.
     */
    fun mapResponse(raw: RawResponse): Map<String, Any>

    /**
     * Return current processing pipeline status and metrics.
     */
    fun getProcessingStatus(): ProcessingStatus
}

/**
 * Detailed status and metrics for the response pipeline.
 */
data class ProcessingStatus(
    val totalProcessed: Long,
    val successCount: Long,
    val failureCount: Long,
    val avgProcessingTimeMs: Long,
    val lastResponseReceived: Long
)

/**
 * Result of the validation stage.
 */
data class ValidationResult(
    val isValid: Boolean,
    val reason: String? = null,
    val errorCode: String? = null
)
