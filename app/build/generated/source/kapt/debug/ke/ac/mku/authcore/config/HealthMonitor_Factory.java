package ke.ac.mku.authcore.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class HealthMonitor_Factory implements Factory<HealthMonitor> {
  private final Provider<ConfigManager> configManagerProvider;

  private HealthMonitor_Factory(Provider<ConfigManager> configManagerProvider) {
    this.configManagerProvider = configManagerProvider;
  }

  @Override
  public HealthMonitor get() {
    return newInstance(configManagerProvider.get());
  }

  public static HealthMonitor_Factory create(Provider<ConfigManager> configManagerProvider) {
    return new HealthMonitor_Factory(configManagerProvider);
  }

  public static HealthMonitor newInstance(ConfigManager configManager) {
    return new HealthMonitor(configManager);
  }
}
