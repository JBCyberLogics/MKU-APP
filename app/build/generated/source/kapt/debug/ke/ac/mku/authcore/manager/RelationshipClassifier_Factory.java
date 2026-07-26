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
public final class RelationshipClassifier_Factory implements Factory<RelationshipClassifier> {
  @Override
  public RelationshipClassifier get() {
    return newInstance();
  }

  public static RelationshipClassifier_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RelationshipClassifier newInstance() {
    return new RelationshipClassifier();
  }

  private static final class InstanceHolder {
    static final RelationshipClassifier_Factory INSTANCE = new RelationshipClassifier_Factory();
  }
}
