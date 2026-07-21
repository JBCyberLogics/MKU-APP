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
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.service.ServiceRegistry;

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
public final class CookieSynchronizationManager_Factory implements Factory<CookieSynchronizationManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private CookieSynchronizationManager_Factory(Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public CookieSynchronizationManager get() {
    return newInstance(cookieManagerProvider.get(), sessionManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), secureStorageProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get(), serviceRegistryProvider.get());
  }

  public static CookieSynchronizationManager_Factory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new CookieSynchronizationManager_Factory(cookieManagerProvider, sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, secureStorageProvider, securityMonitorProvider, authEventManagerProvider, serviceRegistryProvider);
  }

  public static CookieSynchronizationManager newInstance(ICookieManager cookieManager,
      ISessionManager sessionManager, ISessionValidator sessionValidator,
      ISessionRecoveryManager recoveryManager, ISecureStorageManager secureStorage,
      ISecurityMonitor securityMonitor, IAuthenticationEventManager authEventManager,
      ServiceRegistry serviceRegistry) {
    return new CookieSynchronizationManager(cookieManager, sessionManager, sessionValidator, recoveryManager, secureStorage, securityMonitor, authEventManager, serviceRegistry);
  }
}
