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
public final class CsrfTokenManager_Factory implements Factory<CsrfTokenManager> {
  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private CsrfTokenManager_Factory(Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public CsrfTokenManager get() {
    return newInstance(authEventManagerProvider.get());
  }

  public static CsrfTokenManager_Factory create(
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new CsrfTokenManager_Factory(authEventManagerProvider);
  }

  public static CsrfTokenManager newInstance(IAuthenticationEventManager authEventManager) {
    return new CsrfTokenManager(authEventManager);
  }
}
