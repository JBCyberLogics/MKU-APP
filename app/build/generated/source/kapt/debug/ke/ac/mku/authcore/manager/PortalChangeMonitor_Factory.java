package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.INavigationDiscoveryManager;
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager;
import ke.ac.mku.authcore.contracts.portal.IRequestDiscoveryManager;

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
public final class PortalChangeMonitor_Factory implements Factory<PortalChangeMonitor> {
  private final Provider<IPortalDiscoveryManager> discoveryCoreProvider;

  private final Provider<INavigationDiscoveryManager> navDiscoveryProvider;

  private final Provider<IRequestDiscoveryManager> requestDiscoveryProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private PortalChangeMonitor_Factory(Provider<IPortalDiscoveryManager> discoveryCoreProvider,
      Provider<INavigationDiscoveryManager> navDiscoveryProvider,
      Provider<IRequestDiscoveryManager> requestDiscoveryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.discoveryCoreProvider = discoveryCoreProvider;
    this.navDiscoveryProvider = navDiscoveryProvider;
    this.requestDiscoveryProvider = requestDiscoveryProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public PortalChangeMonitor get() {
    return newInstance(discoveryCoreProvider.get(), navDiscoveryProvider.get(), requestDiscoveryProvider.get(), authEventManagerProvider.get());
  }

  public static PortalChangeMonitor_Factory create(
      Provider<IPortalDiscoveryManager> discoveryCoreProvider,
      Provider<INavigationDiscoveryManager> navDiscoveryProvider,
      Provider<IRequestDiscoveryManager> requestDiscoveryProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new PortalChangeMonitor_Factory(discoveryCoreProvider, navDiscoveryProvider, requestDiscoveryProvider, authEventManagerProvider);
  }

  public static PortalChangeMonitor newInstance(IPortalDiscoveryManager discoveryCore,
      INavigationDiscoveryManager navDiscovery, IRequestDiscoveryManager requestDiscovery,
      IAuthenticationEventManager authEventManager) {
    return new PortalChangeMonitor(discoveryCore, navDiscovery, requestDiscovery, authEventManager);
  }
}
