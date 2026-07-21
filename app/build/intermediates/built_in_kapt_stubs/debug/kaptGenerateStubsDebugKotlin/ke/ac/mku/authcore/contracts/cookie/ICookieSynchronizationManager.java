package ke.ac.mku.authcore.contracts.cookie;

/**
 * COOKIE-002: Cookie Synchronization Manager Contract
 *
 * Coordinates secure synchronization of authentication cookies between
 * the Session, Network, Portal and Endpoint layers.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/cookie/ICookieSynchronizationManager;", "", "synchronizeCookies", "", "synchronizeSession", "synchronizeNetwork", "synchronizePortal", "detectConflicts", "", "resolveConflicts", "getSynchronizationStatus", "Lke/ac/mku/authcore/contracts/cookie/SynchronizationStatus;", "app"})
public abstract interface ICookieSynchronizationManager {
    
    /**
     * Synchronize all authentication cookies across all layers.
     */
    public abstract void synchronizeCookies();
    
    /**
     * Synchronize cookies specifically with SessionManager.
     */
    public abstract void synchronizeSession();
    
    /**
     * Synchronize cookies specifically with Network layer.
     */
    public abstract void synchronizeNetwork();
    
    /**
     * Synchronize cookies specifically with Portal layer.
     */
    public abstract void synchronizePortal();
    
    /**
     * Detect inconsistent cookie states between synchronization targets.
     *
     * @return true if conflicts are detected.
     */
    public abstract boolean detectConflicts();
    
    /**
     * Resolve detected cookie conflicts using policy.
     */
    public abstract void resolveConflicts();
    
    /**
     * Returns the current synchronization status.
     *
     * @return SynchronizationStatus details.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.cookie.SynchronizationStatus getSynchronizationStatus();
}