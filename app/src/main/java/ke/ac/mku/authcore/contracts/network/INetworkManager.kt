package ke.ac.mku.authcore.contracts.network

/**
 * NETWORK-001: Network Manager Contract
 *
 * Central authority responsible for managing all network communication
 * within the authentication platform.
 */
interface INetworkManager {

    /**
     * Initialize networking platform.
     */
    fun initializeNetwork()

    /**
     * Determine network availability.
     *
     * @return true if the device is currently online.
     */
    fun isOnline(): Boolean

    /**
     * Return current network state.
     *
     * @return Current [NetworkState].
     */
    fun getNetworkState(): NetworkState

    /**
     * Initiate network recovery.
     */
    fun requestNetworkRecovery()

    /**
     * Pause outgoing requests.
     */
    fun pauseNetwork()

    /**
     * Resume network operations.
     */
    fun resumeNetwork()
}

/**
 * Represents the current state of network connectivity.
 */
enum class NetworkState {
    UNINITIALIZED,
    INITIALIZING,
    ONLINE,
    OFFLINE,
    LIMITED,
    CONNECTING,
    CONNECTED,
    DISCONNECTED,
    RECOVERING,
    FAILED
}
