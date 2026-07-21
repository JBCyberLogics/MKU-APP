package ke.ac.mku.authcore.auth.workflow;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
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
public final class LoginOrchestrator_Factory implements Factory<LoginOrchestrator> {
  private final Provider<IAuthenticationEngine> authenticationEngineProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private LoginOrchestrator_Factory(Provider<IAuthenticationEngine> authenticationEngineProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.authenticationEngineProvider = authenticationEngineProvider;
    this.portalConnectorProvider = portalConnectorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.eventBusProvider = eventBusProvider;
    this.stateRegistryProvider = stateRegistryProvider;
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public LoginOrchestrator get() {
    return newInstance(authenticationEngineProvider.get(), portalConnectorProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static LoginOrchestrator_Factory create(
      Provider<IAuthenticationEngine> authenticationEngineProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new LoginOrchestrator_Factory(authenticationEngineProvider, portalConnectorProvider, sessionManagerProvider, cookieManagerProvider, securityMonitorProvider, eventBusProvider, stateRegistryProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static LoginOrchestrator newInstance(IAuthenticationEngine authenticationEngine,
      IPortalConnector portalConnector, ISessionManager sessionManager,
      ICookieManager cookieManager, SecurityMonitor securityMonitor, EventBus eventBus,
      StateRegistry stateRegistry, DependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager) {
    return new LoginOrchestrator(authenticationEngine, portalConnector, sessionManager, cookieManager, securityMonitor, eventBus, stateRegistry, dependencyRegistry, authEventManager);
  }
}
