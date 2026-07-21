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
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
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
public final class AuthCoreModule_ProvideCookieSynchronizationManagerFactory implements Factory<ICookieSynchronizationManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideCookieSynchronizationManagerFactory(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public ICookieSynchronizationManager get() {
    return provideCookieSynchronizationManager(cookieManagerProvider.get(), sessionManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), secureStorageManagerProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get(), serviceRegistryProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideCookieSynchronizationManagerFactory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideCookieSynchronizationManagerFactory(cookieManagerProvider, sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, secureStorageManagerProvider, securityMonitorProvider, authEventManagerProvider, serviceRegistryProvider, registryProvider);
  }

  public static ICookieSynchronizationManager provideCookieSynchronizationManager(
      ICookieManager cookieManager, ISessionManager sessionManager,
      ISessionValidator sessionValidator, ISessionRecoveryManager recoveryManager,
      ISecureStorageManager secureStorageManager, ISecurityMonitor securityMonitor,
      IAuthenticationEventManager authEventManager, ServiceRegistry serviceRegistry,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideCookieSynchronizationManager(cookieManager, sessionManager, sessionValidator, recoveryManager, secureStorageManager, securityMonitor, authEventManager, serviceRegistry, registry));
  }
}
