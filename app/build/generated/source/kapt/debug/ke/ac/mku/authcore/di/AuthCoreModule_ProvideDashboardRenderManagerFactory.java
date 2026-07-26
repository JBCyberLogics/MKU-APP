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
import ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager;
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager;
import ke.ac.mku.authcore.manager.ui.RenderTreeExecutor;
import ke.ac.mku.authcore.manager.ui.StateBindingEngine;
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
public final class AuthCoreModule_ProvideDashboardRenderManagerFactory implements Factory<IDashboardRenderManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<RenderTreeExecutor> executorProvider;

  private final Provider<StateBindingEngine> binderProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider;

  private final Provider<IDashboardIntelligenceManager> intelligenceManagerProvider;

  private AuthCoreModule_ProvideDashboardRenderManagerFactory(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<RenderTreeExecutor> executorProvider, Provider<StateBindingEngine> binderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.executorProvider = executorProvider;
    this.binderProvider = binderProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.adaptiveLayoutProvider = adaptiveLayoutProvider;
    this.intelligenceManagerProvider = intelligenceManagerProvider;
  }

  @Override
  public IDashboardRenderManager get() {
    return provideDashboardRenderManager(contextManagerProvider.get(), executorProvider.get(), binderProvider.get(), authEventManagerProvider.get(), registryProvider.get(), adaptiveLayoutProvider, intelligenceManagerProvider);
  }

  public static AuthCoreModule_ProvideDashboardRenderManagerFactory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<RenderTreeExecutor> executorProvider, Provider<StateBindingEngine> binderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return new AuthCoreModule_ProvideDashboardRenderManagerFactory(contextManagerProvider, executorProvider, binderProvider, authEventManagerProvider, registryProvider, adaptiveLayoutProvider, intelligenceManagerProvider);
  }

  public static IDashboardRenderManager provideDashboardRenderManager(
      IStudentContextManager contextManager, RenderTreeExecutor executor, StateBindingEngine binder,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry,
      javax.inject.Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      javax.inject.Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideDashboardRenderManager(contextManager, executor, binder, authEventManager, registry, adaptiveLayoutProvider, intelligenceManagerProvider));
  }
}
