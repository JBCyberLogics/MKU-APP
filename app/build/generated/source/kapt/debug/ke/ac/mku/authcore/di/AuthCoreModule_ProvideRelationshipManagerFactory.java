package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager;
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager;
import ke.ac.mku.authcore.manager.EntityGraphBuilder;
import ke.ac.mku.authcore.manager.RelationshipDiscoveryEngine;
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
public final class AuthCoreModule_ProvideRelationshipManagerFactory implements Factory<IRelationshipManager> {
  private final Provider<EntityGraphBuilder> graphBuilderProvider;

  private final Provider<RelationshipDiscoveryEngine> discoveryEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IUniversalJsonManager> jsonManagerProvider;

  private AuthCoreModule_ProvideRelationshipManagerFactory(
      Provider<EntityGraphBuilder> graphBuilderProvider,
      Provider<RelationshipDiscoveryEngine> discoveryEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IUniversalJsonManager> jsonManagerProvider) {
    this.graphBuilderProvider = graphBuilderProvider;
    this.discoveryEngineProvider = discoveryEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.jsonManagerProvider = jsonManagerProvider;
  }

  @Override
  public IRelationshipManager get() {
    return provideRelationshipManager(graphBuilderProvider.get(), discoveryEngineProvider.get(), authEventManagerProvider.get(), registryProvider.get(), jsonManagerProvider);
  }

  public static AuthCoreModule_ProvideRelationshipManagerFactory create(
      Provider<EntityGraphBuilder> graphBuilderProvider,
      Provider<RelationshipDiscoveryEngine> discoveryEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IUniversalJsonManager> jsonManagerProvider) {
    return new AuthCoreModule_ProvideRelationshipManagerFactory(graphBuilderProvider, discoveryEngineProvider, authEventManagerProvider, registryProvider, jsonManagerProvider);
  }

  public static IRelationshipManager provideRelationshipManager(EntityGraphBuilder graphBuilder,
      RelationshipDiscoveryEngine discoveryEngine, IAuthenticationEventManager authEventManager,
      DependencyRegistry registry, javax.inject.Provider<IUniversalJsonManager> jsonManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideRelationshipManager(graphBuilder, discoveryEngine, authEventManager, registry, jsonManager));
  }
}
