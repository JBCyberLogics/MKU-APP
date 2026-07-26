package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.data.api.AuthApiService;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import okhttp3.OkHttpClient;

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
public final class AuthCoreModule_ProvideAuthApiServiceFactory implements Factory<AuthApiService> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthApiServiceFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.configManagerProvider = configManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public AuthApiService get() {
    return provideAuthApiService(okHttpClientProvider.get(), configManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthApiServiceFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<ConfigManager> configManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthApiServiceFactory(okHttpClientProvider, configManagerProvider, registryProvider);
  }

  public static AuthApiService provideAuthApiService(OkHttpClient okHttpClient,
      ConfigManager configManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthApiService(okHttpClient, configManager, registry));
  }
}
