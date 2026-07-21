package ke.ac.mku.authcore.security.audit;

/**
 * Summary of security events.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010 \u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\"H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lke/ac/mku/authcore/security/audit/SecuritySummary;", "", "totalEvents", "", "sessionEvents", "threatEvents", "criticalEvents", "lastSessionCreated", "Lke/ac/mku/authcore/security/audit/SecurityEvent$SessionCreated;", "lastThreat", "Lke/ac/mku/authcore/security/audit/SecurityEvent$ThreatDetected;", "<init>", "(IIIILke/ac/mku/authcore/security/audit/SecurityEvent$SessionCreated;Lke/ac/mku/authcore/security/audit/SecurityEvent$ThreatDetected;)V", "getTotalEvents", "()I", "getSessionEvents", "getThreatEvents", "getCriticalEvents", "getLastSessionCreated", "()Lke/ac/mku/authcore/security/audit/SecurityEvent$SessionCreated;", "getLastThreat", "()Lke/ac/mku/authcore/security/audit/SecurityEvent$ThreatDetected;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app"})
public final class SecuritySummary {
    private final int totalEvents = 0;
    private final int sessionEvents = 0;
    private final int threatEvents = 0;
    private final int criticalEvents = 0;
    @org.jetbrains.annotations.Nullable()
    private final ke.ac.mku.authcore.security.audit.SecurityEvent.SessionCreated lastSessionCreated = null;
    @org.jetbrains.annotations.Nullable()
    private final ke.ac.mku.authcore.security.audit.SecurityEvent.ThreatDetected lastThreat = null;
    
    public SecuritySummary(int totalEvents, int sessionEvents, int threatEvents, int criticalEvents, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.security.audit.SecurityEvent.SessionCreated lastSessionCreated, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.security.audit.SecurityEvent.ThreatDetected lastThreat) {
        super();
    }
    
    public final int getTotalEvents() {
        return 0;
    }
    
    public final int getSessionEvents() {
        return 0;
    }
    
    public final int getThreatEvents() {
        return 0;
    }
    
    public final int getCriticalEvents() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.security.audit.SecurityEvent.SessionCreated getLastSessionCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.security.audit.SecurityEvent.ThreatDetected getLastThreat() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.security.audit.SecurityEvent.SessionCreated component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.security.audit.SecurityEvent.ThreatDetected component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.audit.SecuritySummary copy(int totalEvents, int sessionEvents, int threatEvents, int criticalEvents, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.security.audit.SecurityEvent.SessionCreated lastSessionCreated, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.security.audit.SecurityEvent.ThreatDetected lastThreat) {
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