package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.domain.repository.AuthRepository;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<AuthenticationTransactionManager> transactionManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthRepositoryFactory(
      Provider<AuthenticationTransactionManager> transactionManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.transactionManagerProvider = transactionManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(transactionManagerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthRepositoryFactory create(
      Provider<AuthenticationTransactionManager> transactionManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthRepositoryFactory(transactionManagerProvider, sessionManagerProvider, cookieManagerProvider, registryProvider);
  }

  public static AuthRepository provideAuthRepository(
      AuthenticationTransactionManager transactionManager, ISessionManager sessionManager,
      ICookieManager cookieManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthRepository(transactionManager, sessionManager, cookieManager, registry));
  }
}
