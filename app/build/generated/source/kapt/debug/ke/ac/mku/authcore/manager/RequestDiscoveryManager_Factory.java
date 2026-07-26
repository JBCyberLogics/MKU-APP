package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;

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
public final class RequestDiscoveryManager_Factory implements Factory<RequestDiscoveryManager> {
  private final Provider<RequestFingerprintEngine> fingerprintEngineProvider;

  private final Provider<ParameterAnalyzer> parameterAnalyzerProvider;

  private final Provider<CsrfTokenManager> csrfManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private RequestDiscoveryManager_Factory(
      Provider<RequestFingerprintEngine> fingerprintEngineProvider,
      Provider<ParameterAnalyzer> parameterAnalyzerProvider,
      Provider<CsrfTokenManager> csrfManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.fingerprintEngineProvider = fingerprintEngineProvider;
    this.parameterAnalyzerProvider = parameterAnalyzerProvider;
    this.csrfManagerProvider = csrfManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public RequestDiscoveryManager get() {
    return newInstance(fingerprintEngineProvider.get(), parameterAnalyzerProvider.get(), csrfManagerProvider.get(), authEventManagerProvider.get());
  }

  public static RequestDiscoveryManager_Factory create(
      Provider<RequestFingerprintEngine> fingerprintEngineProvider,
      Provider<ParameterAnalyzer> parameterAnalyzerProvider,
      Provider<CsrfTokenManager> csrfManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new RequestDiscoveryManager_Factory(fingerprintEngineProvider, parameterAnalyzerProvider, csrfManagerProvider, authEventManagerProvider);
  }

  public static RequestDiscoveryManager newInstance(RequestFingerprintEngine fingerprintEngine,
      ParameterAnalyzer parameterAnalyzer, CsrfTokenManager csrfManager,
      IAuthenticationEventManager authEventManager) {
    return new RequestDiscoveryManager(fingerprintEngine, parameterAnalyzer, csrfManager, authEventManager);
  }
}
