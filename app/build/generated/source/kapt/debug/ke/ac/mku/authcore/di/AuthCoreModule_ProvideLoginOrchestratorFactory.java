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
import ke.ac.mku.authcore.contracts.authentication.ILoginOrchestrator;
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
public final class AuthCoreModule_ProvideLoginOrchestratorFactory implements Factory<ILoginOrchestrator> {
  private final Provider<IAuthenticationEngine> authenticationEngineProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<StateRegistry> stateRegistryProvider;

  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private AuthCoreModule_ProvideLoginOrchestratorFactory(
      Provider<IAuthenticationEngine> authenticationEngineProvider,
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
  public ILoginOrchestrator get() {
    return provideLoginOrchestrator(authenticationEngineProvider.get(), portalConnectorProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), securityMonitorProvider.get(), eventBusProvider.get(), stateRegistryProvider.get(), dependencyRegistryProvider.get(), authEventManagerProvider.get());
  }

  public static AuthCoreModule_ProvideLoginOrchestratorFactory create(
      Provider<IAuthenticationEngine> authenticationEngineProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider, Provider<EventBus> eventBusProvider,
      Provider<StateRegistry> stateRegistryProvider,
      Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new AuthCoreModule_ProvideLoginOrchestratorFactory(authenticationEngineProvider, portalConnectorProvider, sessionManagerProvider, cookieManagerProvider, securityMonitorProvider, eventBusProvider, stateRegistryProvider, dependencyRegistryProvider, authEventManagerProvider);
  }

  public static ILoginOrchestrator provideLoginOrchestrator(
      IAuthenticationEngine authenticationEngine, IPortalConnector portalConnector,
      ISessionManager sessionManager, ICookieManager cookieManager, SecurityMonitor securityMonitor,
      EventBus eventBus, StateRegistry stateRegistry, DependencyRegistry dependencyRegistry,
      IAuthenticationEventManager authEventManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideLoginOrchestrator(authenticationEngine, portalConnector, sessionManager, cookieManager, securityMonitor, eventBus, stateRegistry, dependencyRegistry, authEventManager));
  }
}
