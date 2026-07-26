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
public final class GraphDatabase_Factory implements Factory<GraphDatabase> {
  @Override
  public GraphDatabase get() {
    return newInstance();
  }

  public static GraphDatabase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GraphDatabase newInstance() {
    return new GraphDatabase();
  }

  private static final class InstanceHolder {
    static final GraphDatabase_Factory INSTANCE = new GraphDatabase_Factory();
  }
}
