package ke.ac.mku.authcore.contracts.security;

import java.security.cert.X509Certificate;

/**
 * CertificateInfo - SECURITY-004
 *
 * Extracted information from an X509Certificate.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b&\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\t\u0010,\u001a\u00020\u000eH\u00c6\u0003J}\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0001J\u0006\u0010.\u001a\u00020\fJ\u0013\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\fJ\t\u00103\u001a\u00020\fH\u00d6\u0001J\u0006\u00104\u001a\u00020\u000eJ\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 \u00a8\u00067"}, d2 = {"Lke/ac/mku/authcore/contracts/security/CertificateInfo;", "", "subject", "", "issuer", "validFrom", "", "validUntil", "serialNumber", "fingerprint", "publicKeyAlgorithm", "keySize", "", "isSelfSigned", "", "signatureAlgorithm", "subjectAlternativeNames", "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;)V", "getFingerprint", "()Ljava/lang/String;", "()Z", "getIssuer", "getKeySize", "()I", "getPublicKeyAlgorithm", "getSerialNumber", "getSignatureAlgorithm", "getSubject", "getSubjectAlternativeNames", "()Ljava/util/List;", "getValidFrom", "()J", "getValidUntil", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "daysUntilExpiration", "equals", "other", "expiresWithin", "days", "hashCode", "isCurrentlyValid", "toString", "Companion", "app_debug"})
public final class CertificateInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String issuer = null;
    private final long validFrom = 0L;
    private final long validUntil = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serialNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fingerprint = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publicKeyAlgorithm = null;
    private final int keySize = 0;
    private final boolean isSelfSigned = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signatureAlgorithm = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> subjectAlternativeNames = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.CertificateInfo.Companion Companion = null;
    
    public CertificateInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String issuer, long validFrom, long validUntil, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String fingerprint, @org.jetbrains.annotations.NotNull()
    java.lang.String publicKeyAlgorithm, int keySize, boolean isSelfSigned, @org.jetbrains.annotations.NotNull()
    java.lang.String signatureAlgorithm, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> subjectAlternativeNames) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssuer() {
        return null;
    }
    
    public final long getValidFrom() {
        return 0L;
    }
    
    public final long getValidUntil() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSerialNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFingerprint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublicKeyAlgorithm() {
        return null;
    }
    
    public final int getKeySize() {
        return 0;
    }
    
    public final boolean isSelfSigned() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignatureAlgorithm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSubjectAlternativeNames() {
        return null;
    }
    
    /**
     * Check if the certificate is currently valid (not expired and not yet valid).
     */
    public final boolean isCurrentlyValid() {
        return false;
    }
    
    /**
     * Check if the certificate expires within the specified days.
     */
    public final boolean expiresWithin(int days) {
        return false;
    }
    
    /**
     * Get days until expiration.
     */
    public final int daysUntilExpiration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.CertificateInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String issuer, long validFrom, long validUntil, @org.jetbrains.annotations.NotNull()
    java.lang.String serialNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String fingerprint, @org.jetbrains.annotations.NotNull()
    java.lang.String publicKeyAlgorithm, int keySize, boolean isSelfSigned, @org.jetbrains.annotations.NotNull()
    java.lang.String signatureAlgorithm, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> subjectAlternativeNames) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/CertificateInfo$Companion;", "", "()V", "extractKeySize", "", "certificate", "Ljava/security/cert/X509Certificate;", "fromCertificate", "Lke/ac/mku/authcore/contracts/security/CertificateInfo;", "fingerprint", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Extract CertificateInfo from an X509Certificate.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.CertificateInfo fromCertificate(@org.jetbrains.annotations.NotNull()
        java.security.cert.X509Certificate certificate, @org.jetbrains.annotations.NotNull()
        java.lang.String fingerprint) {
            return null;
        }
        
        private final int extractKeySize(java.security.cert.X509Certificate certificate) {
            return 0;
        }
    }
}