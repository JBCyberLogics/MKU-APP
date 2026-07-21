package ke.ac.mku.authcore.feature;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
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
public final class FeatureRegistry_Factory implements Factory<FeatureRegistry> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private FeatureRegistry_Factory(Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public FeatureRegistry get() {
    return newInstance(eventBusProvider.get(), stateRegistryProvider.get(), serviceRegistryProvider.get());
  }

  public static FeatureRegistry_Factory create(Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new FeatureRegistry_Factory(eventBusProvider, stateRegistryProvider, serviceRegistryProvider);
  }

  public static FeatureRegistry newInstance(EventBus eventBus, StateRegistry stateRegistry,
      ServiceRegistry serviceRegistry) {
    return new FeatureRegistry(eventBus, stateRegistry, serviceRegistry);
  }
}
