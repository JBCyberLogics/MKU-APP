package ke.ac.mku.authcore.contracts.cookie

/**
 * COOKIE-002: Cookie Synchronization Manager Contract
 *
 * Coordinates secure synchronization of authentication cookies between
 * the Session, Network, Portal and Endpoint layers.
 */
interface ICookieSynchronizationManager {

    /**
     * Synchronize all authentication cookies across all layers.
     */
    fun synchronizeCookies()

    /**
     * Synchronize cookies specifically with SessionManager.
     */
    fun synchronizeSession()

    /**
     * Synchronize cookies specifically with Network layer.
     */
    fun synchronizeNetwork()

    /**
     * Synchronize cookies specifically with Portal layer.
     */
    fun synchronizePortal()

    /**
     * Detect inconsistent cookie states between synchronization targets.
     *
     * @return true if conflicts are detected.
     */
    fun detectConflicts(): Boolean

    /**
     * Resolve detected cookie conflicts using policy.
     */
    fun resolveConflicts()

    /**
     * Returns the current synchronization status.
     *
     * @return SynchronizationStatus details.
     */
    fun getSynchronizationStatus(): SynchronizationStatus
}

/**
 * Represents the current status of cookie synchronization.
 */
data class SynchronizationStatus(
    val lastSyncTimestamp: Long,
    val isConsistent: Boolean,
    val pendingSync: Boolean,
    val activeConflicts: Int
)
