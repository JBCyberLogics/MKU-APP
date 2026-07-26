package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;

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
public final class SemanticClassificationManager_Factory implements Factory<SemanticClassificationManager> {
  private final Provider<EntityClassifier> classifierProvider;

  private final Provider<ContextAnalyzer> contextAnalyzerProvider;

  private final Provider<ConfidenceEngine> confidenceEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IDomAnalysisManager> domAnalysisProvider;

  private SemanticClassificationManager_Factory(Provider<EntityClassifier> classifierProvider,
      Provider<ContextAnalyzer> contextAnalyzerProvider,
      Provider<ConfidenceEngine> confidenceEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider) {
    this.classifierProvider = classifierProvider;
    this.contextAnalyzerProvider = contextAnalyzerProvider;
    this.confidenceEngineProvider = confidenceEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.domAnalysisProvider = domAnalysisProvider;
  }

  @Override
  public SemanticClassificationManager get() {
    return newInstance(classifierProvider.get(), contextAnalyzerProvider.get(), confidenceEngineProvider.get(), authEventManagerProvider.get(), domAnalysisProvider);
  }

  public static SemanticClassificationManager_Factory create(
      Provider<EntityClassifier> classifierProvider,
      Provider<ContextAnalyzer> contextAnalyzerProvider,
      Provider<ConfidenceEngine> confidenceEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisProvider) {
    return new SemanticClassificationManager_Factory(classifierProvider, contextAnalyzerProvider, confidenceEngineProvider, authEventManagerProvider, domAnalysisProvider);
  }

  public static SemanticClassificationManager newInstance(EntityClassifier classifier,
      ContextAnalyzer contextAnalyzer, ConfidenceEngine confidenceEngine,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<IDomAnalysisManager> domAnalysisProvider) {
    return new SemanticClassificationManager(classifier, contextAnalyzer, confidenceEngine, authEventManager, domAnalysisProvider);
  }
}
