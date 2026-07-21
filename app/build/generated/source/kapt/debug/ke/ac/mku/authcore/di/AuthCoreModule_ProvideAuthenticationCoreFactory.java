package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.AuthenticationCore;
import ke.ac.mku.authcore.domain.repository.AuthRepository;
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
public final class AuthCoreModule_ProvideAuthenticationCoreFactory implements Factory<AuthenticationCore> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<PortalDiscovery> portalDiscoveryProvider;

  private final Provider<EndpointRegistry> endpointRegistryProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthenticationCoreFactory(
      Provider<AuthRepository> authRepositoryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.portalDiscoveryProvider = portalDiscoveryProvider;
    this.endpointRegistryProvider = endpointRegistryProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public AuthenticationCore get() {
    return provideAuthenticationCore(authRepositoryProvider.get(), portalDiscoveryProvider.get(), endpointRegistryProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthenticationCoreFactory create(
      Provider<AuthRepository> authRepositoryProvider,
      Provider<PortalDiscovery> portalDiscoveryProvider,
      Provider<EndpointRegistry> endpointRegistryProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthenticationCoreFactory(authRepositoryProvider, portalDiscoveryProvider, endpointRegistryProvider, registryProvider);
  }

  public static AuthenticationCore provideAuthenticationCore(AuthRepository authRepository,
      PortalDiscovery portalDiscovery, EndpointRegistry endpointRegistry,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthenticationCore(authRepository, portalDiscovery, endpointRegistry, registry));
  }
}
