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
public final class RequestFingerprintEngine_Factory implements Factory<RequestFingerprintEngine> {
  @Override
  public RequestFingerprintEngine get() {
    return newInstance();
  }

  public static RequestFingerprintEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RequestFingerprintEngine newInstance() {
    return new RequestFingerprintEngine();
  }

  private static final class InstanceHolder {
    static final RequestFingerprintEngine_Factory INSTANCE = new RequestFingerprintEngine_Factory();
  }
}
