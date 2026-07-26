package ke.ac.mku.authcore.contracts.portal;

/**
 * IContextCacheManager - PROGRAM-013
 *
 * Interface for the intelligent, versioned student context cache.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IContextCacheManager;", "", "cacheContext", "", "context", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "getCachedContext", "getSnapshots", "", "Lke/ac/mku/authcore/domain/model/portal/ContextSnapshot;", "restoreFromSnapshot", "", "snapshotId", "", "clearCache", "app"})
public abstract interface IContextCacheManager {
    
    /**
     * Store the current student context in the encrypted cache.
     */
    public abstract void cacheContext(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext context);
    
    /**
     * Retrieve the latest verified student context from cache.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentContext getCachedContext();
    
    /**
     * Return a list of all available immutable context snapshots.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextSnapshot> getSnapshots();
    
    /**
     * Restore the active context from a specific snapshot.
     */
    public abstract boolean restoreFromSnapshot(@org.jetbrains.annotations.NotNull()
    java.lang.String snapshotId);
    
    /**
     * Clear all cached snapshots.
     */
    public abstract void clearCache();
}