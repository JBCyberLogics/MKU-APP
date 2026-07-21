package ke.ac.mku.authcore.contracts.security

/**
 * TrustedEndpoint - SECURITY-004
 *
 * Configuration for a trusted endpoint that requires certificate pinning.
 */
data class TrustedEndpoint(
    val host: String,
    val baseUrl: String,
    val requirePinning: Boolean = true,
    val allowSubdomains: Boolean = false,
    val description: String = ""
) {
    /**
     * Check if a given hostname matches this trusted endpoint.
     */
    fun matchesHostname(hostname: String): Boolean {
        if (hostname == host) return true
        if (allowSubdomains && hostname.endsWith(".$host")) return true
        return false
    }

    /**
     * Check if the base URL uses HTTPS.
     */
    fun isSecure(): Boolean = baseUrl.startsWith("https://")

    companion object {
        /**
         * Default MKU trusted endpoints.
         */
        val DEFAULT_ENDPOINTS = listOf(
            TrustedEndpoint(
                host = "login.mku.ac.ke",
                baseUrl = "https://login.mku.ac.ke",
                requirePinning = true,
                allowSubdomains = false,
                description = "MKU Student Authentication Portal"
            ),
            TrustedEndpoint(
                host = "student.mku.ac.ke",
                baseUrl = "https://student.mku.ac.ke",
                requirePinning = true,
                allowSubdomains = false,
                description = "MKU Student Portal"
            )
        )

        /**
         * Get a trusted endpoint by hostname.
         */
        fun fromHostname(hostname: String): TrustedEndpoint? {
            return DEFAULT_ENDPOINTS.find { it.matchesHostname(hostname) }
        }

        /**
         * Check if a hostname is a trusted endpoint.
         */
        fun isTrusted(hostname: String): Boolean {
            return DEFAULT_ENDPOINTS.any { it.matchesHostname(hostname) }
        }
    }
}

/**
 * TlsConfiguration - SECURITY-004
 *
 * TLS/SSL configuration for secure connections.
 */
data class TlsConfiguration(
    val minimumVersion: TlsVersion = TlsVersion.TLS_1_3,
    val allowTls12Fallback: Boolean = true,
    val requireSecureRenegotiation: Boolean = true,
    val requireServerAuthentication: Boolean = true,
    val requireClientAuthentication: Boolean = false
) {
    enum class TlsVersion(val version: String, val major: Int, val minor: Int) {
        TLS_1_3("TLS 1.3", 1, 3),
        TLS_1_2("TLS 1.2", 1, 2);

        companion object {
            fun fromString(version: String): TlsVersion {
                return entries.find { it.version.equals(version, ignoreCase = true) } ?: TLS_1_3
            }
        }
    }

    companion object {
        /**
         * Default secure TLS configuration.
         */
        val SECURE_CONFIG = TlsConfiguration(
            minimumVersion = TlsVersion.TLS_1_3,
            allowTls12Fallback = true,
            requireSecureRenegotiation = true,
            requireServerAuthentication = true,
            requireClientAuthentication = false
        )
    }
}