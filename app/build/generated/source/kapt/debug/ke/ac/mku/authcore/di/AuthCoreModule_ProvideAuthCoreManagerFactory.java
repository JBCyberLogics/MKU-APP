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
import ke.ac.mku.authcore.domain.repository.AuthRepository;
import ke.ac.mku.authcore.manager.AuthCoreManager;

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
public final class AuthCoreModule_ProvideAuthCoreManagerFactory implements Factory<AuthCoreManager> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<HealthMonitor> healthMonitorProvider;

  private AuthCoreModule_ProvideAuthCoreManagerFactory(
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ConfigManager> configManagerProvider,
      Provider<HealthMonitor> healthMonitorProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.configManagerProvider = configManagerProvider;
    this.healthMonitorProvider = healthMonitorProvider;
  }

  @Override
  public AuthCoreManager get() {
    return provideAuthCoreManager(authRepositoryProvider.get(), configManagerProvider.get(), healthMonitorProvider.get());
  }

  public static AuthCoreModule_ProvideAuthCoreManagerFactory create(
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ConfigManager> configManagerProvider,
      Provider<HealthMonitor> healthMonitorProvider) {
    return new AuthCoreModule_ProvideAuthCoreManagerFactory(authRepositoryProvider, configManagerProvider, healthMonitorProvider);
  }

  public static AuthCoreManager provideAuthCoreManager(AuthRepository authRepository,
      ConfigManager configManager, HealthMonitor healthMonitor) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthCoreManager(authRepository, configManager, healthMonitor));
  }
}
