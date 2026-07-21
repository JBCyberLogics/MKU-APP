package ke.ac.mku.authcore.state

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.lifecycle.LifecycleEvent
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.lifecycle.LifecycleManager.LifecycleListener
import ke.ac.mku.authcore.service.ServiceRegistry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * StateRegistry - CORE-007
 *
 * Central state management for AuthCore using StateFlow as the reactive engine.
 * Acts as the single source of truth for all application state.
 * Tracks state history with timestamps and source module.
 * Prevents duplicate updates and validates state before publishing.
 */
@Singleton
class StateRegistry @Inject constructor(
    private val eventBus: EventBus,
    private val lifecycleManager: LifecycleManager,
    private val serviceRegistry: ServiceRegistry
) : BootstrapObserver, LifecycleListener {

    companion object {
        private const val TAG = "StateRegistry"
        private const val MAX_HISTORY_ENTRIES = 500
    }

    private val _stateFlow = MutableStateFlow(RuntimeState())
    val stateFlow: StateFlow<RuntimeState> = _stateFlow.asStateFlow()

    private val stateHistory = mutableListOf<StateHistoryEntry>()

    init {
        eventBus.subscribe(this)
        lifecycleManager.addLifecycleListener(this)
        Log.i(TAG, "StateRegistry initialized, subscribed to bootstrap and lifecycle events")
    }

    override fun onLifecycleEvent(event: LifecycleEvent) {
        when (event) {
            is LifecycleEvent.AllServicesReady -> {
                updateApplicationState(ApplicationState.READY)
            }
            is LifecycleEvent.ServiceStarted -> {
                // Individual service started - could update portal state if needed
            }
            is LifecycleEvent.ServiceStopped -> {
                // Individual service stopped
            }
            is LifecycleEvent.ServiceShutdown -> {
                updateApplicationState(ApplicationState.SHUTDOWN)
            }
            is LifecycleEvent.ServiceFailed -> {
                // Service failed - could update network or portal state
            }
            else -> { /* Ignore other events */ }
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.RegistryReady -> {
                Log.i(TAG, "Registry ready, StateRegistry available")
                eventBus.publish(BootstrapEvent.StateInitialized)
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Get the current runtime state.
     */
    fun getState(): RuntimeState = _stateFlow.value

    /**
     * Update the application state.
     */
    fun updateApplicationState(state: ApplicationState) {
        updateState { current ->
            if (current.application == state) {
                null // No change, prevent duplicate update
            } else {
                current.copy(application = state, lastUpdated = System.currentTimeMillis())
            }
        }
    }

    /**
     * Update the authentication state.
     */
    fun updateAuthenticationState(state: AuthenticationState) {
        updateState { current ->
            if (current.authentication == state) {
                null // No change, prevent duplicate update
            } else {
                current.copy(authentication = state, lastUpdated = System.currentTimeMillis())
            }
        }
    }

    /**
     * Update the network state.
     */
    fun updateNetworkState(state: NetworkState) {
        updateState { current ->
            if (current.network == state) {
                null // No change, prevent duplicate update
            } else {
                current.copy(network = state, lastUpdated = System.currentTimeMillis())
            }
        }
    }

    /**
     * Update the portal state.
     */
    fun updatePortalState(state: PortalState) {
        updateState { current ->
            if (current.portal == state) {
                null // No change, prevent duplicate update
            } else {
                current.copy(portal = state, lastUpdated = System.currentTimeMillis())
            }
        }
    }

    /**
     * Update the session state.
     */
    fun updateSessionState(state: SessionState) {
        updateState { current ->
            if (current.session == state) {
                null // No change, prevent duplicate update
            } else {
                current.copy(session = state, lastUpdated = System.currentTimeMillis())
            }
        }
    }

    /**
     * Restore a persisted state.
     */
    fun restoreState(state: RuntimeState) {
        val previousState = _stateFlow.value
        _stateFlow.value = state.copy(lastUpdated = System.currentTimeMillis())
        addHistoryEntry(previousState, state, "StateRegistry")
        eventBus.publish(BootstrapEvent.StateRestored)
        Log.i(TAG, "State restored: $state")
    }

    /**
     * Reset to default state.
     */
    fun reset() {
        val previousState = _stateFlow.value
        val defaultState = RuntimeState()
        _stateFlow.value = defaultState
        addHistoryEntry(previousState, defaultState, "StateRegistry")
        eventBus.publish(BootstrapEvent.StateReset)
        Log.i(TAG, "State reset to default")
    }

    /**
     * Get the state history.
     */
    fun getStateHistory(): List<StateHistoryEntry> = stateHistory.toList()

    /**
     * Initialize the StateRegistry - called by LifecycleManager.
     */
    fun initialize() {
        Log.i(TAG, "StateRegistry initializing...")
        eventBus.publish(BootstrapEvent.StateInitialized)
    }

    /**
     * Internal method to update state with validation and history tracking.
     */
    private fun updateState(update: (RuntimeState) -> RuntimeState?) {
        val currentState = _stateFlow.value
        val newState = update(currentState)

        if (newState == null) {
            Log.d(TAG, "State unchanged, skipping update")
            return
        }

        // Validate state transition
        if (!isValidStateTransition(currentState, newState)) {
            Log.w(TAG, "Invalid state transition detected")
            eventBus.publish(BootstrapEvent.StateValidationFailed("Invalid transition"))
            return
        }

        val previousState = _stateFlow.value
        _stateFlow.value = newState
        addHistoryEntry(previousState, newState, "StateRegistry")
        eventBus.publish(BootstrapEvent.StateChanged(previousState, newState))
        Log.d(TAG, "State updated: $previousState -> $newState")
    }

    /**
     * Validate state transition (can be extended with more rules).
     */
    private fun isValidStateTransition(from: RuntimeState, to: RuntimeState): Boolean {
        // Example validation: Cannot go from SHUTDOWN to READY without proper restart
        if (from.application == ApplicationState.SHUTDOWN && to.application == ApplicationState.READY) {
            Log.w(TAG, "Invalid transition: Cannot go from SHUTDOWN to READY directly")
            return false
        }
        return true
    }

    /**
     * Add an entry to the state history.
     */
    private fun addHistoryEntry(previousState: RuntimeState, newState: RuntimeState, sourceModule: String) {
        val entry = StateHistoryEntry(
            timestamp = System.currentTimeMillis(),
            sourceModule = sourceModule,
            previousState = previousState,
            newState = newState
        )

        stateHistory.add(entry)

        // Trim history if it exceeds max entries
        while (stateHistory.size > MAX_HISTORY_ENTRIES) {
            stateHistory.removeAt(0)
        }
    }
}