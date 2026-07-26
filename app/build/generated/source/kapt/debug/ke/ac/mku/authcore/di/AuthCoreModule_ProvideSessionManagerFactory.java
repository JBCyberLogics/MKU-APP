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
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.storage.SecureStorageManager;
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
public final class AuthCoreModule_ProvideSessionManagerFactory implements Factory<ISessionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<SecureStorageManager> secureStorageManagerProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private AuthCoreModule_ProvideSessionManagerFactory(Provider<Context> contextProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    this.contextProvider = contextProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
  }

  @Override
  public ISessionManager get() {
    return provideSessionManager(contextProvider.get(), stateRegistryProvider.get(), secureStorageManagerProvider.get(), recoveryManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), registryProvider.get(), authEventManagerProvider.get(), cryptoManagerProvider.get());
  }

  public static AuthCoreModule_ProvideSessionManagerFactory create(
      Provider<Context> contextProvider, Provider<StateRegistry> stateRegistryProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    return new AuthCoreModule_ProvideSessionManagerFactory(contextProvider, stateRegistryProvider, secureStorageManagerProvider, recoveryManagerProvider, securityMonitorProvider, eventBusProvider, registryProvider, authEventManagerProvider, cryptoManagerProvider);
  }

  public static ISessionManager provideSessionManager(Context context, StateRegistry stateRegistry,
      SecureStorageManager secureStorageManager, RecoveryManager recoveryManager,
      SecurityMonitor securityMonitor, EventBus eventBus, DependencyRegistry registry,
      IAuthenticationEventManager authEventManager, ICryptoManager cryptoManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSessionManager(context, stateRegistry, secureStorageManager, recoveryManager, securityMonitor, eventBus, registry, authEventManager, cryptoManager));
  }
}
