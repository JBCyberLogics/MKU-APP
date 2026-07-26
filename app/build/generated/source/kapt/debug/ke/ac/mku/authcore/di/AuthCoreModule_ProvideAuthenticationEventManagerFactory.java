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
public final class AuthCoreModule_ProvideAuthenticationEventManagerFactory implements Factory<IAuthenticationEventManager> {
  private final Provider<SecureStorageManager> secureStorageManagerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthenticationEventManagerFactory(
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<EventBus> eventBusProvider, Provider<StateRegistry> stateRegistryProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IAuthenticationEventManager get() {
    return provideAuthenticationEventManager(secureStorageManagerProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), securityMonitorProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthenticationEventManagerFactory create(
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<EventBus> eventBusProvider, Provider<StateRegistry> stateRegistryProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthenticationEventManagerFactory(secureStorageManagerProvider, eventBusProvider, stateRegistryProvider, securityMonitorProvider, registryProvider);
  }

  public static IAuthenticationEventManager provideAuthenticationEventManager(
      SecureStorageManager secureStorageManager, EventBus eventBus, StateRegistry stateRegistry,
      SecurityMonitor securityMonitor, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthenticationEventManager(secureStorageManager, eventBus, stateRegistry, securityMonitor, registry));
  }
}
