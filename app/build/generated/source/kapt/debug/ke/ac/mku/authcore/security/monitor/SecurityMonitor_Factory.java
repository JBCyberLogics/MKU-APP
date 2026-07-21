package ke.ac.mku.authcore.security.monitor;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;

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
public final class SecurityMonitor_Factory implements Factory<SecurityMonitor> {
  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<ThreatMonitor> threatMonitorProvider;

  private final Provider<SecurityAuditManager> auditManagerProvider;

  private final Provider<IntegrityMonitor> integrityMonitorProvider;

  private final Provider<SecurityIncidentHandler> incidentHandlerProvider;

  private final Provider<RiskEngine> riskEngineProvider;

  private SecurityMonitor_Factory(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ThreatMonitor> threatMonitorProvider,
      Provider<SecurityAuditManager> auditManagerProvider,
      Provider<IntegrityMonitor> integrityMonitorProvider,
      Provider<SecurityIncidentHandler> incidentHandlerProvider,
      Provider<RiskEngine> riskEngineProvider) {
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.threatMonitorProvider = threatMonitorProvider;
    this.auditManagerProvider = auditManagerProvider;
    this.integrityMonitorProvider = integrityMonitorProvider;
    this.incidentHandlerProvider = incidentHandlerProvider;
    this.riskEngineProvider = riskEngineProvider;
  }

  @Override
  public SecurityMonitor get() {
    return newInstance(contextProvider.get(), eventBusProvider.get(), threatMonitorProvider.get(), auditManagerProvider.get(), integrityMonitorProvider.get(), incidentHandlerProvider.get(), riskEngineProvider.get());
  }

  public static SecurityMonitor_Factory create(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ThreatMonitor> threatMonitorProvider,
      Provider<SecurityAuditManager> auditManagerProvider,
      Provider<IntegrityMonitor> integrityMonitorProvider,
      Provider<SecurityIncidentHandler> incidentHandlerProvider,
      Provider<RiskEngine> riskEngineProvider) {
    return new SecurityMonitor_Factory(contextProvider, eventBusProvider, threatMonitorProvider, auditManagerProvider, integrityMonitorProvider, incidentHandlerProvider, riskEngineProvider);
  }

  public static SecurityMonitor newInstance(Context context, EventBus eventBus,
      ThreatMonitor threatMonitor, SecurityAuditManager auditManager,
      IntegrityMonitor integrityMonitor, SecurityIncidentHandler incidentHandler,
      RiskEngine riskEngine) {
    return new SecurityMonitor(context, eventBus, threatMonitor, auditManager, integrityMonitor, incidentHandler, riskEngine);
  }
}
