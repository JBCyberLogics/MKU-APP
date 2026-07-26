package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.ContextDelta
import ke.ac.mku.authcore.domain.model.portal.SyncStatus

/**
 * IContextSynchronizationManager - PROGRAM-012
 *
 * Interface for the incremental context synchronization engine.
 */
interface IContextSynchronizationManager {

    /**
     * Start the continuous background synchronization process.
     */
    fun startSynchronization()

    /**
     * Stop the synchronization engine.
     */
    fun stopSynchronization()

    /**
     * Return the current synchronization status.
     */
    fun getSyncStatus(): SyncStatus

    /**
     * Return the latest computed context delta.
     */
    fun getLatestDelta(): ContextDelta?

    /**
     * Force a full synchronization across all domains.
     */
    fun forceSync()
}
