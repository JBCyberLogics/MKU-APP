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
public final class SemanticQueryEngine_Factory implements Factory<SemanticQueryEngine> {
  @Override
  public SemanticQueryEngine get() {
    return newInstance();
  }

  public static SemanticQueryEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SemanticQueryEngine newInstance() {
    return new SemanticQueryEngine();
  }

  private static final class InstanceHolder {
    static final SemanticQueryEngine_Factory INSTANCE = new SemanticQueryEngine_Factory();
  }
}
