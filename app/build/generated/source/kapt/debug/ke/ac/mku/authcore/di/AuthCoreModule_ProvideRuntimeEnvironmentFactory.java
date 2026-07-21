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
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.feature.FeatureRegistry;
import ke.ac.mku.authcore.runtime.RuntimeEnvironment;

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
public final class AuthCoreModule_ProvideRuntimeEnvironmentFactory implements Factory<RuntimeEnvironment> {
  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<FeatureRegistry> featureRegistryProvider;

  private AuthCoreModule_ProvideRuntimeEnvironmentFactory(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ConfigManager> configManagerProvider,
      Provider<FeatureRegistry> featureRegistryProvider) {
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.configManagerProvider = configManagerProvider;
    this.featureRegistryProvider = featureRegistryProvider;
  }

  @Override
  public RuntimeEnvironment get() {
    return provideRuntimeEnvironment(contextProvider.get(), eventBusProvider.get(), configManagerProvider.get(), featureRegistryProvider.get());
  }

  public static AuthCoreModule_ProvideRuntimeEnvironmentFactory create(
      Provider<Context> contextProvider, Provider<EventBus> eventBusProvider,
      Provider<ConfigManager> configManagerProvider,
      Provider<FeatureRegistry> featureRegistryProvider) {
    return new AuthCoreModule_ProvideRuntimeEnvironmentFactory(contextProvider, eventBusProvider, configManagerProvider, featureRegistryProvider);
  }

  public static RuntimeEnvironment provideRuntimeEnvironment(Context context, EventBus eventBus,
      ConfigManager configManager, FeatureRegistry featureRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideRuntimeEnvironment(context, eventBus, configManager, featureRegistry));
  }
}
