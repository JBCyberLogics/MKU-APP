package ke.ac.mku.authcore.manager.ui;

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
public final class WidgetPlacementOptimizer_Factory implements Factory<WidgetPlacementOptimizer> {
  @Override
  public WidgetPlacementOptimizer get() {
    return newInstance();
  }

  public static WidgetPlacementOptimizer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WidgetPlacementOptimizer newInstance() {
    return new WidgetPlacementOptimizer();
  }

  private static final class InstanceHolder {
    static final WidgetPlacementOptimizer_Factory INSTANCE = new WidgetPlacementOptimizer_Factory();
  }
}
