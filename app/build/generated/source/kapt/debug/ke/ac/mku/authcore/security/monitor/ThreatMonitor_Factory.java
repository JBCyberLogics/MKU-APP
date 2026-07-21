package ke.ac.mku.authcore.security.monitor;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.security.detection.ThreatDetector;

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
public final class ThreatMonitor_Factory implements Factory<ThreatMonitor> {
  private final Provider<Context> contextProvider;

  private final Provider<ThreatDetector> threatDetectorProvider;

  private final Provider<RiskEngine> riskEngineProvider;

  private final Provider<EventBus> eventBusProvider;

  private ThreatMonitor_Factory(Provider<Context> contextProvider,
      Provider<ThreatDetector> threatDetectorProvider, Provider<RiskEngine> riskEngineProvider,
      Provider<EventBus> eventBusProvider) {
    this.contextProvider = contextProvider;
    this.threatDetectorProvider = threatDetectorProvider;
    this.riskEngineProvider = riskEngineProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public ThreatMonitor get() {
    return newInstance(contextProvider.get(), threatDetectorProvider.get(), riskEngineProvider.get(), eventBusProvider.get());
  }

  public static ThreatMonitor_Factory create(Provider<Context> contextProvider,
      Provider<ThreatDetector> threatDetectorProvider, Provider<RiskEngine> riskEngineProvider,
      Provider<EventBus> eventBusProvider) {
    return new ThreatMonitor_Factory(contextProvider, threatDetectorProvider, riskEngineProvider, eventBusProvider);
  }

  public static ThreatMonitor newInstance(Context context, ThreatDetector threatDetector,
      RiskEngine riskEngine, EventBus eventBus) {
    return new ThreatMonitor(context, threatDetector, riskEngine, eventBus);
  }
}
