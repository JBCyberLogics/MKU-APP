package ke.ac.mku.authcore.data.api;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class WebFormLoginHandler_Factory implements Factory<WebFormLoginHandler> {
  private final Provider<AuthApiService> authApiServiceProvider;

  private WebFormLoginHandler_Factory(Provider<AuthApiService> authApiServiceProvider) {
    this.authApiServiceProvider = authApiServiceProvider;
  }

  @Override
  public WebFormLoginHandler get() {
    return newInstance(authApiServiceProvider.get());
  }

  public static WebFormLoginHandler_Factory create(
      Provider<AuthApiService> authApiServiceProvider) {
    return new WebFormLoginHandler_Factory(authApiServiceProvider);
  }

  public static WebFormLoginHandler newInstance(AuthApiService authApiService) {
    return new WebFormLoginHandler(authApiService);
  }
}
