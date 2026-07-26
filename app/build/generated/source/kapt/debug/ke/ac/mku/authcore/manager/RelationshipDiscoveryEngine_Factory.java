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
public final class RelationshipDiscoveryEngine_Factory implements Factory<RelationshipDiscoveryEngine> {
  @Override
  public RelationshipDiscoveryEngine get() {
    return newInstance();
  }

  public static RelationshipDiscoveryEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RelationshipDiscoveryEngine newInstance() {
    return new RelationshipDiscoveryEngine();
  }

  private static final class InstanceHolder {
    static final RelationshipDiscoveryEngine_Factory INSTANCE = new RelationshipDiscoveryEngine_Factory();
  }
}
