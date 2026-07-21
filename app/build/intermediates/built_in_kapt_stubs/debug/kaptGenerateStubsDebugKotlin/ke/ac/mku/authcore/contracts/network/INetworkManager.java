package ke.ac.mku.authcore.contracts.network;

/**
 * NETWORK-001: Network Manager Contract
 *
 * Central authority responsible for managing all network communication
 * within the authentication platform.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/network/INetworkManager;", "", "initializeNetwork", "", "isOnline", "", "getNetworkState", "Lke/ac/mku/authcore/contracts/network/NetworkState;", "requestNetworkRecovery", "pauseNetwork", "resumeNetwork", "app"})
public abstract interface INetworkManager {
    
    /**
     * Initialize networking platform.
     */
    public abstract void initializeNetwork();
    
    /**
     * Determine network availability.
     *
     * @return true if the device is currently online.
     */
    public abstract boolean isOnline();
    
    /**
     * Return current network state.
     *
     * @return Current [NetworkState].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.NetworkState getNetworkState();
    
    /**
     * Initiate network recovery.
     */
    public abstract void requestNetworkRecovery();
    
    /**
     * Pause outgoing requests.
     */
    public abstract void pauseNetwork();
    
    /**
     * Resume network operations.
     */
    public abstract void resumeNetwork();
}