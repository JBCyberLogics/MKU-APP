package ke.ac.mku.authcore.contracts.session;

/**
 * SESSION-003: Session Recovery Metrics
 *
 * Tracks recovery operation statistics for monitoring and debugging.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\u000fH\u00c6\u0003J\t\u0010.\u001a\u00020\u0011H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\u008b\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020=H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015\u00a8\u0006>"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionRecoveryMetrics;", "", "totalAttempts", "", "successfulRecoveries", "failedRecoveries", "reauthentications", "sessionRecreations", "abortedRecoveries", "averageRecoveryTimeMs", "", "lastRecoveryAttempt", "lastSuccessfulRecovery", "lastFailedRecovery", "currentState", "Lke/ac/mku/authcore/contracts/session/RecoveryState;", "circuitBreakerOpen", "", "consecutiveFailures", "(IIIIIIJJJJLke/ac/mku/authcore/contracts/session/RecoveryState;ZI)V", "getAbortedRecoveries", "()I", "getAverageRecoveryTimeMs", "()J", "canRecover", "getCanRecover", "()Z", "getCircuitBreakerOpen", "getConsecutiveFailures", "getCurrentState", "()Lke/ac/mku/authcore/contracts/session/RecoveryState;", "getFailedRecoveries", "getLastFailedRecovery", "getLastRecoveryAttempt", "getLastSuccessfulRecovery", "getReauthentications", "getSessionRecreations", "successRate", "", "getSuccessRate", "()F", "getSuccessfulRecoveries", "getTotalAttempts", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class SessionRecoveryMetrics {
    
    /**
     * Total recovery attempts since app start
     */
    private final int totalAttempts = 0;
    
    /**
     * Successful recoveries
     */
    private final int successfulRecoveries = 0;
    
    /**
     * Failed recoveries
     */
    private final int failedRecoveries = 0;
    
    /**
     * Recoveries that required re-authentication
     */
    private final int reauthentications = 0;
    
    /**
     * Recoveries that recreated session from scratch
     */
    private final int sessionRecreations = 0;
    
    /**
     * Aborted recovery attempts
     */
    private final int abortedRecoveries = 0;
    
    /**
     * Average recovery time in milliseconds
     */
    private final long averageRecoveryTimeMs = 0L;
    
    /**
     * Last recovery timestamp
     */
    private final long lastRecoveryAttempt = 0L;
    
    /**
     * Last successful recovery timestamp
     */
    private final long lastSuccessfulRecovery = 0L;
    
    /**
     * Last failed recovery timestamp
     */
    private final long lastFailedRecovery = 0L;
    
    /**
     * Current recovery state
     */
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.session.RecoveryState currentState = null;
    
    /**
     * Whether circuit breaker is open
     */
    private final boolean circuitBreakerOpen = false;
    
    /**
     * Number of consecutive failures
     */
    private final int consecutiveFailures = 0;
    
    public SessionRecoveryMetrics(int totalAttempts, int successfulRecoveries, int failedRecoveries, int reauthentications, int sessionRecreations, int abortedRecoveries, long averageRecoveryTimeMs, long lastRecoveryAttempt, long lastSuccessfulRecovery, long lastFailedRecovery, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.RecoveryState currentState, boolean circuitBreakerOpen, int consecutiveFailures) {
        super();
    }
    
    /**
     * Total recovery attempts since app start
     */
    public final int getTotalAttempts() {
        return 0;
    }
    
    /**
     * Successful recoveries
     */
    public final int getSuccessfulRecoveries() {
        return 0;
    }
    
    /**
     * Failed recoveries
     */
    public final int getFailedRecoveries() {
        return 0;
    }
    
    /**
     * Recoveries that required re-authentication
     */
    public final int getReauthentications() {
        return 0;
    }
    
    /**
     * Recoveries that recreated session from scratch
     */
    public final int getSessionRecreations() {
        return 0;
    }
    
    /**
     * Aborted recovery attempts
     */
    public final int getAbortedRecoveries() {
        return 0;
    }
    
    /**
     * Average recovery time in milliseconds
     */
    public final long getAverageRecoveryTimeMs() {
        return 0L;
    }
    
    /**
     * Last recovery timestamp
     */
    public final long getLastRecoveryAttempt() {
        return 0L;
    }
    
    /**
     * Last successful recovery timestamp
     */
    public final long getLastSuccessfulRecovery() {
        return 0L;
    }
    
    /**
     * Last failed recovery timestamp
     */
    public final long getLastFailedRecovery() {
        return 0L;
    }
    
    /**
     * Current recovery state
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.session.RecoveryState getCurrentState() {
        return null;
    }
    
    /**
     * Whether circuit breaker is open
     */
    public final boolean getCircuitBreakerOpen() {
        return false;
    }
    
    /**
     * Number of consecutive failures
     */
    public final int getConsecutiveFailures() {
        return 0;
    }
    
    public final float getSuccessRate() {
        return 0.0F;
    }
    
    public final boolean getCanRecover() {
        return false;
    }
    
    public SessionRecoveryMetrics() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.session.RecoveryState component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final int component13() {
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
    
    public final long component8() {
        return 0L;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics copy(int totalAttempts, int successfulRecoveries, int failedRecoveries, int reauthentications, int sessionRecreations, int abortedRecoveries, long averageRecoveryTimeMs, long lastRecoveryAttempt, long lastSuccessfulRecovery, long lastFailedRecovery, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.RecoveryState currentState, boolean circuitBreakerOpen, int consecutiveFailures) {
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