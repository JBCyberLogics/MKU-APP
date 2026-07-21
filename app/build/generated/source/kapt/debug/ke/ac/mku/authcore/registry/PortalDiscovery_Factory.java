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
public final class PortalDiscovery_Factory implements Factory<PortalDiscovery> {
  @Override
  public PortalDiscovery get() {
    return newInstance();
  }

  public static PortalDiscovery_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PortalDiscovery newInstance() {
    return new PortalDiscovery();
  }

  private static final class InstanceHolder {
    static final PortalDiscovery_Factory INSTANCE = new PortalDiscovery_Factory();
  }
}
