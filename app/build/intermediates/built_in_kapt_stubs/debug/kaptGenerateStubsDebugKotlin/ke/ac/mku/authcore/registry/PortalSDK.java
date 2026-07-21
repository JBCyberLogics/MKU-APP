package ke.ac.mku.authcore.registry;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u001a\u0002\b\f\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020 H\u0086@\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u0004\u0018\u00010#H\u0086@\u00a2\u0006\u0002\u0010!J\u000e\u0010$\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010!J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020&J\u0010\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020\u001cJ\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u001cJ\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00ca\u0001\u0002\b0\u00a8\u0006/"}, d2 = {"Lke/ac/mku/authcore/registry/PortalSDK;", "", "authCoreManager", "Lke/ac/mku/authcore/manager/AuthCoreManager;", "endpointRegistry", "Lke/ac/mku/authcore/registry/EndpointRegistry;", "portalDiscovery", "Lke/ac/mku/authcore/registry/PortalDiscovery;", "securityManager", "Lke/ac/mku/authcore/registry/SecurityManager;", "<init>", "(Lke/ac/mku/authcore/manager/AuthCoreManager;Lke/ac/mku/authcore/registry/EndpointRegistry;Lke/ac/mku/authcore/registry/PortalDiscovery;Lke/ac/mku/authcore/registry/SecurityManager;)V", "Ljavax/inject/Inject;", "isInitialized", "", "()Z", "availablePortals", "", "Lke/ac/mku/authcore/registry/PortalDiscovery$Portal;", "getAvailablePortals", "()Ljava/util/List;", "securityLevel", "Lke/ac/mku/authcore/registry/SecurityLevel;", "getSecurityLevel", "()Lke/ac/mku/authcore/registry/SecurityLevel;", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "regNumber", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "isLoggedIn", "getLoginEndpoint", "Lke/ac/mku/authcore/registry/EndpointRegistry$Endpoint;", "getLogoutEndpoint", "getPortal", "portalId", "validateSecurity", "url", "getSecurityInfo", "Lke/ac/mku/authcore/registry/SecurityInfo;", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class PortalSDK {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.SecurityManager securityManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PortalSDK";
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.registry.PortalSDK.Companion Companion = null;
    
    @javax.inject.Inject()
    public PortalSDK(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.SecurityManager securityManager) {
        super();
    }
    
    public final boolean isInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.registry.PortalDiscovery.Portal> getAvailablePortals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityLevel getSecurityLevel() {
        return null;
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
    public final java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.User> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
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
    
    public final boolean validateSecurity(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityInfo getSecurityInfo() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/registry/PortalSDK$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}