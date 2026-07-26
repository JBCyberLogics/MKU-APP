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
public final class ContextAnalyzer_Factory implements Factory<ContextAnalyzer> {
  @Override
  public ContextAnalyzer get() {
    return newInstance();
  }

  public static ContextAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ContextAnalyzer newInstance() {
    return new ContextAnalyzer();
  }

  private static final class InstanceHolder {
    static final ContextAnalyzer_Factory INSTANCE = new ContextAnalyzer_Factory();
  }
}
