package ke.ac.mku.authcore.health

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.lifecycle.LifecycleEvent
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.lifecycle.LifecycleManager.LifecycleListener
import ke.ac.mku.authcore.runtime.RuntimeEnvironment
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.state.StateRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SystemHealthMonitor - CORE-010
 *
 * Centralized health monitoring and diagnostics engine.
 * Monitors all registered services, runtime metrics, and system health.
 * Publishes reactive StateFlow updates and diagnostic events.
 *
 * Subscribes to:
 * - BootstrapEvent.RuntimeReady (triggers initialization)
 * - LifecycleManager events (component lifecycle)
 */
class SystemHealthMonitor constructor(
    private val eventBus: EventBus,
    private val runtimeEnvironment: RuntimeEnvironment,
    private val stateRegistry: StateRegistry,
    private val lifecycleManager: LifecycleManager,
    private val serviceRegistry: ServiceRegistry
) : BootstrapObserver, LifecycleListener {

    companion object {
        private const val TAG = "SystemHealthMonitor"

        // Thresholds
        private const val MEMORY_WARNING_PERCENT = 75
        private const val MEMORY_CRITICAL_PERCENT = 90
        private const val CPU_WARNING_PERCENT = 80
        private const val CPU_CRITICAL_PERCENT = 95

        // Health check intervals (ms)
        private const val SERVICE_CHECK_INTERVAL_MS = 30_000L
        private const val MEMORY_CHECK_INTERVAL_MS = 10_000L
        private const val CPU_CHECK_INTERVAL_MS = 10_000L
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    // Component health storage
    private val componentHealthMap = mutableMapOf<String, ComponentHealth>()
    private val componentStats = mutableMapOf<String, ComponentStatistics>()
    private val failureHistory = mutableListOf<FailureEntry>()

    // Recovery tracking
    private var consecutiveFailures = 0
    private var lastRecoveryTimestamp = 0L

    // Reactive state
    private val _healthFlow = MutableStateFlow(SystemHealth.initial())
    val healthFlow: StateFlow<SystemHealth> = _healthFlow.asStateFlow()

    // Listeners
    private val listeners = mutableListOf<HealthListener>()

    // Monitoring state
    private var isInitialized = false
    private var isMonitoring = false
    private var startTimeMillis = 0L

    init {
        eventBus.subscribe(this)
        lifecycleManager.addLifecycleListener(this)
        Log.i(TAG, "HealthMonitor initialized, subscribed to bootstrap and lifecycle events")
    }

    /**
     * Interface for components that want to observe health events.
     */
    interface HealthListener {
        fun onHealthEvent(event: HealthEvent)
    }

    /**
     * Add a listener for health events.
     */
    fun addHealthListener(listener: HealthListener) {
        listeners.add(listener)
    }

    /**
     * Remove a health listener.
     */
    fun removeHealthListener(listener: HealthListener) {
        listeners.remove(listener)
    }

    private fun notifyListeners(event: HealthEvent) {
        listeners.forEach { listener ->
            try {
                listener.onHealthEvent(event)
            } catch (e: Exception) {
                Log.e(TAG, "Error notifying health listener: ${e.message}")
            }
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.RuntimeReady -> {
                Log.i(TAG, "Runtime ready, initializing health monitor...")
                initializeHealthMonitor()
            }
            else -> { /* Ignore other events */ }
        }
    }

    override fun onLifecycleEvent(event: LifecycleEvent) {
        when (event) {
            is LifecycleEvent.ServiceStarted -> {
                updateComponentHealth(event.serviceName, ComponentHealth.healthy(event.serviceName))
            }
            is LifecycleEvent.ServiceStopped -> {
                updateComponentHealth(
                    event.serviceName,
                    ComponentHealth.warning(event.serviceName, "Service stopped")
                )
            }
            is LifecycleEvent.ServiceFailed -> {
                handleComponentFailure(event.serviceName, event.error)
            }
            is LifecycleEvent.AllServicesReady -> {
                // All services ready - perform initial health check
                performHealthCheck()
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Initialize the health monitor.
     */
    fun initializeHealthMonitor() {
        if (isInitialized) {
            Log.w(TAG, "HealthMonitor already initialized")
            return
        }

        try {
            startTimeMillis = System.currentTimeMillis()
            Log.i(TAG, "Initializing health monitor...")

            // Auto-discover components from ServiceRegistry
            val registeredServices = serviceRegistry.list()
            Log.d(TAG, "Discovered ${registeredServices.size} registered services")

            registeredServices.forEach { serviceName ->
                registerComponent(serviceName)
            }

            // Start monitoring
            startMonitoring()

            isInitialized = true
            notifyListeners(HealthEvent.HealthMonitorReady)
            eventBus.publish(BootstrapEvent.HealthMonitorReady)
            Log.i(TAG, "HealthMonitor ready with ${componentHealthMap.size} components")

        } catch (e: Exception) {
            Log.e(TAG, "Failed to initialize health monitor: ${e.message}", e)
        }
    }

    /**
     * Register a component for health monitoring.
     */
    fun registerComponent(name: String) {
        if (!componentHealthMap.containsKey(name)) {
            componentHealthMap[name] = ComponentHealth.healthy(name)
            componentStats[name] = ComponentStatistics(
                name = name,
                totalChecks = 0,
                successfulChecks = 0,
                failedChecks = 0,
                averageResponseTimeMs = 0,
                lastSuccessfulCheck = System.currentTimeMillis(),
                lastFailedCheck = 0,
                uptimePercent = 100.0
            )
            Log.d(TAG, "Registered component for monitoring: $name")
            updateHealthState()
        }
    }

    /**
     * Start background health monitoring.
     */
    private fun startMonitoring() {
        if (isMonitoring) return
        isMonitoring = true

        // Memory monitoring
        scope.launch {
            while (isActive && isMonitoring) {
                checkMemoryHealth()
                delay(MEMORY_CHECK_INTERVAL_MS)
            }
        }

        // CPU monitoring
        scope.launch {
            while (isActive && isMonitoring) {
                checkCpuHealth()
                delay(CPU_CHECK_INTERVAL_MS)
            }
        }

        // Service availability monitoring
        scope.launch {
            while (isActive && isMonitoring) {
                checkServiceAvailability()
                delay(SERVICE_CHECK_INTERVAL_MS)
            }
        }

        Log.i(TAG, "Health monitoring started")
    }

    /**
     * Check memory health.
     */
    private fun checkMemoryHealth() {
        val metrics = runtimeEnvironment.getMetrics()
        val memoryPercent = metrics.memoryUsagePercent

        when {
            memoryPercent >= MEMORY_CRITICAL_PERCENT -> {
                notifyListeners(HealthEvent.CriticalFailure)
                eventBus.publish(BootstrapEvent.CriticalFailure)
            }
            memoryPercent >= MEMORY_WARNING_PERCENT -> {
                notifyListeners(HealthEvent.MemoryWarning)
                eventBus.publish(BootstrapEvent.MemoryWarning)
            }
        }

        updateHealthState()
    }

    /**
     * Check CPU health.
     */
    private fun checkCpuHealth() {
        val metrics = runtimeEnvironment.getMetrics()
        val cpuPercent = metrics.memoryUsagePercent // Using memory as proxy for now

        when {
            cpuPercent >= CPU_CRITICAL_PERCENT -> {
                notifyListeners(HealthEvent.CriticalFailure)
                eventBus.publish(BootstrapEvent.CriticalFailure)
            }
            cpuPercent >= CPU_WARNING_PERCENT -> {
                notifyListeners(HealthEvent.CpuWarning)
                eventBus.publish(BootstrapEvent.CpuWarning)
            }
        }

        updateHealthState()
    }

    /**
     * Check service availability.
     */
    private fun checkServiceAvailability() {
        val services = serviceRegistry.list()

        services.forEach { serviceName ->
            val isAvailable = serviceRegistry.exists(serviceName)
            val currentHealth = componentHealthMap[serviceName]

            if (currentHealth != null) {
                if (isAvailable && currentHealth.level == HealthLevel.OFFLINE) {
                    // Service recovered
                    handleComponentRecovery(serviceName)
                } else if (!isAvailable && currentHealth.level != HealthLevel.OFFLINE) {
                    // Service went offline
                    handleComponentFailure(serviceName, "Service unavailable")
                }
            }
        }

        updateHealthState()
    }

    /**
     * Perform a complete health check.
     */
    fun checkHealth(): SystemHealth {
        performHealthCheck()
        return _healthFlow.value
    }

    /**
     * Internal health check implementation.
     */
    private fun performHealthCheck() {
        val metrics = runtimeEnvironment.getMetrics()
        updateHealthState()
    }

    /**
     * Update component health.
     */
    fun updateComponentHealth(name: String, health: ComponentHealth) {
        val previousHealth = componentHealthMap[name]
        componentHealthMap[name] = health

        // Update statistics
        updateComponentStatistics(name, health)

        // Check for state changes
        if (previousHealth != null && previousHealth.level != health.level) {
            if (health.level == HealthLevel.OFFLINE || health.level == HealthLevel.CRITICAL) {
                handleComponentFailure(name, health.message)
            } else if (previousHealth.level != HealthLevel.HEALTHY && health.level == HealthLevel.HEALTHY) {
                handleComponentRecovery(name)
            }
        }

        updateHealthState()
    }

    /**
     * Handle component failure.
     */
    private fun handleComponentFailure(component: String, error: String) {
        consecutiveFailures++

        val entry = FailureEntry(
            timestamp = System.currentTimeMillis(),
            component = component,
            error = error,
            level = HealthLevel.CRITICAL,
            recovered = false
        )
        failureHistory.add(entry)

        // Trim history if needed
        while (failureHistory.size > DiagnosticsReport.MAX_FAILURE_HISTORY) {
            failureHistory.removeAt(0)
        }

        notifyListeners(HealthEvent.ComponentFailed(component, error))
        eventBus.publish(BootstrapEvent.ComponentFailed(component))
        notifyListeners(HealthEvent.HealthStatusChanged)
        eventBus.publish(BootstrapEvent.HealthStatusChanged)

        updateHealthState()
    }

    /**
     * Handle component recovery.
     */
    private fun handleComponentRecovery(component: String) {
        consecutiveFailures = 0
        lastRecoveryTimestamp = System.currentTimeMillis()

        // Update failure history
        failureHistory.lastOrNull { it.component == component && !it.recovered }?.let { entry ->
            val index = failureHistory.indexOf(entry)
            if (index >= 0) {
                failureHistory[index] = entry.copy(
                    recovered = true,
                    recoveryTimestamp = lastRecoveryTimestamp
                )
            }
        }

        notifyListeners(HealthEvent.ComponentRecovered(component))
        eventBus.publish(BootstrapEvent.ComponentRecovered(component))
        notifyListeners(HealthEvent.HealthStatusChanged)
        eventBus.publish(BootstrapEvent.HealthStatusChanged)

        updateHealthState()
    }

    /**
     * Update component statistics.
     */
    private fun updateComponentStatistics(name: String, health: ComponentHealth) {
        val stats = componentStats[name] ?: return

        val newStats = stats.copy(
            totalChecks = stats.totalChecks + 1,
            successfulChecks = if (health.isAvailable) stats.successfulChecks + 1 else stats.successfulChecks,
            failedChecks = if (!health.isAvailable) stats.failedChecks + 1 else stats.failedChecks,
            lastSuccessfulCheck = if (health.isAvailable) System.currentTimeMillis() else stats.lastSuccessfulCheck,
            lastFailedCheck = if (!health.isAvailable) System.currentTimeMillis() else stats.lastFailedCheck,
            averageResponseTimeMs = if (health.responseTimeMs > 0) {
                ((stats.averageResponseTimeMs * stats.totalChecks) + health.responseTimeMs) / (stats.totalChecks + 1)
            } else stats.averageResponseTimeMs,
            uptimePercent = calculateUptimePercent(name)
        )

        componentStats[name] = newStats
    }

    /**
     * Calculate uptime percentage for a component.
     */
    private fun calculateUptimePercent(name: String): Double {
        val stats = componentStats[name] ?: return 100.0
        if (stats.totalChecks == 0) return 100.0
        return (stats.successfulChecks.toDouble() / stats.totalChecks.toDouble()) * 100
    }

    /**
     * Update the health StateFlow.
     */
    private fun updateHealthState() {
        val metrics = runtimeEnvironment.getMetrics()

        val health = SystemHealth.operational(
            components = componentHealthMap.toMap(),
            memoryUsagePercent = metrics.memoryUsagePercent,
            cpuUsagePercent = metrics.memoryUsagePercent
        )

        _healthFlow.value = health
    }

    /**
     * Get overall health status.
     */
    fun getHealthStatus(): HealthLevel = _healthFlow.value.overall

    /**
     * Get health of a specific component.
     */
    fun getComponentHealth(name: String): ComponentHealth? = componentHealthMap[name]

    /**
     * Generate a diagnostic report.
     */
    fun generateDiagnosticReport(): DiagnosticsReport {
        val metrics = runtimeEnvironment.getMetrics()
        val recoveryStats = RecoveryStatistics(
            totalFailures = failureHistory.count { !it.recovered },
            totalRecoveries = failureHistory.count { it.recovered },
            averageRecoveryTimeMs = calculateAverageRecoveryTime(),
            lastFailureTimestamp = failureHistory.lastOrNull { !it.recovered }?.timestamp ?: 0,
            lastRecoveryTimestamp = lastRecoveryTimestamp,
            consecutiveFailures = consecutiveFailures
        )

        val report = DiagnosticsReport(
            systemHealth = _healthFlow.value,
            runtimeMetrics = metrics,
            failureHistory = failureHistory.toList(),
            componentStatistics = componentStats.toMap(),
            uptimeMillis = if (startTimeMillis > 0) System.currentTimeMillis() - startTimeMillis else 0,
            recoveryStats = recoveryStats
        )

        notifyListeners(HealthEvent.DiagnosticReportGenerated)
        eventBus.publish(BootstrapEvent.DiagnosticReportGenerated)

        return report
    }

    /**
     * Calculate average recovery time from failure history.
     */
    private fun calculateAverageRecoveryTime(): Long {
        val recoveries = failureHistory.filter { it.recovered && it.recoveryTimestamp != null }
        if (recoveries.isEmpty()) return 0

        val totalTime = recoveries.sumOf { (it.recoveryTimestamp ?: 0) - it.timestamp }
        return totalTime / recoveries.size
    }

    /**
     * Reset health statistics.
     */
    fun resetHealthStatistics() {
        failureHistory.clear()
        componentStats.clear()
        consecutiveFailures = 0
        lastRecoveryTimestamp = 0
        Log.i(TAG, "Health statistics reset")
    }

    /**
     * Check if health monitor is initialized.
     */
    fun isInitialized(): Boolean = isInitialized
}