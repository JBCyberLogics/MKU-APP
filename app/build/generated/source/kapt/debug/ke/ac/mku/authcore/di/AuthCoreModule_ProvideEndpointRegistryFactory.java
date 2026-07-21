package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;

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
public final class AuthCoreModule_ProvideEndpointRegistryFactory implements Factory<EndpointRegistry> {
  private final Provider<ConfigManager> configManagerProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideEndpointRegistryFactory(
      Provider<ConfigManager> configManagerProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.configManagerProvider = configManagerProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public EndpointRegistry get() {
    return provideEndpointRegistry(configManagerProvider.get(), portalDiscoveryProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideEndpointRegistryFactory create(
      Provider<ConfigManager> configManagerProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideEndpointRegistryFactory(configManagerProvider, portalDiscoveryProvider, registryProvider);
  }

  public static EndpointRegistry provideEndpointRegistry(ConfigManager configManager,
      PortalDiscovery portalDiscovery, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideEndpointRegistry(configManager, portalDiscovery, registry));
  }
}
