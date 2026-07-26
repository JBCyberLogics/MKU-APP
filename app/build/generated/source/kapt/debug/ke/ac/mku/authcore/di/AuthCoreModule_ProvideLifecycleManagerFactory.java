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
public final class AuthCoreModule_ProvideLifecycleManagerFactory implements Factory<LifecycleManager> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideLifecycleManagerFactory(Provider<EventBus> eventBusProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public LifecycleManager get() {
    return provideLifecycleManager(eventBusProvider.get(), serviceRegistryProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideLifecycleManagerFactory create(
      Provider<EventBus> eventBusProvider, Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideLifecycleManagerFactory(eventBusProvider, serviceRegistryProvider, registryProvider);
  }

  public static LifecycleManager provideLifecycleManager(EventBus eventBus,
      ServiceRegistry serviceRegistry, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideLifecycleManager(eventBus, serviceRegistry, registry));
  }
}
