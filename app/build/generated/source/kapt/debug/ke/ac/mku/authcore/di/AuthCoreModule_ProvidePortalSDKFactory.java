package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.manager.AuthCoreManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;
import ke.ac.mku.authcore.registry.PortalSDK;
import ke.ac.mku.authcore.registry.SecurityManager;

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
public final class AuthCoreModule_ProvidePortalSDKFactory implements Factory<PortalSDK> {
  private final Provider<AuthCoreManager> authCoreManagerProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<SecurityManager> securityManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvidePortalSDKFactory(Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<SecurityManager> securityManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.securityManagerProvider = securityManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public PortalSDK get() {
    return providePortalSDK(authCoreManagerProvider.get(), endpointRegistryProvider.get(), portalDiscoveryProvider.get(), securityManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvidePortalSDKFactory create(
      Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<SecurityManager> securityManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvidePortalSDKFactory(authCoreManagerProvider, endpointRegistryProvider, portalDiscoveryProvider, securityManagerProvider, registryProvider);
  }

  public static PortalSDK providePortalSDK(AuthCoreManager authCoreManager,
      EndpointRegistry endpointRegistry, PortalDiscovery portalDiscovery,
      SecurityManager securityManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePortalSDK(authCoreManager, endpointRegistry, portalDiscovery, securityManager, registry));
  }
}
