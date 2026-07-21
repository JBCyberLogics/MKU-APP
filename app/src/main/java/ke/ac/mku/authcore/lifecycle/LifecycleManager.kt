package ke.ac.mku.authcore.lifecycle

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.state.StateRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * LifecycleManager - CORE-006
 *
 * Manages the lifecycle states of all registered services.
 * Subscribes to BootstrapEvent.RegistryReady and coordinates service initialization,
 * starting, pausing, resuming, stopping, and restarting.
 *
 * Execution order per spec:
 * 1. ConfigurationManager
 * 2. DependencyRegistry
 * 3. ServiceRegistry
 * 4. AuthenticationCore
 * 5. SessionManager
 * 6. CookieManager
 * 7. PortalDiscovery
 * 8. EndpointRegistry
 * 9. HealthMonitor
 */
@Singleton
class LifecycleManager @Inject constructor(
    private val eventBus: EventBus,
    private val serviceRegistry: ServiceRegistry,
    private val dependencyRegistry: DependencyRegistry
) : BootstrapObserver {

    companion object {
        private const val TAG = "LifecycleManager"
        private const val MAX_RETRIES = 3
        private const val RETRY_DELAY_MS = 1000L
    }

    // Service execution order as specified
    private val serviceExecutionOrder = listOf(
        "configuration_manager",
        "dependency_registry",
        "service_registry",
        "authentication_core",
        "session_manager",
        "cookie_manager",
        "portal_discovery",
        "endpoint_registry",
        "state_registry",
        "feature_registry",
        "runtime_environment",
        "health_monitor",
        "recovery_manager"
    )

    // Map of service name to lifecycle tracking
    private val serviceLifecycles = mutableMapOf<String, ServiceLifecycle>()

    // Listeners for lifecycle events (internal only, not via EventBus)
    private val lifecycleListeners = mutableListOf<LifecycleListener>()

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "LifecycleManager initialized, subscribed to bootstrap events")
    }

    /**
     * Interface for components that want to observe lifecycle events.
     */
    interface LifecycleListener {
        fun onLifecycleEvent(event: LifecycleEvent)
    }

    /**
     * Add a listener for lifecycle events.
     */
    fun addLifecycleListener(listener: LifecycleListener) {
        lifecycleListeners.add(listener)
    }

    /**
     * Remove a lifecycle listener.
     */
    fun removeLifecycleListener(listener: LifecycleListener) {
        lifecycleListeners.remove(listener)
    }

    private fun notifyListeners(event: LifecycleEvent) {
        lifecycleListeners.forEach { listener ->
            try {
                listener.onLifecycleEvent(event)
            } catch (e: Exception) {
                Log.e(TAG, "Error notifying lifecycle listener: ${e.message}")
            }
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.RegistryReady -> {
                Log.i(TAG, "Registry ready received, initializing services...")
                initializeServices()
            }
            // CORE-011: Handle recovery events from RecoveryManager
            is BootstrapEvent.ServiceRestartRequested -> {
                Log.i(TAG, "Received service restart request: ${event.serviceName}")
                restartService(event.serviceName)
            }
            is BootstrapEvent.ReinitializeServiceRequested -> {
                Log.i(TAG, "Received reinitialize service request: ${event.serviceName}")
                reinitializeService(event.serviceName)
            }
            is BootstrapEvent.RollbackRequested -> {
                Log.i(TAG, "Received rollback request: ${event.serviceName}")
                // Rollback is handled by RecoveryManager via StateRegistry
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Reinitialize a service (stop and start).
     */
    private fun reinitializeService(serviceName: String): Boolean {
        Log.i(TAG, "Reinitializing service: $serviceName")
        stopService(serviceName)
        return initializeService(serviceName) && startService(serviceName)
    }

    /**
     * Initialize all services in the specified execution order.
     */
    fun initializeServices() {
        Log.i(TAG, "Initializing services...")
        for (serviceName in serviceExecutionOrder) {
            initializeService(serviceName)
        }

        notifyListeners(LifecycleEvent.AllServicesReady)
        Log.i(TAG, "All services initialized")
    }

    private fun initializeService(serviceName: String): Boolean {
        getOrCreateLifecycle(serviceName)

        val lifecycle = serviceLifecycles[serviceName] ?: return false

        // Validate state transition
        if (!isValidTransition(lifecycle.state, LifecycleState.INITIALIZED)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> INITIALIZED")
            return false
        }

        return withRetry(serviceName) {
            lifecycle.transitionTo(LifecycleState.INITIALIZED)
            notifyListeners(LifecycleEvent.ServiceInitialized(serviceName))
            Log.d(TAG, "Service initialized: $serviceName")
            true
        }
    }

    /**
     * Start all initialized services.
     */
    fun startServices() {
        Log.i(TAG, "Starting services...")
        for (serviceName in serviceExecutionOrder) {
            startService(serviceName)
        }
    }

    private fun startService(serviceName: String): Boolean {
        val lifecycle = serviceLifecycles[serviceName] ?: return false

        if (!isValidTransition(lifecycle.state, LifecycleState.STARTING)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> STARTING")
            return false
        }

        return withRetry(serviceName) {
            lifecycle.transitionTo(LifecycleState.STARTING)
            lifecycle.transitionTo(LifecycleState.RUNNING)
            notifyListeners(LifecycleEvent.ServiceStarted(serviceName))
            Log.d(TAG, "Service started: $serviceName")
            true
        }
    }

    /**
     * Pause all running services.
     */
    fun pauseServices() {
        Log.i(TAG, "Pausing services...")
        for (serviceName in serviceExecutionOrder.reversed()) {
            pauseService(serviceName)
        }
    }

    private fun pauseService(serviceName: String): Boolean {
        val lifecycle = serviceLifecycles[serviceName] ?: return false

        if (!isValidTransition(lifecycle.state, LifecycleState.PAUSED)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> PAUSED")
            return false
        }

        lifecycle.transitionTo(LifecycleState.PAUSED)
        notifyListeners(LifecycleEvent.ServicePaused(serviceName))
        Log.d(TAG, "Service paused: $serviceName")
        return true
    }

    /**
     * Resume all paused services.
     */
    fun resumeServices() {
        Log.i(TAG, "Resuming services...")
        for (serviceName in serviceExecutionOrder) {
            resumeService(serviceName)
        }
    }

    private fun resumeService(serviceName: String): Boolean {
        val lifecycle = serviceLifecycles[serviceName] ?: return false

        if (!isValidTransition(lifecycle.state, LifecycleState.RUNNING)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> RUNNING")
            return false
        }

        lifecycle.transitionTo(LifecycleState.RUNNING)
        notifyListeners(LifecycleEvent.ServiceResumed(serviceName))
        Log.d(TAG, "Service resumed: $serviceName")
        return true
    }

    /**
     * Stop all running services.
     */
    fun stopServices() {
        Log.i(TAG, "Stopping services...")
        for (serviceName in serviceExecutionOrder.reversed()) {
            stopService(serviceName)
        }
    }

    private fun stopService(serviceName: String): Boolean {
        val lifecycle = serviceLifecycles[serviceName] ?: return false

        if (!isValidTransition(lifecycle.state, LifecycleState.STOPPING)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> STOPPING")
            return false
        }

        lifecycle.transitionTo(LifecycleState.STOPPING)
        lifecycle.transitionTo(LifecycleState.STOPPED)
        notifyListeners(LifecycleEvent.ServiceStopped(serviceName))
        Log.d(TAG, "Service stopped: $serviceName")
        return true
    }

    /**
     * Restart all stopped services.
     */
    fun restartServices() {
        Log.i(TAG, "Restarting services...")
        for (serviceName in serviceExecutionOrder) {
            restartService(serviceName)
        }
    }

    private fun restartService(serviceName: String): Boolean {
        val lifecycle = serviceLifecycles[serviceName] ?: return false

        if (!isValidTransition(lifecycle.state, LifecycleState.RESTARTING)) {
            Log.w(TAG, "Invalid transition for $serviceName: ${lifecycle.state} -> RESTARTING")
            return false
        }

        return withRetry(serviceName) {
            lifecycle.transitionTo(LifecycleState.RESTARTING)
            lifecycle.transitionTo(LifecycleState.RUNNING)
            notifyListeners(LifecycleEvent.ServiceRestarted(serviceName))
            Log.d(TAG, "Service restarted: $serviceName")
            true
        }
    }

    /**
     * Shutdown all services unconditionally.
     */
    fun shutdownAll() {
        Log.i(TAG, "Shutting down all services...")
        for (serviceName in serviceExecutionOrder.reversed()) {
            shutdownService(serviceName)
        }
        Log.i(TAG, "All services shut down")
    }

    private fun shutdownService(serviceName: String) {
        val lifecycle = serviceLifecycles[serviceName] ?: return

        lifecycle.transitionTo(LifecycleState.SHUTDOWN)
        notifyListeners(LifecycleEvent.ServiceShutdown(serviceName))
        Log.d(TAG, "Service shutdown: $serviceName")
    }

    /**
     * Get the lifecycle state of a service.
     */
    fun getServiceState(serviceName: String): LifecycleState? {
        return serviceLifecycles[serviceName]?.state
    }

    /**
     * Get all service lifecycles.
     */
    fun getAllLifecycles(): Map<String, ServiceLifecycle> {
        return serviceLifecycles.toMap()
    }

    /**
     * Check if a state transition is valid.
     */
    private fun isValidTransition(from: LifecycleState, to: LifecycleState): Boolean {
        return when (from) {
            LifecycleState.REGISTERED -> to in listOf(LifecycleState.INITIALIZED, LifecycleState.SHUTDOWN, LifecycleState.FAILED)
            LifecycleState.INITIALIZED -> to in listOf(LifecycleState.STARTING, LifecycleState.STOPPED, LifecycleState.SHUTDOWN, LifecycleState.FAILED)
            LifecycleState.STARTING -> to in listOf(LifecycleState.RUNNING, LifecycleState.FAILED)
            LifecycleState.RUNNING -> to in listOf(LifecycleState.PAUSED, LifecycleState.STOPPING, LifecycleState.RESTARTING, LifecycleState.SHUTDOWN, LifecycleState.FAILED)
            LifecycleState.PAUSED -> to in listOf(LifecycleState.RUNNING, LifecycleState.STOPPING, LifecycleState.SHUTDOWN, LifecycleState.FAILED)
            LifecycleState.STOPPING -> to in listOf(LifecycleState.STOPPED, LifecycleState.FAILED)
            LifecycleState.STOPPED -> to in listOf(LifecycleState.RESTARTING, LifecycleState.SHUTDOWN, LifecycleState.FAILED)
            LifecycleState.RESTARTING -> to in listOf(LifecycleState.RUNNING, LifecycleState.FAILED)
            LifecycleState.SHUTDOWN -> false // Terminal state
            LifecycleState.FAILED -> to == LifecycleState.RESTARTING // Can restart from failed
        }
    }

    /**
     * Execute an operation with retry logic.
     */
    private fun <T> withRetry(serviceName: String, operation: () -> T): T {
        var lastException: Exception? = null

        repeat(MAX_RETRIES) { attempt ->
            try {
                return operation()
            } catch (e: Exception) {
                lastException = e
                Log.w(TAG, "Attempt ${attempt + 1} failed for $serviceName: ${e.message}")
                serviceLifecycles[serviceName]?.recordFailure()

                if (attempt < MAX_RETRIES - 1) {
                    Thread.sleep(RETRY_DELAY_MS)
                }
            }
        }

        // All retries exhausted, mark as failed
        serviceLifecycles[serviceName]?.let { lifecycle ->
            lifecycle.transitionTo(LifecycleState.FAILED)
            notifyListeners(LifecycleEvent.ServiceFailed(serviceName, lastException?.message ?: "Unknown error"))
        }

        Log.e(TAG, "Service $serviceName failed after $MAX_RETRIES attempts")
        throw lastException ?: Exception("Service $serviceName failed after $MAX_RETRIES attempts")
    }

    private fun getOrCreateLifecycle(serviceName: String): ServiceLifecycle {
        return serviceLifecycles.getOrPut(serviceName) {
            ServiceLifecycle(
                serviceName = serviceName,
                state = LifecycleState.REGISTERED,
                lastTransitionTime = System.currentTimeMillis()
            )
        }
    }
}