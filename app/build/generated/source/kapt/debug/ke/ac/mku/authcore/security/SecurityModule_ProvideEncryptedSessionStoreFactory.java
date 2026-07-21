package ke.ac.mku.authcore.security;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;
import ke.ac.mku.authcore.security.storage.EncryptedSessionStore;

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
public final class SecurityModule_ProvideEncryptedSessionStoreFactory implements Factory<EncryptedSessionStore> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private SecurityModule_ProvideEncryptedSessionStoreFactory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.auditLoggerProvider = auditLoggerProvider;
  }

  @Override
  public EncryptedSessionStore get() {
    return provideEncryptedSessionStore(contextProvider.get(), cryptoManagerProvider.get(), auditLoggerProvider.get());
  }

  public static SecurityModule_ProvideEncryptedSessionStoreFactory create(
      Provider<Context> contextProvider, Provider<ICryptoManager> cryptoManagerProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    return new SecurityModule_ProvideEncryptedSessionStoreFactory(contextProvider, cryptoManagerProvider, auditLoggerProvider);
  }

  public static EncryptedSessionStore provideEncryptedSessionStore(Context context,
      ICryptoManager cryptoManager, SecurityAuditLogger auditLogger) {
    return Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideEncryptedSessionStore(context, cryptoManager, auditLogger));
  }
}
