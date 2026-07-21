package ke.ac.mku.authcore.runtime

/**
 * Runtime metrics for monitoring the Authentication Core.
 * Exposed as a read-only StateFlow from RuntimeEnvironment.
 */
data class RuntimeMetrics(
    val memoryUsagePercent: Int = 0,
    val availableMemoryMb: Long = 0,
    val usedMemoryMb: Long = 0,
    val totalMemoryMb: Long = 0,
    val activeThreads: Int = 0,
    val totalThreads: Int = 0,
    val dispatcherStatus: DispatcherStatus = DispatcherStatus(),
    val resourceCount: Int = 0,
    val isInMemoryPressure: Boolean = false,
    val isLowMemory: Boolean = false,
    val runtimeUptimeMillis: Long = 0,
    val isInitialized: Boolean = false,
    val isOperational: Boolean = false
) {
    /**
     * Dispatcher status information.
     */
    data class DispatcherStatus(
        val mainAvailable: Boolean = false,
        val ioAvailable: Boolean = false,
        val defaultAvailable: Boolean = false
    )

    companion object {
        /**
         * Create initial/uninitialized metrics.
         */
        fun uninitialized(): RuntimeMetrics = RuntimeMetrics()

        /**
         * Create operational metrics.
         */
        fun operational(
            memoryUsagePercent: Int,
            availableMemoryMb: Long,
            usedMemoryMb: Long,
            totalMemoryMb: Long,
            activeThreads: Int,
            totalThreads: Int,
            mainAvailable: Boolean,
            ioAvailable: Boolean,
            defaultAvailable: Boolean,
            resourceCount: Int,
            isInMemoryPressure: Boolean,
            isLowMemory: Boolean,
            runtimeUptimeMillis: Long
        ): RuntimeMetrics {
            return RuntimeMetrics(
                memoryUsagePercent = memoryUsagePercent,
                availableMemoryMb = availableMemoryMb,
                usedMemoryMb = usedMemoryMb,
                totalMemoryMb = totalMemoryMb,
                activeThreads = activeThreads,
                totalThreads = totalThreads,
                dispatcherStatus = DispatcherStatus(
                    mainAvailable = mainAvailable,
                    ioAvailable = ioAvailable,
                    defaultAvailable = defaultAvailable
                ),
                resourceCount = resourceCount,
                isInMemoryPressure = isInMemoryPressure,
                isLowMemory = isLowMemory,
                runtimeUptimeMillis = runtimeUptimeMillis,
                isInitialized = true,
                isOperational = true
            )
        }
    }
}