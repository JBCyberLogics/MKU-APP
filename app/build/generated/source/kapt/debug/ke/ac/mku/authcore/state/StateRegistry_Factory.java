package ke.ac.mku.authcore.state;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.lifecycle.LifecycleManager;
import ke.ac.mku.authcore.service.ServiceRegistry;

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
public final class StateRegistry_Factory implements Factory<StateRegistry> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<LifecycleManager> lifecycleManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private StateRegistry_Factory(Provider<EventBus> eventBusProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.lifecycleManagerProvider = lifecycleManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public StateRegistry get() {
    return newInstance(eventBusProvider.get(), lifecycleManagerProvider.get(), serviceRegistryProvider.get());
  }

  public static StateRegistry_Factory create(Provider<EventBus> eventBusProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new StateRegistry_Factory(eventBusProvider, lifecycleManagerProvider, serviceRegistryProvider);
  }

  public static StateRegistry newInstance(EventBus eventBus, LifecycleManager lifecycleManager,
      ServiceRegistry serviceRegistry) {
    return new StateRegistry(eventBus, lifecycleManager, serviceRegistry);
  }
}
