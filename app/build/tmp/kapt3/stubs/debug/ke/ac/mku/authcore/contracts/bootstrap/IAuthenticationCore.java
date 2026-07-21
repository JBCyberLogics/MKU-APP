package ke.ac.mku.authcore.contracts.bootstrap;

import ke.ac.mku.authcore.domain.model.AuthResult;
import ke.ac.mku.authcore.domain.model.User;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;

/**
 * IAuthenticationCore - CORE-012
 *
 * Contract for AuthenticationCore.
 * High-level authentication facade.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0016H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/contracts/bootstrap/IAuthenticationCore;", "", "getAvailablePortals", "", "Lke/ac/mku/authcore/registry/PortalDiscovery$Portal;", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoginEndpoint", "Lke/ac/mku/authcore/registry/EndpointRegistry$Endpoint;", "getLogoutEndpoint", "getPortal", "portalId", "", "isLoggedIn", "", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "regNumber", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "app_debug"})
public abstract interface IAuthenticationCore {
    
    /**
     * Login to a portal.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Logout.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Check if logged in.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    /**
     * Get current user.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.User> $completion);
    
    /**
     * Get available portals.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.registry.PortalDiscovery.Portal> getAvailablePortals();
    
    /**
     * Get login endpoint.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.registry.EndpointRegistry.Endpoint getLoginEndpoint();
    
    /**
     * Get logout endpoint.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.registry.EndpointRegistry.Endpoint getLogoutEndpoint();
    
    /**
     * Get a portal by ID.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.registry.PortalDiscovery.Portal getPortal(@org.jetbrains.annotations.NotNull()
    java.lang.String portalId);
}