package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager;
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager;
import ke.ac.mku.authcore.manager.ui.DashboardDecisionEngine;
import ke.ac.mku.authcore.manager.ui.RecommendationEngine;
import ke.ac.mku.authcore.manager.ui.WidgetPlacementEngine;
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
public final class AuthCoreModule_ProvideDashboardIntelligenceManagerFactory implements Factory<IDashboardIntelligenceManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<IWidgetRegistryManager> widgetRegistryProvider;

  private final Provider<DashboardDecisionEngine> decisionEngineProvider;

  private final Provider<WidgetPlacementEngine> placementEngineProvider;

  private final Provider<RecommendationEngine> recommendationEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideDashboardIntelligenceManagerFactory(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<DashboardDecisionEngine> decisionEngineProvider,
      Provider<WidgetPlacementEngine> placementEngineProvider,
      Provider<RecommendationEngine> recommendationEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.widgetRegistryProvider = widgetRegistryProvider;
    this.decisionEngineProvider = decisionEngineProvider;
    this.placementEngineProvider = placementEngineProvider;
    this.recommendationEngineProvider = recommendationEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IDashboardIntelligenceManager get() {
    return provideDashboardIntelligenceManager(contextManagerProvider.get(), widgetRegistryProvider.get(), decisionEngineProvider.get(), placementEngineProvider.get(), recommendationEngineProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideDashboardIntelligenceManagerFactory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<DashboardDecisionEngine> decisionEngineProvider,
      Provider<WidgetPlacementEngine> placementEngineProvider,
      Provider<RecommendationEngine> recommendationEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideDashboardIntelligenceManagerFactory(contextManagerProvider, widgetRegistryProvider, decisionEngineProvider, placementEngineProvider, recommendationEngineProvider, authEventManagerProvider, registryProvider);
  }

  public static IDashboardIntelligenceManager provideDashboardIntelligenceManager(
      IStudentContextManager contextManager, IWidgetRegistryManager widgetRegistry,
      DashboardDecisionEngine decisionEngine, WidgetPlacementEngine placementEngine,
      RecommendationEngine recommendationEngine, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideDashboardIntelligenceManager(contextManager, widgetRegistry, decisionEngine, placementEngine, recommendationEngine, authEventManager, registry));
  }
}
