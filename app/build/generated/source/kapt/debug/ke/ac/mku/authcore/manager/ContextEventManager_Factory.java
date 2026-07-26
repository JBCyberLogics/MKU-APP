package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager;

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
public final class ContextEventManager_Factory implements Factory<ContextEventManager> {
  private final Provider<IContextSynchronizationManager> syncManagerProvider;

  private final Provider<StudentActivityDetector> activityDetectorProvider;

  private final Provider<DashboardRefreshPlanner> refreshPlannerProvider;

  private final Provider<PriorityEventDispatcher> dispatcherProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private ContextEventManager_Factory(Provider<IContextSynchronizationManager> syncManagerProvider,
      Provider<StudentActivityDetector> activityDetectorProvider,
      Provider<DashboardRefreshPlanner> refreshPlannerProvider,
      Provider<PriorityEventDispatcher> dispatcherProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.syncManagerProvider = syncManagerProvider;
    this.activityDetectorProvider = activityDetectorProvider;
    this.refreshPlannerProvider = refreshPlannerProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public ContextEventManager get() {
    return newInstance(syncManagerProvider.get(), activityDetectorProvider.get(), refreshPlannerProvider.get(), dispatcherProvider.get(), authEventManagerProvider.get());
  }

  public static ContextEventManager_Factory create(
      Provider<IContextSynchronizationManager> syncManagerProvider,
      Provider<StudentActivityDetector> activityDetectorProvider,
      Provider<DashboardRefreshPlanner> refreshPlannerProvider,
      Provider<PriorityEventDispatcher> dispatcherProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new ContextEventManager_Factory(syncManagerProvider, activityDetectorProvider, refreshPlannerProvider, dispatcherProvider, authEventManagerProvider);
  }

  public static ContextEventManager newInstance(IContextSynchronizationManager syncManager,
      StudentActivityDetector activityDetector, DashboardRefreshPlanner refreshPlanner,
      PriorityEventDispatcher dispatcher, IAuthenticationEventManager authEventManager) {
    return new ContextEventManager(syncManager, activityDetector, refreshPlanner, dispatcher, authEventManager);
  }
}
