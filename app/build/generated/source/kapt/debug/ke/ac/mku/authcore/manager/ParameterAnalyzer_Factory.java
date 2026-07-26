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
public final class ParameterAnalyzer_Factory implements Factory<ParameterAnalyzer> {
  @Override
  public ParameterAnalyzer get() {
    return newInstance();
  }

  public static ParameterAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ParameterAnalyzer newInstance() {
    return new ParameterAnalyzer();
  }

  private static final class InstanceHolder {
    static final ParameterAnalyzer_Factory INSTANCE = new ParameterAnalyzer_Factory();
  }
}
