package ke.ac.mku.authcore.contracts.portal;

/**
 * Represents the current status of the synchronization engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001J\u0014\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010 \u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\fH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lke/ac/mku/authcore/contracts/portal/SyncStatus;", "", "isRunning", "", "lastSyncTimestamp", "", "successRate", "", "activeConflicts", "", "pendingDomains", "", "", "<init>", "(ZJFILjava/util/List;)V", "()Z", "getLastSyncTimestamp", "()J", "getSuccessRate", "()F", "getActiveConflicts", "()I", "getPendingDomains", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app"})
public final class SyncStatus {
    private final boolean isRunning = false;
    private final long lastSyncTimestamp = 0L;
    private final float successRate = 0.0F;
    private final int activeConflicts = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> pendingDomains = null;
    
    public SyncStatus(boolean isRunning, long lastSyncTimestamp, float successRate, int activeConflicts, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> pendingDomains) {
        super();
    }
    
    public final boolean isRunning() {
        return false;
    }
    
    public final long getLastSyncTimestamp() {
        return 0L;
    }
    
    public final float getSuccessRate() {
        return 0.0F;
    }
    
    public final int getActiveConflicts() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPendingDomains() {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.portal.SyncStatus copy(boolean isRunning, long lastSyncTimestamp, float successRate, int activeConflicts, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> pendingDomains) {
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