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
public final class MetadataGenerator_Factory implements Factory<MetadataGenerator> {
  @Override
  public MetadataGenerator get() {
    return newInstance();
  }

  public static MetadataGenerator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MetadataGenerator newInstance() {
    return new MetadataGenerator();
  }

  private static final class InstanceHolder {
    static final MetadataGenerator_Factory INSTANCE = new MetadataGenerator_Factory();
  }
}
