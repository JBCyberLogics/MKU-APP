package ke.ac.mku.authcore.contracts.portal;

/**
 * IRequestDiscoveryManager - PORTAL-004
 *
 * Interface for the automated request discovery and analysis engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IRequestDiscoveryManager;", "", "startMonitoring", "", "stopMonitoring", "getRequestRegistry", "Lke/ac/mku/authcore/domain/model/portal/RequestRegistry;", "getDiscoveredEndpoints", "", "Lke/ac/mku/authcore/domain/model/portal/DiscoveredEndpoint;", "isRequestDiscovered", "", "fingerprint", "", "app"})
public abstract interface IRequestDiscoveryManager {
    
    /**
     * Start monitoring and analyzing authenticated traffic.
     */
    public abstract void startMonitoring();
    
    /**
     * Stop the discovery engine.
     */
    public abstract void stopMonitoring();
    
    /**
     * Return the complete runtime request registry.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.RequestRegistry getRequestRegistry();
    
    /**
     * Return all discovered endpoints.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> getDiscoveredEndpoints();
    
    /**
     * Check if a specific request has already been discovered and cataloged.
     */
    public abstract boolean isRequestDiscovered(@org.jetbrains.annotations.NotNull()
    java.lang.String fingerprint);
}