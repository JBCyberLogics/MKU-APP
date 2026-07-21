package ke.ac.mku.authcore.contracts.security

import java.security.cert.X509Certificate

/**
 * SECURITY-004: Certificate Pinning Manager Contract
 *
 * Manages certificate pins and performs verification during TLS handshake.
 */
interface ICertificatePinningManager {

    /**
     * Verify a certificate against a pin set for a host.
     *
     * @param certificate The certificate to verify
     * @param host The host name to check pins for
     * @return true if the certificate is pinned or if no pins are configured.
     */
    fun verifyPin(certificate: X509Certificate, host: String): Boolean

    /**
     * Determine if certificate pinning is required for a host.
     *
     * @param host The host name
     * @return true if pinning is mandatory
     */
    fun isPinningRequired(host: String): Boolean

    /**
     * Get the configured pin hashes for a host.
     *
     * @param host The host name
     * @return List of SHA-256 hashes
     */
    fun getPins(host: String): List<String>
}
