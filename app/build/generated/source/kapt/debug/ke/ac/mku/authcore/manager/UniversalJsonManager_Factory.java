package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager;

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
public final class UniversalJsonManager_Factory implements Factory<UniversalJsonManager> {
  private final Provider<JsonSchemaBuilder> schemaBuilderProvider;

  private final Provider<EntitySerializer> entitySerializerProvider;

  private final Provider<DatasetComposer> datasetComposerProvider;

  private final Provider<RelationshipSerializer> relSerializerProvider;

  private final Provider<MetadataGenerator> metadataGeneratorProvider;

  private final Provider<JsonValidator> validatorProvider;

  private final Provider<JsonCacheManager> cacheManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ISemanticClassificationManager> classificationManagerProvider;

  private UniversalJsonManager_Factory(Provider<JsonSchemaBuilder> schemaBuilderProvider,
      Provider<EntitySerializer> entitySerializerProvider,
      Provider<DatasetComposer> datasetComposerProvider,
      Provider<RelationshipSerializer> relSerializerProvider,
      Provider<MetadataGenerator> metadataGeneratorProvider,
      Provider<JsonValidator> validatorProvider, Provider<JsonCacheManager> cacheManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISemanticClassificationManager> classificationManagerProvider) {
    this.schemaBuilderProvider = schemaBuilderProvider;
    this.entitySerializerProvider = entitySerializerProvider;
    this.datasetComposerProvider = datasetComposerProvider;
    this.relSerializerProvider = relSerializerProvider;
    this.metadataGeneratorProvider = metadataGeneratorProvider;
    this.validatorProvider = validatorProvider;
    this.cacheManagerProvider = cacheManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.classificationManagerProvider = classificationManagerProvider;
  }

  @Override
  public UniversalJsonManager get() {
    return newInstance(schemaBuilderProvider.get(), entitySerializerProvider.get(), datasetComposerProvider.get(), relSerializerProvider.get(), metadataGeneratorProvider.get(), validatorProvider.get(), cacheManagerProvider.get(), authEventManagerProvider.get(), classificationManagerProvider);
  }

  public static UniversalJsonManager_Factory create(
      Provider<JsonSchemaBuilder> schemaBuilderProvider,
      Provider<EntitySerializer> entitySerializerProvider,
      Provider<DatasetComposer> datasetComposerProvider,
      Provider<RelationshipSerializer> relSerializerProvider,
      Provider<MetadataGenerator> metadataGeneratorProvider,
      Provider<JsonValidator> validatorProvider, Provider<JsonCacheManager> cacheManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISemanticClassificationManager> classificationManagerProvider) {
    return new UniversalJsonManager_Factory(schemaBuilderProvider, entitySerializerProvider, datasetComposerProvider, relSerializerProvider, metadataGeneratorProvider, validatorProvider, cacheManagerProvider, authEventManagerProvider, classificationManagerProvider);
  }

  public static UniversalJsonManager newInstance(JsonSchemaBuilder schemaBuilder,
      EntitySerializer entitySerializer, DatasetComposer datasetComposer,
      RelationshipSerializer relSerializer, MetadataGenerator metadataGenerator,
      JsonValidator validator, JsonCacheManager cacheManager,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<ISemanticClassificationManager> classificationManager) {
    return new UniversalJsonManager(schemaBuilder, entitySerializer, datasetComposer, relSerializer, metadataGenerator, validator, cacheManager, authEventManager, classificationManager);
  }
}
