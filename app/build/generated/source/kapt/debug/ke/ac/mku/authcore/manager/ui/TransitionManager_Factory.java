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
public final class TransitionManager_Factory implements Factory<TransitionManager> {
  @Override
  public TransitionManager get() {
    return newInstance();
  }

  public static TransitionManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TransitionManager newInstance() {
    return new TransitionManager();
  }

  private static final class InstanceHolder {
    static final TransitionManager_Factory INSTANCE = new TransitionManager_Factory();
  }
}
