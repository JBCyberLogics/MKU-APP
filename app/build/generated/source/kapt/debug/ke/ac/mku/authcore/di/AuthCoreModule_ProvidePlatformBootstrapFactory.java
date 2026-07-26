package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.bootstrap.PlatformBootstrap;
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
public final class AuthCoreModule_ProvidePlatformBootstrapFactory implements Factory<PlatformBootstrap> {
  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<EventBus> eventBusProvider;

  private AuthCoreModule_ProvidePlatformBootstrapFactory(
      Provider<DependencyRegistry> registryProvider, Provider<EventBus> eventBusProvider) {
    this.registryProvider = registryProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public PlatformBootstrap get() {
    return providePlatformBootstrap(registryProvider.get(), eventBusProvider.get());
  }

  public static AuthCoreModule_ProvidePlatformBootstrapFactory create(
      Provider<DependencyRegistry> registryProvider, Provider<EventBus> eventBusProvider) {
    return new AuthCoreModule_ProvidePlatformBootstrapFactory(registryProvider, eventBusProvider);
  }

  public static PlatformBootstrap providePlatformBootstrap(DependencyRegistry registry,
      EventBus eventBus) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePlatformBootstrap(registry, eventBus));
  }
}
