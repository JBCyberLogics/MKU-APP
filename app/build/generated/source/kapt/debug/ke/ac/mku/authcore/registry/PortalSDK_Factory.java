package ke.ac.mku.authcore.registry;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.manager.AuthCoreManager;

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
public final class PortalSDK_Factory implements Factory<PortalSDK> {
  private final Provider<AuthCoreManager> authCoreManagerProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<SecurityManager> securityManagerProvider;

  private PortalSDK_Factory(Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<SecurityManager> securityManagerProvider) {
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.securityManagerProvider = securityManagerProvider;
  }

  @Override
  public PortalSDK get() {
    return newInstance(authCoreManagerProvider.get(), endpointRegistryProvider.get(), portalDiscoveryProvider.get(), securityManagerProvider.get());
  }

  public static PortalSDK_Factory create(Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<SecurityManager> securityManagerProvider) {
    return new PortalSDK_Factory(authCoreManagerProvider, endpointRegistryProvider, portalDiscoveryProvider, securityManagerProvider);
  }

  public static PortalSDK newInstance(AuthCoreManager authCoreManager,
      EndpointRegistry endpointRegistry, PortalDiscovery portalDiscovery,
      SecurityManager securityManager) {
    return new PortalSDK(authCoreManager, endpointRegistry, portalDiscovery, securityManager);
  }
}
