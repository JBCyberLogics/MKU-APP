package ke.ac.mku.authcore.manager;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.registry.IDependencyRegistry;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.state.StateRegistry;

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
public final class SessionManager_Factory implements Factory<SessionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<IDependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private SessionManager_Factory(Provider<Context> contextProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<IDependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    this.contextProvider = contextProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
  }

  @Override
  public SessionManager get() {
    return newInstance(contextProvider.get(), stateRegistryProvider.get(), secureStorageProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get(), cryptoManagerProvider.get());
  }

  public static SessionManager_Factory create(Provider<Context> contextProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<IDependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    return new SessionManager_Factory(contextProvider, stateRegistryProvider, secureStorageProvider, recoveryManagerProvider, securityMonitorProvider, eventBusProvider, dependencyRegistryProvider, authEventManagerProvider, cryptoManagerProvider);
  }

  public static SessionManager newInstance(Context context, StateRegistry stateRegistry,
      ISecureStorageManager secureStorage, RecoveryManager recoveryManager,
      ISecurityMonitor securityMonitor, EventBus eventBus, IDependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager, ICryptoManager cryptoManager) {
    return new SessionManager(context, stateRegistry, secureStorage, recoveryManager, securityMonitor, eventBus, dependencyRegistry, authEventManager, cryptoManager);
  }
}
