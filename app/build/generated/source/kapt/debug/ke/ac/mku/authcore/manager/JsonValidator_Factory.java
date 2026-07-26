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
public final class JsonValidator_Factory implements Factory<JsonValidator> {
  @Override
  public JsonValidator get() {
    return newInstance();
  }

  public static JsonValidator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonValidator newInstance() {
    return new JsonValidator();
  }

  private static final class InstanceHolder {
    static final JsonValidator_Factory INSTANCE = new JsonValidator_Factory();
  }
}
