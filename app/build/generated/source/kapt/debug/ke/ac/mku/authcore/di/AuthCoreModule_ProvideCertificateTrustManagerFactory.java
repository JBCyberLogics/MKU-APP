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
import ke.ac.mku.authcore.security.cert.CertificateTrustManager;
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
public final class AuthCoreModule_ProvideCertificateTrustManagerFactory implements Factory<CertificateTrustManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<SecureStorageManager> secureStorageProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideCertificateTrustManagerFactory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecureStorageManager> secureStorageProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.auditLoggerProvider = auditLoggerProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public CertificateTrustManager get() {
    return provideCertificateTrustManager(contextProvider.get(), cryptoManagerProvider.get(), secureStorageProvider.get(), auditLoggerProvider.get(), eventBusProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideCertificateTrustManagerFactory create(
      Provider<Context> contextProvider, Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecureStorageManager> secureStorageProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideCertificateTrustManagerFactory(contextProvider, cryptoManagerProvider, secureStorageProvider, auditLoggerProvider, eventBusProvider, registryProvider);
  }

  public static CertificateTrustManager provideCertificateTrustManager(Context context,
      ICryptoManager cryptoManager, SecureStorageManager secureStorage,
      SecurityAuditLogger auditLogger, EventBus eventBus, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideCertificateTrustManager(context, cryptoManager, secureStorage, auditLogger, eventBus, registry));
  }
}
