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

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideBootstrapManagerFactory(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.configManagerProvider = configManagerProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public BootstrapManager get() {
    return provideBootstrapManager(configManagerProvider.get(), dependencyRegistryProvider.get(), authCoreManagerProvider.get(), eventBusProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideBootstrapManagerFactory create(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideBootstrapManagerFactory(configManagerProvider, dependencyRegistryProvider, authCoreManagerProvider, eventBusProvider, registryProvider);
  }

  public static BootstrapManager provideBootstrapManager(ConfigManager configManager,
      DependencyRegistry dependencyRegistry, AuthCoreManager authCoreManager, EventBus eventBus,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideBootstrapManager(configManager, dependencyRegistry, authCoreManager, eventBus, registry));
  }
}
