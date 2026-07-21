package ke.ac.mku.authcore.security.cert;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;

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
public final class CertificateTrustManager_Factory implements Factory<CertificateTrustManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private final Provider<EventBus> eventBusProvider;

  private CertificateTrustManager_Factory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.auditLoggerProvider = auditLoggerProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public CertificateTrustManager get() {
    return newInstance(contextProvider.get(), cryptoManagerProvider.get(), secureStorageProvider.get(), auditLoggerProvider.get(), eventBusProvider.get());
  }

  public static CertificateTrustManager_Factory create(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<ISecureStorageManager> secureStorageProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider) {
    return new CertificateTrustManager_Factory(contextProvider, cryptoManagerProvider, secureStorageProvider, auditLoggerProvider, eventBusProvider);
  }

  public static CertificateTrustManager newInstance(Context context, ICryptoManager cryptoManager,
      ISecureStorageManager secureStorage, SecurityAuditLogger auditLogger, EventBus eventBus) {
    return new CertificateTrustManager(context, cryptoManager, secureStorage, auditLogger, eventBus);
  }
}
