package ke.ac.mku.authcore.contracts.portal

/**
 * PORTAL-001: Portal Connector Contract
 *
 * Central gateway responsible for establishing, maintaining and terminating 
 * secure communication with the Student Portal.
 */
interface IPortalConnector {

    /**
     * Establish secure connection to the portal.
     */
    suspend fun connect()

    /**
     * Terminate portal connection.
     */
    suspend fun disconnect()

    /**
     * Reconnect after connection failure.
     */
    suspend fun reconnect()

    /**
     * Determine portal connectivity.
     */
    fun isConnected(): Boolean

    /**
     * Return current portal state.
     */
    fun getPortalState(): PortalState

    /**
     * Return supported portal capabilities.
     */
    fun getPortalCapabilities(): List<String>
}

/**
 * Represents the current state of portal connectivity.
 */
enum class PortalState {
    UNINITIALIZED,
    INITIALIZING,
    DISCONNECTED,
    CONNECTING,
    CONNECTED,
    AUTHENTICATED,
    RECONNECTING,
    FAILED
}
