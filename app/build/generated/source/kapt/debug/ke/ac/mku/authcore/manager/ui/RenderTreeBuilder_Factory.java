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
public final class RenderTreeBuilder_Factory implements Factory<RenderTreeBuilder> {
  @Override
  public RenderTreeBuilder get() {
    return newInstance();
  }

  public static RenderTreeBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RenderTreeBuilder newInstance() {
    return new RenderTreeBuilder();
  }

  private static final class InstanceHolder {
    static final RenderTreeBuilder_Factory INSTANCE = new RenderTreeBuilder_Factory();
  }
}
