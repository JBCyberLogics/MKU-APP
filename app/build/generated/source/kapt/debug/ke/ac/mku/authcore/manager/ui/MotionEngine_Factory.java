package ke.ac.mku.authcore.manager.ui;

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
public final class MotionEngine_Factory implements Factory<MotionEngine> {
  private final Provider<TransitionManager> transitionManagerProvider;

  private final Provider<PhysicsAnimationEngine> physicsEngineProvider;

  private final Provider<LoadingExperienceManager> loadingManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private MotionEngine_Factory(Provider<TransitionManager> transitionManagerProvider,
      Provider<PhysicsAnimationEngine> physicsEngineProvider,
      Provider<LoadingExperienceManager> loadingManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.transitionManagerProvider = transitionManagerProvider;
    this.physicsEngineProvider = physicsEngineProvider;
    this.loadingManagerProvider = loadingManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public MotionEngine get() {
    return newInstance(transitionManagerProvider.get(), physicsEngineProvider.get(), loadingManagerProvider.get(), authEventManagerProvider.get());
  }

  public static MotionEngine_Factory create(Provider<TransitionManager> transitionManagerProvider,
      Provider<PhysicsAnimationEngine> physicsEngineProvider,
      Provider<LoadingExperienceManager> loadingManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new MotionEngine_Factory(transitionManagerProvider, physicsEngineProvider, loadingManagerProvider, authEventManagerProvider);
  }

  public static MotionEngine newInstance(TransitionManager transitionManager,
      PhysicsAnimationEngine physicsEngine, LoadingExperienceManager loadingManager,
      IAuthenticationEventManager authEventManager) {
    return new MotionEngine(transitionManager, physicsEngine, loadingManager, authEventManager);
  }
}
