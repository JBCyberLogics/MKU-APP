package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.registry.DependencyRegistry;
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
public final class AuthCoreModule_ProvidePortalDiscoveryFactory implements Factory<PortalDiscovery> {
  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvidePortalDiscoveryFactory(
      Provider<DependencyRegistry> registryProvider) {
    this.registryProvider = registryProvider;
  }

  @Override
  public PortalDiscovery get() {
    return providePortalDiscovery(registryProvider.get());
  }

  public static AuthCoreModule_ProvidePortalDiscoveryFactory create(
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvidePortalDiscoveryFactory(registryProvider);
  }

  public static PortalDiscovery providePortalDiscovery(DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePortalDiscovery(registry));
  }
}
