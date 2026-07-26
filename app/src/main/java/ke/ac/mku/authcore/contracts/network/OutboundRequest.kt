package ke.ac.mku.authcore.contracts.network

/**
 * Represents an outbound request that needs to be processed by the pipeline.
 */
data class OutboundRequest(
    val url: String,
    val method: String = "GET",
    val headers: Map<String, String> = emptyMap(),
    val body: String? = null,
    val timestamp: Long = System.currentTimeMillis()
)