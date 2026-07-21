package ke.ac.mku.authcore.contracts.session;

/**
 * SessionManagerMetrics - SESSION-001
 *
 * Metrics for session management operations.
 * Tracks session lifecycle statistics.
 *
 * @property totalSessions Total sessions created
 * @property activeSessions Currently active sessions
 * @property expiredSessions Total sessions that expired
 * @property averageSessionDurationMs Average session duration in milliseconds
 * @property totalRefreshCount Total refresh operations
 * @property failedRefreshCount Failed refresh operations
 * @property lastSessionTimestamp Timestamp of last session activity
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\"\u001a\u00020#H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006$"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionManagerMetrics;", "", "totalSessions", "", "activeSessions", "", "expiredSessions", "averageSessionDurationMs", "totalRefreshCount", "failedRefreshCount", "lastSessionTimestamp", "<init>", "(JIJJJJJ)V", "getTotalSessions", "()J", "getActiveSessions", "()I", "getExpiredSessions", "getAverageSessionDurationMs", "getTotalRefreshCount", "getFailedRefreshCount", "getLastSessionTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app"})
public final class SessionManagerMetrics {
    private final long totalSessions = 0L;
    private final int activeSessions = 0;
    private final long expiredSessions = 0L;
    private final long averageSessionDurationMs = 0L;
    private final long totalRefreshCount = 0L;
    private final long failedRefreshCount = 0L;
    private final long lastSessionTimestamp = 0L;
    
    public SessionManagerMetrics(long totalSessions, int activeSessions, long expiredSessions, long averageSessionDurationMs, long totalRefreshCount, long failedRefreshCount, long lastSessionTimestamp) {
        super();
    }
    
    public final long getTotalSessions() {
        return 0L;
    }
    
    public final int getActiveSessions() {
        return 0;
    }
    
    public final long getExpiredSessions() {
        return 0L;
    }
    
    public final long getAverageSessionDurationMs() {
        return 0L;
    }
    
    public final long getTotalRefreshCount() {
        return 0L;
    }
    
    public final long getFailedRefreshCount() {
        return 0L;
    }
    
    public final long getLastSessionTimestamp() {
        return 0L;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.session.SessionManagerMetrics copy(long totalSessions, int activeSessions, long expiredSessions, long averageSessionDurationMs, long totalRefreshCount, long failedRefreshCount, long lastSessionTimestamp) {
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