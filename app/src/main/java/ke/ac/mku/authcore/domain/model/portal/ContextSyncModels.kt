package ke.ac.mku.authcore.domain.model.portal

/**
 * ContextSyncModels - PROGRAM-012
 *
 * Models for incremental context synchronization and delta tracking.
 */

data class ContextDelta(
    val deltaId: String,
    val timestamp: Long,
    val items: List<DeltaItem>,
    val impactedDomains: List<String>
)

data class DeltaItem(
    val domain: String,
    val path: String,
    val oldValue: Any?,
    val newValue: Any?
)

data class SyncStatus(
    val isSyncing: Boolean,
    val lastSyncTimestamp: Long,
    val activeDeltas: Int,
    val healthScore: Float
)

data class SyncReport(
    val reportId: String,
    val durationMs: Long,
    val status: String,
    val changesCount: Int
)

data class SyncConflict(
    val domain: String,
    val localTimestamp: Long,
    val portalTimestamp: Long,
    val conflictDetails: String
)
