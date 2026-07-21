package ke.ac.mku.authcore.bootstrap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class BootstrapManager_Factory implements Factory<BootstrapManager> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<AuthCoreManager> authCoreManagerProvider;

  private final Provider<EventBus> eventBusProvider;

  private BootstrapManager_Factory(Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider, Provider<EventBus> eventBusProvider) {
    this.configManagerProvider = configManagerProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public BootstrapManager get() {
    return newInstance(configManagerProvider.get(), dependencyRegistryProvider.get(), authCoreManagerProvider.get(), eventBusProvider.get());
  }

  public static BootstrapManager_Factory create(Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<AuthCoreManager> authCoreManagerProvider, Provider<EventBus> eventBusProvider) {
    return new BootstrapManager_Factory(configManagerProvider, dependencyRegistryProvider, authCoreManagerProvider, eventBusProvider);
  }

  public static BootstrapManager newInstance(ConfigManager configManager,
      DependencyRegistry dependencyRegistry, AuthCoreManager authCoreManager, EventBus eventBus) {
    return new BootstrapManager(configManager, dependencyRegistry, authCoreManager, eventBus);
  }
}
