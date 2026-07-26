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
public final class EntityClassifier_Factory implements Factory<EntityClassifier> {
  @Override
  public EntityClassifier get() {
    return newInstance();
  }

  public static EntityClassifier_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EntityClassifier newInstance() {
    return new EntityClassifier();
  }

  private static final class InstanceHolder {
    static final EntityClassifier_Factory INSTANCE = new EntityClassifier_Factory();
  }
}
