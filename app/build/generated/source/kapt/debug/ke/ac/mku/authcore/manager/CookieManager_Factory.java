package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
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
public final class CookieManager_Factory implements Factory<CookieManager> {
  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private CookieManager_Factory(Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<StateRegistry> stateRegistryProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.stateRegistryProvider = stateRegistryProvider;
  }

  @Override
  public CookieManager get() {
    return newInstance(sessionManagerProvider.get(), sessionValidatorProvider, recoveryManagerProvider, secureStorageProvider.get(), cryptoManagerProvider.get(), securityMonitorProvider.get(), authEventManagerProvider.get(), stateRegistryProvider.get());
  }

  public static CookieManager_Factory create(Provider<ISessionManager> sessionManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<StateRegistry> stateRegistryProvider) {
    return new CookieManager_Factory(sessionManagerProvider, sessionValidatorProvider, recoveryManagerProvider, secureStorageProvider, cryptoManagerProvider, securityMonitorProvider, authEventManagerProvider, stateRegistryProvider);
  }

  public static CookieManager newInstance(ISessionManager sessionManager,
      javax.inject.Provider<ISessionValidator> sessionValidatorProvider,
      javax.inject.Provider<ISessionRecoveryManager> recoveryManagerProvider,
      ISecureStorageManager secureStorage, ICryptoManager cryptoManager,
      ISecurityMonitor securityMonitor, IAuthenticationEventManager authEventManager,
      StateRegistry stateRegistry) {
    return new CookieManager(sessionManager, sessionValidatorProvider, recoveryManagerProvider, secureStorage, cryptoManager, securityMonitor, authEventManager, stateRegistry);
  }
}
