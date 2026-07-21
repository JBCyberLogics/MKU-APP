package ke.ac.mku.authcore.auth.state

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager
import ke.ac.mku.authcore.contracts.authentication.StateMetrics
import ke.ac.mku.authcore.contracts.authentication.StateTransition
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.state.AuthenticationState
import ke.ac.mku.authcore.state.StateRegistry
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * AuthenticationStateManager - AUTH-003
 *
 * Central authority for managing the complete authentication lifecycle.
 * Maintains authentication state, coordinates state transitions, supports recovery,
 * persistence, synchronization, and guarantees a single source of truth for
 * authentication status across the platform.
 *
 * Implements FSM pattern with validated transitions only.
 * Wraps [StateRegistry] via delegation pattern - StateRegistry receives updates
 * only after validation by this manager.
 */
@Singleton
class AuthenticationStateManager @Inject constructor(
    private val stateRegistry: StateRegistry,
    private val secureStorage: ISecureStorageManager,
    private val recoveryManager: RecoveryManager,
    private val securityMonitor: ISecurityMonitor,
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry,
    private val authEventManager: IAuthenticationEventManager
) : IAuthenticationStateManager, BootstrapObserver {

    companion object {
        private const val TAG = "AuthenticationStateManager"
        private const val AUTH_STATE_KEY = "auth_state"
        private const val MAX_HISTORY_ENTRIES = 100
    }

    // Current and previous state
    @Volatile
    private var currentState: AuthenticationState = AuthenticationState.UNINITIALIZED

    @Volatile
    private var previousState: AuthenticationState = AuthenticationState.UNINITIALIZED

    // State transition history
    private val transitionHistory = mutableListOf<StateTransition>()

    // Metrics
    private var totalTransitions = 0
    private var failedTransitions = 0
    private var rollbackCount = 0
    private var lastTransitionTime = 0L
    private val startTime = System.currentTimeMillis()

    // Valid state transitions map
    private val validTransitions: Map<AuthenticationState, Set<AuthenticationState>> by lazy {
        buildValidTransitionsMap()
    }

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "AuthenticationStateManager initialized")
    }

    // ==================== IAuthenticationStateManager Implementation ====================

    /**
     * Get the current authentication state.
     */
    override fun getCurrentState(): AuthenticationState = currentState

    /**
     * Attempt to transition to the target authentication state.
     * Validates the transition via FSM before executing.
     */
    override fun transitionTo(target: AuthenticationState): Boolean {
        val from = currentState

        // Validate transition
        if (!isValidTransition(from, target)) {
            Log.w(TAG, "Invalid transition attempted: $from -> $target")
            failedTransitions++
            recordTransition(from, target, success = false, reason = "Invalid transition")
            authEventManager.publish(BootstrapEvent.AuthenticationStateFailed("Invalid transition: $from -> $target"))

            // Attempt rollback
            if (rollbackState()) {
                return false
            }
            return false
        }

        // Security check before transition
        if (!securityMonitor.isPlatformSecure()) {
            Log.w(TAG, "Security check failed before transition")
            failedTransitions++
            recordTransition(from, target, success = false, reason = "Security check failed")
            authEventManager.publish(BootstrapEvent.AuthenticationStateFailed("Security check failed"))
            return false
        }

        // Perform transition
        val previous = currentState
        currentState = target
        previousState = previous
        totalTransitions++
        lastTransitionTime = System.currentTimeMillis()

        // Record transition
        recordTransition(previous, target, success = true)
        Log.i(TAG, "State transition: $previous -> $target")

        // Update StateRegistry (only after successful validation)
        stateRegistry.updateAuthenticationState(target)

        // Publish events
        authEventManager.publish(BootstrapEvent.AuthenticationStateChanged(previous, target))
        persistState()

        // Handle specific state transitions
        handleStateTransition(previous, target)

        return true
    }

    /**
     * Rollback to the previous valid authentication state.
     */
    override fun rollbackState(): Boolean {
        val target = previousState
        if (target == currentState) {
            Log.w(TAG, "Cannot rollback: no previous state available")
            return false
        }

        Log.i(TAG, "Rolling back from $currentState to $target")
        currentState = target
        rollbackCount++

        // Update StateRegistry
        stateRegistry.updateAuthenticationState(target)

        // Publish events
        authEventManager.publish(BootstrapEvent.AuthenticationStateChanged(currentState, target))
        authEventManager.publish(BootstrapEvent.AuthenticationStateRecovered(target))
        persistState()

        return true
    }

    /**
     * Restore the authentication state from persistent storage.
     */
    override fun restoreState(): Boolean {
        val result = secureStorage.retrieve(StorageDomain.AUTH_STATE, AUTH_STATE_KEY)
        if (!result.success || result.data == null) {
            Log.i(TAG, "No persisted state found")
            return false
        }

        return try {
            val json = JSONObject(result.data)
            val stateName = json.getString("current_state")
            val state = AuthenticationState.valueOf(stateName)

            currentState = state
            previousState = if (json.has("previous_state")) {
                AuthenticationState.valueOf(json.getString("previous_state"))
            } else {
                state
            }

            Log.i(TAG, "State restored: $currentState")
            authEventManager.publish(BootstrapEvent.AuthenticationStateRestored(currentState))
            true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to restore state: ${e.message}")
            false
        }
    }

    /**
     * Clear the current authentication state and persisted state.
     */
    override fun clearState(): Boolean {
        Log.i(TAG, "Clearing authentication state")
        previousState = currentState
        currentState = AuthenticationState.UNAUTHENTICATED

        // Update StateRegistry
        stateRegistry.updateAuthenticationState(AuthenticationState.UNAUTHENTICATED)

        // Clear persisted state
        secureStorage.delete(StorageDomain.AUTH_STATE, AUTH_STATE_KEY)

        // Publish event
        authEventManager.publish(BootstrapEvent.AuthenticationStateChanged(previousState, AuthenticationState.UNAUTHENTICATED))

        return true
    }

    /**
     * Check if the current state represents an authenticated session.
     */
    override fun isAuthenticated(): Boolean {
        return currentState in setOf(
            AuthenticationState.AUTHENTICATED,
            AuthenticationState.SESSION_ACTIVE,
            AuthenticationState.PORTAL_CONNECTED
        )
    }

    /**
     * Get the complete state transition history.
     */
    override fun getStateHistory(): List<StateTransition> = transitionHistory.toList()

    /**
     * Get authentication state management metrics.
     */
    override fun getMetrics(): StateMetrics {
        return StateMetrics(
            totalTransitions = totalTransitions,
            failedTransitions = failedTransitions,
            rollbackCount = rollbackCount,
            lastTransitionTime = lastTransitionTime,
            uptimeMillis = System.currentTimeMillis() - startTime
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.StateInitialized -> {
                // StateRegistry is ready, attempt to restore our state
                if (restoreState()) {
                    Log.i(TAG, "State restored from storage on startup")
                } else {
                    // No persisted state, start from UNINITIALIZED
                    transitionTo(AuthenticationState.INITIALIZING)
                    transitionTo(AuthenticationState.READY)
                }
                authEventManager.publish(BootstrapEvent.AuthenticationStateInitialized)
            }
            is BootstrapEvent.AuthenticationCoreInitialized -> {
                // Auth core is ready, publish AuthenticationReady if in READY state
                if (currentState == AuthenticationState.READY) {
                    authEventManager.publish(BootstrapEvent.AuthenticationReady)
                }
            }
            else -> { /* Ignore other events */ }
        }
    }

    // ==================== Private Helper Methods ====================

    /**
     * Build the valid state transitions map.
     */
    private fun buildValidTransitionsMap(): Map<AuthenticationState, Set<AuthenticationState>> {
        return mapOf(
            // Initialization flow
            AuthenticationState.UNINITIALIZED to setOf(AuthenticationState.INITIALIZING),
            AuthenticationState.INITIALIZING to setOf(AuthenticationState.READY, AuthenticationState.FAILED),
            AuthenticationState.READY to setOf(
                AuthenticationState.AUTHENTICATING,
                AuthenticationState.UNINITIALIZED,
                AuthenticationState.FAILED
            ),

            // Authentication flow
            AuthenticationState.AUTHENTICATING to setOf(
                AuthenticationState.AUTHENTICATED,
                AuthenticationState.FAILED,
                AuthenticationState.LOGGED_OUT
            ),
            AuthenticationState.AUTHENTICATED to setOf(
                AuthenticationState.SESSION_INITIALIZING,
                AuthenticationState.LOGGING_OUT,
                AuthenticationState.SESSION_EXPIRED,
                AuthenticationState.FAILED
            ),

            // Session flow
            AuthenticationState.SESSION_INITIALIZING to setOf(
                AuthenticationState.SESSION_ACTIVE,
                AuthenticationState.FAILED,
                AuthenticationState.LOGGING_OUT
            ),
            AuthenticationState.SESSION_ACTIVE to setOf(
                AuthenticationState.PORTAL_CONNECTING,
                AuthenticationState.REFRESHING,
                AuthenticationState.LOGGING_OUT,
                AuthenticationState.SESSION_EXPIRED,
                AuthenticationState.FAILED
            ),

            // Portal connection flow
            AuthenticationState.PORTAL_CONNECTING to setOf(
                AuthenticationState.PORTAL_CONNECTED,
                AuthenticationState.FAILED,
                AuthenticationState.LOGGING_OUT
            ),
            AuthenticationState.PORTAL_CONNECTED to setOf(
                AuthenticationState.REFRESHING,
                AuthenticationState.LOGGING_OUT,
                AuthenticationState.SESSION_EXPIRED,
                AuthenticationState.FAILED
            ),

            // Refresh flow
            AuthenticationState.REFRESHING to setOf(
                AuthenticationState.SESSION_ACTIVE,
                AuthenticationState.PORTAL_CONNECTED,
                AuthenticationState.FAILED,
                AuthenticationState.SESSION_EXPIRED
            ),

            // Session expired flow
            AuthenticationState.SESSION_EXPIRED to setOf(
                AuthenticationState.AUTHENTICATING,
                AuthenticationState.LOGGED_OUT,
                AuthenticationState.RECOVERING
            ),

            // Logout flow
            AuthenticationState.LOGGING_OUT to setOf(
                AuthenticationState.LOGGED_OUT,
                AuthenticationState.FAILED
            ),
            AuthenticationState.LOGGED_OUT to setOf(
                AuthenticationState.AUTHENTICATING,
                AuthenticationState.UNAUTHENTICATED
            ),

            // Failure and recovery flow
            AuthenticationState.FAILED to setOf(
                AuthenticationState.RECOVERING,
                AuthenticationState.LOGGING_OUT,
                AuthenticationState.UNAUTHENTICATED
            ),
            AuthenticationState.RECOVERING to setOf(
                AuthenticationState.READY,
                AuthenticationState.AUTHENTICATING,
                AuthenticationState.FAILED,
                AuthenticationState.LOGGED_OUT
            ),

            // Terminal states (no outgoing transitions)
            AuthenticationState.UNAUTHENTICATED to emptySet()
        )
    }

    /**
     * Check if a state transition is valid.
     */
    private fun isValidTransition(from: AuthenticationState, to: AuthenticationState): Boolean {
        val allowedTransitions = validTransitions[from] ?: emptySet()
        return to in allowedTransitions
    }

    /**
     * Record a state transition in history.
     */
    private fun recordTransition(
        from: AuthenticationState,
        to: AuthenticationState,
        success: Boolean,
        reason: String? = null
    ) {
        val entry = StateTransition(
            timestamp = System.currentTimeMillis(),
            fromState = from,
            toState = to,
            success = success,
            reason = reason
        )

        transitionHistory.add(entry)

        // Trim history if it exceeds max entries
        while (transitionHistory.size > MAX_HISTORY_ENTRIES) {
            transitionHistory.removeAt(0)
        }
    }

    /**
     * Persist the current state to storage.
     */
    private fun persistState() {
        val json = JSONObject().apply {
            put("current_state", currentState.name)
            put("previous_state", previousState.name)
            put("timestamp", System.currentTimeMillis())
        }

        val result = secureStorage.store(StorageDomain.AUTH_STATE, AUTH_STATE_KEY, json.toString())
        if (result.success) {
            authEventManager.publish(BootstrapEvent.AuthenticationStatePersisted(currentState))
        } else {
            Log.e(TAG, "Failed to persist state: ${result.error}")
        }
    }

    /**
     * Handle specific state transitions with side effects.
     */
    private fun handleStateTransition(previous: AuthenticationState, current: AuthenticationState) {
        when (current) {
            AuthenticationState.SESSION_EXPIRED -> {
                authEventManager.publish(BootstrapEvent.AuthenticationStateExpired(previous))
            }
            AuthenticationState.FAILED -> {
                authEventManager.publish(BootstrapEvent.AuthenticationStateFailed("State transition failed"))
                // Trigger recovery if in authenticated states
                if (previous in setOf(
                        AuthenticationState.AUTHENTICATED,
                        AuthenticationState.SESSION_ACTIVE,
                        AuthenticationState.PORTAL_CONNECTED
                    )
                ) {
                    recoveryManager.takeSnapshot("AuthenticationState", mapOf(
                        "previousState" to previous.name,
                        "currentState" to current.name,
                        "timestamp" to System.currentTimeMillis()
                    ))
                }
            }
            AuthenticationState.READY -> {
                authEventManager.publish(BootstrapEvent.AuthenticationReady)
            }
            else -> { /* No special handling */ }
        }
    }
}