package ke.ac.mku.authcore.domain.model.portal

/**
 * ContextCacheModels - PROGRAM-013
 *
 * Models for intelligent caching and versioning of the Student Context.
 */

data class CacheMetadata(
    val lastSync: Long,
    val snapshotCount: Int,
    val compressionEnabled: Boolean,
    val storageUsageBytes: Long
)

data class CacheStatistics(
    val hitRate: Float,
    val averageRestoreTimeMs: Long,
    val totalCleans: Int
)

data class RestorePoint(
    val snapshotId: String,
    val timestamp: Long,
    val reason: String,
    val isVerified: Boolean
)
