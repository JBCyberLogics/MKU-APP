package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;

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
public final class ContextCacheManager_Factory implements Factory<ContextCacheManager> {
  private final Provider<SnapshotManager> snapshotManagerProvider;

  private final Provider<IncrementalCacheEngine> cacheEngineProvider;

  private final Provider<CacheIntegrityValidator> integrityValidatorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private ContextCacheManager_Factory(Provider<SnapshotManager> snapshotManagerProvider,
      Provider<IncrementalCacheEngine> cacheEngineProvider,
      Provider<CacheIntegrityValidator> integrityValidatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.snapshotManagerProvider = snapshotManagerProvider;
    this.cacheEngineProvider = cacheEngineProvider;
    this.integrityValidatorProvider = integrityValidatorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public ContextCacheManager get() {
    return newInstance(snapshotManagerProvider.get(), cacheEngineProvider.get(), integrityValidatorProvider.get(), authEventManagerProvider.get());
  }

  public static ContextCacheManager_Factory create(
      Provider<SnapshotManager> snapshotManagerProvider,
      Provider<IncrementalCacheEngine> cacheEngineProvider,
      Provider<CacheIntegrityValidator> integrityValidatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new ContextCacheManager_Factory(snapshotManagerProvider, cacheEngineProvider, integrityValidatorProvider, authEventManagerProvider);
  }

  public static ContextCacheManager newInstance(SnapshotManager snapshotManager,
      IncrementalCacheEngine cacheEngine, CacheIntegrityValidator integrityValidator,
      IAuthenticationEventManager authEventManager) {
    return new ContextCacheManager(snapshotManager, cacheEngine, integrityValidator, authEventManager);
  }
}
