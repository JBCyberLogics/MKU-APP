package ke.ac.mku.authcore.contracts.portal;

/**
 * IPortalDiscoveryManager - PORTAL-001
 *
 * Interface for the dynamic portal discovery engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalDiscoveryManager;", "", "startDiscovery", "", "getPortalMap", "Lke/ac/mku/authcore/domain/model/portal/PortalMap;", "isDiscoveryComplete", "", "app"})
public abstract interface IPortalDiscoveryManager {
    
    /**
     * Start the portal discovery process.
     */
    public abstract void startDiscovery();
    
    /**
     * Return the current discovered portal map.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.PortalMap getPortalMap();
    
    /**
     * Determine if the discovery process has completed.
     */
    public abstract boolean isDiscoveryComplete();
}