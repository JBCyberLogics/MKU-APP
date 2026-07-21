package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.SecurityManager;

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
public final class AuthCoreModule_ProvideSecurityManagerFactory implements Factory<SecurityManager> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideSecurityManagerFactory(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.configManagerProvider = configManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public SecurityManager get() {
    return provideSecurityManager(configManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideSecurityManagerFactory create(
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideSecurityManagerFactory(configManagerProvider, registryProvider);
  }

  public static SecurityManager provideSecurityManager(ConfigManager configManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSecurityManager(configManager, registry));
  }
}
