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
public final class StudentActivityDetector_Factory implements Factory<StudentActivityDetector> {
  @Override
  public StudentActivityDetector get() {
    return newInstance();
  }

  public static StudentActivityDetector_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StudentActivityDetector newInstance() {
    return new StudentActivityDetector();
  }

  private static final class InstanceHolder {
    static final StudentActivityDetector_Factory INSTANCE = new StudentActivityDetector_Factory();
  }
}
