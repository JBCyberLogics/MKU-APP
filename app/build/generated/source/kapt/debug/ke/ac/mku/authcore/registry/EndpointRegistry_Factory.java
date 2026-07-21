package ke.ac.mku.authcore.registry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;

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
public final class EndpointRegistry_Factory implements Factory<EndpointRegistry> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private EndpointRegistry_Factory(Provider<ConfigManager> configManagerProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider) {
    this.configManagerProvider = configManagerProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
  }

  @Override
  public EndpointRegistry get() {
    return newInstance(configManagerProvider.get(), portalDiscoveryProvider.get());
  }

  public static EndpointRegistry_Factory create(Provider<ConfigManager> configManagerProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider) {
    return new EndpointRegistry_Factory(configManagerProvider, portalDiscoveryProvider);
  }

  public static EndpointRegistry newInstance(ConfigManager configManager,
      PortalDiscovery portalDiscovery) {
    return new EndpointRegistry(configManager, portalDiscovery);
  }
}
