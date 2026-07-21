package ke.ac.mku.authcore.security.audit;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class SecurityAuditLogger_Factory implements Factory<SecurityAuditLogger> {
  private final Provider<Context> contextProvider;

  private SecurityAuditLogger_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SecurityAuditLogger get() {
    return newInstance(contextProvider.get());
  }

  public static SecurityAuditLogger_Factory create(Provider<Context> contextProvider) {
    return new SecurityAuditLogger_Factory(contextProvider);
  }

  public static SecurityAuditLogger newInstance(Context context) {
    return new SecurityAuditLogger(context);
  }
}
