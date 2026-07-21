package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.cert.CertificatePinningService;

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
public final class AuthCoreModule_ProvideCertificatePinningManagerFactory implements Factory<ICertificatePinningManager> {
  private final Provider<CertificatePinningService> implProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideCertificatePinningManagerFactory(
      Provider<CertificatePinningService> implProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.implProvider = implProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public ICertificatePinningManager get() {
    return provideCertificatePinningManager(implProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideCertificatePinningManagerFactory create(
      Provider<CertificatePinningService> implProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideCertificatePinningManagerFactory(implProvider, registryProvider);
  }

  public static ICertificatePinningManager provideCertificatePinningManager(
      CertificatePinningService impl, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideCertificatePinningManager(impl, registry));
  }
}
