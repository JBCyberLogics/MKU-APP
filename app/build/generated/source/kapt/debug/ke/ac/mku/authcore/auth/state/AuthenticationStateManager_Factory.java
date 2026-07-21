package ke.ac.mku.authcore.auth.state;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
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
public final class AuthenticationStateManager_Factory implements Factory<AuthenticationStateManager> {
  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthenticationStateManager_Factory(Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.stateRegistryProvider = stateRegistryProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public AuthenticationStateManager get() {
    return newInstance(stateRegistryProvider.get(), secureStorageProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthenticationStateManager_Factory create(
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthenticationStateManager_Factory(stateRegistryProvider, secureStorageProvider, recoveryManagerProvider, securityMonitorProvider, eventBusProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static AuthenticationStateManager newInstance(StateRegistry stateRegistry,
      ISecureStorageManager secureStorage, RecoveryManager recoveryManager,
      ISecurityMonitor securityMonitor, EventBus eventBus, DependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager) {
    return new AuthenticationStateManager(stateRegistry, secureStorage, recoveryManager, securityMonitor, eventBus, dependencyRegistry, authEventManager);
  }
}
