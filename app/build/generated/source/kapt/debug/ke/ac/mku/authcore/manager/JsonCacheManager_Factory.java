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
public final class JsonCacheManager_Factory implements Factory<JsonCacheManager> {
  private final Provider<ISecureStorageManager> secureStorageProvider;

  private JsonCacheManager_Factory(Provider<ISecureStorageManager> secureStorageProvider) {
    this.secureStorageProvider = secureStorageProvider;
  }

  @Override
  public JsonCacheManager get() {
    return newInstance(secureStorageProvider.get());
  }

  public static JsonCacheManager_Factory create(
      Provider<ISecureStorageManager> secureStorageProvider) {
    return new JsonCacheManager_Factory(secureStorageProvider);
  }

  public static JsonCacheManager newInstance(ISecureStorageManager secureStorage) {
    return new JsonCacheManager(secureStorage);
  }
}
