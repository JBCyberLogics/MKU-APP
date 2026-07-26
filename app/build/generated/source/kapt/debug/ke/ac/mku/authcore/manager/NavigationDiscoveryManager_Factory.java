package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager;

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
public final class NavigationDiscoveryManager_Factory implements Factory<NavigationDiscoveryManager> {
  private final Provider<IPortalDiscoveryManager> portalDiscoveryCoreProvider;

  private final Provider<MenuScanner> menuScannerProvider;

  private final Provider<SidebarAnalyzer> sidebarAnalyzerProvider;

  private final Provider<NavigationGraphBuilder> graphBuilderProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private NavigationDiscoveryManager_Factory(
      Provider<IPortalDiscoveryManager> portalDiscoveryCoreProvider,
      Provider<MenuScanner> menuScannerProvider, Provider<SidebarAnalyzer> sidebarAnalyzerProvider,
      Provider<NavigationGraphBuilder> graphBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.portalDiscoveryCoreProvider = portalDiscoveryCoreProvider;
    this.menuScannerProvider = menuScannerProvider;
    this.sidebarAnalyzerProvider = sidebarAnalyzerProvider;
    this.graphBuilderProvider = graphBuilderProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public NavigationDiscoveryManager get() {
    return newInstance(portalDiscoveryCoreProvider.get(), menuScannerProvider.get(), sidebarAnalyzerProvider.get(), graphBuilderProvider.get(), authEventManagerProvider.get());
  }

  public static NavigationDiscoveryManager_Factory create(
      Provider<IPortalDiscoveryManager> portalDiscoveryCoreProvider,
      Provider<MenuScanner> menuScannerProvider, Provider<SidebarAnalyzer> sidebarAnalyzerProvider,
      Provider<NavigationGraphBuilder> graphBuilderProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new NavigationDiscoveryManager_Factory(portalDiscoveryCoreProvider, menuScannerProvider, sidebarAnalyzerProvider, graphBuilderProvider, authEventManagerProvider);
  }

  public static NavigationDiscoveryManager newInstance(IPortalDiscoveryManager portalDiscoveryCore,
      MenuScanner menuScanner, SidebarAnalyzer sidebarAnalyzer, NavigationGraphBuilder graphBuilder,
      IAuthenticationEventManager authEventManager) {
    return new NavigationDiscoveryManager(portalDiscoveryCore, menuScanner, sidebarAnalyzer, graphBuilder, authEventManager);
  }
}
