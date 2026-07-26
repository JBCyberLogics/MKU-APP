package ke.ac.mku.authcore.bootstrap

import android.util.Log
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.network.INetworkManager
import ke.ac.mku.authcore.contracts.network.IRequestPipelineManager
import ke.ac.mku.authcore.contracts.network.IResponseProcessingManager
import ke.ac.mku.authcore.contracts.portal.*
import ke.ac.mku.authcore.contracts.endpoint.IEndpointDiscoveryManager
import ke.ac.mku.authcore.contracts.endpoint.IEndpointHealthManager
import ke.ac.mku.authcore.contracts.ui.*
import ke.ac.mku.authcore.security.diagnostic.SecurityDiagnosticEngine
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.registry.SecurityManager
import ke.ac.mku.authcore.registry.PortalDiscovery
import ke.ac.mku.authcore.registry.EndpointRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CoreInitializer - Forces initialization of all core services via Hilt.
 * This ensures they call registry.register() in their @Provides method.
 */
@Singleton
class CoreInitializer @Inject constructor(
    private val dependencyRegistry: DependencyRegistry,
    private val securityManager: SecurityManager,
    private val secureStorageManager: ISecureStorageManager,
    private val sessionManager: ISessionManager,
    private val cookieManager: ICookieManager,
    private val authEngine: IAuthenticationEngine,
    private val authStateManager: IAuthenticationStateManager,
    private val authEventManager: IAuthenticationEventManager,
    private val sessionValidator: ISessionValidator,
    private val sessionRecoveryManager: ISessionRecoveryManager,
    private val networkManager: INetworkManager,
    private val portalConnector: IPortalConnector,
    private val portalDiscoveryManager: IPortalDiscoveryManager,
    private val domAnalysisManager: IDomAnalysisManager,
    private val semanticClassificationManager: ISemanticClassificationManager,
    private val universalJsonManager: IUniversalJsonManager,
    private val relationshipManager: IRelationshipManager,
    private val knowledgeGraphManager: IKnowledgeGraphManager,
    private val studentContextManager: IStudentContextManager,
    private val contextSynchronizer: IContextSynchronizationManager,
    private val contextCacheManager: IContextCacheManager,
    private val contextEventManager: IContextEventManager,
    private val contextValidationManager: IContextValidationManager,
    private val widgetRegistryManager: IWidgetRegistryManager,
    private val dashboardIntelligenceManager: IDashboardIntelligenceManager,
    private val adaptiveLayoutManager: IAdaptiveLayoutManager,
    private val motionEngine: IMotionEngine,
    private val dashboardRenderManager: IDashboardRenderManager,
    private val authCore: AuthenticationCore,
    private val portalDiscovery: PortalDiscovery,
    private val endpointRegistry: EndpointRegistry
) {
    fun initialize() {
        Log.i("CoreInitializer", "Forcing creation of all ${dependencyRegistry.list().size} services...")
        // All services are already instantiated by Hilt to satisfy constructor injection
    }
}
