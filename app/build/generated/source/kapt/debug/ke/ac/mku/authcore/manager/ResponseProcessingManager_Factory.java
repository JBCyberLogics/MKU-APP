package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;

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
public final class ResponseProcessingManager_Factory implements Factory<ResponseProcessingManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ICookieSynchronizationManager> cookieSyncManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private ResponseProcessingManager_Factory(Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.cookieSyncManagerProvider = cookieSyncManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public ResponseProcessingManager get() {
    return newInstance(cookieManagerProvider.get(), cookieSyncManagerProvider.get(), sessionManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get());
  }

  public static ResponseProcessingManager_Factory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new ResponseProcessingManager_Factory(cookieManagerProvider, cookieSyncManagerProvider, sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, securityMonitorProvider, authEventManagerProvider);
  }

  public static ResponseProcessingManager newInstance(ICookieManager cookieManager,
      ICookieSynchronizationManager cookieSyncManager, ISessionManager sessionManager,
      ISessionValidator sessionValidator, ISessionRecoveryManager recoveryManager,
      ISecurityMonitor securityMonitor, IAuthenticationEventManager authEventManager) {
    return new ResponseProcessingManager(cookieManager, cookieSyncManager, sessionManager, sessionValidator, recoveryManager, securityMonitor, authEventManager);
  }
}
