package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IContextValidationManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.manager.ContextRepairEngine;
import ke.ac.mku.authcore.manager.DashboardReadinessEvaluator;
import ke.ac.mku.authcore.manager.IntegrityValidator;
import ke.ac.mku.authcore.manager.SchemaValidator;
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
public final class AuthCoreModule_ProvideContextValidationManagerFactory implements Factory<IContextValidationManager> {
  private final Provider<SchemaValidator> schemaValidatorProvider;

  private final Provider<IntegrityValidator> integrityValidatorProvider;

  private final Provider<ContextRepairEngine> repairEngineProvider;

  private final Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IStudentContextManager> contextManagerProvider;

  private AuthCoreModule_ProvideContextValidationManagerFactory(
      Provider<SchemaValidator> schemaValidatorProvider,
      Provider<IntegrityValidator> integrityValidatorProvider,
      Provider<ContextRepairEngine> repairEngineProvider,
      Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IStudentContextManager> contextManagerProvider) {
    this.schemaValidatorProvider = schemaValidatorProvider;
    this.integrityValidatorProvider = integrityValidatorProvider;
    this.repairEngineProvider = repairEngineProvider;
    this.readinessEvaluatorProvider = readinessEvaluatorProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.contextManagerProvider = contextManagerProvider;
  }

  @Override
  public IContextValidationManager get() {
    return provideContextValidationManager(schemaValidatorProvider.get(), integrityValidatorProvider.get(), repairEngineProvider.get(), readinessEvaluatorProvider.get(), authEventManagerProvider.get(), registryProvider.get(), contextManagerProvider);
  }

  public static AuthCoreModule_ProvideContextValidationManagerFactory create(
      Provider<SchemaValidator> schemaValidatorProvider,
      Provider<IntegrityValidator> integrityValidatorProvider,
      Provider<ContextRepairEngine> repairEngineProvider,
      Provider<DashboardReadinessEvaluator> readinessEvaluatorProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IStudentContextManager> contextManagerProvider) {
    return new AuthCoreModule_ProvideContextValidationManagerFactory(schemaValidatorProvider, integrityValidatorProvider, repairEngineProvider, readinessEvaluatorProvider, authEventManagerProvider, registryProvider, contextManagerProvider);
  }

  public static IContextValidationManager provideContextValidationManager(
      SchemaValidator schemaValidator, IntegrityValidator integrityValidator,
      ContextRepairEngine repairEngine, DashboardReadinessEvaluator readinessEvaluator,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry,
      javax.inject.Provider<IStudentContextManager> contextManagerProvider) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideContextValidationManager(schemaValidator, integrityValidator, repairEngine, readinessEvaluator, authEventManager, registry, contextManagerProvider));
  }
}
