package ke.ac.mku.authcore.contracts.security;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\rH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH&J$\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00140\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001cH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H&J\b\u0010#\u001a\u00020\u0003H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010%\u001a\u00020\u0003H&J\u0016\u0010&\u001a\u00020\u00032\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J#\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\u0006\u0010\b\u001a\u00020\tH&\u00a2\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020/2\u0006\u0010\b\u001a\u00020\tH&\u00a8\u00060"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ICertificateTrustManager;", "", "addTrustedHost", "", "endpoint", "Lke/ac/mku/authcore/contracts/security/TrustedEndpoint;", "checkPins", "Lke/ac/mku/authcore/contracts/security/PinValidationResult;", "host", "", "certificate", "Ljava/security/cert/X509Certificate;", "clearCachedCertificate", "", "clearTrustCache", "getCertificateForHost", "getCertificateInfo", "Lke/ac/mku/authcore/contracts/security/CertificateInfo;", "getExpiringCertificates", "", "Lkotlin/Pair;", "", "daysThreshold", "getHostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getMetrics", "Lke/ac/mku/authcore/contracts/security/TrustMetrics;", "getPinSets", "", "Lke/ac/mku/authcore/contracts/security/PinSet;", "getSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getTrustManager", "Ljavax/net/ssl/X509TrustManager;", "getTrustedHosts", "initialize", "isHostTrusted", "isInitialized", "refreshPins", "pinSets", "removeTrustedHost", "validateCertificate", "Lke/ac/mku/authcore/contracts/security/ValidationResult;", "chain", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Lke/ac/mku/authcore/contracts/security/ValidationResult;", "verifyTrust", "Lke/ac/mku/authcore/contracts/security/TrustStatus;", "app_debug"})
public abstract interface ICertificateTrustManager {
    
    /**
     * Check if the trust manager is initialized and ready.
     */
    public abstract boolean isInitialized();
    
    /**
     * Initialize the trust manager with configured pins.
     * Called automatically on startup after secure_storage_ready.
     */
    public abstract boolean initialize();
    
    /**
     * Validate a certificate chain for a specific host.
     *
     * @param chain The certificate chain from the server
     * @param host The hostname the certificate is presented for
     * @return ValidationResult with trust status
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.ValidationResult validateCertificate(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Verify trust for a specific host.
     *
     * @param host The hostname to verify
     * @return TrustStatus indicating the trust level
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.TrustStatus verifyTrust(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Check if a host is trusted (has valid pinned certificate).
     *
     * @param host The hostname to check
     * @return true if the host is trusted
     */
    public abstract boolean isHostTrusted(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Verify certificate pins against the configured pins for a host.
     *
     * @param host The hostname
     * @param certificate The certificate to verify
     * @return PinValidationResult with pin match status
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.PinValidationResult checkPins(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate certificate);
    
    /**
     * Refresh certificate pins for a host.
     *
     * @param pinSets List of new pin sets
     * @return true if refresh was successful
     */
    public abstract boolean refreshPins(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.contracts.security.PinSet> pinSets);
    
    /**
     * Get current pin sets for all hosts.
     *
     * @return Map of host to PinSet
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, ke.ac.mku.authcore.contracts.security.PinSet> getPinSets();
    
    /**
     * Get certificate information.
     *
     * @param certificate The certificate to analyze
     * @return CertificateInfo with extracted details
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.CertificateInfo getCertificateInfo(@org.jetbrains.annotations.NotNull()
    java.security.cert.X509Certificate certificate);
    
    /**
     * Get the currently cached certificate for a host.
     *
     * @param host The hostname
     * @return The cached X509Certificate or null
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.security.cert.X509Certificate getCertificateForHost(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Get list of all trusted hosts.
     *
     * @return List of trusted hostnames
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getTrustedHosts();
    
    /**
     * Add a host to the trusted list.
     *
     * @param endpoint The trusted endpoint configuration
     * @return true if added successfully
     */
    public abstract boolean addTrustedHost(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.TrustedEndpoint endpoint);
    
    /**
     * Remove a host from the trusted list.
     *
     * @param host The hostname to remove
     * @return true if removed successfully
     */
    public abstract boolean removeTrustedHost(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Clear the trust cache.
     * Forces re-validation on next connection.
     */
    public abstract void clearTrustCache();
    
    /**
     * Clear cached certificate for a specific host.
     *
     * @param host The hostname
     */
    public abstract void clearCachedCertificate(@org.jetbrains.annotations.NotNull()
    java.lang.String host);
    
    /**
     * Get the configured SSL socket factory for OkHttp.
     *
     * @return Configured javax.net.ssl.SSLSocketFactory
     */
    @org.jetbrains.annotations.NotNull()
    public abstract javax.net.ssl.SSLSocketFactory getSSLSocketFactory();
    
    /**
     * Get the X509TrustManager for certificate validation.
     *
     * @return The custom X509TrustManager
     */
    @org.jetbrains.annotations.NotNull()
    public abstract javax.net.ssl.X509TrustManager getTrustManager();
    
    /**
     * Get the HostnameVerifier for hostname validation.
     *
     * @return The custom HostnameVerifier
     */
    @org.jetbrains.annotations.NotNull()
    public abstract javax.net.ssl.HostnameVerifier getHostnameVerifier();
    
    /**
     * Get trust validation metrics.
     *
     * @return TrustMetrics with current statistics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.TrustMetrics getMetrics();
    
    /**
     * Check if any certificates are expiring soon.
     *
     * @param daysThreshold Days before expiration to trigger warning
     * @return List of hosts with expiring certificates
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> getExpiringCertificates(int daysThreshold);
    
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
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}