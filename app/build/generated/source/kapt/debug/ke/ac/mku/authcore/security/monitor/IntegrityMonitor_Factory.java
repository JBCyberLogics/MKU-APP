package ke.ac.mku.authcore.security.monitor;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;

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
public final class IntegrityMonitor_Factory implements Factory<IntegrityMonitor> {
  private final Provider<Context> contextProvider;

  private final Provider<ISecureStorageManager> secureStorageProvider;

  private final Provider<EventBus> eventBusProvider;

  private IntegrityMonitor_Factory(Provider<Context> contextProvider,
      Provider<ISecureStorageManager> secureStorageProvider, Provider<EventBus> eventBusProvider) {
    this.contextProvider = contextProvider;
    this.secureStorageProvider = secureStorageProvider;
    this.eventBusProvider = eventBusProvider;
  }

  @Override
  public IntegrityMonitor get() {
    return newInstance(contextProvider.get(), secureStorageProvider.get(), eventBusProvider.get());
  }

  public static IntegrityMonitor_Factory create(Provider<Context> contextProvider,
      Provider<ISecureStorageManager> secureStorageProvider, Provider<EventBus> eventBusProvider) {
    return new IntegrityMonitor_Factory(contextProvider, secureStorageProvider, eventBusProvider);
  }

  public static IntegrityMonitor newInstance(Context context, ISecureStorageManager secureStorage,
      EventBus eventBus) {
    return new IntegrityMonitor(context, secureStorage, eventBus);
  }
}
