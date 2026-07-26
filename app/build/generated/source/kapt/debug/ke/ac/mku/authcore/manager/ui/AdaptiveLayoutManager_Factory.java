package ke.ac.mku.authcore.manager.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager;

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
public final class AdaptiveLayoutManager_Factory implements Factory<AdaptiveLayoutManager> {
  private final Provider<GridGenerationEngine> gridEngineProvider;

  private final Provider<WidgetPlacementOptimizer> optimizerProvider;

  private final Provider<RenderTreeBuilder> treeBuilderProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IDashboardIntelligenceManager> intelligenceManagerProvider;

  private AdaptiveLayoutManager_Factory(Provider<GridGenerationEngine> gridEngineProvider,
      Provider<WidgetPlacementOptimizer> optimizerProvider,
      Provider<RenderTreeBuilder> treeBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    this.gridEngineProvider = gridEngineProvider;
    this.optimizerProvider = optimizerProvider;
    this.treeBuilderProvider = treeBuilderProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.intelligenceManagerProvider = intelligenceManagerProvider;
  }

  @Override
  public AdaptiveLayoutManager get() {
    return newInstance(gridEngineProvider.get(), optimizerProvider.get(), treeBuilderProvider.get(), authEventManagerProvider.get(), intelligenceManagerProvider);
  }

  public static AdaptiveLayoutManager_Factory create(
      Provider<GridGenerationEngine> gridEngineProvider,
      Provider<WidgetPlacementOptimizer> optimizerProvider,
      Provider<RenderTreeBuilder> treeBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return new AdaptiveLayoutManager_Factory(gridEngineProvider, optimizerProvider, treeBuilderProvider, authEventManagerProvider, intelligenceManagerProvider);
  }

  public static AdaptiveLayoutManager newInstance(GridGenerationEngine gridEngine,
      WidgetPlacementOptimizer optimizer, RenderTreeBuilder treeBuilder,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<IDashboardIntelligenceManager> intelligenceManager) {
    return new AdaptiveLayoutManager(gridEngine, optimizer, treeBuilder, authEventManager, intelligenceManager);
  }
}
