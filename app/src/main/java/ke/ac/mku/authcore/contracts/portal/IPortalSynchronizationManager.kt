package ke.ac.mku.authcore.contracts.portal

/**
 * PORTAL-003: Portal Synchronization Manager Contract
 *
 * Coordinates bidirectional synchronization between the MKU Student Portal 
 * and the local authentication platform.
 */
interface IPortalSynchronizationManager {

    /**
     * Start the background synchronization process.
     */
    fun startSynchronization()

    /**
     * Immediately trigger portal data synchronization.
     */
    fun synchronizeNow()

    /**
     * Cancel any active synchronization operation.
     */
    fun cancelSynchronization()

    /**
     * Returns the current synchronization status.
     */
    fun getSynchronizationStatus(): SyncStatus

    /**
     * Resolve a detected synchronization conflict.
     */
    fun resolveConflict(conflict: SyncConflict)

    /**
     * Discard local cache and download latest portal state.
     */
    fun forceRefresh()
}

/**
 * Represents the current status of the synchronization engine.
 */
data class SyncStatus(
    val isRunning: Boolean,
    val lastSyncTimestamp: Long,
    val successRate: Float,
    val activeConflicts: Int,
    val pendingDomains: List<String>
)

/**
 * Represents a synchronization conflict between local and remote state.
 */
data class SyncConflict(
    val domain: String,
    val localTimestamp: Long,
    val serverTimestamp: Long,
    val localValue: String,
    val serverValue: String
)
