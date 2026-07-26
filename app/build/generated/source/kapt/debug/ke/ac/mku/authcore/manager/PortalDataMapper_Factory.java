package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;

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
public final class PortalDataMapper_Factory implements Factory<PortalDataMapper> {
  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private PortalDataMapper_Factory(Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public PortalDataMapper get() {
    return newInstance(authEventManagerProvider.get());
  }

  public static PortalDataMapper_Factory create(
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new PortalDataMapper_Factory(authEventManagerProvider);
  }

  public static PortalDataMapper newInstance(IAuthenticationEventManager authEventManager) {
    return new PortalDataMapper(authEventManager);
  }
}
