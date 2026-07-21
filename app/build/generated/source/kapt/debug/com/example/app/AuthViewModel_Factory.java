package com.example.app;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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

  private AuthViewModel_Factory(Provider<AuthCoreManager> authCoreManagerProvider) {
    this.authCoreManagerProvider = authCoreManagerProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(authCoreManagerProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthCoreManager> authCoreManagerProvider) {
    return new AuthViewModel_Factory(authCoreManagerProvider);
  }

  public static AuthViewModel newInstance(AuthCoreManager authCoreManager) {
    return new AuthViewModel(authCoreManager);
  }
}
