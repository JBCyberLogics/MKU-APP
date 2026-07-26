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
public final class EntitySerializer_Factory implements Factory<EntitySerializer> {
  @Override
  public EntitySerializer get() {
    return newInstance();
  }

  public static EntitySerializer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EntitySerializer newInstance() {
    return new EntitySerializer();
  }

  private static final class InstanceHolder {
    static final EntitySerializer_Factory INSTANCE = new EntitySerializer_Factory();
  }
}
