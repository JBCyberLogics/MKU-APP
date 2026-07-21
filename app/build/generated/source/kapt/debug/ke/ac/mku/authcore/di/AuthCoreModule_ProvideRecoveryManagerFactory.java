package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.lifecycle.LifecycleManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
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
public final class AuthCoreModule_ProvideRecoveryManagerFactory implements Factory<RecoveryManager> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<LifecycleManager> lifecycleManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideRecoveryManagerFactory(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.lifecycleManagerProvider = lifecycleManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public RecoveryManager get() {
    return provideRecoveryManager(eventBusProvider.get(), serviceRegistryProvider.get(), stateRegistryProvider.get(), lifecycleManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideRecoveryManagerFactory create(
      Provider<EventBus> eventBusProvider, Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideRecoveryManagerFactory(eventBusProvider, serviceRegistryProvider, stateRegistryProvider, lifecycleManagerProvider, registryProvider);
  }

  public static RecoveryManager provideRecoveryManager(EventBus eventBus,
      ServiceRegistry serviceRegistry, StateRegistry stateRegistry,
      LifecycleManager lifecycleManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideRecoveryManager(eventBus, serviceRegistry, stateRegistry, lifecycleManager, registry));
  }
}
