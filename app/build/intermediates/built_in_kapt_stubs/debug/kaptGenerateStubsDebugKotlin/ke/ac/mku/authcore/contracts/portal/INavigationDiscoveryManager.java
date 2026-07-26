package ke.ac.mku.authcore.contracts.portal;

/**
 * INavigationDiscoveryManager - PORTAL-002
 *
 * Interface for the runtime navigation discovery engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/INavigationDiscoveryManager;", "", "startNavigationDiscovery", "", "getNavigationGraph", "Lke/ac/mku/authcore/domain/model/portal/NavigationGraph;", "getNavigationTree", "Lke/ac/mku/authcore/domain/model/portal/NavigationTree;", "isDiscovering", "", "app"})
public abstract interface INavigationDiscoveryManager {
    
    /**
     * Start the navigation discovery process using discovered portal data.
     */
    public abstract void startNavigationDiscovery();
    
    /**
     * Return the current navigation graph.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.NavigationGraph getNavigationGraph();
    
    /**
     * Return the navigation tree hierarchy.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.NavigationTree getNavigationTree();
    
    /**
     * Check if navigation discovery is currently active.
     */
    public abstract boolean isDiscovering();
}