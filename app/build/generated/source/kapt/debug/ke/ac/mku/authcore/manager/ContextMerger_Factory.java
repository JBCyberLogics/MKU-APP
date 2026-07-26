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
public final class ContextMerger_Factory implements Factory<ContextMerger> {
  @Override
  public ContextMerger get() {
    return newInstance();
  }

  public static ContextMerger_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ContextMerger newInstance() {
    return new ContextMerger();
  }

  private static final class InstanceHolder {
    static final ContextMerger_Factory INSTANCE = new ContextMerger_Factory();
  }
}
