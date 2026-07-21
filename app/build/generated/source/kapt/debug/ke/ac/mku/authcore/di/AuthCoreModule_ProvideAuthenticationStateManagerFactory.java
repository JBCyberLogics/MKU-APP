package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.storage.SecureStorageManager;
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
public final class AuthCoreModule_ProvideAuthenticationStateManagerFactory implements Factory<IAuthenticationStateManager> {
  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<SecureStorageManager> secureStorageManagerProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthCoreModule_ProvideAuthenticationStateManagerFactory(
      Provider<StateRegistry> stateRegistryProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.stateRegistryProvider = stateRegistryProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public IAuthenticationStateManager get() {
    return provideAuthenticationStateManager(stateRegistryProvider.get(), secureStorageManagerProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthCoreModule_ProvideAuthenticationStateManagerFactory create(
      Provider<StateRegistry> stateRegistryProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthCoreModule_ProvideAuthenticationStateManagerFactory(stateRegistryProvider, secureStorageManagerProvider, recoveryManagerProvider, securityMonitorProvider, eventBusProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static IAuthenticationStateManager provideAuthenticationStateManager(
      StateRegistry stateRegistry, SecureStorageManager secureStorageManager,
      RecoveryManager recoveryManager, SecurityMonitor securityMonitor, EventBus eventBus,
      DependencyRegistry dependencyRegistry, IAuthenticationEventManager authEventManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthenticationStateManager(stateRegistry, secureStorageManager, recoveryManager, securityMonitor, eventBus, dependencyRegistry, authEventManager));
  }
}
