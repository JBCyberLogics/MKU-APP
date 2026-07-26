package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;

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
public final class ContextSynchronizationManager_Factory implements Factory<ContextSynchronizationManager> {
  private final Provider<IStudentContextManager> studentContextManagerProvider;

  private final Provider<ContextChangeDetector> changeDetectorProvider;

  private final Provider<DeltaComputationEngine> deltaEngineProvider;

  private final Provider<ContextMerger> mergerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private ContextSynchronizationManager_Factory(
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<ContextChangeDetector> changeDetectorProvider,
      Provider<DeltaComputationEngine> deltaEngineProvider, Provider<ContextMerger> mergerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.studentContextManagerProvider = studentContextManagerProvider;
    this.changeDetectorProvider = changeDetectorProvider;
    this.deltaEngineProvider = deltaEngineProvider;
    this.mergerProvider = mergerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public ContextSynchronizationManager get() {
    return newInstance(studentContextManagerProvider.get(), changeDetectorProvider.get(), deltaEngineProvider.get(), mergerProvider.get(), authEventManagerProvider.get());
  }

  public static ContextSynchronizationManager_Factory create(
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<ContextChangeDetector> changeDetectorProvider,
      Provider<DeltaComputationEngine> deltaEngineProvider, Provider<ContextMerger> mergerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new ContextSynchronizationManager_Factory(studentContextManagerProvider, changeDetectorProvider, deltaEngineProvider, mergerProvider, authEventManagerProvider);
  }

  public static ContextSynchronizationManager newInstance(
      IStudentContextManager studentContextManager, ContextChangeDetector changeDetector,
      DeltaComputationEngine deltaEngine, ContextMerger merger,
      IAuthenticationEventManager authEventManager) {
    return new ContextSynchronizationManager(studentContextManager, changeDetector, deltaEngine, merger, authEventManager);
  }
}
