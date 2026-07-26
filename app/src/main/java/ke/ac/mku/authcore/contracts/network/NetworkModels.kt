package ke.ac.mku.authcore.contracts.network

/**
 * Represents a raw HTTP response received from the network stack.
 */
data class RawResponse(
    val statusCode: Int,
    val headers: Map<String, String>,
    val body: ByteArray?,
    val url: String,
    val isTlsVerified: Boolean,
    val timestamp: Long = System.currentTimeMillis()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as RawResponse
        return statusCode == other.statusCode && url == other.url && timestamp == other.timestamp
    }

    override fun hashCode(): Int {
        var result = statusCode
        result = 31 * result + url.hashCode()
        result = 31 * result + timestamp.hashCode()
        return result
    }
}

/**
 * Represents a response after being processed by the pipeline.
 */
data class ProcessedResponse(
    val isSuccess: Boolean,
    val statusCode: Int,
    val statusLabel: String,
    val sanitizedBody: String?,
    val headers: Map<String, String>,
    val cookies: Map<String, String>,
    val metadata: Map<String, String> = emptyMap()
)
