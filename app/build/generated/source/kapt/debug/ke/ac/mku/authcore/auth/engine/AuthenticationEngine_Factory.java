package ke.ac.mku.authcore.auth.engine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService;
import ke.ac.mku.authcore.manager.SessionManager;
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
public final class AuthenticationEngine_Factory implements Factory<AuthenticationEngine> {
  private final Provider<IAuthNetworkService> networkServiceProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthenticationEngine_Factory(Provider<IAuthNetworkService> networkServiceProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.networkServiceProvider = networkServiceProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public AuthenticationEngine get() {
    return newInstance(networkServiceProvider.get(), securityMonitorProvider.get(), sessionManagerProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthenticationEngine_Factory create(
      Provider<IAuthNetworkService> networkServiceProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<SessionManager> sessionManagerProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthenticationEngine_Factory(networkServiceProvider, securityMonitorProvider, sessionManagerProvider, eventBusProvider, stateRegistryProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static AuthenticationEngine newInstance(IAuthNetworkService networkService,
      SecurityMonitor securityMonitor, SessionManager sessionManager, EventBus eventBus,
      StateRegistry stateRegistry, DependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager) {
    return new AuthenticationEngine(networkService, securityMonitor, sessionManager, eventBus, stateRegistry, dependencyRegistry, authEventManager);
  }
}
