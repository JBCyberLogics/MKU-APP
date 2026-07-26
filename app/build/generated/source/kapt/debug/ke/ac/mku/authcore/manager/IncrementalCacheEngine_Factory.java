package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;

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
public final class IncrementalCacheEngine_Factory implements Factory<IncrementalCacheEngine> {
  private final Provider<ISecureStorageManager> secureStorageProvider;

  private IncrementalCacheEngine_Factory(Provider<ISecureStorageManager> secureStorageProvider) {
    this.secureStorageProvider = secureStorageProvider;
  }

  @Override
  public IncrementalCacheEngine get() {
    return newInstance(secureStorageProvider.get());
  }

  public static IncrementalCacheEngine_Factory create(
      Provider<ISecureStorageManager> secureStorageProvider) {
    return new IncrementalCacheEngine_Factory(secureStorageProvider);
  }

  public static IncrementalCacheEngine newInstance(ISecureStorageManager secureStorage) {
    return new IncrementalCacheEngine(secureStorage);
  }
}
