package ke.ac.mku.authcore.bootstrap;

/**
 * CoreInitializer - Forces initialization of all core services via Hilt.
 * This ensures they call registry.register() in their @Provides method.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209\u0012\u0006\u0010:\u001a\u00020;\u0012\u0006\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020?\u001a\u0002\bB\u00a2\u0006\u0004\b@\u0010AJ\u0006\u0010C\u001a\u00020DR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\bF\u00a8\u0006E"}, d2 = {"Lke/ac/mku/authcore/bootstrap/CoreInitializer;", "", "dependencyRegistry", "Lke/ac/mku/authcore/registry/DependencyRegistry;", "securityManager", "Lke/ac/mku/authcore/registry/SecurityManager;", "secureStorageManager", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "sessionManager", "Lke/ac/mku/authcore/contracts/authentication/ISessionManager;", "cookieManager", "Lke/ac/mku/authcore/contracts/cookie/ICookieManager;", "authEngine", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;", "authStateManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationStateManager;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "sessionValidator", "Lke/ac/mku/authcore/contracts/session/ISessionValidator;", "sessionRecoveryManager", "Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;", "networkManager", "Lke/ac/mku/authcore/contracts/network/INetworkManager;", "portalConnector", "Lke/ac/mku/authcore/contracts/portal/IPortalConnector;", "portalDiscoveryManager", "Lke/ac/mku/authcore/contracts/portal/IPortalDiscoveryManager;", "domAnalysisManager", "Lke/ac/mku/authcore/contracts/portal/IDomAnalysisManager;", "semanticClassificationManager", "Lke/ac/mku/authcore/contracts/portal/ISemanticClassificationManager;", "universalJsonManager", "Lke/ac/mku/authcore/contracts/portal/IUniversalJsonManager;", "relationshipManager", "Lke/ac/mku/authcore/contracts/portal/IRelationshipManager;", "knowledgeGraphManager", "Lke/ac/mku/authcore/contracts/portal/IKnowledgeGraphManager;", "studentContextManager", "Lke/ac/mku/authcore/contracts/portal/IStudentContextManager;", "contextSynchronizer", "Lke/ac/mku/authcore/contracts/portal/IContextSynchronizationManager;", "contextCacheManager", "Lke/ac/mku/authcore/contracts/portal/IContextCacheManager;", "contextEventManager", "Lke/ac/mku/authcore/contracts/portal/IContextEventManager;", "contextValidationManager", "Lke/ac/mku/authcore/contracts/portal/IContextValidationManager;", "widgetRegistryManager", "Lke/ac/mku/authcore/contracts/ui/IWidgetRegistryManager;", "dashboardIntelligenceManager", "Lke/ac/mku/authcore/contracts/ui/IDashboardIntelligenceManager;", "adaptiveLayoutManager", "Lke/ac/mku/authcore/contracts/ui/IAdaptiveLayoutManager;", "motionEngine", "Lke/ac/mku/authcore/contracts/ui/IMotionEngine;", "dashboardRenderManager", "Lke/ac/mku/authcore/contracts/ui/IDashboardRenderManager;", "authCore", "Lke/ac/mku/authcore/bootstrap/AuthenticationCore;", "portalDiscovery", "Lke/ac/mku/authcore/registry/PortalDiscovery;", "endpointRegistry", "Lke/ac/mku/authcore/registry/EndpointRegistry;", "<init>", "(Lke/ac/mku/authcore/registry/DependencyRegistry;Lke/ac/mku/authcore/registry/SecurityManager;Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;Lke/ac/mku/authcore/contracts/authentication/ISessionManager;Lke/ac/mku/authcore/contracts/cookie/ICookieManager;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationStateManager;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;Lke/ac/mku/authcore/contracts/session/ISessionValidator;Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;Lke/ac/mku/authcore/contracts/network/INetworkManager;Lke/ac/mku/authcore/contracts/portal/IPortalConnector;Lke/ac/mku/authcore/contracts/portal/IPortalDiscoveryManager;Lke/ac/mku/authcore/contracts/portal/IDomAnalysisManager;Lke/ac/mku/authcore/contracts/portal/ISemanticClassificationManager;Lke/ac/mku/authcore/contracts/portal/IUniversalJsonManager;Lke/ac/mku/authcore/contracts/portal/IRelationshipManager;Lke/ac/mku/authcore/contracts/portal/IKnowledgeGraphManager;Lke/ac/mku/authcore/contracts/portal/IStudentContextManager;Lke/ac/mku/authcore/contracts/portal/IContextSynchronizationManager;Lke/ac/mku/authcore/contracts/portal/IContextCacheManager;Lke/ac/mku/authcore/contracts/portal/IContextEventManager;Lke/ac/mku/authcore/contracts/portal/IContextValidationManager;Lke/ac/mku/authcore/contracts/ui/IWidgetRegistryManager;Lke/ac/mku/authcore/contracts/ui/IDashboardIntelligenceManager;Lke/ac/mku/authcore/contracts/ui/IAdaptiveLayoutManager;Lke/ac/mku/authcore/contracts/ui/IMotionEngine;Lke/ac/mku/authcore/contracts/ui/IDashboardRenderManager;Lke/ac/mku/authcore/bootstrap/AuthenticationCore;Lke/ac/mku/authcore/registry/PortalDiscovery;Lke/ac/mku/authcore/registry/EndpointRegistry;)V", "Ljavax/inject/Inject;", "initialize", "", "app", "Ljavax/inject/Singleton;"})
public final class CoreInitializer {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry = null;
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
    private final ke.ac.mku.authcore.contracts.network.INetworkManager networkManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IPortalConnector portalConnector = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager portalDiscoveryManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager domAnalysisManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager semanticClassificationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager universalJsonManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IRelationshipManager relationshipManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager knowledgeGraphManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IStudentContextManager studentContextManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager contextSynchronizer = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IContextCacheManager contextCacheManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IContextEventManager contextEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.portal.IContextValidationManager contextValidationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager widgetRegistryManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager dashboardIntelligenceManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager adaptiveLayoutManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.ui.IMotionEngine motionEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager dashboardRenderManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.AuthenticationCore authCore = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry = null;
    
    @javax.inject.Inject()
    public CoreInitializer(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.SecurityManager securityManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorageManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.cookie.ICookieManager cookieManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine authEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager authStateManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.ISessionValidator sessionValidator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager sessionRecoveryManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IPortalConnector portalConnector, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager portalDiscoveryManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager domAnalysisManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager semanticClassificationManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager universalJsonManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IRelationshipManager relationshipManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager knowledgeGraphManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IStudentContextManager studentContextManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager contextSynchronizer, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IContextCacheManager contextCacheManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IContextEventManager contextEventManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.portal.IContextValidationManager contextValidationManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager widgetRegistryManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager dashboardIntelligenceManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager adaptiveLayoutManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.ui.IMotionEngine motionEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager dashboardRenderManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.AuthenticationCore authCore, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.PortalDiscovery portalDiscovery, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.EndpointRegistry endpointRegistry) {
        super();
    }
    
    public final void initialize() {
    }
}