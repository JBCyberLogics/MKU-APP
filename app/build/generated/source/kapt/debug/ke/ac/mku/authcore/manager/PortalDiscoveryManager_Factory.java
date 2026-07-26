package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;

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
public final class PortalDiscoveryManager_Factory implements Factory<PortalDiscoveryManager> {
  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<PortalCrawler> crawlerProvider;

  private final Provider<PortalMapBuilder> mapBuilderProvider;

  private final Provider<NavigationScanner> scannerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<IDomAnalysisManager> domAnalysisManagerProvider;

  private PortalDiscoveryManager_Factory(Provider<IPortalConnector> portalConnectorProvider,
      Provider<PortalCrawler> crawlerProvider, Provider<PortalMapBuilder> mapBuilderProvider,
      Provider<NavigationScanner> scannerProvider, Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider) {
    this.portalConnectorProvider = portalConnectorProvider;
    this.crawlerProvider = crawlerProvider;
    this.mapBuilderProvider = mapBuilderProvider;
    this.scannerProvider = scannerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.domAnalysisManagerProvider = domAnalysisManagerProvider;
  }

  @Override
  public PortalDiscoveryManager get() {
    return newInstance(portalConnectorProvider.get(), crawlerProvider.get(), mapBuilderProvider.get(), scannerProvider.get(), sessionManagerProvider.get(), authEventManagerProvider.get(), domAnalysisManagerProvider.get());
  }

  public static PortalDiscoveryManager_Factory create(
      Provider<IPortalConnector> portalConnectorProvider, Provider<PortalCrawler> crawlerProvider,
      Provider<PortalMapBuilder> mapBuilderProvider, Provider<NavigationScanner> scannerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider) {
    return new PortalDiscoveryManager_Factory(portalConnectorProvider, crawlerProvider, mapBuilderProvider, scannerProvider, sessionManagerProvider, authEventManagerProvider, domAnalysisManagerProvider);
  }

  public static PortalDiscoveryManager newInstance(IPortalConnector portalConnector,
      PortalCrawler crawler, PortalMapBuilder mapBuilder, NavigationScanner scanner,
      ISessionManager sessionManager, IAuthenticationEventManager authEventManager,
      IDomAnalysisManager domAnalysisManager) {
    return new PortalDiscoveryManager(portalConnector, crawler, mapBuilder, scanner, sessionManager, authEventManager, domAnalysisManager);
  }
}
