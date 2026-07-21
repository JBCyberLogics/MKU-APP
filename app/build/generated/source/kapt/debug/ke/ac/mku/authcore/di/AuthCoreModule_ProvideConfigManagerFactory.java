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
public final class AuthCoreModule_ProvideConfigManagerFactory implements Factory<ConfigManager> {
  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideConfigManagerFactory(
      Provider<DependencyRegistry> registryProvider) {
    this.registryProvider = registryProvider;
  }

  @Override
  public ConfigManager get() {
    return provideConfigManager(registryProvider.get());
  }

  public static AuthCoreModule_ProvideConfigManagerFactory create(
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideConfigManagerFactory(registryProvider);
  }

  public static ConfigManager provideConfigManager(DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideConfigManager(registry));
  }
}
