package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager;
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager;
import ke.ac.mku.authcore.manager.ui.WidgetEligibilityEngine;
import ke.ac.mku.authcore.manager.ui.WidgetFactory;
import ke.ac.mku.authcore.manager.ui.WidgetPriorityManager;
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
public final class AuthCoreModule_ProvideWidgetRegistryManagerFactory implements Factory<IWidgetRegistryManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<WidgetFactory> factoryProvider;

  private final Provider<WidgetEligibilityEngine> eligibilityEngineProvider;

  private final Provider<WidgetPriorityManager> priorityManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideWidgetRegistryManagerFactory(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<WidgetFactory> factoryProvider,
      Provider<WidgetEligibilityEngine> eligibilityEngineProvider,
      Provider<WidgetPriorityManager> priorityManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.factoryProvider = factoryProvider;
    this.eligibilityEngineProvider = eligibilityEngineProvider;
    this.priorityManagerProvider = priorityManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IWidgetRegistryManager get() {
    return provideWidgetRegistryManager(contextManagerProvider.get(), factoryProvider.get(), eligibilityEngineProvider.get(), priorityManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideWidgetRegistryManagerFactory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<WidgetFactory> factoryProvider,
      Provider<WidgetEligibilityEngine> eligibilityEngineProvider,
      Provider<WidgetPriorityManager> priorityManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideWidgetRegistryManagerFactory(contextManagerProvider, factoryProvider, eligibilityEngineProvider, priorityManagerProvider, authEventManagerProvider, registryProvider);
  }

  public static IWidgetRegistryManager provideWidgetRegistryManager(
      IStudentContextManager contextManager, WidgetFactory factory,
      WidgetEligibilityEngine eligibilityEngine, WidgetPriorityManager priorityManager,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideWidgetRegistryManager(contextManager, factory, eligibilityEngine, priorityManager, authEventManager, registry));
  }
}
