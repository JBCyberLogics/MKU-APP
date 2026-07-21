package ke.ac.mku.authcore.contracts.authentication;

/**
 * Workflow metrics data class.
 *
 * @property loginDurationMs Total login duration in milliseconds
 * @property stepsCompleted Number of workflow steps completed
 * @property retryCount Number of retry attempts made
 * @property failureCount Number of failures encountered
 * @property lastErrorCode The error code of the last failure
 * @property startTimestamp Workflow start timestamp
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010 \u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\tH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\""}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/WorkflowMetrics;", "", "loginDurationMs", "", "stepsCompleted", "", "retryCount", "failureCount", "lastErrorCode", "", "startTimestamp", "<init>", "(JIIILjava/lang/String;J)V", "getLoginDurationMs", "()J", "getStepsCompleted", "()I", "getRetryCount", "getFailureCount", "getLastErrorCode", "()Ljava/lang/String;", "getStartTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app"})
public final class WorkflowMetrics {
    private final long loginDurationMs = 0L;
    private final int stepsCompleted = 0;
    private final int retryCount = 0;
    private final int failureCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastErrorCode = null;
    private final long startTimestamp = 0L;
    
    public WorkflowMetrics(long loginDurationMs, int stepsCompleted, int retryCount, int failureCount, @org.jetbrains.annotations.Nullable()
    java.lang.String lastErrorCode, long startTimestamp) {
        super();
    }
    
    public final long getLoginDurationMs() {
        return 0L;
    }
    
    public final int getStepsCompleted() {
        return 0;
    }
    
    public final int getRetryCount() {
        return 0;
    }
    
    public final int getFailureCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastErrorCode() {
        return null;
    }
    
    public final long getStartTimestamp() {
        return 0L;
    }
    
    public WorkflowMetrics() {
        super();
    }
    
    public final long component1() {
        return 0L;
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
    public final java.lang.String component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.authentication.WorkflowMetrics copy(long loginDurationMs, int stepsCompleted, int retryCount, int failureCount, @org.jetbrains.annotations.Nullable()
    java.lang.String lastErrorCode, long startTimestamp) {
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