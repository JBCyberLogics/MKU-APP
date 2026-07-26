package ke.ac.mku.authcore.manager;

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
public final class ContextEventRouter_Factory implements Factory<ContextEventRouter> {
  private final Provider<EventBus> eventBusProvider;

  private ContextEventRouter_Factory(Provider<EventBus> eventBusProvider) {
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public ContextEventRouter get() {
    return newInstance(eventBusProvider.get());
  }

  public static ContextEventRouter_Factory create(Provider<EventBus> eventBusProvider) {
    return new ContextEventRouter_Factory(eventBusProvider);
  }

  public static ContextEventRouter newInstance(EventBus eventBus) {
    return new ContextEventRouter(eventBus);
  }
}
