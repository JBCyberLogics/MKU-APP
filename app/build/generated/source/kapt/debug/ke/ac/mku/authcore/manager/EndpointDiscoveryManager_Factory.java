package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.portal.IPortalSynchronizationManager;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;

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
public final class EndpointDiscoveryManager_Factory implements Factory<EndpointDiscoveryManager> {
  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<IPortalSynchronizationManager> syncManagerProvider;

  private final Provider<ICertificatePinningManager> pinningManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private EndpointDiscoveryManager_Factory(Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalSynchronizationManager> syncManagerProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.portalConnectorProvider = portalConnectorProvider;
    this.syncManagerProvider = syncManagerProvider;
    this.pinningManagerProvider = pinningManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public EndpointDiscoveryManager get() {
    return newInstance(portalConnectorProvider.get(), syncManagerProvider.get(), pinningManagerProvider.get(), authEventManagerProvider.get());
  }

  public static EndpointDiscoveryManager_Factory create(
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalSynchronizationManager> syncManagerProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new EndpointDiscoveryManager_Factory(portalConnectorProvider, syncManagerProvider, pinningManagerProvider, authEventManagerProvider);
  }

  public static EndpointDiscoveryManager newInstance(IPortalConnector portalConnector,
      IPortalSynchronizationManager syncManager, ICertificatePinningManager pinningManager,
      IAuthenticationEventManager authEventManager) {
    return new EndpointDiscoveryManager(portalConnector, syncManager, pinningManager, authEventManager);
  }
}
