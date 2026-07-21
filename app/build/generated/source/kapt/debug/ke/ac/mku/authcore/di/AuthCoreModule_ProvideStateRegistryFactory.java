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
public final class AuthCoreModule_ProvideStateRegistryFactory implements Factory<StateRegistry> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<LifecycleManager> lifecycleManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideStateRegistryFactory(Provider<EventBus> eventBusProvider,
      Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.lifecycleManagerProvider = lifecycleManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public StateRegistry get() {
    return provideStateRegistry(eventBusProvider.get(), lifecycleManagerProvider.get(), serviceRegistryProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideStateRegistryFactory create(
      Provider<EventBus> eventBusProvider, Provider<LifecycleManager> lifecycleManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideStateRegistryFactory(eventBusProvider, lifecycleManagerProvider, serviceRegistryProvider, registryProvider);
  }

  public static StateRegistry provideStateRegistry(EventBus eventBus,
      LifecycleManager lifecycleManager, ServiceRegistry serviceRegistry,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideStateRegistry(eventBus, lifecycleManager, serviceRegistry, registry));
  }
}
