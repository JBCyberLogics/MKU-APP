package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager;

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
public final class KnowledgeGraphManager_Factory implements Factory<KnowledgeGraphManager> {
  private final Provider<GraphDatabase> dbProvider;

  private final Provider<ReasoningEngine> reasoningEngineProvider;

  private final Provider<SemanticQueryEngine> queryEngineProvider;

  private final Provider<IRelationshipManager> relationshipManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private KnowledgeGraphManager_Factory(Provider<GraphDatabase> dbProvider,
      Provider<ReasoningEngine> reasoningEngineProvider,
      Provider<SemanticQueryEngine> queryEngineProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.dbProvider = dbProvider;
    this.reasoningEngineProvider = reasoningEngineProvider;
    this.queryEngineProvider = queryEngineProvider;
    this.relationshipManagerProvider = relationshipManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public KnowledgeGraphManager get() {
    return newInstance(dbProvider.get(), reasoningEngineProvider.get(), queryEngineProvider.get(), relationshipManagerProvider.get(), authEventManagerProvider.get());
  }

  public static KnowledgeGraphManager_Factory create(Provider<GraphDatabase> dbProvider,
      Provider<ReasoningEngine> reasoningEngineProvider,
      Provider<SemanticQueryEngine> queryEngineProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new KnowledgeGraphManager_Factory(dbProvider, reasoningEngineProvider, queryEngineProvider, relationshipManagerProvider, authEventManagerProvider);
  }

  public static KnowledgeGraphManager newInstance(GraphDatabase db, ReasoningEngine reasoningEngine,
      SemanticQueryEngine queryEngine, IRelationshipManager relationshipManager,
      IAuthenticationEventManager authEventManager) {
    return new KnowledgeGraphManager(db, reasoningEngine, queryEngine, relationshipManager, authEventManager);
  }
}
