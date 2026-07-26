package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager;
import ke.ac.mku.authcore.contracts.network.IResponseProcessingManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
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
public final class AuthCoreModule_ProvideResponseProcessingManagerFactory implements Factory<IResponseProcessingManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ICookieSynchronizationManager> cookieSyncManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideResponseProcessingManagerFactory(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.cookieSyncManagerProvider = cookieSyncManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IResponseProcessingManager get() {
    return provideResponseProcessingManager(cookieManagerProvider.get(), cookieSyncManagerProvider.get(), sessionManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideResponseProcessingManagerFactory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideResponseProcessingManagerFactory(cookieManagerProvider, cookieSyncManagerProvider, sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, securityMonitorProvider, authEventManagerProvider, registryProvider);
  }

  public static IResponseProcessingManager provideResponseProcessingManager(
      ICookieManager cookieManager, ICookieSynchronizationManager cookieSyncManager,
      ISessionManager sessionManager, ISessionValidator sessionValidator,
      ISessionRecoveryManager recoveryManager, ISecurityMonitor securityMonitor,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideResponseProcessingManager(cookieManager, cookieSyncManager, sessionManager, sessionValidator, recoveryManager, securityMonitor, authEventManager, registry));
  }
}
