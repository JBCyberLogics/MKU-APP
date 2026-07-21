package ke.ac.mku.authcore.contracts.security;

/**
 * SECURITY-004: Certificate Pinning Manager Contract
 *
 * Manages certificate pins and performs verification during TLS handshake.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ICertificatePinningManager;", "", "verifyPin", "", "certificate", "Ljava/security/cert/X509Certificate;", "host", "", "isPinningRequired", "getPins", "", "app"})
public abstract interface ICertificatePinningManager {
    
    /**
     * Verify a certificate against a pin set for a host.
     *
     * @param certificate The certificate to verify
     * @param host The host name to check pins for
     * @return true if the certificate is pinned or if no pins are configured.
     */
    public abstract boolean verifyPin(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate certificate, @org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Determine if certificate pinning is required for a host.
     *
     * @param host The host name
     * @return true if pinning is mandatory
     */
    public abstract boolean isPinningRequired(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Get the configured pin hashes for a host.
     *
     * @param host The host name
     * @return List of SHA-256 hashes
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getPins(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
}