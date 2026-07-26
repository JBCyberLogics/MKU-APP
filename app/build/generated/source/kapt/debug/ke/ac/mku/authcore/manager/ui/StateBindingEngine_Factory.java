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
public final class StateBindingEngine_Factory implements Factory<StateBindingEngine> {
  @Override
  public StateBindingEngine get() {
    return newInstance();
  }

  public static StateBindingEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StateBindingEngine newInstance() {
    return new StateBindingEngine();
  }

  private static final class InstanceHolder {
    static final StateBindingEngine_Factory INSTANCE = new StateBindingEngine_Factory();
  }
}
