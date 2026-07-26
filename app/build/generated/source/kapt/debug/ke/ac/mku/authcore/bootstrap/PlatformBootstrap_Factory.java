package ke.ac.mku.authcore.bootstrap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class PlatformBootstrap_Factory implements Factory<PlatformBootstrap> {
  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<EventBus> eventBusProvider;

  private PlatformBootstrap_Factory(Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<EventBus> eventBusProvider) {
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public PlatformBootstrap get() {
    return newInstance(dependencyRegistryProvider.get(), eventBusProvider.get());
  }

  public static PlatformBootstrap_Factory create(
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<EventBus> eventBusProvider) {
    return new PlatformBootstrap_Factory(dependencyRegistryProvider, eventBusProvider);
  }

  public static PlatformBootstrap newInstance(DependencyRegistry dependencyRegistry,
      EventBus eventBus) {
    return new PlatformBootstrap(dependencyRegistry, eventBus);
  }
}
