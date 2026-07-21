package ke.ac.mku.authcore.session.validation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;

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
public final class SessionIntegrityChecker_Factory implements Factory<SessionIntegrityChecker> {
  private final Provider<ICryptoManager> cryptoManagerProvider;

  private SessionIntegrityChecker_Factory(Provider<ICryptoManager> cryptoManagerProvider) {
    this.cryptoManagerProvider = cryptoManagerProvider;
  }

  @Override
  public SessionIntegrityChecker get() {
    return newInstance(cryptoManagerProvider.get());
  }

  public static SessionIntegrityChecker_Factory create(
      Provider<ICryptoManager> cryptoManagerProvider) {
    return new SessionIntegrityChecker_Factory(cryptoManagerProvider);
  }

  public static SessionIntegrityChecker newInstance(ICryptoManager cryptoManager) {
    return new SessionIntegrityChecker(cryptoManager);
  }
}
