package ke.ac.mku.authcore.security.storage;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
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
public final class EncryptedSessionStore_Factory implements Factory<EncryptedSessionStore> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private EncryptedSessionStore_Factory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.auditLoggerProvider = auditLoggerProvider;
  }

  @Override
  public EncryptedSessionStore get() {
    return newInstance(contextProvider.get(), cryptoManagerProvider.get(), auditLoggerProvider.get());
  }

  public static EncryptedSessionStore_Factory create(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    return new EncryptedSessionStore_Factory(contextProvider, cryptoManagerProvider, auditLoggerProvider);
  }

  public static EncryptedSessionStore newInstance(Context context, ICryptoManager cryptoManager,
      SecurityAuditLogger auditLogger) {
    return new EncryptedSessionStore(context, cryptoManager, auditLogger);
  }
}
