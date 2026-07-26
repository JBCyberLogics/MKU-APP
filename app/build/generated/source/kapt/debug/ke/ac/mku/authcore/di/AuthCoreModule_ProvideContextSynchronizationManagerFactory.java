package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.manager.ContextChangeDetector;
import ke.ac.mku.authcore.manager.ContextMerger;
import ke.ac.mku.authcore.manager.DeltaComputationEngine;
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
public final class AuthCoreModule_ProvideContextSynchronizationManagerFactory implements Factory<IContextSynchronizationManager> {
  private final Provider<IStudentContextManager> studentContextManagerProvider;

  private final Provider<ContextChangeDetector> changeDetectorProvider;

  private final Provider<DeltaComputationEngine> deltaEngineProvider;

  private final Provider<ContextMerger> mergerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideContextSynchronizationManagerFactory(
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<ContextChangeDetector> changeDetectorProvider,
      Provider<DeltaComputationEngine> deltaEngineProvider, Provider<ContextMerger> mergerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.studentContextManagerProvider = studentContextManagerProvider;
    this.changeDetectorProvider = changeDetectorProvider;
    this.deltaEngineProvider = deltaEngineProvider;
    this.mergerProvider = mergerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IContextSynchronizationManager get() {
    return provideContextSynchronizationManager(studentContextManagerProvider.get(), changeDetectorProvider.get(), deltaEngineProvider.get(), mergerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideContextSynchronizationManagerFactory create(
      Provider<IStudentContextManager> studentContextManagerProvider,
      Provider<ContextChangeDetector> changeDetectorProvider,
      Provider<DeltaComputationEngine> deltaEngineProvider, Provider<ContextMerger> mergerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideContextSynchronizationManagerFactory(studentContextManagerProvider, changeDetectorProvider, deltaEngineProvider, mergerProvider, authEventManagerProvider, registryProvider);
  }

  public static IContextSynchronizationManager provideContextSynchronizationManager(
      IStudentContextManager studentContextManager, ContextChangeDetector changeDetector,
      DeltaComputationEngine deltaEngine, ContextMerger merger,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideContextSynchronizationManager(studentContextManager, changeDetector, deltaEngine, merger, authEventManager, registry));
  }
}
