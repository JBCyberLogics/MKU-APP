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
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.state.StateRegistry;

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
public final class AuthCoreModule_ProvideCookieManagerFactory implements Factory<ICookieManager> {
  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageManagerProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private AuthCoreModule_ProvideCookieManagerFactory(
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<StateRegistry> stateRegistryProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.stateRegistryProvider = stateRegistryProvider;
  }

  @Override
  public ICookieManager get() {
    return provideCookieManager(sessionManagerProvider.get(), sessionValidatorProvider, recoveryManagerProvider, secureStorageManagerProvider.get(), cryptoManagerProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get(), registryProvider.get(), stateRegistryProvider.get());
  }

  public static AuthCoreModule_ProvideCookieManagerFactory create(
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<StateRegistry> stateRegistryProvider) {
    return new AuthCoreModule_ProvideCookieManagerFactory(sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, secureStorageManagerProvider, cryptoManagerProvider, securityMonitorProvider, authEventManagerProvider, registryProvider, stateRegistryProvider);
  }

  public static ICookieManager provideCookieManager(ISessionManager sessionManager,
      javax.inject.Provider<ISessionValidator> sessionValidatorProvider,
      javax.inject.Provider<ISessionRecoveryManager> recoveryManagerProvider,
      ISecureStorageManager secureStorageManager, ICryptoManager cryptoManager,
      ISecurityMonitor securityMonitor, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry, StateRegistry stateRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideCookieManager(sessionManager, sessionValidatorProvider, recoveryManagerProvider, secureStorageManager, cryptoManager, securityMonitor, authEventManager, registry, stateRegistry));
  }
}
