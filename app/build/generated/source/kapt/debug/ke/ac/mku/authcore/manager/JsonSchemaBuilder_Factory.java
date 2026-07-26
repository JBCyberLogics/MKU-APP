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
public final class JsonSchemaBuilder_Factory implements Factory<JsonSchemaBuilder> {
  @Override
  public JsonSchemaBuilder get() {
    return newInstance();
  }

  public static JsonSchemaBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonSchemaBuilder newInstance() {
    return new JsonSchemaBuilder();
  }

  private static final class InstanceHolder {
    static final JsonSchemaBuilder_Factory INSTANCE = new JsonSchemaBuilder_Factory();
  }
}
