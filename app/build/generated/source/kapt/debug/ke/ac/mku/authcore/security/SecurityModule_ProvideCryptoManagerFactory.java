package ke.ac.mku.authcore.security;

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
public final class SecurityModule_ProvideCryptoManagerFactory implements Factory<ICryptoManager> {
  private final Provider<Context> contextProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private SecurityModule_ProvideCryptoManagerFactory(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.auditLoggerProvider = auditLoggerProvider;
    this.eventBusProvider = eventBusProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public ICryptoManager get() {
    return provideCryptoManager(contextProvider.get(), auditLoggerProvider.get(), eventBusProvider.get(), registryProvider.get());
  }

  public static SecurityModule_ProvideCryptoManagerFactory create(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new SecurityModule_ProvideCryptoManagerFactory(contextProvider, auditLoggerProvider, eventBusProvider, registryProvider);
  }

  public static ICryptoManager provideCryptoManager(Context context,
      SecurityAuditLogger auditLogger, EventBus eventBus, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideCryptoManager(context, auditLogger, eventBus, registry));
  }
}
