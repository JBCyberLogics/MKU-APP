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
public final class DashboardRefreshPlanner_Factory implements Factory<DashboardRefreshPlanner> {
  @Override
  public DashboardRefreshPlanner get() {
    return newInstance();
  }

  public static DashboardRefreshPlanner_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DashboardRefreshPlanner newInstance() {
    return new DashboardRefreshPlanner();
  }

  private static final class InstanceHolder {
    static final DashboardRefreshPlanner_Factory INSTANCE = new DashboardRefreshPlanner_Factory();
  }
}
