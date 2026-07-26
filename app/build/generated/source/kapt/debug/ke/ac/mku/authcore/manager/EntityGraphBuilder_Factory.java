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
public final class EntityGraphBuilder_Factory implements Factory<EntityGraphBuilder> {
  @Override
  public EntityGraphBuilder get() {
    return newInstance();
  }

  public static EntityGraphBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EntityGraphBuilder newInstance() {
    return new EntityGraphBuilder();
  }

  private static final class InstanceHolder {
    static final EntityGraphBuilder_Factory INSTANCE = new EntityGraphBuilder_Factory();
  }
}
