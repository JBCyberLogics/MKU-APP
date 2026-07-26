package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager;
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager;
import ke.ac.mku.authcore.manager.GraphDatabase;
import ke.ac.mku.authcore.manager.ReasoningEngine;
import ke.ac.mku.authcore.manager.SemanticQueryEngine;
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
public final class AuthCoreModule_ProvideKnowledgeGraphManagerFactory implements Factory<IKnowledgeGraphManager> {
  private final Provider<GraphDatabase> dbProvider;

  private final Provider<ReasoningEngine> reasoningEngineProvider;

  private final Provider<SemanticQueryEngine> queryEngineProvider;

  private final Provider<IRelationshipManager> relationshipManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideKnowledgeGraphManagerFactory(Provider<GraphDatabase> dbProvider,
      Provider<ReasoningEngine> reasoningEngineProvider,
      Provider<SemanticQueryEngine> queryEngineProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.dbProvider = dbProvider;
    this.reasoningEngineProvider = reasoningEngineProvider;
    this.queryEngineProvider = queryEngineProvider;
    this.relationshipManagerProvider = relationshipManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IKnowledgeGraphManager get() {
    return provideKnowledgeGraphManager(dbProvider.get(), reasoningEngineProvider.get(), queryEngineProvider.get(), relationshipManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideKnowledgeGraphManagerFactory create(
      Provider<GraphDatabase> dbProvider, Provider<ReasoningEngine> reasoningEngineProvider,
      Provider<SemanticQueryEngine> queryEngineProvider,
      Provider<IRelationshipManager> relationshipManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideKnowledgeGraphManagerFactory(dbProvider, reasoningEngineProvider, queryEngineProvider, relationshipManagerProvider, authEventManagerProvider, registryProvider);
  }

  public static IKnowledgeGraphManager provideKnowledgeGraphManager(GraphDatabase db,
      ReasoningEngine reasoningEngine, SemanticQueryEngine queryEngine,
      IRelationshipManager relationshipManager, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideKnowledgeGraphManager(db, reasoningEngine, queryEngine, relationshipManager, authEventManager, registry));
  }
}
