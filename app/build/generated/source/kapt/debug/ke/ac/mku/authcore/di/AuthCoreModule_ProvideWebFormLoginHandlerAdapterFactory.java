package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;
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
public final class AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory implements Factory<IAuthNetworkService> {
  private final Provider<WebFormLoginHandler> webFormLoginHandlerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.webFormLoginHandlerProvider = webFormLoginHandlerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IAuthNetworkService get() {
    return provideWebFormLoginHandlerAdapter(webFormLoginHandlerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory create(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory(webFormLoginHandlerProvider, registryProvider);
  }

  public static IAuthNetworkService provideWebFormLoginHandlerAdapter(
      WebFormLoginHandler webFormLoginHandler, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideWebFormLoginHandlerAdapter(webFormLoginHandler, registry));
  }
}
