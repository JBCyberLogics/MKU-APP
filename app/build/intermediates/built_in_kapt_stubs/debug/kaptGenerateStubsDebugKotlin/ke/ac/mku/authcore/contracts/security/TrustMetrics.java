package ke.ac.mku.authcore.contracts.security;

/**
 * TrustMetrics - SECURITY-004
 *
 * Trust validation metrics for monitoring.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fH\u00c6\u0003Jg\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0014\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010/\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u00100\u001a\u00020\fH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\"\u00a8\u00061"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TrustMetrics;", "", "totalValidations", "", "successfulValidations", "failedValidations", "pinMismatches", "hostnameMismatches", "expiredCertificates", "lastValidationTime", "", "lastFailedHost", "", "lastFailureReason", "<init>", "(IIIIIIJLjava/lang/String;Ljava/lang/String;)V", "getTotalValidations", "()I", "getSuccessfulValidations", "getFailedValidations", "getPinMismatches", "getHostnameMismatches", "getExpiredCertificates", "getLastValidationTime", "()J", "getLastFailedHost", "()Ljava/lang/String;", "getLastFailureReason", "successRate", "", "getSuccessRate", "()F", "isHealthy", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app"})
public final class TrustMetrics {
    private final int totalValidations = 0;
    private final int successfulValidations = 0;
    private final int failedValidations = 0;
    private final int pinMismatches = 0;
    private final int hostnameMismatches = 0;
    private final int expiredCertificates = 0;
    private final long lastValidationTime = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastFailedHost = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastFailureReason = null;
    
    public TrustMetrics(int totalValidations, int successfulValidations, int failedValidations, int pinMismatches, int hostnameMismatches, int expiredCertificates, long lastValidationTime, @org.jetbrains.annotations.Nullable()
    java.lang.String lastFailedHost, @org.jetbrains.annotations.Nullable()
    java.lang.String lastFailureReason) {
        super();
    }
    
    public final int getTotalValidations() {
        return 0;
    }
    
    public final int getSuccessfulValidations() {
        return 0;
    }
    
    public final int getFailedValidations() {
        return 0;
    }
    
    public final int getPinMismatches() {
        return 0;
    }
    
    public final int getHostnameMismatches() {
        return 0;
    }
    
    public final int getExpiredCertificates() {
        return 0;
    }
    
    public final long getLastValidationTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastFailedHost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastFailureReason() {
        return null;
    }
    
    public final float getSuccessRate() {
        return 0.0F;
    }
    
    public final boolean isHealthy() {
        return false;
    }
    
    public TrustMetrics() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.TrustMetrics copy(int totalValidations, int successfulValidations, int failedValidations, int pinMismatches, int hostnameMismatches, int expiredCertificates, long lastValidationTime, @org.jetbrains.annotations.Nullable()
    java.lang.String lastFailedHost, @org.jetbrains.annotations.Nullable()
    java.lang.String lastFailureReason) {
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
}