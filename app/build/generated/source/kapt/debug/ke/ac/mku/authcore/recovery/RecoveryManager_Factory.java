package ke.ac.mku.authcore.recovery;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.lifecycle.LifecycleManager;
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
public final class RecoveryManager_Factory implements Factory<RecoveryManager> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<LifecycleManager> lifecycleManagerProvider;

  private RecoveryManager_Factory(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider) {
    this.eventBusProvider = eventBusProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.lifecycleManagerProvider = lifecycleManagerProvider;
  }

  @Override
  public RecoveryManager get() {
    return newInstance(eventBusProvider.get(), serviceRegistryProvider.get(), stateRegistryProvider.get(), lifecycleManagerProvider.get());
  }

  public static RecoveryManager_Factory create(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<LifecycleManager> lifecycleManagerProvider) {
    return new RecoveryManager_Factory(eventBusProvider, serviceRegistryProvider, stateRegistryProvider, lifecycleManagerProvider);
  }

  public static RecoveryManager newInstance(EventBus eventBus, ServiceRegistry serviceRegistry,
      StateRegistry stateRegistry, LifecycleManager lifecycleManager) {
    return new RecoveryManager(eventBus, serviceRegistry, stateRegistry, lifecycleManager);
  }
}
