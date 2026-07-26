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
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.manager.PriorityEngine;
import ke.ac.mku.authcore.manager.StudentContextBuilder;
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
public final class AuthCoreModule_ProvideStudentContextManagerFactory implements Factory<IStudentContextManager> {
  private final Provider<IKnowledgeGraphManager> graphManagerProvider;

  private final Provider<StudentContextBuilder> contextBuilderProvider;

  private final Provider<PriorityEngine> priorityEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideStudentContextManagerFactory(
      Provider<IKnowledgeGraphManager> graphManagerProvider,
      Provider<StudentContextBuilder> contextBuilderProvider,
      Provider<PriorityEngine> priorityEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.graphManagerProvider = graphManagerProvider;
    this.contextBuilderProvider = contextBuilderProvider;
    this.priorityEngineProvider = priorityEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IStudentContextManager get() {
    return provideStudentContextManager(graphManagerProvider.get(), contextBuilderProvider.get(), priorityEngineProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideStudentContextManagerFactory create(
      Provider<IKnowledgeGraphManager> graphManagerProvider,
      Provider<StudentContextBuilder> contextBuilderProvider,
      Provider<PriorityEngine> priorityEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideStudentContextManagerFactory(graphManagerProvider, contextBuilderProvider, priorityEngineProvider, authEventManagerProvider, registryProvider);
  }

  public static IStudentContextManager provideStudentContextManager(
      IKnowledgeGraphManager graphManager, StudentContextBuilder contextBuilder,
      PriorityEngine priorityEngine, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideStudentContextManager(graphManager, contextBuilder, priorityEngine, authEventManager, registry));
  }
}
