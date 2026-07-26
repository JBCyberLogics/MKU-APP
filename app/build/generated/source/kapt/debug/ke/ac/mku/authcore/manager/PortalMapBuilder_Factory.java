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
public final class PortalMapBuilder_Factory implements Factory<PortalMapBuilder> {
  @Override
  public PortalMapBuilder get() {
    return newInstance();
  }

  public static PortalMapBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PortalMapBuilder newInstance() {
    return new PortalMapBuilder();
  }

  private static final class InstanceHolder {
    static final PortalMapBuilder_Factory INSTANCE = new PortalMapBuilder_Factory();
  }
}
