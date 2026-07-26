package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager;
import ke.ac.mku.authcore.manager.DashboardRefreshPlanner;
import ke.ac.mku.authcore.manager.PriorityEventDispatcher;
import ke.ac.mku.authcore.manager.StudentActivityDetector;
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
public final class AuthCoreModule_ProvideContextEventManagerFactory implements Factory<IContextEventManager> {
  private final Provider<IContextSynchronizationManager> syncManagerProvider;

  private final Provider<StudentActivityDetector> activityDetectorProvider;

  private final Provider<DashboardRefreshPlanner> refreshPlannerProvider;

  private final Provider<PriorityEventDispatcher> dispatcherProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideContextEventManagerFactory(
      Provider<IContextSynchronizationManager> syncManagerProvider,
      Provider<StudentActivityDetector> activityDetectorProvider,
      Provider<DashboardRefreshPlanner> refreshPlannerProvider,
      Provider<PriorityEventDispatcher> dispatcherProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.syncManagerProvider = syncManagerProvider;
    this.activityDetectorProvider = activityDetectorProvider;
    this.refreshPlannerProvider = refreshPlannerProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IContextEventManager get() {
    return provideContextEventManager(syncManagerProvider.get(), activityDetectorProvider.get(), refreshPlannerProvider.get(), dispatcherProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideContextEventManagerFactory create(
      Provider<IContextSynchronizationManager> syncManagerProvider,
      Provider<StudentActivityDetector> activityDetectorProvider,
      Provider<DashboardRefreshPlanner> refreshPlannerProvider,
      Provider<PriorityEventDispatcher> dispatcherProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideContextEventManagerFactory(syncManagerProvider, activityDetectorProvider, refreshPlannerProvider, dispatcherProvider, authEventManagerProvider, registryProvider);
  }

  public static IContextEventManager provideContextEventManager(
      IContextSynchronizationManager syncManager, StudentActivityDetector activityDetector,
      DashboardRefreshPlanner refreshPlanner, PriorityEventDispatcher dispatcher,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideContextEventManager(syncManager, activityDetector, refreshPlanner, dispatcher, authEventManager, registry));
  }
}
