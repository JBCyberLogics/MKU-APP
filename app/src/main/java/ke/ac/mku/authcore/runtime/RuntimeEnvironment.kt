package ke.ac.mku.authcore.runtime

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.feature.FeatureRegistry
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RuntimeEnvironment - CORE-009
 *
 * Provides the centralized runtime execution environment for the Authentication Core.
 * Manages application context, coroutine dispatchers, thread pools, resources,
 * and runtime configuration.
 *
 * Subscribes to:
 * - BootstrapEvent.FeatureRegistryReady (triggers initialization)
 */
@Singleton
class RuntimeEnvironment @Inject constructor(
    @ApplicationContext private val context: Context,
    private val eventBus: EventBus,
    private val configManager: ConfigManager,
    private val featureRegistry: FeatureRegistry
) : BootstrapObserver {

    companion object {
        private const val TAG = "RuntimeEnvironment"
    }

    // Component managers
    private val threadPoolManager = ThreadPoolManager()
    private val resourceManager = ResourceManager(context)
    private val environmentInfo = EnvironmentInfo(context)

    // Runtime state
    private var startTimeMillis: Long = 0
    private var isInitialized = false
    private var isOperational = false

    // Metrics exposed as StateFlow
    private val _metricsFlow = MutableStateFlow(RuntimeMetrics.uninitialized())
    val metricsFlow: StateFlow<RuntimeMetrics> = _metricsFlow.asStateFlow()

    // Listeners for internal events
    private val listeners = mutableListOf<RuntimeListener>()

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "RuntimeEnvironment initialized, subscribed to bootstrap events")
    }

    /**
     * Interface for components that want to observe runtime events.
     */
    interface RuntimeListener {
        fun onRuntimeEvent(event: RuntimeEvent)
    }

    /**
     * Add a listener for runtime events.
     */
    fun addRuntimeListener(listener: RuntimeListener) {
        listeners.add(listener)
    }

    /**
     * Remove a runtime listener.
     */
    fun removeRuntimeListener(listener: RuntimeListener) {
        listeners.remove(listener)
    }

    private fun notifyListeners(event: RuntimeEvent) {
        listeners.forEach { listener ->
            try {
                listener.onRuntimeEvent(event)
            } catch (e: Exception) {
                Log.e(TAG, "Error notifying runtime listener: ${e.message}")
            }
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.FeatureRegistryReady -> {
                Log.i(TAG, "Feature registry ready, initializing runtime environment...")
                initializeRuntime()
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Initialize the runtime environment.
     */
    fun initializeRuntime() {
        if (isInitialized) {
            Log.w(TAG, "Runtime already initialized, skipping")
            return
        }

        try {
            startTimeMillis = System.currentTimeMillis()
            Log.i(TAG, "Initializing runtime environment...")

            // Initialize thread pools
            threadPoolManager.initialize()

            // Initialize resource manager
            resourceManager.initialize()

            // Update metrics
            updateMetrics()

            isInitialized = true
            notifyListeners(RuntimeEvent.RuntimeInitialized)
            eventBus.publish(BootstrapEvent.RuntimeInitialized)
            Log.i(TAG, "Runtime initialized")

            // Mark as operational after short delay to allow other components to settle
            markOperational()

        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize runtime: ${e.message}", e)
            notifyListeners(RuntimeEvent.RuntimeFailure(e.message ?: "Unknown error"))
            eventBus.publish(BootstrapEvent.RuntimeFailure(e.message ?: "Unknown error"))
        }
    }

    /**
     * Mark the runtime as operational and publish RuntimeReady.
     */
    private fun markOperational() {
        isOperational = true
        updateMetrics()
        notifyListeners(RuntimeEvent.RuntimeReady)
        eventBus.publish(BootstrapEvent.RuntimeReady)
        Log.i(TAG, "Runtime ready and operational")
    }

    /**
     * Shutdown the runtime environment gracefully.
     */
    fun shutdown() {
        Log.i(TAG, "Shutting down runtime environment...")

        try {
            // Cleanup resources
            resourceManager.cleanupAll()

            // Shutdown thread pools
            threadPoolManager.shutdown()

            isOperational = false
            isInitialized = false

            notifyListeners(RuntimeEvent.RuntimeShutdown)
            eventBus.publish(BootstrapEvent.RuntimeShutdown)
            Log.i(TAG, "Runtime shut down successfully")

        } catch (e: Exception) {
            Log.e(TAG, "Error during shutdown: ${e.message}", e)
        }
    }

    /**
     * Get the application context.
     */
    fun getApplicationContext(): Context = context

    /**
     * Get the main dispatcher.
     */
    fun getMainDispatcher(): CoroutineDispatcher = DispatcherProvider.main

    /**
     * Get the IO dispatcher.
     */
    fun getIoDispatcher(): CoroutineDispatcher = DispatcherProvider.io

    /**
     * Get the default dispatcher.
     */
    fun getDefaultDispatcher(): CoroutineDispatcher = DispatcherProvider.default

    /**
     * Get environment information.
     */
    fun getEnvironmentInfo(): EnvironmentInfo = environmentInfo

    /**
     * Get resource manager.
     */
    fun getResourceManager(): ResourceManager = resourceManager

    /**
     * Get thread pool manager.
     */
    fun getThreadPoolManager(): ThreadPoolManager = threadPoolManager

    /**
     * Get current runtime metrics.
     */
    fun getMetrics(): RuntimeMetrics = _metricsFlow.value

    /**
     * Get runtime uptime in milliseconds.
     */
    fun getUptimeMillis(): Long {
        return if (startTimeMillis > 0) {
            System.currentTimeMillis() - startTimeMillis
        } else 0
    }

    /**
     * Get background timeout from configuration.
     */
    fun getBackgroundTimeoutSeconds(): Long {
        return configManager.config.network.connectionTimeout
    }

    /**
     * Get network timeout from configuration.
     */
    fun getNetworkTimeoutSeconds(): Long {
        return configManager.config.network.readTimeout
    }

    /**
     * Update the metrics StateFlow.
     */
    private fun updateMetrics() {
        val memoryInfo = resourceManager.getMemoryInfo()
        val activeThreads = threadPoolManager.getActiveThreadCount()
        val totalThreads = threadPoolManager.getTotalThreadCount()

        val metrics = RuntimeMetrics.operational(
            memoryUsagePercent = memoryInfo.usagePercent,
            availableMemoryMb = memoryInfo.availableMemory / (1024 * 1024),
            usedMemoryMb = memoryInfo.usedMemory / (1024 * 1024),
            totalMemoryMb = memoryInfo.totalMemory / (1024 * 1024),
            activeThreads = activeThreads,
            totalThreads = totalThreads,
            mainAvailable = DispatcherProvider.isAvailable(DispatcherProvider.main),
            ioAvailable = DispatcherProvider.isAvailable(DispatcherProvider.io),
            defaultAvailable = DispatcherProvider.isAvailable(DispatcherProvider.default),
            resourceCount = resourceManager.getTrackedResourceCount(),
            isInMemoryPressure = memoryInfo.isInPressure,
            isLowMemory = memoryInfo.isLowMemory,
            runtimeUptimeMillis = getUptimeMillis()
        )

        _metricsFlow.value = metrics

        // Check for memory pressure and publish warning if needed
        if (memoryInfo.isInPressure) {
            notifyListeners(RuntimeEvent.MemoryPressureDetected)
            eventBus.publish(BootstrapEvent.MemoryPressureDetected)
        }
    }

    /**
     * Check if runtime is initialized.
     */
    fun isInitialized(): Boolean = isInitialized

    /**
     * Check if runtime is operational.
     */
    fun isOperational(): Boolean = isOperational
}