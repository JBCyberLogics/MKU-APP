package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AuthCoreModule_ProvideServiceRegistryFactory implements Factory<ServiceRegistry> {
  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private AuthCoreModule_ProvideServiceRegistryFactory(Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
  }

  @Override
  public ServiceRegistry get() {
    return provideServiceRegistry(eventBusProvider.get(), dependencyRegistryProvider.get());
  }

  public static AuthCoreModule_ProvideServiceRegistryFactory create(
      Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    return new AuthCoreModule_ProvideServiceRegistryFactory(eventBusProvider, dependencyRegistryProvider);
  }

  public static ServiceRegistry provideServiceRegistry(EventBus eventBus,
      DependencyRegistry dependencyRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideServiceRegistry(eventBus, dependencyRegistry));
  }
}
