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
public final class RenderTreeExecutor_Factory implements Factory<RenderTreeExecutor> {
  @Override
  public RenderTreeExecutor get() {
    return newInstance();
  }

  public static RenderTreeExecutor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RenderTreeExecutor newInstance() {
    return new RenderTreeExecutor();
  }

  private static final class InstanceHolder {
    static final RenderTreeExecutor_Factory INSTANCE = new RenderTreeExecutor_Factory();
  }
}
