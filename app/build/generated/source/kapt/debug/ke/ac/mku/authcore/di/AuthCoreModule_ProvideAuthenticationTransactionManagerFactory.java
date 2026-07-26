package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.bootstrap.PlatformVerifier;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;

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
public final class AuthCoreModule_ProvideAuthenticationTransactionManagerFactory implements Factory<AuthenticationTransactionManager> {
  private final Provider<WebFormLoginHandler> webFormLoginHandlerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<PlatformVerifier> platformVerifierProvider;

  private final Provider<IDashboardRenderManager> dashboardRendererProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<SecurityMonitor> securityMonitorProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideAuthenticationTransactionManagerFactory(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<PlatformVerifier> platformVerifierProvider,
      Provider<IDashboardRenderManager> dashboardRendererProvider,
      Provider<EventBus> eventBusProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.webFormLoginHandlerProvider = webFormLoginHandlerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.platformVerifierProvider = platformVerifierProvider;
    this.dashboardRendererProvider = dashboardRendererProvider;
    this.eventBusProvider = eventBusProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.portalConnectorProvider = portalConnectorProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public AuthenticationTransactionManager get() {
    return provideAuthenticationTransactionManager(webFormLoginHandlerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), platformVerifierProvider.get(), dashboardRendererProvider.get(), eventBusProvider.get(), authEventManagerProvider.get(), securityMonitorProvider.get(), portalConnectorProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideAuthenticationTransactionManagerFactory create(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<PlatformVerifier> platformVerifierProvider,
      Provider<IDashboardRenderManager> dashboardRendererProvider,
      Provider<EventBus> eventBusProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<SecurityMonitor> securityMonitorProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideAuthenticationTransactionManagerFactory(webFormLoginHandlerProvider, sessionManagerProvider, cookieManagerProvider, sessionValidatorProvider, recoveryManagerProvider, platformVerifierProvider, dashboardRendererProvider, eventBusProvider, authEventManagerProvider, securityMonitorProvider, portalConnectorProvider, registryProvider);
  }

  public static AuthenticationTransactionManager provideAuthenticationTransactionManager(
      WebFormLoginHandler webFormLoginHandler, ISessionManager sessionManager,
      ICookieManager cookieManager, ISessionValidator sessionValidator,
      ISessionRecoveryManager recoveryManager, PlatformVerifier platformVerifier,
      IDashboardRenderManager dashboardRenderer, EventBus eventBus,
      IAuthenticationEventManager authEventManager, SecurityMonitor securityMonitor,
      IPortalConnector portalConnector, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthenticationTransactionManager(webFormLoginHandler, sessionManager, cookieManager, sessionValidator, recoveryManager, platformVerifier, dashboardRenderer, eventBus, authEventManager, securityMonitor, portalConnector, registry));
  }
}
