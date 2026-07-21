package ke.ac.mku.authcore.bootstrap;

/**
 * CoreInitializer - Forces initialization of all core services.
 * This ensures they register themselves with the DependencyRegistry.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001Bu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u0002\b\u001e\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\"\u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/bootstrap/CoreInitializer;", "", "dependencyRegistry", "Lke/ac/mku/authcore/registry/DependencyRegistry;", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "securityManager", "Lke/ac/mku/authcore/registry/SecurityManager;", "secureStorageManager", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "sessionManager", "Lke/ac/mku/authcore/contracts/authentication/ISessionManager;", "cookieManager", "Lke/ac/mku/authcore/contracts/cookie/ICookieManager;", "authEngine", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;", "authStateManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationStateManager;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "sessionValidator", "Lke/ac/mku/authcore/contracts/session/ISessionValidator;", "sessionRecoveryManager", "Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;", "cookieSyncManager", "Lke/ac/mku/authcore/contracts/cookie/ICookieSynchronizationManager;", "networkManager", "Lke/ac/mku/authcore/contracts/network/INetworkManager;", "<init>", "(Lke/ac/mku/authcore/registry/DependencyRegistry;Lke/ac/mku/authcore/bootstrap/EventBus;Lke/ac/mku/authcore/registry/SecurityManager;Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;Lke/ac/mku/authcore/contracts/authentication/ISessionManager;Lke/ac/mku/authcore/contracts/cookie/ICookieManager;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationStateManager;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;Lke/ac/mku/authcore/contracts/session/ISessionValidator;Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;Lke/ac/mku/authcore/contracts/cookie/ICookieSynchronizationManager;Lke/ac/mku/authcore/contracts/network/INetworkManager;)V", "Ljavax/inject/Inject;", "initialize", "", "app", "Ljavax/inject/Singleton;"})
public final class CoreInitializer {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.EventBus eventBus = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.SecurityManager securityManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorageManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.cookie.ICookieManager cookieManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine authEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager authStateManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.session.ISessionValidator sessionValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager sessionRecoveryManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager cookieSyncManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.INetworkManager networkManager = null;
    
    @javax.inject.Inject()
    public CoreInitializer(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.SecurityManager securityManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorageManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.cookie.ICookieManager cookieManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine authEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager authStateManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.ISessionValidator sessionValidator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager sessionRecoveryManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager cookieSyncManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.INetworkManager networkManager) {
        super();
    }
    
    public final void initialize() {
    }
}