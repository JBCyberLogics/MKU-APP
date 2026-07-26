package ke.ac.mku.authcore.manager;

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
public final class NetworkInterceptorAnalyzer_Factory implements Factory<NetworkInterceptorAnalyzer> {
  private final Provider<RequestDiscoveryManager> discoveryManagerProvider;

  private NetworkInterceptorAnalyzer_Factory(
      Provider<RequestDiscoveryManager> discoveryManagerProvider) {
    this.discoveryManagerProvider = discoveryManagerProvider;
  }

  @Override
  public NetworkInterceptorAnalyzer get() {
    return newInstance(discoveryManagerProvider.get());
  }

  public static NetworkInterceptorAnalyzer_Factory create(
      Provider<RequestDiscoveryManager> discoveryManagerProvider) {
    return new NetworkInterceptorAnalyzer_Factory(discoveryManagerProvider);
  }

  public static NetworkInterceptorAnalyzer newInstance(RequestDiscoveryManager discoveryManager) {
    return new NetworkInterceptorAnalyzer(discoveryManager);
  }
}
