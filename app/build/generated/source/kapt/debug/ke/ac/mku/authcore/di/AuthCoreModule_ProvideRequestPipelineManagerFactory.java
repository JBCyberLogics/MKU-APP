package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.network.IRequestPipelineManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideRequestPipelineManagerFactory implements Factory<IRequestPipelineManager> {
  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideRequestPipelineManagerFactory(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.cookieManagerProvider = cookieManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IRequestPipelineManager get() {
    return provideRequestPipelineManager(cookieManagerProvider.get(), sessionManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideRequestPipelineManagerFactory create(
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideRequestPipelineManagerFactory(cookieManagerProvider, sessionManagerProvider, authEventManagerProvider, registryProvider);
  }

  public static IRequestPipelineManager provideRequestPipelineManager(ICookieManager cookieManager,
      ISessionManager sessionManager, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideRequestPipelineManager(cookieManager, sessionManager, authEventManager, registry));
  }
}
