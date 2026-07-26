package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;

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
public final class ContextValidationManager_Factory implements Factory<ContextValidationManager> {
  private final Provider<SchemaValidator> schemaValidatorProvider;

  private final Provider<IntegrityValidator> integrityValidatorProvider;

  private final Provider<ContextRepairEngine> repairEngineProvider;

  private final Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IStudentContextManager> contextManagerProvider;

  private ContextValidationManager_Factory(Provider<SchemaValidator> schemaValidatorProvider,
      Provider<IntegrityValidator> integrityValidatorProvider,
      Provider<ContextRepairEngine> repairEngineProvider,
      Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IStudentContextManager> contextManagerProvider) {
    this.schemaValidatorProvider = schemaValidatorProvider;
    this.integrityValidatorProvider = integrityValidatorProvider;
    this.repairEngineProvider = repairEngineProvider;
    this.readinessEvaluatorProvider = readinessEvaluatorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.contextManagerProvider = contextManagerProvider;
  }

  @Override
  public ContextValidationManager get() {
    return newInstance(schemaValidatorProvider.get(), integrityValidatorProvider.get(), repairEngineProvider.get(), readinessEvaluatorProvider.get(), authEventManagerProvider.get(), contextManagerProvider);
  }

  public static ContextValidationManager_Factory create(
      Provider<SchemaValidator> schemaValidatorProvider,
      Provider<IntegrityValidator> integrityValidatorProvider,
      Provider<ContextRepairEngine> repairEngineProvider,
      Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IStudentContextManager> contextManagerProvider) {
    return new ContextValidationManager_Factory(schemaValidatorProvider, integrityValidatorProvider, repairEngineProvider, readinessEvaluatorProvider, authEventManagerProvider, contextManagerProvider);
  }

  public static ContextValidationManager newInstance(SchemaValidator schemaValidator,
      IntegrityValidator integrityValidator, ContextRepairEngine repairEngine,
      DashboardReadinessEvaluator readinessEvaluator, IAuthenticationEventManager authEventManager,
      javax.inject.Provider<IStudentContextManager> contextManagerProvider) {
    return new ContextValidationManager(schemaValidator, integrityValidator, repairEngine, readinessEvaluator, authEventManager, contextManagerProvider);
  }
}
