package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideEventBusFactory implements Factory<EventBus> {
  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideEventBusFactory(Provider<DependencyRegistry> registryProvider) {
    this.registryProvider = registryProvider;
  }

  @Override
  public EventBus get() {
    return provideEventBus(registryProvider.get());
  }

  public static AuthCoreModule_ProvideEventBusFactory create(
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideEventBusFactory(registryProvider);
  }

  public static EventBus provideEventBus(DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideEventBus(registry));
  }
}
