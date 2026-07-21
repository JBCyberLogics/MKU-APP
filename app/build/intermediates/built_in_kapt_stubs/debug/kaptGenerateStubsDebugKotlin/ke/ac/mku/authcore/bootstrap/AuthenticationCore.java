package ke.ac.mku.authcore.bootstrap;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086@\u00a2\u0006\u0002\u0010\u0013J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b!\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/bootstrap/AuthenticationCore;", "", "authRepository", "Lke/ac/mku/authcore/domain/repository/AuthRepository;", "portalDiscovery", "Lke/ac/mku/authcore/registry/PortalDiscovery;", "endpointRegistry", "Lke/ac/mku/authcore/registry/EndpointRegistry;", "<init>", "(Lke/ac/mku/authcore/domain/repository/AuthRepository;Lke/ac/mku/authcore/registry/PortalDiscovery;Lke/ac/mku/authcore/registry/EndpointRegistry;)V", "Ljavax/inject/Inject;", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "regNumber", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLoggedIn", "", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "getAvailablePortals", "", "Lke/ac/mku/authcore/registry/PortalDiscovery$Portal;", "getLoginEndpoint", "Lke/ac/mku/authcore/registry/EndpointRegistry$Endpoint;", "getLogoutEndpoint", "getPortal", "portalId", "app", "Ljavax/inject/Singleton;"})
public final class AuthenticationCore {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry = null;
    
    @javax.inject.Inject()
    public AuthenticationCore(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.User> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.registry.PortalDiscovery.Portal> getAvailablePortals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.EndpointRegistry.Endpoint getLoginEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.EndpointRegistry.Endpoint getLogoutEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.registry.PortalDiscovery.Portal getPortal(@org.jetbrains.annotations.NotNull()
    java.lang.String portalId) {
        return null;
    }
}