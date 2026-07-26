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
public final class JsonSchemaEngine_Factory implements Factory<JsonSchemaEngine> {
  @Override
  public JsonSchemaEngine get() {
    return newInstance();
  }

  public static JsonSchemaEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonSchemaEngine newInstance() {
    return new JsonSchemaEngine();
  }

  private static final class InstanceHolder {
    static final JsonSchemaEngine_Factory INSTANCE = new JsonSchemaEngine_Factory();
  }
}
