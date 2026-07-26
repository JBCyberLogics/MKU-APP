package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager;
import ke.ac.mku.authcore.manager.NavigationScanner;
import ke.ac.mku.authcore.manager.PortalCrawler;
import ke.ac.mku.authcore.manager.PortalMapBuilder;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvidePortalDiscoveryManagerFactory implements Factory<IPortalDiscoveryManager> {
  private final Provider<IPortalConnector> portalConnectorProvider;

  private final Provider<PortalCrawler> crawlerProvider;

  private final Provider<PortalMapBuilder> mapBuilderProvider;

  private final Provider<NavigationScanner> scannerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private final Provider<IDomAnalysisManager> domAnalysisManagerProvider;

  private AuthCoreModule_ProvidePortalDiscoveryManagerFactory(
      Provider<IPortalConnector> portalConnectorProvider, Provider<PortalCrawler> crawlerProvider,
      Provider<PortalMapBuilder> mapBuilderProvider, Provider<NavigationScanner> scannerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider) {
    this.portalConnectorProvider = portalConnectorProvider;
    this.crawlerProvider = crawlerProvider;
    this.mapBuilderProvider = mapBuilderProvider;
    this.scannerProvider = scannerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
    this.domAnalysisManagerProvider = domAnalysisManagerProvider;
  }

  @Override
  public IPortalDiscoveryManager get() {
    return providePortalDiscoveryManager(portalConnectorProvider.get(), crawlerProvider.get(), mapBuilderProvider.get(), scannerProvider.get(), sessionManagerProvider.get(), authEventManagerProvider.get(), registryProvider.get(), domAnalysisManagerProvider.get());
  }

  public static AuthCoreModule_ProvidePortalDiscoveryManagerFactory create(
      Provider<IPortalConnector> portalConnectorProvider, Provider<PortalCrawler> crawlerProvider,
      Provider<PortalMapBuilder> mapBuilderProvider, Provider<NavigationScanner> scannerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider,
      Provider<IDomAnalysisManager> domAnalysisManagerProvider) {
    return new AuthCoreModule_ProvidePortalDiscoveryManagerFactory(portalConnectorProvider, crawlerProvider, mapBuilderProvider, scannerProvider, sessionManagerProvider, authEventManagerProvider, registryProvider, domAnalysisManagerProvider);
  }

  public static IPortalDiscoveryManager providePortalDiscoveryManager(
      IPortalConnector portalConnector, PortalCrawler crawler, PortalMapBuilder mapBuilder,
      NavigationScanner scanner, ISessionManager sessionManager,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry,
      IDomAnalysisManager domAnalysisManager) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.providePortalDiscoveryManager(portalConnector, crawler, mapBuilder, scanner, sessionManager, authEventManager, registry, domAnalysisManager));
  }
}
