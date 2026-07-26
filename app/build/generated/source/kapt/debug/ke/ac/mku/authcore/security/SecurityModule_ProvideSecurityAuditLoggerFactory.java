package ke.ac.mku.authcore.security;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.registry.DependencyRegistry;
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

  private final Provider<DependencyRegistry> registryProvider;

  private SecurityModule_ProvideSecurityAuditLoggerFactory(Provider<Context> contextProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public SecurityAuditLogger get() {
    return provideSecurityAuditLogger(contextProvider.get(), registryProvider.get());
  }

  public static SecurityModule_ProvideSecurityAuditLoggerFactory create(
      Provider<Context> contextProvider, Provider<DependencyRegistry> registryProvider) {
    return new SecurityModule_ProvideSecurityAuditLoggerFactory(contextProvider, registryProvider);
  }

  public static SecurityAuditLogger provideSecurityAuditLogger(Context context,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideSecurityAuditLogger(context, registry));
  }
}
