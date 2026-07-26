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
public final class ConfidenceEngine_Factory implements Factory<ConfidenceEngine> {
  @Override
  public ConfidenceEngine get() {
    return newInstance();
  }

  public static ConfidenceEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ConfidenceEngine newInstance() {
    return new ConfidenceEngine();
  }

  private static final class InstanceHolder {
    static final ConfidenceEngine_Factory INSTANCE = new ConfidenceEngine_Factory();
  }
}
