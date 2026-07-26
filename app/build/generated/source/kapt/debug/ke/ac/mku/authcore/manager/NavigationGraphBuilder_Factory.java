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
public final class NavigationGraphBuilder_Factory implements Factory<NavigationGraphBuilder> {
  @Override
  public NavigationGraphBuilder get() {
    return newInstance();
  }

  public static NavigationGraphBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NavigationGraphBuilder newInstance() {
    return new NavigationGraphBuilder();
  }

  private static final class InstanceHolder {
    static final NavigationGraphBuilder_Factory INSTANCE = new NavigationGraphBuilder_Factory();
  }
}
