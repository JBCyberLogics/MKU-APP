package ke.ac.mku.authcore.security;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.crypto.KeyRotationManager;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class SecurityModule_ProvideKeyRotationManagerFactory implements Factory<KeyRotationManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private SecurityModule_ProvideKeyRotationManagerFactory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public KeyRotationManager get() {
    return provideKeyRotationManager(contextProvider.get(), cryptoManagerProvider.get(), registryProvider.get());
  }

  public static SecurityModule_ProvideKeyRotationManagerFactory create(
      Provider<Context> contextProvider, Provider<ICryptoManager> cryptoManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new SecurityModule_ProvideKeyRotationManagerFactory(contextProvider, cryptoManagerProvider, registryProvider);
  }

  public static KeyRotationManager provideKeyRotationManager(Context context,
      ICryptoManager cryptoManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideKeyRotationManager(context, cryptoManager, registry));
  }
}
