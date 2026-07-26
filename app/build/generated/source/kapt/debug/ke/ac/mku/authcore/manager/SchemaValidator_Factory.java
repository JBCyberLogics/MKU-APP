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
public final class SchemaValidator_Factory implements Factory<SchemaValidator> {
  @Override
  public SchemaValidator get() {
    return newInstance();
  }

  public static SchemaValidator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SchemaValidator newInstance() {
    return new SchemaValidator();
  }

  private static final class InstanceHolder {
    static final SchemaValidator_Factory INSTANCE = new SchemaValidator_Factory();
  }
}
