package ke.ac.mku.authcore.security.monitor;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.recovery.RecoveryManager;

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
public final class SecurityIncidentHandler_Factory implements Factory<SecurityIncidentHandler> {
  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private SecurityIncidentHandler_Factory(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<RecoveryManager> recoveryManagerProvider) {
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
  }

  @Override
  public SecurityIncidentHandler get() {
    return newInstance(contextProvider.get(), eventBusProvider.get(), recoveryManagerProvider.get());
  }

  public static SecurityIncidentHandler_Factory create(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<RecoveryManager> recoveryManagerProvider) {
    return new SecurityIncidentHandler_Factory(contextProvider, eventBusProvider, recoveryManagerProvider);
  }

  public static SecurityIncidentHandler newInstance(Context context, EventBus eventBus,
      RecoveryManager recoveryManager) {
    return new SecurityIncidentHandler(context, eventBus, recoveryManager);
  }
}
