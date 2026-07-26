package ke.ac.mku.authcore.auth.transaction;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.bootstrap.PlatformVerifier;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;

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
public final class AuthenticationTransactionManager_Factory implements Factory<AuthenticationTransactionManager> {
  private final Provider<WebFormLoginHandler> webFormLoginHandlerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<PlatformVerifier> platformVerifierProvider;

  private final Provider<IDashboardRenderManager> dashboardRendererProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private AuthenticationTransactionManager_Factory(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<PlatformVerifier> platformVerifierProvider,
      Provider<IDashboardRenderManager> dashboardRendererProvider,
      Provider<EventBus> eventBusProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IPortalConnector> portalConnectorProvider) {
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
  }

  @Override
  public AuthenticationTransactionManager get() {
    return newInstance(webFormLoginHandlerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), sessionValidatorProvider.get(), recoveryManagerProvider.get(), platformVerifierProvider.get(), dashboardRendererProvider.get(), eventBusProvider.get(), authEventManagerProvider.get(), securityMonitorProvider.get(), portalConnectorProvider.get());
  }

  public static AuthenticationTransactionManager_Factory create(
      Provider<WebFormLoginHandler> webFormLoginHandlerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<PlatformVerifier> platformVerifierProvider,
      Provider<IDashboardRenderManager> dashboardRendererProvider,
      Provider<EventBus> eventBusProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<IPortalConnector> portalConnectorProvider) {
    return new AuthenticationTransactionManager_Factory(webFormLoginHandlerProvider, sessionManagerProvider, cookieManagerProvider, sessionValidatorProvider, recoveryManagerProvider, platformVerifierProvider, dashboardRendererProvider, eventBusProvider, authEventManagerProvider, securityMonitorProvider, portalConnectorProvider);
  }

  public static AuthenticationTransactionManager newInstance(
      WebFormLoginHandler webFormLoginHandler, ISessionManager sessionManager,
      ICookieManager cookieManager, ISessionValidator sessionValidator,
      ISessionRecoveryManager recoveryManager, PlatformVerifier platformVerifier,
      IDashboardRenderManager dashboardRenderer, EventBus eventBus,
      IAuthenticationEventManager authEventManager, ISecurityMonitor securityMonitor,
      IPortalConnector portalConnector) {
    return new AuthenticationTransactionManager(webFormLoginHandler, sessionManager, cookieManager, sessionValidator, recoveryManager, platformVerifier, dashboardRenderer, eventBus, authEventManager, securityMonitor, portalConnector);
  }
}
