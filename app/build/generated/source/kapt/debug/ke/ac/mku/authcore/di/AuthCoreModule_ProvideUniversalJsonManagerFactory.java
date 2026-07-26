package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager;
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager;
import ke.ac.mku.authcore.manager.DatasetComposer;
import ke.ac.mku.authcore.manager.EntitySerializer;
import ke.ac.mku.authcore.manager.JsonCacheManager;
import ke.ac.mku.authcore.manager.JsonSchemaBuilder;
import ke.ac.mku.authcore.manager.JsonValidator;
import ke.ac.mku.authcore.manager.MetadataGenerator;
import ke.ac.mku.authcore.manager.RelationshipSerializer;
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
public final class AuthCoreModule_ProvideUniversalJsonManagerFactory implements Factory<IUniversalJsonManager> {
  private final Provider<JsonSchemaBuilder> schemaBuilderProvider;

  private final Provider<EntitySerializer> entitySerializerProvider;

  private final Provider<DatasetComposer> datasetComposerProvider;

  private final Provider<RelationshipSerializer> relSerializerProvider;

  private final Provider<MetadataGenerator> metadataGeneratorProvider;

  private final Provider<JsonValidator> validatorProvider;

  private final Provider<JsonCacheManager> cacheManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<ISemanticClassificationManager> classificationManagerProvider;

  private AuthCoreModule_ProvideUniversalJsonManagerFactory(
      Provider<JsonSchemaBuilder> schemaBuilderProvider,
      Provider<EntitySerializer> entitySerializerProvider,
      Provider<DatasetComposer> datasetComposerProvider,
      Provider<RelationshipSerializer> relSerializerProvider,
      Provider<MetadataGenerator> metadataGeneratorProvider,
      Provider<JsonValidator> validatorProvider, Provider<JsonCacheManager> cacheManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<ISemanticClassificationManager> classificationManagerProvider) {
    this.schemaBuilderProvider = schemaBuilderProvider;
    this.entitySerializerProvider = entitySerializerProvider;
    this.datasetComposerProvider = datasetComposerProvider;
    this.relSerializerProvider = relSerializerProvider;
    this.metadataGeneratorProvider = metadataGeneratorProvider;
    this.validatorProvider = validatorProvider;
    this.cacheManagerProvider = cacheManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.classificationManagerProvider = classificationManagerProvider;
  }

  @Override
  public IUniversalJsonManager get() {
    return provideUniversalJsonManager(schemaBuilderProvider.get(), entitySerializerProvider.get(), datasetComposerProvider.get(), relSerializerProvider.get(), metadataGeneratorProvider.get(), validatorProvider.get(), cacheManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get(), classificationManagerProvider);
  }

  public static AuthCoreModule_ProvideUniversalJsonManagerFactory create(
      Provider<JsonSchemaBuilder> schemaBuilderProvider,
      Provider<EntitySerializer> entitySerializerProvider,
      Provider<DatasetComposer> datasetComposerProvider,
      Provider<RelationshipSerializer> relSerializerProvider,
      Provider<MetadataGenerator> metadataGeneratorProvider,
      Provider<JsonValidator> validatorProvider, Provider<JsonCacheManager> cacheManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<ISemanticClassificationManager> classificationManagerProvider) {
    return new AuthCoreModule_ProvideUniversalJsonManagerFactory(schemaBuilderProvider, entitySerializerProvider, datasetComposerProvider, relSerializerProvider, metadataGeneratorProvider, validatorProvider, cacheManagerProvider, authEventManagerProvider, registryProvider, classificationManagerProvider);
  }

  public static IUniversalJsonManager provideUniversalJsonManager(JsonSchemaBuilder schemaBuilder,
      EntitySerializer entitySerializer, DatasetComposer datasetComposer,
      RelationshipSerializer relSerializer, MetadataGenerator metadataGenerator,
      JsonValidator validator, JsonCacheManager cacheManager,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry,
      javax.inject.Provider<ISemanticClassificationManager> classificationManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideUniversalJsonManager(schemaBuilder, entitySerializer, datasetComposer, relSerializer, metadataGenerator, validator, cacheManager, authEventManager, registry, classificationManager));
  }
}
