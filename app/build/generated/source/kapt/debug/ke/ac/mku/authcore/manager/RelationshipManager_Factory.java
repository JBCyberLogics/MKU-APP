package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager;

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
public final class RelationshipManager_Factory implements Factory<RelationshipManager> {
  private final Provider<EntityGraphBuilder> graphBuilderProvider;

  private final Provider<RelationshipDiscoveryEngine> discoveryEngineProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IUniversalJsonManager> jsonManagerProvider;

  private RelationshipManager_Factory(Provider<EntityGraphBuilder> graphBuilderProvider,
      Provider<RelationshipDiscoveryEngine> discoveryEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IUniversalJsonManager> jsonManagerProvider) {
    this.graphBuilderProvider = graphBuilderProvider;
    this.discoveryEngineProvider = discoveryEngineProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.jsonManagerProvider = jsonManagerProvider;
  }

  @Override
  public RelationshipManager get() {
    return newInstance(graphBuilderProvider.get(), discoveryEngineProvider.get(), authEventManagerProvider.get(), jsonManagerProvider);
  }

  public static RelationshipManager_Factory create(
      Provider<EntityGraphBuilder> graphBuilderProvider,
      Provider<RelationshipDiscoveryEngine> discoveryEngineProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IUniversalJsonManager> jsonManagerProvider) {
    return new RelationshipManager_Factory(graphBuilderProvider, discoveryEngineProvider, authEventManagerProvider, jsonManagerProvider);
  }

  public static RelationshipManager newInstance(EntityGraphBuilder graphBuilder,
      RelationshipDiscoveryEngine discoveryEngine, IAuthenticationEventManager authEventManager,
      javax.inject.Provider<IUniversalJsonManager> jsonManager) {
    return new RelationshipManager(graphBuilder, discoveryEngine, authEventManager, jsonManager);
  }
}
