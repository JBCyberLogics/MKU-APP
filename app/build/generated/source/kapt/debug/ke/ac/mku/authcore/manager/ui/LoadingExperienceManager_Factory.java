package ke.ac.mku.authcore.manager.ui;

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
public final class LoadingExperienceManager_Factory implements Factory<LoadingExperienceManager> {
  @Override
  public LoadingExperienceManager get() {
    return newInstance();
  }

  public static LoadingExperienceManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LoadingExperienceManager newInstance() {
    return new LoadingExperienceManager();
  }

  private static final class InstanceHolder {
    static final LoadingExperienceManager_Factory INSTANCE = new LoadingExperienceManager_Factory();
  }
}
