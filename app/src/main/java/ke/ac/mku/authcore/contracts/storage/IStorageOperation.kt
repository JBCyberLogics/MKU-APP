package ke.ac.mku.authcore.contracts.storage

/**
 * IStorageOperation - SECURITY-003
 *
 * Storage operation result types and utilities.
 */

/**
 * Integrity status for stored data verification.
 */
enum class IntegrityStatus {
    /** Data integrity is valid */
    VALID,

    /** Data has been tampered with or corrupted */
    INVALID,

    /** Data not found in storage */
    NOT_FOUND,

    /** Error occurred during integrity check */
    ERROR
}

/**
 * Result wrapper for storage operations.
 * Provides detailed status for each operation.
 */
data class StorageResult<T>(
    val success: Boolean,
    val data: T?,
    val error: String?,
    val integrityValid: Boolean = true
) {
    companion object {
        /**
         * Create a successful result.
         */
        fun <T> success(data: T, integrityValid: Boolean = true): StorageResult<T> {
            return StorageResult(
                success = true,
                data = data,
                error = null,
                integrityValid = integrityValid
            )
        }

        /**
         * Create a failure result.
         */
        fun <T> failure(error: String, data: T? = null): StorageResult<T> {
            return StorageResult(
                success = false,
                data = data,
                error = error,
                integrityValid = false
            )
        }

        /**
         * Create an integrity failure result.
         */
        fun <T> integrityFailure(error: String, data: T? = null): StorageResult<T> {
            return StorageResult(
                success = false,
                data = data,
                error = error,
                integrityValid = false
            )
        }
    }

    /**
     * Map the data to a different type.
     */
    fun <R> map(transform: (T) -> R): StorageResult<R> {
        return if (success) {
            StorageResult(
                success = true,
                data = data?.let { transform(it) },
                error = null,
                integrityValid = integrityValid
            )
        } else {
            StorageResult(
                success = false,
                data = null,
                error = error,
                integrityValid = false
            )
        }
    }

    /**
     * Get data or throw if failed.
     */
    fun getOrThrow(): T {
        if (!success) {
            throw SecurityException(error ?: "Storage operation failed")
        }
        @Suppress("UNCHECKED_CAST")
        return data as T
    }

    /**
     * Get data or null if failed.
     */
    fun getOrNull(): T? {
        return if (success) data else null
    }
}

/**
 * Storage health metrics for a domain.
 */
data class StorageHealth(
    val domain: StorageDomain,
    val totalKeys: Int,
    val totalSizeBytes: Long,
    val failedReads: Int,
    val failedWrites: Int,
    val integrityFailures: Int,
    val lastAccessed: Long,
    val isHealthy: Boolean
) {
    companion object {
        /**
         * Create an unhealthy storage state.
         */
        fun unhealthy(domain: StorageDomain): StorageHealth {
            return StorageHealth(
                domain = domain,
                totalKeys = 0,
                totalSizeBytes = 0,
                failedReads = 0,
                failedWrites = 0,
                integrityFailures = 0,
                lastAccessed = 0,
                isHealthy = false
            )
        }
    }
}

/**
 * Storage metrics aggregated across all domains.
 */
data class StorageMetrics(
    val totalDomains: Int,
    val totalKeys: Int,
    val totalSizeBytes: Long,
    val totalFailedReads: Int,
    val totalFailedWrites: Int,
    val totalIntegrityFailures: Int,
    val domainHealth: Map<StorageDomain, StorageHealth>
) {
    val isOverallHealthy: Boolean
        get() = domainHealth.values.all { it.isHealthy }
}