package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.data.api.AuthApiService;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;

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
public final class AuthCoreModule_ProvideWebFormLoginHandlerFactory implements Factory<WebFormLoginHandler> {
  private final Provider<AuthApiService> authApiServiceProvider;

  private AuthCoreModule_ProvideWebFormLoginHandlerFactory(
      Provider<AuthApiService> authApiServiceProvider) {
    this.authApiServiceProvider = authApiServiceProvider;
  }

  @Override
  public WebFormLoginHandler get() {
    return provideWebFormLoginHandler(authApiServiceProvider.get());
  }

  public static AuthCoreModule_ProvideWebFormLoginHandlerFactory create(
      Provider<AuthApiService> authApiServiceProvider) {
    return new AuthCoreModule_ProvideWebFormLoginHandlerFactory(authApiServiceProvider);
  }

  public static WebFormLoginHandler provideWebFormLoginHandler(AuthApiService authApiService) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideWebFormLoginHandler(authApiService));
  }
}
