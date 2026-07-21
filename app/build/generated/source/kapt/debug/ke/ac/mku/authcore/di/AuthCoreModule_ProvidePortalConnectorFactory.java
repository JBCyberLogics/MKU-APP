package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
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
public final class AuthCoreModule_ProvidePortalConnectorFactory implements Factory<IPortalConnector> {
  private final Provider<PortalSDK> portalSDKProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private AuthCoreModule_ProvidePortalConnectorFactory(Provider<PortalSDK> portalSDKProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    this.portalSDKProvider = portalSDKProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
  }

  @Override
  public IPortalConnector get() {
    return providePortalConnector(portalSDKProvider.get(), portalDiscoveryProvider.get(), endpointRegistryProvider.get());
  }

  public static AuthCoreModule_ProvidePortalConnectorFactory create(
      Provider<PortalSDK> portalSDKProvider, Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    return new AuthCoreModule_ProvidePortalConnectorFactory(portalSDKProvider, portalDiscoveryProvider, endpointRegistryProvider);
  }

  public static IPortalConnector providePortalConnector(PortalSDK portalSDK,
      PortalDiscovery portalDiscovery, EndpointRegistry endpointRegistry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePortalConnector(portalSDK, portalDiscovery, endpointRegistry));
  }
}
