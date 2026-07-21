package ke.ac.mku.authcore.contracts.security;

/**
 * SecurityMetrics - SECURITY-005
 *
 * Aggregated security monitoring metrics.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010#\u001a\u00020\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\t\u0010&\u001a\u00020\u0012H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\t\u0010.\u001a\u00020\rH\u00c6\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00100\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\u0006\u00103\u001a\u00020\u0012J\t\u00104\u001a\u000205H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00067"}, d2 = {"Lke/ac/mku/authcore/contracts/security/SecurityMetrics;", "", "totalScans", "", "threatsDetected", "threatsBlocked", "incidentsCreated", "incidentsResolved", "auditRecordsWritten", "lastScanTime", "", "lastThreatDetectionTime", "platformHealthScore", "", "securityEventsByLevel", "", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "isPlatformSecure", "", "(IIIIIIJJFLjava/util/Map;Z)V", "getAuditRecordsWritten", "()I", "getIncidentsCreated", "getIncidentsResolved", "()Z", "getLastScanTime", "()J", "getLastThreatDetectionTime", "getPlatformHealthScore", "()F", "getSecurityEventsByLevel", "()Ljava/util/Map;", "getThreatsBlocked", "getThreatsDetected", "getTotalScans", "calculateHealthScore", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isHealthy", "toString", "", "Companion", "app_debug"})
public final class SecurityMetrics {
    private final int totalScans = 0;
    private final int threatsDetected = 0;
    private final int threatsBlocked = 0;
    private final int incidentsCreated = 0;
    private final int incidentsResolved = 0;
    private final int auditRecordsWritten = 0;
    private final long lastScanTime = 0L;
    private final long lastThreatDetectionTime = 0L;
    private final float platformHealthScore = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<ke.ac.mku.authcore.contracts.security.RiskLevel, java.lang.Integer> securityEventsByLevel = null;
    private final boolean isPlatformSecure = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.SecurityMetrics.Companion Companion = null;
    
    public SecurityMetrics(int totalScans, int threatsDetected, int threatsBlocked, int incidentsCreated, int incidentsResolved, int auditRecordsWritten, long lastScanTime, long lastThreatDetectionTime, float platformHealthScore, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.security.RiskLevel, java.lang.Integer> securityEventsByLevel, boolean isPlatformSecure) {
        super();
    }
    
    public final int getTotalScans() {
        return 0;
    }
    
    public final int getThreatsDetected() {
        return 0;
    }
    
    public final int getThreatsBlocked() {
        return 0;
    }
    
    public final int getIncidentsCreated() {
        return 0;
    }
    
    public final int getIncidentsResolved() {
        return 0;
    }
    
    public final int getAuditRecordsWritten() {
        return 0;
    }
    
    public final long getLastScanTime() {
        return 0L;
    }
    
    public final long getLastThreatDetectionTime() {
        return 0L;
    }
    
    public final float getPlatformHealthScore() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.security.RiskLevel, java.lang.Integer> getSecurityEventsByLevel() {
        return null;
    }
    
    public final boolean isPlatformSecure() {
        return false;
    }
    
    /**
     * Calculate the overall health score based on metrics.
     */
    public final float calculateHealthScore() {
        return 0.0F;
    }
    
    /**
     * Check if the platform is in a healthy security state.
     */
    public final boolean isHealthy() {
        return false;
    }
    
    public SecurityMetrics() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.security.RiskLevel, java.lang.Integer> component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
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
    
    public final long component8() {
        return 0L;
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.SecurityMetrics copy(int totalScans, int threatsDetected, int threatsBlocked, int incidentsCreated, int incidentsResolved, int auditRecordsWritten, long lastScanTime, long lastThreatDetectionTime, float platformHealthScore, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.security.RiskLevel, java.lang.Integer> securityEventsByLevel, boolean isPlatformSecure) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lke/ac/mku/authcore/contracts/security/SecurityMetrics$Companion;", "", "()V", "empty", "Lke/ac/mku/authcore/contracts/security/SecurityMetrics;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create initial empty metrics.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.SecurityMetrics empty() {
            return null;
        }
    }
}