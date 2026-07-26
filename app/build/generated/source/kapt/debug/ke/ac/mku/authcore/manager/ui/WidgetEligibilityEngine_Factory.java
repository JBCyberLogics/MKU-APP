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
public final class WidgetEligibilityEngine_Factory implements Factory<WidgetEligibilityEngine> {
  @Override
  public WidgetEligibilityEngine get() {
    return newInstance();
  }

  public static WidgetEligibilityEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WidgetEligibilityEngine newInstance() {
    return new WidgetEligibilityEngine();
  }

  private static final class InstanceHolder {
    static final WidgetEligibilityEngine_Factory INSTANCE = new WidgetEligibilityEngine_Factory();
  }
}
