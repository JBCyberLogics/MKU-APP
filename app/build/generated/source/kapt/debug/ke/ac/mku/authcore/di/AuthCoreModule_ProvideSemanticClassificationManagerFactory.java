package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager;
import ke.ac.mku.authcore.manager.ConfidenceEngine;
import ke.ac.mku.authcore.manager.ContextAnalyzer;
import ke.ac.mku.authcore.manager.EntityClassifier;
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
public final class AuthCoreModule_ProvideSemanticClassificationManagerFactory implements Factory<ISemanticClassificationManager> {
  private final Provider<EntityClassifier> classifierProvider;

  private final Provider<ContextAnalyzer> contextAnalyzerProvider;

  private final Provider<ConfidenceEngine> confidenceEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IDomAnalysisManager> domAnalysisProvider;

  private AuthCoreModule_ProvideSemanticClassificationManagerFactory(
      Provider<EntityClassifier> classifierProvider,
      Provider<ContextAnalyzer> contextAnalyzerProvider,
      Provider<ConfidenceEngine> confidenceEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider) {
    this.classifierProvider = classifierProvider;
    this.contextAnalyzerProvider = contextAnalyzerProvider;
    this.confidenceEngineProvider = confidenceEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.domAnalysisProvider = domAnalysisProvider;
  }

  @Override
  public ISemanticClassificationManager get() {
    return provideSemanticClassificationManager(classifierProvider.get(), contextAnalyzerProvider.get(), confidenceEngineProvider.get(), authEventManagerProvider.get(), registryProvider.get(), domAnalysisProvider);
  }

  public static AuthCoreModule_ProvideSemanticClassificationManagerFactory create(
      Provider<EntityClassifier> classifierProvider,
      Provider<ContextAnalyzer> contextAnalyzerProvider,
      Provider<ConfidenceEngine> confidenceEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider) {
    return new AuthCoreModule_ProvideSemanticClassificationManagerFactory(classifierProvider, contextAnalyzerProvider, confidenceEngineProvider, authEventManagerProvider, registryProvider, domAnalysisProvider);
  }

  public static ISemanticClassificationManager provideSemanticClassificationManager(
      EntityClassifier classifier, ContextAnalyzer contextAnalyzer,
      ConfidenceEngine confidenceEngine, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry, javax.inject.Provider<IDomAnalysisManager> domAnalysisProvider) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideSemanticClassificationManager(classifier, contextAnalyzer, confidenceEngine, authEventManager, registry, domAnalysisProvider));
  }
}
