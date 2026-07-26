package com.example.app;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.manager.AuthCoreManager;

@ScopeMetadata
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
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AuthCoreManager> authCoreManagerProvider;

  private final Provider<EventBus> eventBusProvider;

  private AuthViewModel_Factory(Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EventBus> eventBusProvider) {
    this.authCoreManagerProvider = authCoreManagerProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(authCoreManagerProvider.get(), eventBusProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthCoreManager> authCoreManagerProvider,
      Provider<EventBus> eventBusProvider) {
    return new AuthViewModel_Factory(authCoreManagerProvider, eventBusProvider);
  }

  public static AuthViewModel newInstance(AuthCoreManager authCoreManager, EventBus eventBus) {
    return new AuthViewModel(authCoreManager, eventBus);
  }
}
