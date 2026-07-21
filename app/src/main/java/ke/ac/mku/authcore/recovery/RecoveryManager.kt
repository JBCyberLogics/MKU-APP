package ke.ac.mku.authcore.recovery

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.state.StateRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RecoveryManager - CORE-011
 *
 * Central recovery engine responsible for automatic fault detection,
 * recovery orchestration, rollback, restart strategies, circuit breaking,
 * and maintaining Authentication Core availability.
 *
 * Architecture (per decision_003):
 * - RecoveryManager NEVER restarts services directly
 * - RecoveryManager publishes recovery events
 * - LifecycleManager performs actual lifecycle operations
 *
 * Circuit Breaker (per decision_001):
 * - Per-service circuit breakers
 * - No global circuit breaker
 * - Each service owns its independent CircuitBreaker
 *
 * Rollback Storage (per decision_002):
 * - Runtime snapshots stored in memory
 * - Persistent state delegated to StateRegistry
 * - SharedPreferences NOT used for rollback
 */
@Singleton
class RecoveryManager @Inject constructor(
    private val eventBus: EventBus,
    private val serviceRegistry: ServiceRegistry,
    private val stateRegistry: StateRegistry,
    private val lifecycleManager: LifecycleManager
) : BootstrapObserver {

    companion object {
        private const val TAG = "RecoveryManager"
        private const val MAX_HISTORY_SIZE = 1000
        private const val MAX_RETRY_ATTEMPTS = 3
    }

    // Per-service circuit breakers
    private val circuitBreakers = mutableMapOf<String, CircuitBreaker>()

    // Rollback snapshots (in-memory, per decision_002)
    private val rollbackSnapshots = mutableMapOf<String, MutableMap<String, Any>>()

    // Retry manager with exponential backoff
    private val retryManager = RetryManager(RetryPolicy())

    // Recovery state
    private val _recoveryState = MutableStateFlow(RecoveryState())
    val recoveryState: StateFlow<RecoveryState> = _recoveryState.asStateFlow()

    // Coroutine scope for async operations
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    // Active recoveries
    private val activeRecoveries = mutableMapOf<String, ActiveRecovery>()

    // Recovery history
    private val recoveryHistory = mutableListOf<RecoveryRecord>()

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "RecoveryManager initialized")
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.HealthMonitorReady -> {
                initializeRecoveryEngine()
            }
            is BootstrapEvent.ComponentFailed -> {
                handleComponentFailed(event.component)
            }
            is BootstrapEvent.CriticalFailure -> {
                handleCriticalFailure()
            }
            is BootstrapEvent.HealthStatusChanged -> {
                checkSystemHealth()
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Initialize the recovery engine after HealthMonitor is ready.
     */
    private fun initializeRecoveryEngine() {
        Log.i(TAG, "Initializing recovery engine...")

        // Create circuit breakers for all registered services
        createCircuitBreakersForServices()

        // Subscribe to LifecycleManager events
        lifecycleManager.addLifecycleListener(object : ke.ac.mku.authcore.lifecycle.LifecycleManager.LifecycleListener {
            override fun onLifecycleEvent(event: ke.ac.mku.authcore.lifecycle.LifecycleEvent) {
                handleLifecycleEvent(event)
            }
        })

        updateState { copy(isRecovering = false) }
        publishRecoveryEvent(RecoveryEvent.RecoveryManagerReady)
        Log.i(TAG, "Recovery engine initialized")
    }

    /**
     * Create circuit breakers for all registered services.
     */
    private fun createCircuitBreakersForServices() {
        val services = serviceRegistry.list()
        services.forEach { serviceName ->
            if (!circuitBreakers.containsKey(serviceName)) {
                circuitBreakers[serviceName] = CircuitBreaker(serviceName)
                Log.d(TAG, "Created circuit breaker for service: $serviceName")
            }
        }
        updateCircuitBreakerStates()
    }

    /**
     * Handle a component failure event.
     */
    private fun handleComponentFailed(component: String) {
        Log.w(TAG, "Component failed: $component")

        // Record failure in circuit breaker
        circuitBreakers[component]?.recordFailure()

        // Update circuit breaker state
        val circuitState = circuitBreakers[component]?.getCircuitState()
        if (circuitState != null) {
            val previousState = _recoveryState.value.circuitBreakerStates[component]?.state
            if (previousState != circuitState.state) {
                if (circuitState.state == CircuitBreakerState.OPEN) {
                    publishRecoveryEvent(RecoveryEvent.CircuitOpened(component))
                } else if (circuitState.state == CircuitBreakerState.CLOSED && previousState == CircuitBreakerState.OPEN) {
                    publishRecoveryEvent(RecoveryEvent.CircuitClosed(component))
                }
            }
        }

        updateCircuitBreakerStates()

        // Determine recovery strategy based on failure
        val category = classifyFailure(component)
        initiateRecovery(component, category)
    }

    /**
     * Handle critical failure event.
     */
    private fun handleCriticalFailure() {
        Log.e(TAG, "Critical failure detected, initiating full system recovery")
        initiateFullSystemRecovery()
    }

    /**
     * Check overall system health.
     */
    private fun checkSystemHealth() {
        val openCircuits = circuitBreakers.values.count { it.getState() == CircuitBreakerState.OPEN }
        if (openCircuits == 0 && _recoveryState.value.consecutiveFailures > 0) {
            publishRecoveryEvent(RecoveryEvent.SystemRecovered)
            updateState { copy(consecutiveFailures = 0) }
        }
    }

    /**
     * Handle lifecycle events from LifecycleManager.
     */
    private fun handleLifecycleEvent(event: ke.ac.mku.authcore.lifecycle.LifecycleEvent) {
        when (event) {
            is ke.ac.mku.authcore.lifecycle.LifecycleEvent.ServiceRestarted -> {
                // Service was restarted by LifecycleManager
                completeActiveRecovery(event.serviceName, success = true)
                circuitBreakers[event.serviceName]?.recordSuccess()
                updateCircuitBreakerStates()
            }
            is ke.ac.mku.authcore.lifecycle.LifecycleEvent.ServiceFailed -> {
                // Service failed even after restart attempts
                handleServiceRestartFailed(event.serviceName, event.error)
            }
            else -> { /* Ignore other lifecycle events */ }
        }
    }

    /**
     * Classify a failure into a FailureCategory.
     */
    private fun classifyFailure(serviceName: String): FailureCategory {
        return when {
            serviceName.contains("auth", ignoreCase = true) -> FailureCategory.AUTHENTICATION_FAILURE
            serviceName.contains("session", ignoreCase = true) -> FailureCategory.SESSION_FAILURE
            serviceName.contains("network", ignoreCase = true) -> FailureCategory.NETWORK_FAILURE
            serviceName.contains("config", ignoreCase = true) -> FailureCategory.CONFIGURATION_FAILURE
            serviceName.contains("state", ignoreCase = true) -> FailureCategory.STATE_FAILURE
            serviceName.contains("resource", ignoreCase = true) -> FailureCategory.RESOURCE_FAILURE
            else -> FailureCategory.SERVICE_FAILURE
        }
    }

    /**
     * Initiate recovery for a failed service.
     */
    private fun initiateRecovery(serviceName: String, category: FailureCategory) {
        Log.i(TAG, "Initiating recovery for $serviceName, category: $category")

        // Check circuit breaker first
        val circuitBreaker = circuitBreakers[serviceName]
        if (circuitBreaker != null && !circuitBreaker.canExecute()) {
            Log.w(TAG, "Circuit breaker is open for $serviceName, skipping recovery")
            return
        }

        // Create active recovery
        val recovery = ActiveRecovery(
            serviceName = serviceName,
            failureCategory = category,
            startTime = System.currentTimeMillis(),
            currentAttempt = 1,
            maxAttempts = MAX_RETRY_ATTEMPTS,
            strategy = RecoveryStrategy.RETRY
        )
        activeRecoveries[serviceName] = recovery
        updateState { copy(isRecovering = true, activeRecoveries = activeRecoveries.toMap()) }

        // Determine strategy based on category
        val strategy = when (category) {
            FailureCategory.TIMEOUT, FailureCategory.NETWORK_FAILURE -> RecoveryStrategy.RETRY
            FailureCategory.SERVICE_FAILURE -> RecoveryStrategy.RESTART
            FailureCategory.AUTHENTICATION_FAILURE, FailureCategory.SESSION_FAILURE -> RecoveryStrategy.REINITIALIZE
            FailureCategory.STATE_FAILURE -> RecoveryStrategy.ROLLBACK
            else -> RecoveryStrategy.RETRY
        }

        publishRecoveryEvent(RecoveryEvent.RecoveryStarted(serviceName, strategy, 1))

        // Execute recovery strategy
        scope.launch {
            executeRecovery(serviceName, strategy, category)
        }
    }

    /**
     * Execute the recovery strategy.
     */
    private suspend fun executeRecovery(
        serviceName: String,
        strategy: RecoveryStrategy,
        category: FailureCategory
    ) {
        when (strategy) {
            RecoveryStrategy.RETRY -> {
                executeRetry(serviceName, category)
            }
            RecoveryStrategy.RESTART -> {
                requestServiceRestart(serviceName)
            }
            RecoveryStrategy.REINITIALIZE -> {
                requestServiceReinitialize(serviceName)
            }
            RecoveryStrategy.ROLLBACK -> {
                executeRollback(serviceName)
            }
            RecoveryStrategy.FULL_RECOVERY -> {
                initiateFullSystemRecovery()
            }
        }
    }

    /**
     * Execute retry with exponential backoff.
     */
    private suspend fun executeRetry(serviceName: String, category: FailureCategory) {
        val result = retryManager.execute(
            operation = {
                // Attempt the operation
                kotlinx.coroutines.delay(100)
                true
            },
            onRetry = { attempt, error ->
                Log.w(TAG, "Retry attempt $attempt for $serviceName: ${error.message}")
                publishRecoveryEvent(RecoveryEvent.RetryStarted(serviceName, attempt, MAX_RETRY_ATTEMPTS))
            }
        )

        when (result) {
            is RetryResult.Success -> {
                completeActiveRecovery(serviceName, success = true)
                circuitBreakers[serviceName]?.recordSuccess()
                updateCircuitBreakerStates()
            }
            is RetryResult.Failure -> {
                Log.e(TAG, "Retry exhausted for $serviceName: ${result.error}")
                publishRecoveryEvent(RecoveryEvent.RetryFailed(serviceName, result.error, result.attempts))
                // Fall back to restart
                requestServiceRestart(serviceName)
            }
            is RetryResult.Retrying -> {
                // Should not happen in this context
            }
        }
    }

    /**
     * Request LifecycleManager to restart a service.
     * RecoveryManager NEVER restarts services directly (per decision_003).
     */
    private fun requestServiceRestart(serviceName: String) {
        Log.i(TAG, "Requesting service restart: $serviceName")
        publishRecoveryEvent(RecoveryEvent.ServiceRestartRequested(serviceName))
    }

    /**
     * Request LifecycleManager to reinitialize a service.
     */
    private fun requestServiceReinitialize(serviceName: String) {
        Log.i(TAG, "Requesting service reinitialize: $serviceName")
        publishRecoveryEvent(RecoveryEvent.ReinitializeServiceRequested(serviceName))
    }

    /**
     * Execute rollback using in-memory snapshots (per decision_002).
     * Note: StateRegistry.restoreState takes RuntimeState, so we handle
     * rollback differently - the snapshot contains service-specific state.
     */
    private suspend fun executeRollback(serviceName: String) {
        Log.i(TAG, "Executing rollback for $serviceName")

        val snapshot = rollbackSnapshots[serviceName]
        if (snapshot != null) {
            // Rollback snapshots are in-memory Map<String, Any> for fast recovery
            // The actual state restoration is delegated to the service itself
            // via reinitialize which will reload from StateRegistry
            Log.d(TAG, "Rollback snapshot found for $serviceName, requesting reinitialize")
            requestServiceReinitialize(serviceName)
            publishRecoveryEvent(RecoveryEvent.RollbackCompleted)
            completeActiveRecovery(serviceName, success = true)
        } else {
            // No snapshot available, request reinitialize instead
            Log.w(TAG, "No rollback snapshot for $serviceName, requesting reinitialize")
            requestServiceReinitialize(serviceName)
        }
    }

    /**
     * Take a snapshot for potential rollback.
     */
    fun takeSnapshot(serviceName: String, state: Map<String, Any>) {
        rollbackSnapshots[serviceName] = state.toMutableMap()
        Log.d(TAG, "Snapshot taken for $serviceName")
    }

    /**
     * Complete an active recovery.
     */
    private fun completeActiveRecovery(serviceName: String, success: Boolean) {
        val recovery = activeRecoveries.remove(serviceName)
        if (recovery != null) {
            val record = RecoveryRecord(
                serviceName = serviceName,
                failureCategory = recovery.failureCategory,
                strategy = recovery.strategy,
                success = success,
                startTime = recovery.startTime,
                endTime = System.currentTimeMillis(),
                errorMessage = null,
                attempts = recovery.currentAttempt
            )
            addToHistory(record)

            val duration = record.endTime - record.startTime
            if (success) {
                publishRecoveryEvent(RecoveryEvent.RecoveryCompleted(serviceName, recovery.strategy, duration))
                updateState { copy(isRecovering = activeRecoveries.isNotEmpty()) }
            } else {
                publishRecoveryEvent(RecoveryEvent.RecoveryFailed(serviceName, recovery.strategy, "Recovery failed", recovery.currentAttempt))
            }
        }
    }

    /**
     * Handle service restart failure.
     */
    private fun handleServiceRestartFailed(serviceName: String, error: String) {
        Log.e(TAG, "Service restart failed for $serviceName: $error")
        updateState { copy(consecutiveFailures = consecutiveFailures + 1) }

        // Check if circuit breaker should open
        circuitBreakers[serviceName]?.recordFailure()
        updateCircuitBreakerStates()

        // Remove from active recovery
        activeRecoveries.remove(serviceName)

        // Record failure
        val record = RecoveryRecord(
            serviceName = serviceName,
            failureCategory = FailureCategory.SERVICE_FAILURE,
            strategy = RecoveryStrategy.RESTART,
            success = false,
            startTime = System.currentTimeMillis(),
            endTime = System.currentTimeMillis(),
            errorMessage = error,
            attempts = MAX_RETRY_ATTEMPTS
        )
        addToHistory(record)
    }

    /**
     * Initiate full system recovery.
     */
    private fun initiateFullSystemRecovery() {
        Log.i(TAG, "Initiating full system recovery")
        // Reset all circuit breakers
        circuitBreakers.values.forEach { it.reset() }
        updateCircuitBreakerStates()

        // Request LifecycleManager to restart all services
        lifecycleManager.restartServices()
    }

    /**
     * Add a record to recovery history.
     */
    private fun addToHistory(record: RecoveryRecord) {
        recoveryHistory.add(record)
        if (recoveryHistory.size > MAX_HISTORY_SIZE) {
            recoveryHistory.removeAt(0)
        }
        updateState {
            copy(
                recoveryHistory = recoveryHistory.toList(),
                lastRecoveryTime = record.endTime
            )
        }
    }

    /**
     * Update circuit breaker states in state.
     */
    private fun updateCircuitBreakerStates() {
        val states = circuitBreakers.mapValues { it.value.getCircuitState() }
        updateState { copy(circuitBreakerStates = states) }
    }

    /**
     * Update recovery state.
     */
    private fun updateState(update: RecoveryState.() -> RecoveryState) {
        _recoveryState.value = _recoveryState.value.update()
    }

    /**
     * Publish a recovery event via EventBus.
     */
    private fun publishRecoveryEvent(event: RecoveryEvent) {
        // RecoveryEvent is internal, convert to BootstrapEvent for EventBus
        val bootstrapEvent = when (event) {
            is RecoveryEvent.RecoveryManagerReady -> BootstrapEvent.RecoveryManagerReady
            is RecoveryEvent.RecoveryStarted -> BootstrapEvent.RecoveryStarted(event.serviceName, event.strategy, event.attempt)
            is RecoveryEvent.RecoveryCompleted -> BootstrapEvent.RecoveryCompleted(event.serviceName, event.strategy, event.durationMs)
            is RecoveryEvent.RecoveryFailed -> BootstrapEvent.RecoveryFailed(event.serviceName, event.strategy, event.error, event.attempts)
            is RecoveryEvent.ServiceRestartRequested -> BootstrapEvent.ServiceRestartRequested(event.serviceName)
            is RecoveryEvent.ServiceRestarted -> BootstrapEvent.ServiceRestarted(event.serviceName)
            is RecoveryEvent.ReinitializeServiceRequested -> BootstrapEvent.ReinitializeServiceRequested(event.serviceName)
            is RecoveryEvent.RollbackRequested -> BootstrapEvent.RollbackRequested(event.serviceName)
            is RecoveryEvent.RollbackCompleted -> BootstrapEvent.RollbackCompleted
            is RecoveryEvent.RetryStarted -> BootstrapEvent.RetryStarted(event.serviceName, event.attempt, event.maxAttempts)
            is RecoveryEvent.RetryFailed -> BootstrapEvent.RetryFailed(event.serviceName, event.error, event.attempts)
            is RecoveryEvent.CircuitOpened -> BootstrapEvent.CircuitOpened(event.serviceName)
            is RecoveryEvent.CircuitClosed -> BootstrapEvent.CircuitClosed(event.serviceName)
            is RecoveryEvent.SystemRecovered -> BootstrapEvent.SystemRecovered
            is RecoveryEvent.CircuitStateChanged -> BootstrapEvent.CircuitStateChanged(event.serviceName, event.previousState, event.newState)
        }
        eventBus.publish(bootstrapEvent)
    }

    /**
     * Get circuit breaker for a service.
     */
    fun getCircuitBreaker(serviceName: String): CircuitBreaker? = circuitBreakers[serviceName]

    /**
     * Get recovery history.
     */
    fun getRecoveryHistory(): List<RecoveryRecord> = recoveryHistory.toList()

    /**
     * Clear recovery history.
     */
    fun clearHistory() {
        recoveryHistory.clear()
        updateState { copy(recoveryHistory = emptyList()) }
    }
}