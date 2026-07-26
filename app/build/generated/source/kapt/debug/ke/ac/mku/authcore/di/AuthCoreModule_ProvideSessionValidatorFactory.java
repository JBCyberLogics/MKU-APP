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
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.storage.SecureStorageManager;

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
public final class AuthCoreModule_ProvideSessionValidatorFactory implements Factory<ISessionValidator> {
  private final Provider<Context> contextProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<SecureStorageManager> secureStorageManagerProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthCoreModule_ProvideSessionValidatorFactory(Provider<Context> contextProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.contextProvider = contextProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public ISessionValidator get() {
    return provideSessionValidator(contextProvider.get(), sessionManagerProvider.get(), secureStorageManagerProvider.get(), cryptoManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), registryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthCoreModule_ProvideSessionValidatorFactory create(
      Provider<Context> contextProvider, Provider<ISessionManager> sessionManagerProvider,
      Provider<SecureStorageManager> secureStorageManagerProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthCoreModule_ProvideSessionValidatorFactory(contextProvider, sessionManagerProvider, secureStorageManagerProvider, cryptoManagerProvider, securityMonitorProvider, eventBusProvider, registryProvider, authEventManagerProvider);
  }

  public static ISessionValidator provideSessionValidator(Context context,
      ISessionManager sessionManager, SecureStorageManager secureStorageManager,
      ICryptoManager cryptoManager, SecurityMonitor securityMonitor, EventBus eventBus,
      DependencyRegistry registry, IAuthenticationEventManager authEventManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSessionValidator(context, sessionManager, secureStorageManager, cryptoManager, securityMonitor, eventBus, registry, authEventManager));
  }
}
