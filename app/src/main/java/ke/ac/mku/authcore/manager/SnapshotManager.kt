package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.ContextSnapshot
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import java.util.concurrent.ConcurrentLinkedDeque
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SnapshotManager - PROGRAM-013
 *
 * Manages immutable context snapshots with an LRU eviction policy.
 */
@Singleton
class SnapshotManager @Inject constructor() {

    companion object {
        private const val MAX_SNAPSHOTS = 30
    }

    private val snapshots = ConcurrentLinkedDeque<ContextSnapshot>()

    fun createSnapshot(context: StudentContext, reason: String): ContextSnapshot {
        val snapshot = ContextSnapshot(
            contextId = "snapshot_${System.nanoTime()}",
            timestamp = System.currentTimeMillis(),
            context = context,
            reason = reason
        )
        
        addSnapshot(snapshot)
        return snapshot
    }

    private fun addSnapshot(snapshot: ContextSnapshot) {
        if (snapshots.size >= MAX_SNAPSHOTS) {
            snapshots.removeFirst() // Evict oldest
        }
        snapshots.addLast(snapshot)
        Log.d("SnapshotManager", "Snapshot stored. Total count: ${snapshots.size}")
    }

    fun getAllSnapshots(): List<ContextSnapshot> = snapshots.toList()

    fun getLatestSnapshot(): ContextSnapshot? = snapshots.peekLast()

    fun clear() {
        snapshots.clear()
    }
}
