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
public final class DatasetComposer_Factory implements Factory<DatasetComposer> {
  @Override
  public DatasetComposer get() {
    return newInstance();
  }

  public static DatasetComposer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DatasetComposer newInstance() {
    return new DatasetComposer();
  }

  private static final class InstanceHolder {
    static final DatasetComposer_Factory INSTANCE = new DatasetComposer_Factory();
  }
}
