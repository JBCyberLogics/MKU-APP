package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.data.repository.AuthRepositoryImpl;
import ke.ac.mku.authcore.domain.repository.AuthRepository;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<AuthRepositoryImpl> authRepositoryImplProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthRepositoryFactory(
      Provider<AuthRepositoryImpl> authRepositoryImplProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.authRepositoryImplProvider = authRepositoryImplProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(authRepositoryImplProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthRepositoryFactory create(
      Provider<AuthRepositoryImpl> authRepositoryImplProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthRepositoryFactory(authRepositoryImplProvider, registryProvider);
  }

  public static AuthRepository provideAuthRepository(AuthRepositoryImpl authRepositoryImpl,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthRepository(authRepositoryImpl, registry));
  }
}
