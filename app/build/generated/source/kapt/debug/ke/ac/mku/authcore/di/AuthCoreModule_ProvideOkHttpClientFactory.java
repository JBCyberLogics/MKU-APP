package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.manager.NetworkInterceptorAnalyzer;
import ke.ac.mku.authcore.security.cert.CertificateTrustManager;
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
public final class AuthCoreModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<CertificateTrustManager> certificateTrustManagerProvider;

  private final Provider<NetworkInterceptorAnalyzer> requestDiscoveryInterceptorProvider;

  private AuthCoreModule_ProvideOkHttpClientFactory(Provider<ConfigManager> configManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<CertificateTrustManager> certificateTrustManagerProvider,
      Provider<NetworkInterceptorAnalyzer> requestDiscoveryInterceptorProvider) {
    this.configManagerProvider = configManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.certificateTrustManagerProvider = certificateTrustManagerProvider;
    this.requestDiscoveryInterceptorProvider = requestDiscoveryInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(configManagerProvider.get(), cookieManagerProvider.get(), certificateTrustManagerProvider.get(), requestDiscoveryInterceptorProvider.get());
  }

  public static AuthCoreModule_ProvideOkHttpClientFactory create(
      Provider<ConfigManager> configManagerProvider, Provider<ICookieManager> cookieManagerProvider,
      Provider<CertificateTrustManager> certificateTrustManagerProvider,
      Provider<NetworkInterceptorAnalyzer> requestDiscoveryInterceptorProvider) {
    return new AuthCoreModule_ProvideOkHttpClientFactory(configManagerProvider, cookieManagerProvider, certificateTrustManagerProvider, requestDiscoveryInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(ConfigManager configManager,
      ICookieManager cookieManager, CertificateTrustManager certificateTrustManager,
      NetworkInterceptorAnalyzer requestDiscoveryInterceptor) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideOkHttpClient(configManager, cookieManager, certificateTrustManager, requestDiscoveryInterceptor));
  }
}
