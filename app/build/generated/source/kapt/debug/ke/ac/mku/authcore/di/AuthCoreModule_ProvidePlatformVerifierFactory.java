package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.bootstrap.PlatformVerifier;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.portal.IContextValidationManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager;
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager;
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvidePlatformVerifierFactory implements Factory<PlatformVerifier> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<IPortalDiscoveryManager> portalDiscoveryProvider;

  private final Provider<IDomAnalysisManager> domAnalysisProvider;

  private final Provider<IKnowledgeGraphManager> knowledgeGraphProvider;

  private final Provider<IStudentContextManager> studentContextProvider;

  private final Provider<IContextValidationManager> contextValidationProvider;

  private final Provider<IWidgetRegistryManager> widgetRegistryProvider;

  private final Provider<IDashboardRenderManager> dashboardRenderProvider;

  private AuthCoreModule_ProvidePlatformVerifierFactory(Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IPortalDiscoveryManager> portalDiscoveryProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider,
      Provider<IKnowledgeGraphManager> knowledgeGraphProvider,
      Provider<IStudentContextManager> studentContextProvider,
      Provider<IContextValidationManager> contextValidationProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<IDashboardRenderManager> dashboardRenderProvider) {
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.domAnalysisProvider = domAnalysisProvider;
    this.knowledgeGraphProvider = knowledgeGraphProvider;
    this.studentContextProvider = studentContextProvider;
    this.contextValidationProvider = contextValidationProvider;
    this.widgetRegistryProvider = widgetRegistryProvider;
    this.dashboardRenderProvider = dashboardRenderProvider;
  }

  @Override
  public PlatformVerifier get() {
    return providePlatformVerifier(eventBusProvider.get(), dependencyRegistryProvider.get(), sessionManagerProvider.get(), portalDiscoveryProvider.get(), domAnalysisProvider.get(), knowledgeGraphProvider.get(), studentContextProvider.get(), contextValidationProvider.get(), widgetRegistryProvider.get(), dashboardRenderProvider.get());
  }

  public static AuthCoreModule_ProvidePlatformVerifierFactory create(
      Provider<EventBus> eventBusProvider, Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IPortalDiscoveryManager> portalDiscoveryProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider,
      Provider<IKnowledgeGraphManager> knowledgeGraphProvider,
      Provider<IStudentContextManager> studentContextProvider,
      Provider<IContextValidationManager> contextValidationProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<IDashboardRenderManager> dashboardRenderProvider) {
    return new AuthCoreModule_ProvidePlatformVerifierFactory(eventBusProvider, dependencyRegistryProvider, sessionManagerProvider, portalDiscoveryProvider, domAnalysisProvider, knowledgeGraphProvider, studentContextProvider, contextValidationProvider, widgetRegistryProvider, dashboardRenderProvider);
  }

  public static PlatformVerifier providePlatformVerifier(EventBus eventBus,
      DependencyRegistry dependencyRegistry, ISessionManager sessionManager,
      IPortalDiscoveryManager portalDiscovery, IDomAnalysisManager domAnalysis,
      IKnowledgeGraphManager knowledgeGraph, IStudentContextManager studentContext,
      IContextValidationManager contextValidation, IWidgetRegistryManager widgetRegistry,
      IDashboardRenderManager dashboardRender) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePlatformVerifier(eventBus, dependencyRegistry, sessionManager, portalDiscovery, domAnalysis, knowledgeGraph, studentContext, contextValidation, widgetRegistry, dashboardRender));
  }
}
