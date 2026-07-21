package ke.ac.mku.authcore.runtime

import android.app.ActivityManager
import android.content.Context
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manages runtime resources including memory monitoring and cleanup.
 */
@Singleton
class ResourceManager @Inject constructor(
    @dagger.hilt.android.qualifiers.ApplicationContext private val context: Context
) {

    companion object {
        private const val TAG = "ResourceManager"
        private const val MEMORY_PRESSURE_THRESHOLD_PERCENT = 80
    }

    private val trackedResources = mutableListOf<AutoCloseable>()
    private var isInitialized = false

    private val activityManager: ActivityManager by lazy {
        context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    }

    /**
     * Initialize the resource manager.
     */
    fun initialize() {
        if (isInitialized) {
            Log.w(TAG, "ResourceManager already initialized")
            return
        }

        Log.i(TAG, "ResourceManager initialized")
        isInitialized = true
    }

    /**
     * Track a resource for automatic cleanup.
     */
    fun trackResource(resource: AutoCloseable) {
        synchronized(trackedResources) {
            trackedResources.add(resource)
            Log.d(TAG, "Tracking resource: ${resource.javaClass.simpleName} (total: ${trackedResources.size})")
        }
    }

    /**
     * Release a tracked resource.
     */
    fun releaseResource(resource: AutoCloseable) {
        synchronized(trackedResources) {
            try {
                resource.close()
                trackedResources.remove(resource)
                Log.d(TAG, "Released resource: ${resource.javaClass.simpleName}")
            } catch (e: Exception) {
                Log.e(TAG, "Error releasing resource: ${e.message}")
            }
        }
    }

    /**
     * Get available memory in bytes.
     */
    fun getAvailableMemory(): Long {
        val memInfo = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(memInfo)
        return memInfo.availMem
    }

    /**
     * Get total memory in bytes.
     */
    fun getTotalMemory(): Long {
        val memInfo = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(memInfo)
        return memInfo.totalMem
    }

    /**
     * Get used memory in bytes.
     */
    fun getUsedMemory(): Long {
        return getTotalMemory() - getAvailableMemory()
    }

    /**
     * Get memory usage as a percentage (0-100).
     */
    fun getMemoryUsagePercent(): Int {
        val total = getTotalMemory()
        if (total == 0L) return 0
        val used = getUsedMemory()
        return ((used.toDouble() / total.toDouble()) * 100).toInt()
    }

    /**
     * Check if the device is in memory pressure.
     */
    fun isInMemoryPressure(): Boolean {
        return getMemoryUsagePercent() >= MEMORY_PRESSURE_THRESHOLD_PERCENT
    }

    /**
     * Get the number of tracked resources.
     */
    fun getTrackedResourceCount(): Int {
        synchronized(trackedResources) {
            return trackedResources.size
        }
    }

    /**
     * Clean up all tracked resources.
     */
    fun cleanupAll() {
        Log.i(TAG, "Cleaning up ${trackedResources.size} tracked resources...")

        synchronized(trackedResources) {
            trackedResources.forEach { resource ->
                try {
                    resource.close()
                } catch (e: Exception) {
                    Log.e(TAG, "Error closing resource: ${e.message}")
                }
            }
            trackedResources.clear()
        }

        Log.i(TAG, "All resources cleaned up")
    }

    /**
     * Check if memory is low according to the system.
     */
    fun isLowMemory(): Boolean {
        val memInfo = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(memInfo)
        return memInfo.lowMemory
    }

    /**
     * Get runtime memory info.
     */
    fun getMemoryInfo(): MemoryInfo {
        return MemoryInfo(
            totalMemory = getTotalMemory(),
            availableMemory = getAvailableMemory(),
            usedMemory = getUsedMemory(),
            usagePercent = getMemoryUsagePercent(),
            isLowMemory = isLowMemory(),
            isInPressure = isInMemoryPressure()
        )
    }

    /**
     * Data class for memory information.
     */
    data class MemoryInfo(
        val totalMemory: Long,
        val availableMemory: Long,
        val usedMemory: Long,
        val usagePercent: Int,
        val isLowMemory: Boolean,
        val isInPressure: Boolean
    )
}