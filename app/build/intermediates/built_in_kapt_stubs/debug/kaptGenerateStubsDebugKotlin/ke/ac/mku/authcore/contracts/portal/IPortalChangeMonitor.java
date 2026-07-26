package ke.ac.mku.authcore.contracts.portal;

/**
 * IPortalChangeMonitor - PORTAL-005
 *
 * Interface for the continuous portal evolution detection engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalChangeMonitor;", "", "startMonitoring", "", "stopMonitoring", "performFullComparison", "Lke/ac/mku/authcore/domain/model/portal/ChangeReport;", "getCompatibilityReport", "Lke/ac/mku/authcore/domain/model/portal/CompatibilityReport;", "triggerRediscovery", "getPortalVersion", "", "app"})
public abstract interface IPortalChangeMonitor {
    
    /**
     * Start continuous monitoring of the portal.
     */
    public abstract void startMonitoring();
    
    /**
     * Stop the change monitor engine.
     */
    public abstract void stopMonitoring();
    
    /**
     * Perform an immediate comparison of the current portal state against the last snapshot.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.ChangeReport performFullComparison();
    
    /**
     * Get the latest compatibility report.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.CompatibilityReport getCompatibilityReport();
    
    /**
     * Trigger an automated rediscovery if major changes are detected.
     */
    public abstract void triggerRediscovery();
    
    /**
     * Get the current detected portal version.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPortalVersion();
}