package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CacheIntegrityValidator_Factory implements Factory<CacheIntegrityValidator> {
  @Override
  public CacheIntegrityValidator get() {
    return newInstance();
  }

  public static CacheIntegrityValidator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CacheIntegrityValidator newInstance() {
    return new CacheIntegrityValidator();
  }

  private static final class InstanceHolder {
    static final CacheIntegrityValidator_Factory INSTANCE = new CacheIntegrityValidator_Factory();
  }
}
