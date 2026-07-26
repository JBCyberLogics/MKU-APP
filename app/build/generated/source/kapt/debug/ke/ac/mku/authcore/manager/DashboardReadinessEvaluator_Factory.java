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
public final class DashboardReadinessEvaluator_Factory implements Factory<DashboardReadinessEvaluator> {
  @Override
  public DashboardReadinessEvaluator get() {
    return newInstance();
  }

  public static DashboardReadinessEvaluator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DashboardReadinessEvaluator newInstance() {
    return new DashboardReadinessEvaluator();
  }

  private static final class InstanceHolder {
    static final DashboardReadinessEvaluator_Factory INSTANCE = new DashboardReadinessEvaluator_Factory();
  }
}
