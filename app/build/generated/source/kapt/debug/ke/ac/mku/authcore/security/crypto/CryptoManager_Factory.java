package ke.ac.mku.authcore.security.crypto;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class CryptoManager_Factory implements Factory<CryptoManager> {
  private final Provider<Context> contextProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private CryptoManager_Factory(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    this.contextProvider = contextProvider;
    this.auditLoggerProvider = auditLoggerProvider;
  }

  @Override
  public CryptoManager get() {
    return newInstance(contextProvider.get(), auditLoggerProvider.get());
  }

  public static CryptoManager_Factory create(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider) {
    return new CryptoManager_Factory(contextProvider, auditLoggerProvider);
  }

  public static CryptoManager newInstance(Context context, SecurityAuditLogger auditLogger) {
    return new CryptoManager(context, auditLogger);
  }
}
