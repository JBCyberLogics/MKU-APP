package ke.ac.mku.authcore.contracts.endpoint;

/**
 * ENDPOINT-001: Endpoint Discovery Manager Contract
 *
 * Central authority responsible for discovering, validating, registering 
 * and maintaining every Student Portal endpoint.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/endpoint/IEndpointDiscoveryManager;", "", "discoverEndpoints", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEndpoint", "Lke/ac/mku/authcore/contracts/endpoint/PortalEndpoint;", "identifier", "", "refreshEndpoints", "validateEndpoint", "", "endpoint", "listEndpoints", "", "getRegistryStatus", "Lke/ac/mku/authcore/contracts/endpoint/RegistryStatus;", "app"})
public abstract interface IEndpointDiscoveryManager {
    
    /**
     * Discover all available portal endpoints.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object discoverEndpoints(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Return a validated endpoint by identifier.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.endpoint.PortalEndpoint getEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
    
    /**
     * Force rediscovery of all endpoints.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshEndpoints(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Validate endpoint integrity and accessibility.
     */
    public abstract boolean validateEndpoint(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.endpoint.PortalEndpoint endpoint);
    
    /**
     * Return all registered endpoints.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.endpoint.PortalEndpoint> listEndpoints();
    
    /**
     * Return endpoint registry status.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.endpoint.RegistryStatus getRegistryStatus();
}