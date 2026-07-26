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
public final class FormAnalyzer_Factory implements Factory<FormAnalyzer> {
  @Override
  public FormAnalyzer get() {
    return newInstance();
  }

  public static FormAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FormAnalyzer newInstance() {
    return new FormAnalyzer();
  }

  private static final class InstanceHolder {
    static final FormAnalyzer_Factory INSTANCE = new FormAnalyzer_Factory();
  }
}
