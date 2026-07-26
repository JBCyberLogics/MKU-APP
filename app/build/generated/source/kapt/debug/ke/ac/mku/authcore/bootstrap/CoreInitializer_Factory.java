package ke.ac.mku.authcore.bootstrap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.network.INetworkManager;
import ke.ac.mku.authcore.contracts.portal.IContextCacheManager;
import ke.ac.mku.authcore.contracts.portal.IContextEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager;
import ke.ac.mku.authcore.contracts.portal.IContextValidationManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager;
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager;
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager;
import ke.ac.mku.authcore.contracts.ui.IMotionEngine;
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;
import ke.ac.mku.authcore.registry.SecurityManager;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class CoreInitializer_Factory implements Factory<CoreInitializer> {
  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<SecurityManager> securityManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<IAuthenticationEngine> authEngineProvider;

  private final Provider<IAuthenticationStateManager> authStateManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider;

  private final Provider<INetworkManager> networkManagerProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<IPortalDiscoveryManager> portalDiscoveryManagerProvider;

  private final Provider<IDomAnalysisManager> domAnalysisManagerProvider;

  private final Provider<ISemanticClassificationManager> semanticClassificationManagerProvider;

  private final Provider<IUniversalJsonManager> universalJsonManagerProvider;

  private final Provider<IRelationshipManager> relationshipManagerProvider;

  private final Provider<IKnowledgeGraphManager> knowledgeGraphManagerProvider;

  private final Provider<IStudentContextManager> studentContextManagerProvider;

  private final Provider<IContextSynchronizationManager> contextSynchronizerProvider;

  private final Provider<IContextCacheManager> contextCacheManagerProvider;

  private final Provider<IContextEventManager> contextEventManagerProvider;

  private final Provider<IContextValidationManager> contextValidationManagerProvider;

  private final Provider<IWidgetRegistryManager> widgetRegistryManagerProvider;

  private final Provider<IDashboardIntelligenceManager> dashboardIntelligenceManagerProvider;

  private final Provider<IAdaptiveLayoutManager> adaptiveLayoutManagerProvider;

  private final Provider<IMotionEngine> motionEngineProvider;

  private final Provider<IDashboardRenderManager> dashboardRenderManagerProvider;

  private final Provider<AuthenticationCore> authCoreProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private CoreInitializer_Factory(Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<SecurityManager> securityManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEngine> authEngineProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider,
      Provider<INetworkManager> networkManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalDiscoveryManager> portalDiscoveryManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider,
      Provider<ISemanticClassificationManager> semanticClassificationManagerProvider,
      Provider<IUniversalJsonManager> universalJsonManagerProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IKnowledgeGraphManager> knowledgeGraphManagerProvider,
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<IContextSynchronizationManager> contextSynchronizerProvider,
      Provider<IContextCacheManager> contextCacheManagerProvider,
      Provider<IContextEventManager> contextEventManagerProvider,
      Provider<IContextValidationManager> contextValidationManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryManagerProvider,
      Provider<IDashboardIntelligenceManager> dashboardIntelligenceManagerProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutManagerProvider,
      Provider<IMotionEngine> motionEngineProvider,
      Provider<IDashboardRenderManager> dashboardRenderManagerProvider,
      Provider<AuthenticationCore> authCoreProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.securityManagerProvider = securityManagerProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.authEngineProvider = authEngineProvider;
    this.authStateManagerProvider = authStateManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.sessionRecoveryManagerProvider = sessionRecoveryManagerProvider;
    this.networkManagerProvider = networkManagerProvider;
    this.portalConnectorProvider = portalConnectorProvider;
    this.portalDiscoveryManagerProvider = portalDiscoveryManagerProvider;
    this.domAnalysisManagerProvider = domAnalysisManagerProvider;
    this.semanticClassificationManagerProvider = semanticClassificationManagerProvider;
    this.universalJsonManagerProvider = universalJsonManagerProvider;
    this.relationshipManagerProvider = relationshipManagerProvider;
    this.knowledgeGraphManagerProvider = knowledgeGraphManagerProvider;
    this.studentContextManagerProvider = studentContextManagerProvider;
    this.contextSynchronizerProvider = contextSynchronizerProvider;
    this.contextCacheManagerProvider = contextCacheManagerProvider;
    this.contextEventManagerProvider = contextEventManagerProvider;
    this.contextValidationManagerProvider = contextValidationManagerProvider;
    this.widgetRegistryManagerProvider = widgetRegistryManagerProvider;
    this.dashboardIntelligenceManagerProvider = dashboardIntelligenceManagerProvider;
    this.adaptiveLayoutManagerProvider = adaptiveLayoutManagerProvider;
    this.motionEngineProvider = motionEngineProvider;
    this.dashboardRenderManagerProvider = dashboardRenderManagerProvider;
    this.authCoreProvider = authCoreProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
  }

  @Override
  public CoreInitializer get() {
    return newInstance(dependencyRegistryProvider.get(), securityManagerProvider.get(), secureStorageManagerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), authEngineProvider.get(), authStateManagerProvider.get(), authEventManagerProvider.get(), sessionValidatorProvider.get(), sessionRecoveryManagerProvider.get(), networkManagerProvider.get(), portalConnectorProvider.get(), portalDiscoveryManagerProvider.get(), domAnalysisManagerProvider.get(), semanticClassificationManagerProvider.get(), universalJsonManagerProvider.get(), relationshipManagerProvider.get(), knowledgeGraphManagerProvider.get(), studentContextManagerProvider.get(), contextSynchronizerProvider.get(), contextCacheManagerProvider.get(), contextEventManagerProvider.get(), contextValidationManagerProvider.get(), widgetRegistryManagerProvider.get(), dashboardIntelligenceManagerProvider.get(), adaptiveLayoutManagerProvider.get(), motionEngineProvider.get(), dashboardRenderManagerProvider.get(), authCoreProvider.get(), portalDiscoveryProvider.get(), endpointRegistryProvider.get());
  }

  public static CoreInitializer_Factory create(
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<SecurityManager> securityManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEngine> authEngineProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider,
      Provider<INetworkManager> networkManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalDiscoveryManager> portalDiscoveryManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider,
      Provider<ISemanticClassificationManager> semanticClassificationManagerProvider,
      Provider<IUniversalJsonManager> universalJsonManagerProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IKnowledgeGraphManager> knowledgeGraphManagerProvider,
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<IContextSynchronizationManager> contextSynchronizerProvider,
      Provider<IContextCacheManager> contextCacheManagerProvider,
      Provider<IContextEventManager> contextEventManagerProvider,
      Provider<IContextValidationManager> contextValidationManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryManagerProvider,
      Provider<IDashboardIntelligenceManager> dashboardIntelligenceManagerProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutManagerProvider,
      Provider<IMotionEngine> motionEngineProvider,
      Provider<IDashboardRenderManager> dashboardRenderManagerProvider,
      Provider<AuthenticationCore> authCoreProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    return new CoreInitializer_Factory(dependencyRegistryProvider, securityManagerProvider, secureStorageManagerProvider, sessionManagerProvider, cookieManagerProvider, authEngineProvider, authStateManagerProvider, authEventManagerProvider, sessionValidatorProvider, sessionRecoveryManagerProvider, networkManagerProvider, portalConnectorProvider, portalDiscoveryManagerProvider, domAnalysisManagerProvider, semanticClassificationManagerProvider, universalJsonManagerProvider, relationshipManagerProvider, knowledgeGraphManagerProvider, studentContextManagerProvider, contextSynchronizerProvider, contextCacheManagerProvider, contextEventManagerProvider, contextValidationManagerProvider, widgetRegistryManagerProvider, dashboardIntelligenceManagerProvider, adaptiveLayoutManagerProvider, motionEngineProvider, dashboardRenderManagerProvider, authCoreProvider, portalDiscoveryProvider, endpointRegistryProvider);
  }

  public static CoreInitializer newInstance(DependencyRegistry dependencyRegistry,
      SecurityManager securityManager, ISecureStorageManager secureStorageManager,
      ISessionManager sessionManager, ICookieManager cookieManager,
      IAuthenticationEngine authEngine, IAuthenticationStateManager authStateManager,
      IAuthenticationEventManager authEventManager, ISessionValidator sessionValidator,
      ISessionRecoveryManager sessionRecoveryManager, INetworkManager networkManager,
      IPortalConnector portalConnector, IPortalDiscoveryManager portalDiscoveryManager,
      IDomAnalysisManager domAnalysisManager,
      ISemanticClassificationManager semanticClassificationManager,
      IUniversalJsonManager universalJsonManager, IRelationshipManager relationshipManager,
      IKnowledgeGraphManager knowledgeGraphManager, IStudentContextManager studentContextManager,
      IContextSynchronizationManager contextSynchronizer, IContextCacheManager contextCacheManager,
      IContextEventManager contextEventManager, IContextValidationManager contextValidationManager,
      IWidgetRegistryManager widgetRegistryManager,
      IDashboardIntelligenceManager dashboardIntelligenceManager,
      IAdaptiveLayoutManager adaptiveLayoutManager, IMotionEngine motionEngine,
      IDashboardRenderManager dashboardRenderManager, AuthenticationCore authCore,
      PortalDiscovery portalDiscovery, EndpointRegistry endpointRegistry) {
    return new CoreInitializer(dependencyRegistry, securityManager, secureStorageManager, sessionManager, cookieManager, authEngine, authStateManager, authEventManager, sessionValidator, sessionRecoveryManager, networkManager, portalConnector, portalDiscoveryManager, domAnalysisManager, semanticClassificationManager, universalJsonManager, relationshipManager, knowledgeGraphManager, studentContextManager, contextSynchronizer, contextCacheManager, contextEventManager, contextValidationManager, widgetRegistryManager, dashboardIntelligenceManager, adaptiveLayoutManager, motionEngine, dashboardRenderManager, authCore, portalDiscovery, endpointRegistry);
  }
}
