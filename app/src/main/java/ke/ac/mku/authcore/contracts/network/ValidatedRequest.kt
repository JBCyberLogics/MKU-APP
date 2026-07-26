package ke.ac.mku.authcore.contracts.network

/**
 * Represents a request after the validation stage.
 */
data class ValidatedRequest(
    val original: OutboundRequest,
    val isValid: Boolean,
    val validationErrors: List<String> = emptyList()
)