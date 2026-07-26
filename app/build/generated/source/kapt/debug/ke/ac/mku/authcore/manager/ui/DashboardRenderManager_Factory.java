package ke.ac.mku.authcore.manager.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager;
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
public final class DashboardRenderManager_Factory implements Factory<DashboardRenderManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<RenderTreeExecutor> executorProvider;

  private final Provider<StateBindingEngine> binderProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider;

  private final Provider<IDashboardIntelligenceManager> intelligenceManagerProvider;

  private DashboardRenderManager_Factory(Provider<IStudentContextManager> contextManagerProvider,
      Provider<RenderTreeExecutor> executorProvider, Provider<StateBindingEngine> binderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.executorProvider = executorProvider;
    this.binderProvider = binderProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.adaptiveLayoutProvider = adaptiveLayoutProvider;
    this.intelligenceManagerProvider = intelligenceManagerProvider;
  }

  @Override
  public DashboardRenderManager get() {
    return newInstance(contextManagerProvider.get(), executorProvider.get(), binderProvider.get(), authEventManagerProvider.get(), adaptiveLayoutProvider, intelligenceManagerProvider);
  }

  public static DashboardRenderManager_Factory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<RenderTreeExecutor> executorProvider, Provider<StateBindingEngine> binderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return new DashboardRenderManager_Factory(contextManagerProvider, executorProvider, binderProvider, authEventManagerProvider, adaptiveLayoutProvider, intelligenceManagerProvider);
  }

  public static DashboardRenderManager newInstance(IStudentContextManager contextManager,
      RenderTreeExecutor executor, StateBindingEngine binder,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<IAdaptiveLayoutManager> adaptiveLayoutProvider,
      javax.inject.Provider<IDashboardIntelligenceManager> intelligenceManagerProvider) {
    return new DashboardRenderManager(contextManager, executor, binder, authEventManager, adaptiveLayoutProvider, intelligenceManagerProvider);
  }
}
