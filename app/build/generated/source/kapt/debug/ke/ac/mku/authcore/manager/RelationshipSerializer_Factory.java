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
public final class RelationshipSerializer_Factory implements Factory<RelationshipSerializer> {
  @Override
  public RelationshipSerializer get() {
    return newInstance();
  }

  public static RelationshipSerializer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RelationshipSerializer newInstance() {
    return new RelationshipSerializer();
  }

  private static final class InstanceHolder {
    static final RelationshipSerializer_Factory INSTANCE = new RelationshipSerializer_Factory();
  }
}
