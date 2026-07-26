package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.config.HealthMonitor;
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
public final class AuthCoreModule_ProvideHealthMonitorFactory implements Factory<HealthMonitor> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideHealthMonitorFactory(Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.configManagerProvider = configManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public HealthMonitor get() {
    return provideHealthMonitor(configManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideHealthMonitorFactory create(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideHealthMonitorFactory(configManagerProvider, registryProvider);
  }

  public static HealthMonitor provideHealthMonitor(ConfigManager configManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideHealthMonitor(configManager, registry));
  }
}
