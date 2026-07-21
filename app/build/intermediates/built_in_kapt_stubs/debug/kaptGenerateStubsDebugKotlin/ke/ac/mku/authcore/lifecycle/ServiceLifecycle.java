package ke.ac.mku.authcore.lifecycle;

/**
 * Tracks lifecycle information for a single service.
 *
 * @property serviceName The unique name identifying the service
 * @property state The current lifecycle state of the service
 * @property uptimeMillis The cumulative uptime in milliseconds
 * @property failureCount The number of times the service has failed
 * @property lastTransitionTime Timestamp of the last state transition
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u0007J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J;\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010,\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010-\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016\u00a8\u0006."}, d2 = {"Lke/ac/mku/authcore/lifecycle/ServiceLifecycle;", "", "serviceName", "", "state", "Lke/ac/mku/authcore/lifecycle/LifecycleState;", "uptimeMillis", "", "failureCount", "", "lastTransitionTime", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/lifecycle/LifecycleState;JIJ)V", "getServiceName", "()Ljava/lang/String;", "getState", "()Lke/ac/mku/authcore/lifecycle/LifecycleState;", "setState", "(Lke/ac/mku/authcore/lifecycle/LifecycleState;)V", "getUptimeMillis", "()J", "setUptimeMillis", "(J)V", "getFailureCount", "()I", "setFailureCount", "(I)V", "getLastTransitionTime", "setLastTransitionTime", "transitionTo", "", "newState", "recordFailure", "resetFailures", "getCurrentUptime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"})
public final class ServiceLifecycle {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serviceName = null;
    @org.jetbrains.annotations.NotNull()
    private ke.ac.mku.authcore.lifecycle.LifecycleState state;
    private long uptimeMillis;
    private int failureCount;
    private long lastTransitionTime;
    
    public ServiceLifecycle(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.lifecycle.LifecycleState state, long uptimeMillis, int failureCount, long lastTransitionTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.lifecycle.LifecycleState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.lifecycle.LifecycleState p0) {
    }
    
    public final long getUptimeMillis() {
        return 0L;
    }
    
    public final void setUptimeMillis(long p0) {
    }
    
    public final int getFailureCount() {
        return 0;
    }
    
    public final void setFailureCount(int p0) {
    }
    
    public final long getLastTransitionTime() {
        return 0L;
    }
    
    public final void setLastTransitionTime(long p0) {
    }
    
    /**
     * Record a state transition to a new state.
     */
    public final void transitionTo(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.lifecycle.LifecycleState newState) {
    }
    
    /**
     * Increment the failure counter.
     */
    public final void recordFailure() {
    }
    
    /**
     * Reset the failure counter after successful operation.
     */
    public final void resetFailures() {
    }
    
    /**
     * Get the current uptime (current time minus last transition if running).
     */
    public final long getCurrentUptime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.lifecycle.LifecycleState component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.lifecycle.ServiceLifecycle copy(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.lifecycle.LifecycleState state, long uptimeMillis, int failureCount, long lastTransitionTime) {
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