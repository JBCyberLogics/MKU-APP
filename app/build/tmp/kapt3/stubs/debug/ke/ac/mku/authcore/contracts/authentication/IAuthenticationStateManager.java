package ke.ac.mku.authcore.contracts.authentication;

import ke.ac.mku.authcore.state.AuthenticationState;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/IAuthenticationStateManager;", "", "clearState", "", "getCurrentState", "Lke/ac/mku/authcore/state/AuthenticationState;", "getMetrics", "Lke/ac/mku/authcore/contracts/authentication/StateMetrics;", "getStateHistory", "", "Lke/ac/mku/authcore/contracts/authentication/StateTransition;", "isAuthenticated", "restoreState", "rollbackState", "transitionTo", "target", "app_debug"})
public abstract interface IAuthenticationStateManager {
    
    /**
     * Get the current authentication state.
     *
     * @return The current [AuthenticationState]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.state.AuthenticationState getCurrentState();
    
    /**
     * Attempt to transition to the target authentication state.
     * Validates the transition via FSM before executing.
     *
     * @param target The target [AuthenticationState] to transition to
     * @return True if transition was successful, false if invalid or failed
     */
    public abstract boolean transitionTo(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.AuthenticationState target);
    
    /**
     * Rollback to the previous valid authentication state.
     * Used when a transition fails and recovery is needed.
     *
     * @return True if rollback was successful, false if no previous state exists
     */
    public abstract boolean rollbackState();
    
    /**
     * Restore the authentication state from persistent storage.
     * Called on application startup to recover previous state.
     *
     * @return True if state was restored successfully, false if no persisted state exists
     */
    public abstract boolean restoreState();
    
    /**
     * Clear the current authentication state and persisted state.
     * Called on logout to reset authentication.
     *
     * @return True if state was cleared successfully
     */
    public abstract boolean clearState();
    
    /**
     * Check if the current state represents an authenticated session.
     *
     * @return True if authenticated, false otherwise
     */
    public abstract boolean isAuthenticated();
    
    /**
     * Get the complete state transition history.
     *
     * @return List of [StateTransition] records ordered by timestamp
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.authentication.StateTransition> getStateHistory();
    
    /**
     * Get authentication state management metrics.
     *
     * @return [StateMetrics] containing transition and performance data
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.StateMetrics getMetrics();
}