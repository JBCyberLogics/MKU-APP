package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService;
import ke.ac.mku.authcore.contracts.network.INetworkManager;
import ke.ac.mku.authcore.contracts.network.IResponseProcessingManager;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.service.ServiceRegistry;

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
public final class PortalConnector_Factory implements Factory<PortalConnector> {
  private final Provider<INetworkManager> networkManagerProvider;

  private final Provider<IAuthNetworkService> networkServiceProvider;

  private final Provider<IResponseProcessingManager> responseProcessorProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<ICertificatePinningManager> pinningManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private PortalConnector_Factory(Provider<INetworkManager> networkManagerProvider,
      Provider<IAuthNetworkService> networkServiceProvider,
      Provider<IResponseProcessingManager> responseProcessorProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.networkManagerProvider = networkManagerProvider;
    this.networkServiceProvider = networkServiceProvider;
    this.responseProcessorProvider = responseProcessorProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.pinningManagerProvider = pinningManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public PortalConnector get() {
    return newInstance(networkManagerProvider, networkServiceProvider.get(), responseProcessorProvider, sessionManagerProvider.get(), cookieManagerProvider.get(), securityMonitorProvider.get(), pinningManagerProvider.get(), authEventManagerProvider.get(), serviceRegistryProvider.get());
  }

  public static PortalConnector_Factory create(Provider<INetworkManager> networkManagerProvider,
      Provider<IAuthNetworkService> networkServiceProvider,
      Provider<IResponseProcessingManager> responseProcessorProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new PortalConnector_Factory(networkManagerProvider, networkServiceProvider, responseProcessorProvider, sessionManagerProvider, cookieManagerProvider, securityMonitorProvider, pinningManagerProvider, authEventManagerProvider, serviceRegistryProvider);
  }

  public static PortalConnector newInstance(
      javax.inject.Provider<INetworkManager> networkManagerProvider,
      IAuthNetworkService networkService,
      javax.inject.Provider<IResponseProcessingManager> responseProcessorProvider,
      ISessionManager sessionManager, ICookieManager cookieManager,
      ISecurityMonitor securityMonitor, ICertificatePinningManager pinningManager,
      IAuthenticationEventManager authEventManager, ServiceRegistry serviceRegistry) {
    return new PortalConnector(networkManagerProvider, networkService, responseProcessorProvider, sessionManager, cookieManager, securityMonitor, pinningManager, authEventManager, serviceRegistry);
  }
}
