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
public final class StudentContextBuilder_Factory implements Factory<StudentContextBuilder> {
  @Override
  public StudentContextBuilder get() {
    return newInstance();
  }

  public static StudentContextBuilder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StudentContextBuilder newInstance() {
    return new StudentContextBuilder();
  }

  private static final class InstanceHolder {
    static final StudentContextBuilder_Factory INSTANCE = new StudentContextBuilder_Factory();
  }
}
