package ke.ac.mku.authcore.auth.events;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
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
public final class AuthenticationEventManager_Factory implements Factory<AuthenticationEventManager> {
  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private AuthenticationEventManager_Factory(Provider<ISecureStorageManager> secureStorageProvider,
      Provider<EventBus> eventBusProvider, Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    this.secureStorageProvider = secureStorageProvider;
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
  }

  @Override
  public AuthenticationEventManager get() {
    return newInstance(secureStorageProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), securityMonitorProvider.get(), dependencyRegistryProvider.get());
  }

  public static AuthenticationEventManager_Factory create(
      Provider<ISecureStorageManager> secureStorageProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider) {
    return new AuthenticationEventManager_Factory(secureStorageProvider, eventBusProvider, stateRegistryProvider, securityMonitorProvider, dependencyRegistryProvider);
  }

  public static AuthenticationEventManager newInstance(ISecureStorageManager secureStorage,
      EventBus eventBus, StateRegistry stateRegistry, ISecurityMonitor securityMonitor,
      DependencyRegistry dependencyRegistry) {
    return new AuthenticationEventManager(secureStorage, eventBus, stateRegistry, securityMonitor, dependencyRegistry);
  }
}
