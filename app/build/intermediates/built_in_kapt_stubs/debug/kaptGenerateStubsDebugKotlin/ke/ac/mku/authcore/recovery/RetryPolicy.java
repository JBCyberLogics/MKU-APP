package ke.ac.mku.authcore.recovery;

/**
 * RetryPolicy - CORE-011
 *
 * Configures retry behavior with exponential backoff and jitter.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0014\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lke/ac/mku/authcore/recovery/RetryPolicy;", "", "initialDelayMs", "", "maximumDelayMs", "maximumAttempts", "", "jitterEnabled", "", "<init>", "(JJIZ)V", "getInitialDelayMs", "()J", "getMaximumDelayMs", "getMaximumAttempts", "()I", "getJitterEnabled", "()Z", "calculateDelay", "attempt", "canRetry", "getNextDelay", "currentAttempt", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app"})
public final class RetryPolicy {
    private final long initialDelayMs = 0L;
    private final long maximumDelayMs = 0L;
    private final int maximumAttempts = 0;
    private final boolean jitterEnabled = false;
    public static final long DEFAULT_INITIAL_DELAY = 1000L;
    public static final long DEFAULT_MAXIMUM_DELAY = 30000L;
    public static final int DEFAULT_MAX_ATTEMPTS = 3;
    public static final boolean DEFAULT_JITTER_ENABLED = true;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.recovery.RetryPolicy.Companion Companion = null;
    
    public RetryPolicy(long initialDelayMs, long maximumDelayMs, int maximumAttempts, boolean jitterEnabled) {
        super();
    }
    
    public final long getInitialDelayMs() {
        return 0L;
    }
    
    public final long getMaximumDelayMs() {
        return 0L;
    }
    
    public final int getMaximumAttempts() {
        return 0;
    }
    
    public final boolean getJitterEnabled() {
        return false;
    }
    
    /**
     * Calculate delay for a given attempt (1-indexed).
     */
    public final long calculateDelay(int attempt) {
        return 0L;
    }
    
    /**
     * Check if more attempts are allowed.
     */
    public final boolean canRetry(int attempt) {
        return false;
    }
    
    /**
     * Get delay for next attempt.
     */
    public final long getNextDelay(int currentAttempt) {
        return 0L;
    }
    
    public RetryPolicy() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.recovery.RetryPolicy copy(long initialDelayMs, long maximumDelayMs, int maximumAttempts, boolean jitterEnabled) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/recovery/RetryPolicy$Companion;", "", "<init>", "()V", "DEFAULT_INITIAL_DELAY", "", "DEFAULT_MAXIMUM_DELAY", "DEFAULT_MAX_ATTEMPTS", "", "DEFAULT_JITTER_ENABLED", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}