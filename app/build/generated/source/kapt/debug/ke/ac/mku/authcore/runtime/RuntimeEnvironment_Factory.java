package ke.ac.mku.authcore.runtime;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.feature.FeatureRegistry;

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
public final class RuntimeEnvironment_Factory implements Factory<RuntimeEnvironment> {
  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<FeatureRegistry> featureRegistryProvider;

  private RuntimeEnvironment_Factory(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ConfigManager> configManagerProvider,
      Provider<FeatureRegistry> featureRegistryProvider) {
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.configManagerProvider = configManagerProvider;
    this.featureRegistryProvider = featureRegistryProvider;
  }

  @Override
  public RuntimeEnvironment get() {
    return newInstance(contextProvider.get(), eventBusProvider.get(), configManagerProvider.get(), featureRegistryProvider.get());
  }

  public static RuntimeEnvironment_Factory create(Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<ConfigManager> configManagerProvider,
      Provider<FeatureRegistry> featureRegistryProvider) {
    return new RuntimeEnvironment_Factory(contextProvider, eventBusProvider, configManagerProvider, featureRegistryProvider);
  }

  public static RuntimeEnvironment newInstance(Context context, EventBus eventBus,
      ConfigManager configManager, FeatureRegistry featureRegistry) {
    return new RuntimeEnvironment(context, eventBus, configManager, featureRegistry);
  }
}
