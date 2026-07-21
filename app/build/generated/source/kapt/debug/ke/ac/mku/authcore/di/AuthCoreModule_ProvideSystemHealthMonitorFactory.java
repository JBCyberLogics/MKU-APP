package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.health.SystemHealthMonitor;
import ke.ac.mku.authcore.lifecycle.LifecycleManager;
import ke.ac.mku.authcore.runtime.RuntimeEnvironment;
import ke.ac.mku.authcore.service.ServiceRegistry;
import ke.ac.mku.authcore.state.StateRegistry;

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
public final class AuthCoreModule_ProvideSystemHealthMonitorFactory implements Factory<SystemHealthMonitor> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<RuntimeEnvironment> runtimeEnvironmentProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<LifecycleManager> lifecycleManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private AuthCoreModule_ProvideSystemHealthMonitorFactory(Provider<EventBus> eventBusProvider,
      Provider<RuntimeEnvironment> runtimeEnvironmentProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.runtimeEnvironmentProvider = runtimeEnvironmentProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.lifecycleManagerProvider = lifecycleManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public SystemHealthMonitor get() {
    return provideSystemHealthMonitor(eventBusProvider.get(), runtimeEnvironmentProvider.get(), stateRegistryProvider.get(), lifecycleManagerProvider.get(), serviceRegistryProvider.get());
  }

  public static AuthCoreModule_ProvideSystemHealthMonitorFactory create(
      Provider<EventBus> eventBusProvider, Provider<RuntimeEnvironment> runtimeEnvironmentProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new AuthCoreModule_ProvideSystemHealthMonitorFactory(eventBusProvider, runtimeEnvironmentProvider, stateRegistryProvider, lifecycleManagerProvider, serviceRegistryProvider);
  }

  public static SystemHealthMonitor provideSystemHealthMonitor(EventBus eventBus,
      RuntimeEnvironment runtimeEnvironment, StateRegistry stateRegistry,
      LifecycleManager lifecycleManager, ServiceRegistry serviceRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSystemHealthMonitor(eventBus, runtimeEnvironment, stateRegistry, lifecycleManager, serviceRegistry));
  }
}
