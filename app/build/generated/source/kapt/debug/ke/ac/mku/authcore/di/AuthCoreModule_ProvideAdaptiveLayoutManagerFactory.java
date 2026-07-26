package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager;
import ke.ac.mku.authcore.manager.ui.GridGenerationEngine;
import ke.ac.mku.authcore.manager.ui.RenderTreeBuilder;
import ke.ac.mku.authcore.manager.ui.WidgetPlacementOptimizer;
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
public final class AuthCoreModule_ProvideAdaptiveLayoutManagerFactory implements Factory<IAdaptiveLayoutManager> {
  private final Provider<GridGenerationEngine> gridEngineProvider;

  private final Provider<WidgetPlacementOptimizer> optimizerProvider;

  private final Provider<RenderTreeBuilder> treeBuilderProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IDashboardIntelligenceManager> intelligenceManagerProvider;

  private AuthCoreModule_ProvideAdaptiveLayoutManagerFactory(
      Provider<GridGenerationEngine> gridEngineProvider,
      Provider<WidgetPlacementOptimizer> optimizerProvider,
      Provider<RenderTreeBuilder> treeBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    this.gridEngineProvider = gridEngineProvider;
    this.optimizerProvider = optimizerProvider;
    this.treeBuilderProvider = treeBuilderProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.intelligenceManagerProvider = intelligenceManagerProvider;
  }

  @Override
  public IAdaptiveLayoutManager get() {
    return provideAdaptiveLayoutManager(gridEngineProvider.get(), optimizerProvider.get(), treeBuilderProvider.get(), authEventManagerProvider.get(), registryProvider.get(), intelligenceManagerProvider);
  }

  public static AuthCoreModule_ProvideAdaptiveLayoutManagerFactory create(
      Provider<GridGenerationEngine> gridEngineProvider,
      Provider<WidgetPlacementOptimizer> optimizerProvider,
      Provider<RenderTreeBuilder> treeBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return new AuthCoreModule_ProvideAdaptiveLayoutManagerFactory(gridEngineProvider, optimizerProvider, treeBuilderProvider, authEventManagerProvider, registryProvider, intelligenceManagerProvider);
  }

  public static IAdaptiveLayoutManager provideAdaptiveLayoutManager(GridGenerationEngine gridEngine,
      WidgetPlacementOptimizer optimizer, RenderTreeBuilder treeBuilder,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry,
      javax.inject.Provider<IDashboardIntelligenceManager> intelligenceManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAdaptiveLayoutManager(gridEngine, optimizer, treeBuilder, authEventManager, registry, intelligenceManager));
  }
}
