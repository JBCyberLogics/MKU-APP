package ke.ac.mku.authcore.manager.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager;

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
public final class DashboardIntelligenceManager_Factory implements Factory<DashboardIntelligenceManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<IWidgetRegistryManager> widgetRegistryProvider;

  private final Provider<DashboardDecisionEngine> decisionEngineProvider;

  private final Provider<WidgetPlacementEngine> placementEngineProvider;

  private final Provider<RecommendationEngine> recommendationEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private DashboardIntelligenceManager_Factory(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<DashboardDecisionEngine> decisionEngineProvider,
      Provider<WidgetPlacementEngine> placementEngineProvider,
      Provider<RecommendationEngine> recommendationEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.widgetRegistryProvider = widgetRegistryProvider;
    this.decisionEngineProvider = decisionEngineProvider;
    this.placementEngineProvider = placementEngineProvider;
    this.recommendationEngineProvider = recommendationEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public DashboardIntelligenceManager get() {
    return newInstance(contextManagerProvider.get(), widgetRegistryProvider.get(), decisionEngineProvider.get(), placementEngineProvider.get(), recommendationEngineProvider.get(), authEventManagerProvider.get());
  }

  public static DashboardIntelligenceManager_Factory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<IWidgetRegistryManager> widgetRegistryProvider,
      Provider<DashboardDecisionEngine> decisionEngineProvider,
      Provider<WidgetPlacementEngine> placementEngineProvider,
      Provider<RecommendationEngine> recommendationEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new DashboardIntelligenceManager_Factory(contextManagerProvider, widgetRegistryProvider, decisionEngineProvider, placementEngineProvider, recommendationEngineProvider, authEventManagerProvider);
  }

  public static DashboardIntelligenceManager newInstance(IStudentContextManager contextManager,
      IWidgetRegistryManager widgetRegistry, DashboardDecisionEngine decisionEngine,
      WidgetPlacementEngine placementEngine, RecommendationEngine recommendationEngine,
      IAuthenticationEventManager authEventManager) {
    return new DashboardIntelligenceManager(contextManager, widgetRegistry, decisionEngine, placementEngine, recommendationEngine, authEventManager);
  }
}
