package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;

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
public final class RequestPipelineManager_Factory implements Factory<RequestPipelineManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private RequestPipelineManager_Factory(Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public RequestPipelineManager get() {
    return newInstance(cookieManagerProvider.get(), sessionManagerProvider.get(), authEventManagerProvider.get());
  }

  public static RequestPipelineManager_Factory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new RequestPipelineManager_Factory(cookieManagerProvider, sessionManagerProvider, authEventManagerProvider);
  }

  public static RequestPipelineManager newInstance(ICookieManager cookieManager,
      ISessionManager sessionManager, IAuthenticationEventManager authEventManager) {
    return new RequestPipelineManager(cookieManager, sessionManager, authEventManager);
  }
}
