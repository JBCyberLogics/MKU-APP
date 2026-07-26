package ke.ac.mku.authcore.contracts.endpoint;

/**
 * Represents the health status report of an endpoint.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003J\t\u0010$\u001a\u00020\u000eH\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0014\u0010&\u001a\u00020\u000e2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010(\u001a\u00020\fH\u00d6\u0081\u0004J\n\u0010)\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthReport;", "", "identifier", "", "state", "Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthState;", "lastChecked", "", "averageLatencyMs", "availabilityPercent", "", "consecutiveFailures", "", "certificateExpiringSoon", "", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthState;JJFIZ)V", "getIdentifier", "()Ljava/lang/String;", "getState", "()Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthState;", "getLastChecked", "()J", "getAverageLatencyMs", "getAvailabilityPercent", "()F", "getConsecutiveFailures", "()I", "getCertificateExpiringSoon", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"})
public final class EndpointHealthReport {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String identifier = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState state = null;
    private final long lastChecked = 0L;
    private final long averageLatencyMs = 0L;
    private final float availabilityPercent = 0.0F;
    private final int consecutiveFailures = 0;
    private final boolean certificateExpiringSoon = false;
    
    public EndpointHealthReport(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState state, long lastChecked, long averageLatencyMs, float availabilityPercent, int consecutiveFailures, boolean certificateExpiringSoon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState getState() {
        return null;
    }
    
    public final long getLastChecked() {
        return 0L;
    }
    
    public final long getAverageLatencyMs() {
        return 0L;
    }
    
    public final float getAvailabilityPercent() {
        return 0.0F;
    }
    
    public final int getConsecutiveFailures() {
        return 0;
    }
    
    public final boolean getCertificateExpiringSoon() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.endpoint.EndpointHealthReport copy(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState state, long lastChecked, long averageLatencyMs, float availabilityPercent, int consecutiveFailures, boolean certificateExpiringSoon) {
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