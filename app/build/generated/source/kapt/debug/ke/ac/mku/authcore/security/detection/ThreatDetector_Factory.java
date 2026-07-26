package ke.ac.mku.authcore.security.detection;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
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
public final class ThreatDetector_Factory implements Factory<ThreatDetector> {
  private final Provider<Context> contextProvider;

  private final Provider<SecurityAuditLogger> auditLoggerProvider;

  private final Provider<EventBus> eventBusProvider;

  private ThreatDetector_Factory(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider) {
    this.contextProvider = contextProvider;
    this.auditLoggerProvider = auditLoggerProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public ThreatDetector get() {
    return newInstance(contextProvider.get(), auditLoggerProvider.get(), eventBusProvider.get());
  }

  public static ThreatDetector_Factory create(Provider<Context> contextProvider,
      Provider<SecurityAuditLogger> auditLoggerProvider, Provider<EventBus> eventBusProvider) {
    return new ThreatDetector_Factory(contextProvider, auditLoggerProvider, eventBusProvider);
  }

  public static ThreatDetector newInstance(Context context, SecurityAuditLogger auditLogger,
      EventBus eventBus) {
    return new ThreatDetector(context, auditLogger, eventBus);
  }
}
