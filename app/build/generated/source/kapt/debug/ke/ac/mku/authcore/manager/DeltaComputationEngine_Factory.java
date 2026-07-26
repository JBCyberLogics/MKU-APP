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
public final class DeltaComputationEngine_Factory implements Factory<DeltaComputationEngine> {
  @Override
  public DeltaComputationEngine get() {
    return newInstance();
  }

  public static DeltaComputationEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DeltaComputationEngine newInstance() {
    return new DeltaComputationEngine();
  }

  private static final class InstanceHolder {
    static final DeltaComputationEngine_Factory INSTANCE = new DeltaComputationEngine_Factory();
  }
}
