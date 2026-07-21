package ke.ac.mku.authcore.contracts.state;

/**
 * IStateRegistry - CORE-012
 *
 * Contract for StateRegistry.
 * Central state management with reactive updates.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\tH&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\b\u0010\u0019\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/state/IStateRegistry;", "", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lke/ac/mku/authcore/state/RuntimeState;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getState", "updateApplicationState", "", "state", "Lke/ac/mku/authcore/state/ApplicationState;", "updateAuthenticationState", "Lke/ac/mku/authcore/state/AuthenticationState;", "updateNetworkState", "Lke/ac/mku/authcore/state/NetworkState;", "updatePortalState", "Lke/ac/mku/authcore/state/PortalState;", "updateSessionState", "Lke/ac/mku/authcore/state/SessionState;", "restoreState", "reset", "getStateHistory", "", "Lke/ac/mku/authcore/state/StateHistoryEntry;", "initialize", "app"})
public abstract interface IStateRegistry {
    
    /**
     * The state as a reactive flow.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<ke.ac.mku.authcore.state.RuntimeState> getStateFlow();
    
    /**
     * Get current state.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.state.RuntimeState getState();
    
    /**
     * Update application state.
     */
    public abstract void updateApplicationState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.ApplicationState state);
    
    /**
     * Update authentication state.
     */
    public abstract void updateAuthenticationState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.AuthenticationState state);
    
    /**
     * Update network state.
     */
    public abstract void updateNetworkState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.NetworkState state);
    
    /**
     * Update portal state.
     */
    public abstract void updatePortalState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.PortalState state);
    
    /**
     * Update session state.
     */
    public abstract void updateSessionState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.SessionState state);
    
    /**
     * Restore state from persistence.
     */
    public abstract void restoreState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.RuntimeState state);
    
    /**
     * Reset to default state.
     */
    public abstract void reset();
    
    /**
     * Get state history.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.state.StateHistoryEntry> getStateHistory();
    
    /**
     * Initialize the registry.
     */
    public abstract void initialize();
}