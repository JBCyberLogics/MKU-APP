package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager;

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
public final class StudentContextManager_Factory implements Factory<StudentContextManager> {
  private final Provider<IKnowledgeGraphManager> graphManagerProvider;

  private final Provider<StudentContextBuilder> contextBuilderProvider;

  private final Provider<PriorityEngine> priorityEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private StudentContextManager_Factory(Provider<IKnowledgeGraphManager> graphManagerProvider,
      Provider<StudentContextBuilder> contextBuilderProvider,
      Provider<PriorityEngine> priorityEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.graphManagerProvider = graphManagerProvider;
    this.contextBuilderProvider = contextBuilderProvider;
    this.priorityEngineProvider = priorityEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public StudentContextManager get() {
    return newInstance(graphManagerProvider.get(), contextBuilderProvider.get(), priorityEngineProvider.get(), authEventManagerProvider.get());
  }

  public static StudentContextManager_Factory create(
      Provider<IKnowledgeGraphManager> graphManagerProvider,
      Provider<StudentContextBuilder> contextBuilderProvider,
      Provider<PriorityEngine> priorityEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new StudentContextManager_Factory(graphManagerProvider, contextBuilderProvider, priorityEngineProvider, authEventManagerProvider);
  }

  public static StudentContextManager newInstance(IKnowledgeGraphManager graphManager,
      StudentContextBuilder contextBuilder, PriorityEngine priorityEngine,
      IAuthenticationEventManager authEventManager) {
    return new StudentContextManager(graphManager, contextBuilder, priorityEngine, authEventManager);
  }
}
