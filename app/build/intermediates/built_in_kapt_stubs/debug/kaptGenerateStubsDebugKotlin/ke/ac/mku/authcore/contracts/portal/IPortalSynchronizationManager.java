package ke.ac.mku.authcore.contracts.portal;

/**
 * PORTAL-003: Portal Synchronization Manager Contract
 *
 * Coordinates bidirectional synchronization between the MKU Student Portal 
 * and the local authentication platform.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalSynchronizationManager;", "", "startSynchronization", "", "synchronizeNow", "cancelSynchronization", "getSynchronizationStatus", "Lke/ac/mku/authcore/contracts/portal/SyncStatus;", "resolveConflict", "conflict", "Lke/ac/mku/authcore/contracts/portal/SyncConflict;", "forceRefresh", "app"})
public abstract interface IPortalSynchronizationManager {
    
    /**
     * Start the background synchronization process.
     */
    public abstract void startSynchronization();
    
    /**
     * Immediately trigger portal data synchronization.
     */
    public abstract void synchronizeNow();
    
    /**
     * Cancel any active synchronization operation.
     */
    public abstract void cancelSynchronization();
    
    /**
     * Returns the current synchronization status.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.portal.SyncStatus getSynchronizationStatus();
    
    /**
     * Resolve a detected synchronization conflict.
     */
    public abstract void resolveConflict(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.SyncConflict conflict);
    
    /**
     * Discard local cache and download latest portal state.
     */
    public abstract void forceRefresh();
}