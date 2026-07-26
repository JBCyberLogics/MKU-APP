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
public final class ContextChangeDetector_Factory implements Factory<ContextChangeDetector> {
  @Override
  public ContextChangeDetector get() {
    return newInstance();
  }

  public static ContextChangeDetector_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ContextChangeDetector newInstance() {
    return new ContextChangeDetector();
  }

  private static final class InstanceHolder {
    static final ContextChangeDetector_Factory INSTANCE = new ContextChangeDetector_Factory();
  }
}
