package ke.ac.mku.authcore.contracts.portal;

/**
 * IContextSynchronizationManager - PROGRAM-012
 *
 * Interface for the incremental context synchronization engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IContextSynchronizationManager;", "", "startSynchronization", "", "stopSynchronization", "getSyncStatus", "Lke/ac/mku/authcore/domain/model/portal/SyncStatus;", "getLatestDelta", "Lke/ac/mku/authcore/domain/model/portal/ContextDelta;", "forceSync", "app"})
public abstract interface IContextSynchronizationManager {
    
    /**
     * Start the continuous background synchronization process.
     */
    public abstract void startSynchronization();
    
    /**
     * Stop the synchronization engine.
     */
    public abstract void stopSynchronization();
    
    /**
     * Return the current synchronization status.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.SyncStatus getSyncStatus();
    
    /**
     * Return the latest computed context delta.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.ContextDelta getLatestDelta();
    
    /**
     * Force a full synchronization across all domains.
     */
    public abstract void forceSync();
}