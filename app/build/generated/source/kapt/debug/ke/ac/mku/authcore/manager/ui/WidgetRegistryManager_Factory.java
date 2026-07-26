package ke.ac.mku.authcore.manager.ui;

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
public final class WidgetRegistryManager_Factory implements Factory<WidgetRegistryManager> {
  private final Provider<IStudentContextManager> contextManagerProvider;

  private final Provider<WidgetFactory> factoryProvider;

  private final Provider<WidgetEligibilityEngine> eligibilityEngineProvider;

  private final Provider<WidgetPriorityManager> priorityManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private WidgetRegistryManager_Factory(Provider<IStudentContextManager> contextManagerProvider,
      Provider<WidgetFactory> factoryProvider,
      Provider<WidgetEligibilityEngine> eligibilityEngineProvider,
      Provider<WidgetPriorityManager> priorityManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.contextManagerProvider = contextManagerProvider;
    this.factoryProvider = factoryProvider;
    this.eligibilityEngineProvider = eligibilityEngineProvider;
    this.priorityManagerProvider = priorityManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public WidgetRegistryManager get() {
    return newInstance(contextManagerProvider.get(), factoryProvider.get(), eligibilityEngineProvider.get(), priorityManagerProvider.get(), authEventManagerProvider.get());
  }

  public static WidgetRegistryManager_Factory create(
      Provider<IStudentContextManager> contextManagerProvider,
      Provider<WidgetFactory> factoryProvider,
      Provider<WidgetEligibilityEngine> eligibilityEngineProvider,
      Provider<WidgetPriorityManager> priorityManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new WidgetRegistryManager_Factory(contextManagerProvider, factoryProvider, eligibilityEngineProvider, priorityManagerProvider, authEventManagerProvider);
  }

  public static WidgetRegistryManager newInstance(IStudentContextManager contextManager,
      WidgetFactory factory, WidgetEligibilityEngine eligibilityEngine,
      WidgetPriorityManager priorityManager, IAuthenticationEventManager authEventManager) {
    return new WidgetRegistryManager(contextManager, factory, eligibilityEngine, priorityManager, authEventManager);
  }
}
