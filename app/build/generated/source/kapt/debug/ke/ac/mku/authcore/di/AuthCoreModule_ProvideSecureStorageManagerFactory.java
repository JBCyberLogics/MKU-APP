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
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;
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
public final class AuthCoreModule_ProvideSecureStorageManagerFactory implements Factory<SecureStorageManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideSecureStorageManagerFactory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.auditLoggerProvider = auditLoggerProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public SecureStorageManager get() {
    return provideSecureStorageManager(contextProvider.get(), cryptoManagerProvider.get(), auditLoggerProvider.get(), eventBusProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideSecureStorageManagerFactory create(
      Provider<Context> contextProvider, Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideSecureStorageManagerFactory(contextProvider, cryptoManagerProvider, auditLoggerProvider, eventBusProvider, registryProvider);
  }

  public static SecureStorageManager provideSecureStorageManager(Context context,
      ICryptoManager cryptoManager, SecurityAuditLogger auditLogger, EventBus eventBus,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSecureStorageManager(context, cryptoManager, auditLogger, eventBus, registry));
  }
}
