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
public final class PriorityEventDispatcher_Factory implements Factory<PriorityEventDispatcher> {
  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ContextEventRouter> routerProvider;

  private PriorityEventDispatcher_Factory(
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ContextEventRouter> routerProvider) {
    this.authEventManagerProvider = authEventManagerProvider;
    this.routerProvider = routerProvider;
  }

  @Override
  public PriorityEventDispatcher get() {
    return newInstance(authEventManagerProvider.get(), routerProvider.get());
  }

  public static PriorityEventDispatcher_Factory create(
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ContextEventRouter> routerProvider) {
    return new PriorityEventDispatcher_Factory(authEventManagerProvider, routerProvider);
  }

  public static PriorityEventDispatcher newInstance(IAuthenticationEventManager authEventManager,
      ContextEventRouter router) {
    return new PriorityEventDispatcher(authEventManager, router);
  }
}
