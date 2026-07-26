package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.ui.IMotionEngine;
import ke.ac.mku.authcore.manager.ui.LoadingExperienceManager;
import ke.ac.mku.authcore.manager.ui.PhysicsAnimationEngine;
import ke.ac.mku.authcore.manager.ui.TransitionManager;
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
public final class AuthCoreModule_ProvideMotionEngineFactory implements Factory<IMotionEngine> {
  private final Provider<TransitionManager> transitionManagerProvider;

  private final Provider<PhysicsAnimationEngine> physicsEngineProvider;

  private final Provider<LoadingExperienceManager> loadingManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideMotionEngineFactory(
      Provider<TransitionManager> transitionManagerProvider,
      Provider<PhysicsAnimationEngine> physicsEngineProvider,
      Provider<LoadingExperienceManager> loadingManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.transitionManagerProvider = transitionManagerProvider;
    this.physicsEngineProvider = physicsEngineProvider;
    this.loadingManagerProvider = loadingManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IMotionEngine get() {
    return provideMotionEngine(transitionManagerProvider.get(), physicsEngineProvider.get(), loadingManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideMotionEngineFactory create(
      Provider<TransitionManager> transitionManagerProvider,
      Provider<PhysicsAnimationEngine> physicsEngineProvider,
      Provider<LoadingExperienceManager> loadingManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideMotionEngineFactory(transitionManagerProvider, physicsEngineProvider, loadingManagerProvider, authEventManagerProvider, registryProvider);
  }

  public static IMotionEngine provideMotionEngine(TransitionManager transitionManager,
      PhysicsAnimationEngine physicsEngine, LoadingExperienceManager loadingManager,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideMotionEngine(transitionManager, physicsEngine, loadingManager, authEventManager, registry));
  }
}
