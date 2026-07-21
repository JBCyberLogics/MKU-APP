package ke.ac.mku.authcore.security;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SecurityModule_ProvideSecurityAuditLoggerFactory implements Factory<SecurityAuditLogger> {
  private final Provider<Context> contextProvider;

  private SecurityModule_ProvideSecurityAuditLoggerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SecurityAuditLogger get() {
    return provideSecurityAuditLogger(contextProvider.get());
  }

  public static SecurityModule_ProvideSecurityAuditLoggerFactory create(
      Provider<Context> contextProvider) {
    return new SecurityModule_ProvideSecurityAuditLoggerFactory(contextProvider);
  }

  public static SecurityAuditLogger provideSecurityAuditLogger(Context context) {
    return Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideSecurityAuditLogger(context));
  }
}
