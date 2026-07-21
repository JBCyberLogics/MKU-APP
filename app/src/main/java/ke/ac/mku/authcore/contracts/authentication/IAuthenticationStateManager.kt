package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.state.AuthenticationState

/**
 * IAuthenticationStateManager - CORE-012
 *
 * Public platform contract for authentication state management.
 * This is the SINGLE SOURCE OF TRUTH for authentication state.
 *
 * Manages the complete authentication lifecycle including:
 * - State transitions with FSM validation
 * - State persistence and recovery
 * - State history and metrics
 * - Rollback on failed transitions
 *
 * Future modules (AUTH-004, SESSION-*, PORTAL-*) will consume this contract.
 * AuthenticationStateManager wraps [ke.ac.mku.authcore.state.StateRegistry] via
 * delegation pattern, acting as the authoritative source for auth state.
 */
interface IAuthenticationStateManager {

    /**
     * Get the current authentication state.
     *
     * @return The current [AuthenticationState]
     */
    fun getCurrentState(): AuthenticationState

    /**
     * Attempt to transition to the target authentication state.
     * Validates the transition via FSM before executing.
     *
     * @param target The target [AuthenticationState] to transition to
     * @return True if transition was successful, false if invalid or failed
     */
    fun transitionTo(target: AuthenticationState): Boolean

    /**
     * Rollback to the previous valid authentication state.
     * Used when a transition fails and recovery is needed.
     *
     * @return True if rollback was successful, false if no previous state exists
     */
    fun rollbackState(): Boolean

    /**
     * Restore the authentication state from persistent storage.
     * Called on application startup to recover previous state.
     *
     * @return True if state was restored successfully, false if no persisted state exists
     */
    fun restoreState(): Boolean

    /**
     * Clear the current authentication state and persisted state.
     * Called on logout to reset authentication.
     *
     * @return True if state was cleared successfully
     */
    fun clearState(): Boolean

    /**
     * Check if the current state represents an authenticated session.
     *
     * @return True if authenticated, false otherwise
     */
    fun isAuthenticated(): Boolean

    /**
     * Get the complete state transition history.
     *
     * @return List of [StateTransition] records ordered by timestamp
     */
    fun getStateHistory(): List<StateTransition>

    /**
     * Get authentication state management metrics.
     *
     * @return [StateMetrics] containing transition and performance data
     */
    fun getMetrics(): StateMetrics
}

/**
 * Represents a single state transition in the authentication lifecycle.
 *
 * @property timestamp When the transition occurred
 * @property fromState The state before transition
 * @property toState The state after transition
 * @property success Whether the transition was successful
 * @property reason Reason for failure if transition failed
 */
data class StateTransition(
    val timestamp: Long,
    val fromState: AuthenticationState,
    val toState: AuthenticationState,
    val success: Boolean,
    val reason: String? = null
)

/**
 * Authentication state management metrics.
 *
 * @property totalTransitions Total number of state transitions
 * @property failedTransitions Number of failed transitions
 * @property rollbackCount Number of rollbacks performed
 * @property lastTransitionTime Timestamp of last transition
 * @property uptimeMillis Time in milliseconds the manager has been active
 */
data class StateMetrics(
    val totalTransitions: Int = 0,
    val failedTransitions: Int = 0,
    val rollbackCount: Int = 0,
    val lastTransitionTime: Long = 0,
    val uptimeMillis: Long = 0
)