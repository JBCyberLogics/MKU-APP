package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class AuthCoreModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<ConfigManager> configManagerProvider;

  private AuthCoreModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<ConfigManager> configManagerProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.configManagerProvider = configManagerProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get(), configManagerProvider.get());
  }

  public static AuthCoreModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<ConfigManager> configManagerProvider) {
    return new AuthCoreModule_ProvideRetrofitFactory(okHttpClientProvider, configManagerProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient, ConfigManager configManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideRetrofit(okHttpClient, configManager));
  }
}
