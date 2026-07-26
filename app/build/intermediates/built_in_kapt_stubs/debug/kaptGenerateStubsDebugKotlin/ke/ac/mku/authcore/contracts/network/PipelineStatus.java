package ke.ac.mku.authcore.contracts.network;

/**
 * Pipeline status and metrics.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/contracts/network/PipelineStatus;", "", "totalProcessed", "", "validationFailures", "averageLatencyMs", "", "priorityDistribution", "", "Lke/ac/mku/authcore/contracts/network/PriorityLevel;", "securityRejections", "<init>", "(IIJLjava/util/Map;I)V", "getTotalProcessed", "()I", "getValidationFailures", "getAverageLatencyMs", "()J", "getPriorityDistribution", "()Ljava/util/Map;", "getSecurityRejections", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app"})
public final class PipelineStatus {
    private final int totalProcessed = 0;
    private final int validationFailures = 0;
    private final long averageLatencyMs = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<ke.ac.mku.authcore.contracts.network.PriorityLevel, java.lang.Integer> priorityDistribution = null;
    private final int securityRejections = 0;
    
    public PipelineStatus(int totalProcessed, int validationFailures, long averageLatencyMs, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.network.PriorityLevel, java.lang.Integer> priorityDistribution, int securityRejections) {
        super();
    }
    
    public final int getTotalProcessed() {
        return 0;
    }
    
    public final int getValidationFailures() {
        return 0;
    }
    
    public final long getAverageLatencyMs() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.network.PriorityLevel, java.lang.Integer> getPriorityDistribution() {
        return null;
    }
    
    public final int getSecurityRejections() {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.network.PriorityLevel, java.lang.Integer> component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.PipelineStatus copy(int totalProcessed, int validationFailures, long averageLatencyMs, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.network.PriorityLevel, java.lang.Integer> priorityDistribution, int securityRejections) {
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