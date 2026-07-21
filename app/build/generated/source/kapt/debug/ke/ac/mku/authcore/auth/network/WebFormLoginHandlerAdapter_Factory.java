package ke.ac.mku.authcore.auth.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;

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
public final class WebFormLoginHandlerAdapter_Factory implements Factory<WebFormLoginHandlerAdapter> {
  private final Provider<WebFormLoginHandler> webFormLoginHandlerProvider;

  private WebFormLoginHandlerAdapter_Factory(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider) {
    this.webFormLoginHandlerProvider = webFormLoginHandlerProvider;
  }

  @Override
  public WebFormLoginHandlerAdapter get() {
    return newInstance(webFormLoginHandlerProvider.get());
  }

  public static WebFormLoginHandlerAdapter_Factory create(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider) {
    return new WebFormLoginHandlerAdapter_Factory(webFormLoginHandlerProvider);
  }

  public static WebFormLoginHandlerAdapter newInstance(WebFormLoginHandler webFormLoginHandler) {
    return new WebFormLoginHandlerAdapter(webFormLoginHandler);
  }
}
