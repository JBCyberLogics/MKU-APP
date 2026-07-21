package ke.ac.mku.authcore.auth.portal;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;
import ke.ac.mku.authcore.registry.PortalSDK;

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
public final class PortalConnectorImpl_Factory implements Factory<PortalConnectorImpl> {
  private final Provider<PortalSDK> portalSDKProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private PortalConnectorImpl_Factory(Provider<PortalSDK> portalSDKProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    this.portalSDKProvider = portalSDKProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
  }

  @Override
  public PortalConnectorImpl get() {
    return newInstance(portalSDKProvider.get(), portalDiscoveryProvider.get(), endpointRegistryProvider.get());
  }

  public static PortalConnectorImpl_Factory create(Provider<PortalSDK> portalSDKProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    return new PortalConnectorImpl_Factory(portalSDKProvider, portalDiscoveryProvider, endpointRegistryProvider);
  }

  public static PortalConnectorImpl newInstance(PortalSDK portalSDK,
      PortalDiscovery portalDiscovery, EndpointRegistry endpointRegistry) {
    return new PortalConnectorImpl(portalSDK, portalDiscovery, endpointRegistry);
  }
}
