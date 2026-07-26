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
public final class DependencyAnalyzer_Factory implements Factory<DependencyAnalyzer> {
  @Override
  public DependencyAnalyzer get() {
    return newInstance();
  }

  public static DependencyAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DependencyAnalyzer newInstance() {
    return new DependencyAnalyzer();
  }

  private static final class InstanceHolder {
    static final DependencyAnalyzer_Factory INSTANCE = new DependencyAnalyzer_Factory();
  }
}
