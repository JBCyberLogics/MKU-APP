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
public final class WidgetFactory_Factory implements Factory<WidgetFactory> {
  @Override
  public WidgetFactory get() {
    return newInstance();
  }

  public static WidgetFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WidgetFactory newInstance() {
    return new WidgetFactory();
  }

  private static final class InstanceHolder {
    static final WidgetFactory_Factory INSTANCE = new WidgetFactory_Factory();
  }
}
