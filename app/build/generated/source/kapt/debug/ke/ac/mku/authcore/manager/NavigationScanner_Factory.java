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
public final class NavigationScanner_Factory implements Factory<NavigationScanner> {
  @Override
  public NavigationScanner get() {
    return newInstance();
  }

  public static NavigationScanner_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NavigationScanner newInstance() {
    return new NavigationScanner();
  }

  private static final class InstanceHolder {
    static final NavigationScanner_Factory INSTANCE = new NavigationScanner_Factory();
  }
}
