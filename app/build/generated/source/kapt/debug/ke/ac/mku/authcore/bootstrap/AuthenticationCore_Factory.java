package ke.ac.mku.authcore.bootstrap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.domain.repository.AuthRepository;
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
public final class AuthenticationCore_Factory implements Factory<AuthenticationCore> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private AuthenticationCore_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
  }

  @Override
  public AuthenticationCore get() {
    return newInstance(authRepositoryProvider.get(), portalDiscoveryProvider.get(), endpointRegistryProvider.get());
  }

  public static AuthenticationCore_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider) {
    return new AuthenticationCore_Factory(authRepositoryProvider, portalDiscoveryProvider, endpointRegistryProvider);
  }

  public static AuthenticationCore newInstance(AuthRepository authRepository,
      PortalDiscovery portalDiscovery, EndpointRegistry endpointRegistry) {
    return new AuthenticationCore(authRepository, portalDiscovery, endpointRegistry);
  }
}
