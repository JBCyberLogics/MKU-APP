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
public final class ReasoningEngine_Factory implements Factory<ReasoningEngine> {
  @Override
  public ReasoningEngine get() {
    return newInstance();
  }

  public static ReasoningEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ReasoningEngine newInstance() {
    return new ReasoningEngine();
  }

  private static final class InstanceHolder {
    static final ReasoningEngine_Factory INSTANCE = new ReasoningEngine_Factory();
  }
}
