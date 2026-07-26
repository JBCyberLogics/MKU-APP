package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.data.api.AuthApiService;

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
public final class PortalCrawler_Factory implements Factory<PortalCrawler> {
  private final Provider<AuthApiService> authApiServiceProvider;

  private PortalCrawler_Factory(Provider<AuthApiService> authApiServiceProvider) {
    this.authApiServiceProvider = authApiServiceProvider;
  }

  @Override
  public PortalCrawler get() {
    return newInstance(authApiServiceProvider.get());
  }

  public static PortalCrawler_Factory create(Provider<AuthApiService> authApiServiceProvider) {
    return new PortalCrawler_Factory(authApiServiceProvider);
  }

  public static PortalCrawler newInstance(AuthApiService authApiService) {
    return new PortalCrawler(authApiService);
  }
}
