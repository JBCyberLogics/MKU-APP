package ke.ac.mku.authcore.security.cert;

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
public final class CertificatePinningService_Factory implements Factory<CertificatePinningService> {
  @Override
  public CertificatePinningService get() {
    return newInstance();
  }

  public static CertificatePinningService_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CertificatePinningService newInstance() {
    return new CertificatePinningService();
  }

  private static final class InstanceHolder {
    static final CertificatePinningService_Factory INSTANCE = new CertificatePinningService_Factory();
  }
}
