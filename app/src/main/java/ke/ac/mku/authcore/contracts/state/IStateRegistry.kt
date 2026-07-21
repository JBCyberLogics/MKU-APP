package ke.ac.mku.authcore.contracts.state

import kotlinx.coroutines.flow.StateFlow
import ke.ac.mku.authcore.state.RuntimeState
import ke.ac.mku.authcore.state.ApplicationState
import ke.ac.mku.authcore.state.AuthenticationState
import ke.ac.mku.authcore.state.NetworkState
import ke.ac.mku.authcore.state.PortalState
import ke.ac.mku.authcore.state.SessionState
import ke.ac.mku.authcore.state.StateHistoryEntry

/**
 * IStateRegistry - CORE-012
 *
 * Contract for StateRegistry.
 * Central state management with reactive updates.
 */
interface IStateRegistry {
    /**
     * The state as a reactive flow.
     */
    val stateFlow: StateFlow<RuntimeState>

    /**
     * Get current state.
     */
    fun getState(): RuntimeState

    /**
     * Update application state.
     */
    fun updateApplicationState(state: ApplicationState)

    /**
     * Update authentication state.
     */
    fun updateAuthenticationState(state: AuthenticationState)

    /**
     * Update network state.
     */
    fun updateNetworkState(state: NetworkState)

    /**
     * Update portal state.
     */
    fun updatePortalState(state: PortalState)

    /**
     * Update session state.
     */
    fun updateSessionState(state: SessionState)

    /**
     * Restore state from persistence.
     */
    fun restoreState(state: RuntimeState)

    /**
     * Reset to default state.
     */
    fun reset()

    /**
     * Get state history.
     */
    fun getStateHistory(): List<StateHistoryEntry>

    /**
     * Initialize the registry.
     */
    fun initialize()
}