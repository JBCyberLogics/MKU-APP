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
public final class WidgetPlacementEngine_Factory implements Factory<WidgetPlacementEngine> {
  @Override
  public WidgetPlacementEngine get() {
    return newInstance();
  }

  public static WidgetPlacementEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WidgetPlacementEngine newInstance() {
    return new WidgetPlacementEngine();
  }

  private static final class InstanceHolder {
    static final WidgetPlacementEngine_Factory INSTANCE = new WidgetPlacementEngine_Factory();
  }
}
