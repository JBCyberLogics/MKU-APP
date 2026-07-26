package ke.ac.mku.authcore.security.diagnostic;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class SecurityDiagnosticEngine_Factory implements Factory<SecurityDiagnosticEngine> {
  private final Provider<EventBus> eventBusProvider;

  private SecurityDiagnosticEngine_Factory(Provider<EventBus> eventBusProvider) {
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public SecurityDiagnosticEngine get() {
    return newInstance(eventBusProvider.get());
  }

  public static SecurityDiagnosticEngine_Factory create(Provider<EventBus> eventBusProvider) {
    return new SecurityDiagnosticEngine_Factory(eventBusProvider);
  }

  public static SecurityDiagnosticEngine newInstance(EventBus eventBus) {
    return new SecurityDiagnosticEngine(eventBus);
  }
}
