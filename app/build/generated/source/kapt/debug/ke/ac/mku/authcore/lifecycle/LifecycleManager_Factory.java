package ke.ac.mku.authcore.lifecycle;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.registry.DependencyRegistry;
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
public final class LifecycleManager_Factory implements Factory<LifecycleManager> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private LifecycleManager_Factory(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
  }

  @Override
  public LifecycleManager get() {
    return newInstance(eventBusProvider.get(), serviceRegistryProvider.get(), dependencyRegistryProvider.get());
  }

  public static LifecycleManager_Factory create(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    return new LifecycleManager_Factory(eventBusProvider, serviceRegistryProvider, dependencyRegistryProvider);
  }

  public static LifecycleManager newInstance(EventBus eventBus, ServiceRegistry serviceRegistry,
      DependencyRegistry dependencyRegistry) {
    return new LifecycleManager(eventBus, serviceRegistry, dependencyRegistry);
  }
}
