package ke.ac.mku.authcore.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.service.ServiceRegistry;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AuthCoreModule_ProvideSessionRecoveryManagerFactory implements Factory<ISessionRecoveryManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<IAuthenticationEngine> authenticationEngineProvider;

  private final Provider<ISecureStorageManager> secureStorageManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<IAuthenticationStateManager> authStateManagerProvider;

  private AuthCoreModule_ProvideSessionRecoveryManagerFactory(Provider<Context> contextProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<IAuthenticationEngine> authenticationEngineProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider) {
    this.contextProvider = contextProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.authenticationEngineProvider = authenticationEngineProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.portalConnectorProvider = portalConnectorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.authStateManagerProvider = authStateManagerProvider;
  }

  @Override
  public ISessionRecoveryManager get() {
    return provideSessionRecoveryManager(contextProvider.get(), sessionManagerProvider.get(), sessionValidatorProvider.get(), authenticationEngineProvider, secureStorageManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get(), cookieManagerProvider, portalConnectorProvider.get(), recoveryManagerProvider.get(), serviceRegistryProvider.get(), cryptoManagerProvider.get(), authStateManagerProvider.get());
  }

  public static AuthCoreModule_ProvideSessionRecoveryManagerFactory create(
      Provider<Context> contextProvider, Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<IAuthenticationEngine> authenticationEngineProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider) {
    return new AuthCoreModule_ProvideSessionRecoveryManagerFactory(contextProvider, sessionManagerProvider, sessionValidatorProvider, authenticationEngineProvider, secureStorageManagerProvider, securityMonitorProvider, eventBusProvider, dependencyRegistryProvider, authEventManagerProvider, cookieManagerProvider, portalConnectorProvider, recoveryManagerProvider, serviceRegistryProvider, cryptoManagerProvider, authStateManagerProvider);
  }

  public static ISessionRecoveryManager provideSessionRecoveryManager(Context context,
      ISessionManager sessionManager, ISessionValidator sessionValidator,
      javax.inject.Provider<IAuthenticationEngine> authenticationEngineProvider,
      ISecureStorageManager secureStorageManager, ISecurityMonitor securityMonitor,
      EventBus eventBus, DependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<ICookieManager> cookieManagerProvider, IPortalConnector portalConnector,
      RecoveryManager recoveryManager, ServiceRegistry serviceRegistry,
      ICryptoManager cryptoManager, IAuthenticationStateManager authStateManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSessionRecoveryManager(context, sessionManager, sessionValidator, authenticationEngineProvider, secureStorageManager, securityMonitor, eventBus, dependencyRegistry, authEventManager, cookieManagerProvider, portalConnector, recoveryManager, serviceRegistry, cryptoManager, authStateManager));
  }
}
