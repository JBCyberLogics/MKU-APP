package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.ContextSnapshot
import ke.ac.mku.authcore.domain.model.portal.StudentContext

/**
 * IContextCacheManager - PROGRAM-013
 *
 * Interface for the intelligent, versioned student context cache.
 */
interface IContextCacheManager {

    /**
     * Store the current student context in the encrypted cache.
     */
    fun cacheContext(context: StudentContext)

    /**
     * Retrieve the latest verified student context from cache.
     */
    fun getCachedContext(): StudentContext?

    /**
     * Return a list of all available immutable context snapshots.
     */
    fun getSnapshots(): List<ContextSnapshot>

    /**
     * Restore the active context from a specific snapshot.
     */
    fun restoreFromSnapshot(snapshotId: String): Boolean

    /**
     * Clear all cached snapshots.
     */
    fun clearCache()
}
