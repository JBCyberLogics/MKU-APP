package ke.ac.mku.authcore.contracts.security

import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager

/**
 * ICertificateTrustManager - SECURITY-004
 *
 * Central certificate trust management contract for the Authentication Platform.
 * Provides TLS certificate validation, certificate pinning, hostname verification,
 * and trust chain validation for all secure communications.
 *
 * All HTTPS connections must go through this manager to ensure certificate pinning
 * and trust validation are enforced.
 *
 * Contract Reference: CORE-012, SECURITY-004
 */
interface ICertificateTrustManager {

    // ==================== INITIALIZATION ====================

    /**
     * Check if the trust manager is initialized and ready.
     */
    fun isInitialized(): Boolean

    /**
     * Initialize the trust manager with configured pins.
     * Called automatically on startup after secure_storage_ready.
     */
    fun initialize(): Boolean

    // ==================== CERTIFICATE VALIDATION ====================

    /**
     * Validate a certificate chain for a specific host.
     *
     * @param chain The certificate chain from the server
     * @param host The hostname the certificate is presented for
     * @return ValidationResult with trust status
     */
    fun validateCertificate(chain: Array<X509Certificate>, host: String): ValidationResult

    /**
     * Verify trust for a specific host.
     *
     * @param host The hostname to verify
     * @return TrustStatus indicating the trust level
     */
    fun verifyTrust(host: String): TrustStatus

    /**
     * Check if a host is trusted (has valid pinned certificate).
     *
     * @param host The hostname to check
     * @return true if the host is trusted
     */
    fun isHostTrusted(host: String): Boolean

    // ==================== CERTIFICATE PINNING ====================

    /**
     * Verify certificate pins against the configured pins for a host.
     *
     * @param host The hostname
     * @param certificate The certificate to verify
     * @return PinValidationResult with pin match status
     */
    fun checkPins(host: String, certificate: X509Certificate): PinValidationResult

    /**
     * Refresh certificate pins for a host.
     *
     * @param pinSets List of new pin sets
     * @return true if refresh was successful
     */
    fun refreshPins(pinSets: List<PinSet>): Boolean

    /**
     * Get current pin sets for all hosts.
     *
     * @return Map of host to PinSet
     */
    fun getPinSets(): Map<String, PinSet>

    // ==================== CERTIFICATE INFO ====================

    /**
     * Get certificate information.
     *
     * @param certificate The certificate to analyze
     * @return CertificateInfo with extracted details
     */
    fun getCertificateInfo(certificate: X509Certificate): CertificateInfo

    /**
     * Get the currently cached certificate for a host.
     *
     * @param host The hostname
     * @return The cached X509Certificate or null
     */
    fun getCertificateForHost(host: String): X509Certificate?

    // ==================== TRUSTED HOSTS ====================

    /**
     * Get list of all trusted hosts.
     *
     * @return List of trusted hostnames
     */
    fun getTrustedHosts(): List<String>

    /**
     * Add a host to the trusted list.
     *
     * @param endpoint The trusted endpoint configuration
     * @return true if added successfully
     */
    fun addTrustedHost(endpoint: TrustedEndpoint): Boolean

    /**
     * Remove a host from the trusted list.
     *
     * @param host The hostname to remove
     * @return true if removed successfully
     */
    fun removeTrustedHost(host: String): Boolean

    // ==================== CACHE MANAGEMENT ====================

    /**
     * Clear the trust cache.
     * Forces re-validation on next connection.
     */
    fun clearTrustCache()

    /**
     * Clear cached certificate for a specific host.
     *
     * @param host The hostname
     */
    fun clearCachedCertificate(host: String)

    // ==================== SSL FACTORY ACCESS ====================

    /**
     * Get the configured SSL socket factory for OkHttp.
     *
     * @return Configured javax.net.ssl.SSLSocketFactory
     */
    fun getSSLSocketFactory(): javax.net.ssl.SSLSocketFactory

    /**
     * Get the X509TrustManager for certificate validation.
     *
     * @return The custom X509TrustManager
     */
    fun getTrustManager(): X509TrustManager

    /**
     * Get the HostnameVerifier for hostname validation.
     *
     * @return The custom HostnameVerifier
     */
    fun getHostnameVerifier(): javax.net.ssl.HostnameVerifier

    // ==================== MONITORING ====================

    /**
     * Get trust validation metrics.
     *
     * @return TrustMetrics with current statistics
     */
    fun getMetrics(): TrustMetrics

    /**
     * Check if any certificates are expiring soon.
     *
     * @param daysThreshold Days before expiration to trigger warning
     * @return List of hosts with expiring certificates
     */
    fun getExpiringCertificates(daysThreshold: Int = 30): List<Pair<String, Int>>
}