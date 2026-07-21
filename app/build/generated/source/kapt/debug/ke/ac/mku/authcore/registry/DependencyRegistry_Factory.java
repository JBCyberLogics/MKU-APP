package ke.ac.mku.authcore.registry;

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
public final class DependencyRegistry_Factory implements Factory<DependencyRegistry> {
  @Override
  public DependencyRegistry get() {
    return newInstance();
  }

  public static DependencyRegistry_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DependencyRegistry newInstance() {
    return new DependencyRegistry();
  }

  private static final class InstanceHolder {
    static final DependencyRegistry_Factory INSTANCE = new DependencyRegistry_Factory();
  }
}
