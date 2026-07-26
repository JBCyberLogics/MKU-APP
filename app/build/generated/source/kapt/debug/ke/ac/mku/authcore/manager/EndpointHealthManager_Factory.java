package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.endpoint.IEndpointDiscoveryManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.recovery.RecoveryManager;

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
public final class EndpointHealthManager_Factory implements Factory<EndpointHealthManager> {
  private final Provider<IEndpointDiscoveryManager> discoveryManagerProvider;

  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<ICertificatePinningManager> pinningManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private EndpointHealthManager_Factory(
      Provider<IEndpointDiscoveryManager> discoveryManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.discoveryManagerProvider = discoveryManagerProvider;
    this.portalConnectorProvider = portalConnectorProvider;
    this.pinningManagerProvider = pinningManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public EndpointHealthManager get() {
    return newInstance(discoveryManagerProvider.get(), portalConnectorProvider.get(), pinningManagerProvider.get(), securityMonitorProvider.get(), recoveryManagerProvider.get(), authEventManagerProvider.get());
  }

  public static EndpointHealthManager_Factory create(
      Provider<IEndpointDiscoveryManager> discoveryManagerProvider,
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new EndpointHealthManager_Factory(discoveryManagerProvider, portalConnectorProvider, pinningManagerProvider, securityMonitorProvider, recoveryManagerProvider, authEventManagerProvider);
  }

  public static EndpointHealthManager newInstance(IEndpointDiscoveryManager discoveryManager,
      IPortalConnector portalConnector, ICertificatePinningManager pinningManager,
      ISecurityMonitor securityMonitor, RecoveryManager recoveryManager,
      IAuthenticationEventManager authEventManager) {
    return new EndpointHealthManager(discoveryManager, portalConnector, pinningManager, securityMonitor, recoveryManager, authEventManager);
  }
}
