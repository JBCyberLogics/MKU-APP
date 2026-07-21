package ke.ac.mku.authcore.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
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
public final class ServiceRegistry_Factory implements Factory<ServiceRegistry> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private ServiceRegistry_Factory(Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
  }

  @Override
  public ServiceRegistry get() {
    return newInstance(eventBusProvider.get(), dependencyRegistryProvider.get());
  }

  public static ServiceRegistry_Factory create(Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    return new ServiceRegistry_Factory(eventBusProvider, dependencyRegistryProvider);
  }

  public static ServiceRegistry newInstance(EventBus eventBus,
      DependencyRegistry dependencyRegistry) {
    return new ServiceRegistry(eventBus, dependencyRegistry);
  }
}
