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
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.portal.IPortalDataMapper;
import ke.ac.mku.authcore.recovery.RecoveryManager;
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
public final class PortalSynchronizationManager_Factory implements Factory<PortalSynchronizationManager> {
  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<IPortalDataMapper> portalMapperProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<RecoveryManager> recoveryManagerProvider;

  private final Provider<ServiceRegistry> serviceRegistryProvider;

  private PortalSynchronizationManager_Factory(Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalDataMapper> portalMapperProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    this.portalConnectorProvider = portalConnectorProvider;
    this.portalMapperProvider = portalMapperProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.serviceRegistryProvider = serviceRegistryProvider;
  }

  @Override
  public PortalSynchronizationManager get() {
    return newInstance(portalConnectorProvider.get(), portalMapperProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), authEventManagerProvider.get(), recoveryManagerProvider.get(), serviceRegistryProvider.get());
  }

  public static PortalSynchronizationManager_Factory create(
      Provider<IPortalConnector> portalConnectorProvider,
      Provider<IPortalDataMapper> portalMapperProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<RecoveryManager> recoveryManagerProvider,
      Provider<ServiceRegistry> serviceRegistryProvider) {
    return new PortalSynchronizationManager_Factory(portalConnectorProvider, portalMapperProvider, sessionManagerProvider, cookieManagerProvider, authEventManagerProvider, recoveryManagerProvider, serviceRegistryProvider);
  }

  public static PortalSynchronizationManager newInstance(IPortalConnector portalConnector,
      IPortalDataMapper portalMapper, ISessionManager sessionManager, ICookieManager cookieManager,
      IAuthenticationEventManager authEventManager, RecoveryManager recoveryManager,
      ServiceRegistry serviceRegistry) {
    return new PortalSynchronizationManager(portalConnector, portalMapper, sessionManager, cookieManager, authEventManager, recoveryManager, serviceRegistry);
  }
}
