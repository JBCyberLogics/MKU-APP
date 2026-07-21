package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.models.portal.PortalConnectionResult
import ke.ac.mku.authcore.models.portal.PortalConnectionState
import ke.ac.mku.authcore.models.portal.PortalInfo

/**
 * IPortalConnector - CORE-012
 *
 * Public platform contract for portal connection operations.
 * This interface abstracts portal connection away from direct PortalSDK access.
 *
 * The [ke.ac.mku.authcore.auth.orchestrator.LoginOrchestrator] uses this interface
 * to connect to and manage portal sessions without coupling to PortalSDK directly.
 *
 * This allows:
 * - Different portal implementations (current and future)
 * - Easier testing via mock implementations
 * - Separation of concerns between workflow orchestration and portal management
 *
 * Wraps existing components:
 * - [ke.ac.mku.authcore.registry.PortalSDK] for portal operations
 * - [ke.ac.mku.authcore.registry.PortalDiscovery] for portal discovery
 * - [ke.ac.mku.authcore.registry.EndpointRegistry] for endpoint management
 *
 * Future modules (PORTAL-001, PORTAL-002) will consume this contract.
 */
interface IPortalConnector {

    /**
     * Connect to the Student Portal.
     *
     * Establishes a connection to the portal and returns the connection result
     * including portal metadata on success.
     *
     * @return The [PortalConnectionResult] containing success/failure and portal info
     */
    suspend fun connect(): PortalConnectionResult

    /**
     * Disconnect from the Portal Session.
     *
     * Closes the current portal session and cleans up any resources.
     */
    suspend fun disconnect(): Unit

    /**
     * Verify Portal Availability.
     *
     * Checks if the portal is currently available and responsive.
     *
     * @return True if the portal is available, false otherwise
     */
    suspend fun isPortalAvailable(): Boolean

    /**
     * Retrieve Portal Metadata.
     *
     * @return The [PortalInfo] containing portal identification and details
     * @throws IllegalStateException if not connected
     */
    fun getPortalInfo(): PortalInfo

    /**
     * Get the current portal connection state.
     *
     * @return The current [PortalConnectionState]
     */
    fun getConnectionState(): PortalConnectionState
}