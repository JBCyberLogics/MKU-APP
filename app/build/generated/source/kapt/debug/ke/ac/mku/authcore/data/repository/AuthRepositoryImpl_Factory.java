package ke.ac.mku.authcore.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;
import ke.ac.mku.authcore.manager.CookieManager;

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
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  private final Provider<WebFormLoginHandler> webFormLoginHandlerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<CookieManager> cookieManagerProvider;

  private AuthRepositoryImpl_Factory(Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<CookieManager> cookieManagerProvider) {
    this.webFormLoginHandlerProvider = webFormLoginHandlerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(webFormLoginHandlerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<CookieManager> cookieManagerProvider) {
    return new AuthRepositoryImpl_Factory(webFormLoginHandlerProvider, sessionManagerProvider, cookieManagerProvider);
  }

  public static AuthRepositoryImpl newInstance(WebFormLoginHandler webFormLoginHandler,
      ISessionManager sessionManager, CookieManager cookieManager) {
    return new AuthRepositoryImpl(webFormLoginHandler, sessionManager, cookieManager);
  }
}
