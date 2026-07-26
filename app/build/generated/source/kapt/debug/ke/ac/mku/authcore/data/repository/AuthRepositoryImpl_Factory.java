package ke.ac.mku.authcore.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
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
  private final Provider<AuthenticationTransactionManager> transactionManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<CookieManager> cookieManagerProvider;

  private AuthRepositoryImpl_Factory(
      Provider<AuthenticationTransactionManager> transactionManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<CookieManager> cookieManagerProvider) {
    this.transactionManagerProvider = transactionManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(transactionManagerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(
      Provider<AuthenticationTransactionManager> transactionManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<CookieManager> cookieManagerProvider) {
    return new AuthRepositoryImpl_Factory(transactionManagerProvider, sessionManagerProvider, cookieManagerProvider);
  }

  public static AuthRepositoryImpl newInstance(AuthenticationTransactionManager transactionManager,
      ISessionManager sessionManager, CookieManager cookieManager) {
    return new AuthRepositoryImpl(transactionManager, sessionManager, cookieManager);
  }
}
