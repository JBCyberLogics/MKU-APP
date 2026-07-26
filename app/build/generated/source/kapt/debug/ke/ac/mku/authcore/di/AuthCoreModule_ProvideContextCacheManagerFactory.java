package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextCacheManager;
import ke.ac.mku.authcore.manager.CacheIntegrityValidator;
import ke.ac.mku.authcore.manager.IncrementalCacheEngine;
import ke.ac.mku.authcore.manager.SnapshotManager;
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
public final class AuthCoreModule_ProvideContextCacheManagerFactory implements Factory<IContextCacheManager> {
  private final Provider<SnapshotManager> snapshotManagerProvider;

  private final Provider<IncrementalCacheEngine> cacheEngineProvider;

  private final Provider<CacheIntegrityValidator> integrityValidatorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideContextCacheManagerFactory(
      Provider<SnapshotManager> snapshotManagerProvider,
      Provider<IncrementalCacheEngine> cacheEngineProvider,
      Provider<CacheIntegrityValidator> integrityValidatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.snapshotManagerProvider = snapshotManagerProvider;
    this.cacheEngineProvider = cacheEngineProvider;
    this.integrityValidatorProvider = integrityValidatorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IContextCacheManager get() {
    return provideContextCacheManager(snapshotManagerProvider.get(), cacheEngineProvider.get(), integrityValidatorProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideContextCacheManagerFactory create(
      Provider<SnapshotManager> snapshotManagerProvider,
      Provider<IncrementalCacheEngine> cacheEngineProvider,
      Provider<CacheIntegrityValidator> integrityValidatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideContextCacheManagerFactory(snapshotManagerProvider, cacheEngineProvider, integrityValidatorProvider, authEventManagerProvider, registryProvider);
  }

  public static IContextCacheManager provideContextCacheManager(SnapshotManager snapshotManager,
      IncrementalCacheEngine cacheEngine, CacheIntegrityValidator integrityValidator,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideContextCacheManager(snapshotManager, cacheEngine, integrityValidator, authEventManager, registry));
  }
}
