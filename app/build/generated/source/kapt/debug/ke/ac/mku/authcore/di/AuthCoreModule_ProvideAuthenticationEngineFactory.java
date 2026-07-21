package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.state.StateRegistry;

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
public final class AuthCoreModule_ProvideAuthenticationEngineFactory implements Factory<IAuthenticationEngine> {
  private final Provider<IAuthNetworkService> authNetworkServiceProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthCoreModule_ProvideAuthenticationEngineFactory(
      Provider<IAuthNetworkService> authNetworkServiceProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<ISessionManager> sessionManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.authNetworkServiceProvider = authNetworkServiceProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public IAuthenticationEngine get() {
    return provideAuthenticationEngine(authNetworkServiceProvider.get(), securityMonitorProvider.get(), sessionManagerProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthCoreModule_ProvideAuthenticationEngineFactory create(
      Provider<IAuthNetworkService> authNetworkServiceProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<ISessionManager> sessionManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthCoreModule_ProvideAuthenticationEngineFactory(authNetworkServiceProvider, securityMonitorProvider, sessionManagerProvider, eventBusProvider, stateRegistryProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static IAuthenticationEngine provideAuthenticationEngine(
      IAuthNetworkService authNetworkService, SecurityMonitor securityMonitor,
      ISessionManager sessionManager, EventBus eventBus, StateRegistry stateRegistry,
      DependencyRegistry dependencyRegistry, IAuthenticationEventManager authEventManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthenticationEngine(authNetworkService, securityMonitor, sessionManager, eventBus, stateRegistry, dependencyRegistry, authEventManager));
  }
}
