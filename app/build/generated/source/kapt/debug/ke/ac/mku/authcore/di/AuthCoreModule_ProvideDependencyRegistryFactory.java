package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideDependencyRegistryFactory implements Factory<DependencyRegistry> {
  @Override
  public DependencyRegistry get() {
    return provideDependencyRegistry();
  }

  public static AuthCoreModule_ProvideDependencyRegistryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DependencyRegistry provideDependencyRegistry() {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideDependencyRegistry());
  }

  private static final class InstanceHolder {
    static final AuthCoreModule_ProvideDependencyRegistryFactory INSTANCE = new AuthCoreModule_ProvideDependencyRegistryFactory();
  }
}
