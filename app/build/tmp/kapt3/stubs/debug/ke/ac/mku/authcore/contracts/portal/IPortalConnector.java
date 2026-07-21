package ke.ac.mku.authcore.contracts.portal;

import ke.ac.mku.authcore.models.portal.PortalConnectionResult;
import ke.ac.mku.authcore.models.portal.PortalConnectionState;
import ke.ac.mku.authcore.models.portal.PortalInfo;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalConnector;", "", "connect", "Lke/ac/mku/authcore/models/portal/PortalConnectionResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "", "getConnectionState", "Lke/ac/mku/authcore/models/portal/PortalConnectionState;", "getPortalInfo", "Lke/ac/mku/authcore/models/portal/PortalInfo;", "isPortalAvailable", "", "app_debug"})
public abstract interface IPortalConnector {
    
    /**
     * Connect to the Student Portal.
     *
     * Establishes a connection to the portal and returns the connection result
     * including portal metadata on success.
     *
     * @return The [PortalConnectionResult] containing success/failure and portal info
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.models.portal.PortalConnectionResult> $completion);
    
    /**
     * Disconnect from the Portal Session.
     *
     * Closes the current portal session and cleans up any resources.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object disconnect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Verify Portal Availability.
     *
     * Checks if the portal is currently available and responsive.
     *
     * @return True if the portal is available, false otherwise
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isPortalAvailable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    /**
     * Retrieve Portal Metadata.
     *
     * @return The [PortalInfo] containing portal identification and details
     * @throws IllegalStateException if not connected
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.models.portal.PortalInfo getPortalInfo();
    
    /**
     * Get the current portal connection state.
     *
     * @return The current [PortalConnectionState]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.models.portal.PortalConnectionState getConnectionState();
}