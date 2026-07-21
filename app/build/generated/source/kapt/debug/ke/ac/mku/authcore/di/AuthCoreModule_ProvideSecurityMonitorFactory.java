package ke.ac.mku.authcore.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.IntegrityMonitor;
import ke.ac.mku.authcore.security.monitor.RiskEngine;
import ke.ac.mku.authcore.security.monitor.SecurityAuditManager;
import ke.ac.mku.authcore.security.monitor.SecurityIncidentHandler;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.monitor.ThreatMonitor;

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
public final class AuthCoreModule_ProvideSecurityMonitorFactory implements Factory<SecurityMonitor> {
  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<ThreatMonitor> threatMonitorProvider;

  private final Provider<SecurityAuditManager> auditManagerProvider;

  private final Provider<IntegrityMonitor> integrityMonitorProvider;

  private final Provider<SecurityIncidentHandler> incidentHandlerProvider;

  private final Provider<RiskEngine> riskEngineProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideSecurityMonitorFactory(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ThreatMonitor> threatMonitorProvider,
      Provider<SecurityAuditManager> auditManagerProvider,
      Provider<IntegrityMonitor> integrityMonitorProvider,
      Provider<SecurityIncidentHandler> incidentHandlerProvider,
      Provider<RiskEngine> riskEngineProvider, Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.threatMonitorProvider = threatMonitorProvider;
    this.auditManagerProvider = auditManagerProvider;
    this.integrityMonitorProvider = integrityMonitorProvider;
    this.incidentHandlerProvider = incidentHandlerProvider;
    this.riskEngineProvider = riskEngineProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public SecurityMonitor get() {
    return provideSecurityMonitor(contextProvider.get(), eventBusProvider.get(), threatMonitorProvider.get(), auditManagerProvider.get(), integrityMonitorProvider.get(), incidentHandlerProvider.get(), riskEngineProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideSecurityMonitorFactory create(
      Provider<Context> contextProvider, Provider<EventBus> eventBusProvider,
      Provider<ThreatMonitor> threatMonitorProvider,
      Provider<SecurityAuditManager> auditManagerProvider,
      Provider<IntegrityMonitor> integrityMonitorProvider,
      Provider<SecurityIncidentHandler> incidentHandlerProvider,
      Provider<RiskEngine> riskEngineProvider, Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideSecurityMonitorFactory(contextProvider, eventBusProvider, threatMonitorProvider, auditManagerProvider, integrityMonitorProvider, incidentHandlerProvider, riskEngineProvider, registryProvider);
  }

  public static SecurityMonitor provideSecurityMonitor(Context context, EventBus eventBus,
      ThreatMonitor threatMonitor, SecurityAuditManager auditManager,
      IntegrityMonitor integrityMonitor, SecurityIncidentHandler incidentHandler,
      RiskEngine riskEngine, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSecurityMonitor(context, eventBus, threatMonitor, auditManager, integrityMonitor, incidentHandler, riskEngine, registry));
  }
}
