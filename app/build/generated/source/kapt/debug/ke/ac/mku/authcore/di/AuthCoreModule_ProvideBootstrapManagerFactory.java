package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.BootstrapManager;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.bootstrap.PlatformBootstrap;
import ke.ac.mku.authcore.bootstrap.PlatformVerifier;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.manager.AuthCoreManager;
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
public final class AuthCoreModule_ProvideBootstrapManagerFactory implements Factory<BootstrapManager> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<AuthCoreManager> authCoreManagerProvider;

  private final Provider<PlatformBootstrap> bootstrapProvider;

  private final Provider<PlatformVerifier> verifierProvider;

  private final Provider<EventBus> eventBusProvider;

  private AuthCoreModule_ProvideBootstrapManagerFactory(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<PlatformBootstrap> bootstrapProvider, Provider<PlatformVerifier> verifierProvider,
      Provider<EventBus> eventBusProvider) {
    this.configManagerProvider = configManagerProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.bootstrapProvider = bootstrapProvider;
    this.verifierProvider = verifierProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public BootstrapManager get() {
    return provideBootstrapManager(configManagerProvider.get(), dependencyRegistryProvider.get(), authCoreManagerProvider.get(), bootstrapProvider.get(), verifierProvider.get(), eventBusProvider.get());
  }

  public static AuthCoreModule_ProvideBootstrapManagerFactory create(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<PlatformBootstrap> bootstrapProvider, Provider<PlatformVerifier> verifierProvider,
      Provider<EventBus> eventBusProvider) {
    return new AuthCoreModule_ProvideBootstrapManagerFactory(configManagerProvider, dependencyRegistryProvider, authCoreManagerProvider, bootstrapProvider, verifierProvider, eventBusProvider);
  }

  public static BootstrapManager provideBootstrapManager(ConfigManager configManager,
      DependencyRegistry dependencyRegistry, AuthCoreManager authCoreManager,
      PlatformBootstrap bootstrap, PlatformVerifier verifier, EventBus eventBus) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideBootstrapManager(configManager, dependencyRegistry, authCoreManager, bootstrap, verifier, eventBus));
  }
}
