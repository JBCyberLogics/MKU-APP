package ke.ac.mku.authcore.domain.model.portal

/**
 * RequestRegistryModels - PORTAL-004
 *
 * Models for cataloging and fingerprinting runtime portal requests.
 */

data class RequestRegistry(
    val requests: List<DiscoveredRequest> = emptyList(),
    val endpoints: List<DiscoveredEndpoint> = emptyList(),
    val lastUpdated: Long
)

data class DiscoveredRequest(
    val id: String,
    val method: String,
    val url: String,
    val category: String,
    val fingerprint: String,
    val parameters: List<ParameterMetadata> = emptyList(),
    val responseSchema: String? = null,
    val lastObserved: Long
)

data class DiscoveredEndpoint(
    val method: String,
    val url: String,
    val isSecure: Boolean,
    val requiresAuth: Boolean = true,
    val discoverySource: String
)

data class ParameterMetadata(
    val name: String,
    val type: String,
    val isRequired: Boolean,
    val source: ParameterSource
)

enum class ParameterSource {
    QUERY,
    FORM,
    JSON_BODY,
    HEADER,
    PATH
}

data class RequestFingerprint(
    val signature: String,
    val algorithm: String = "SHA-256",
    val dataPoints: Map<String, String>
)

data class CsrfTokenEntry(
    val name: String,
    val value: String,
    val expiry: Long,
    val associatedUrl: String? = null
)
