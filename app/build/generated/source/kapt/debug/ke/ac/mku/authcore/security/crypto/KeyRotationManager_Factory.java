package ke.ac.mku.authcore.security.crypto;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;

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
public final class KeyRotationManager_Factory implements Factory<KeyRotationManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICryptoManager> cryptoManagerProvider;

  private KeyRotationManager_Factory(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    this.contextProvider = contextProvider;
    this.cryptoManagerProvider = cryptoManagerProvider;
  }

  @Override
  public KeyRotationManager get() {
    return newInstance(contextProvider.get(), cryptoManagerProvider.get());
  }

  public static KeyRotationManager_Factory create(Provider<Context> contextProvider,
      Provider<ICryptoManager> cryptoManagerProvider) {
    return new KeyRotationManager_Factory(contextProvider, cryptoManagerProvider);
  }

  public static KeyRotationManager newInstance(Context context, ICryptoManager cryptoManager) {
    return new KeyRotationManager(context, cryptoManager);
  }
}
