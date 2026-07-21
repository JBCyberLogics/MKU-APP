package ke.ac.mku.authcore.contracts.security;

/**
 * ISecurityMonitor - SECURITY-005
 *
 * Main security orchestrator interface for the Authentication Platform.
 * Coordinates all security services and provides unified security monitoring.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H&J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0003H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H&J\b\u0010\u001f\u001a\u00020\u0017H&\u00a8\u0006 \u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ISecurityMonitor;", "", "isInitialized", "", "initialize", "performSecurityScan", "", "Lke/ac/mku/authcore/contracts/security/ThreatReport;", "isPlatformSecure", "evaluateThreat", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "category", "Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "processThreat", "Lke/ac/mku/authcore/contracts/security/Action;", "report", "getActiveIncidents", "Lke/ac/mku/authcore/contracts/security/SecurityIncident;", "getAllIncidents", "limit", "", "resolveIncident", "incidentId", "", "resolution", "getMetrics", "Lke/ac/mku/authcore/contracts/security/SecurityMetrics;", "resetMetrics", "", "areAllModulesReady", "getUnreadyModules", "getPlatformStatus", "app"})
public abstract interface ISecurityMonitor {
    
    /**
     * Check if the security monitor is initialized and ready.
     */
    public abstract boolean isInitialized();
    
    /**
     * Initialize the security monitor and all sub-components.
     * Must be called before any security operations.
     */
    public abstract boolean initialize();
    
    /**
     * Perform a complete security scan of the platform.
     * Scans for all threat categories and returns aggregated report.
     *
     * @return List of detected threats
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.ThreatReport> performSecurityScan();
    
    /**
     * Perform a quick security health check.
     * Does not perform full threat scan.
     *
     * @return true if platform appears secure
     */
    public abstract boolean isPlatformSecure();
    
    /**
     * Evaluate a detected threat and determine its risk level.
     *
     * @param category The threat category
     * @return The evaluated risk level
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.RiskLevel evaluateThreat(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ThreatCategory category);
    
    /**
     * Process a detected threat and take appropriate action.
     *
     * @param report The threat report
     * @return The action taken
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.Action processThreat(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ThreatReport report);
    
    /**
     * Get all active (unresolved) security incidents.
     *
     * @return List of active incidents
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.SecurityIncident> getActiveIncidents();
    
    /**
     * Get all security incidents including resolved ones.
     *
     * @param limit Maximum number to return
     * @return List of incidents
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.SecurityIncident> getAllIncidents(int limit);
    
    /**
     * Resolve a security incident.
     *
     * @param incidentId The incident ID
     * @param resolution The resolution description
     * @return true if resolved successfully
     */
    public abstract boolean resolveIncident(@org.jetbrains.annotations.NotNull()
    java.lang.String incidentId, @org.jetbrains.annotations.NotNull()
    java.lang.String resolution);
    
    /**
     * Get current security metrics.
     *
     * @return SecurityMetrics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.SecurityMetrics getMetrics();
    
    /**
     * Reset security metrics (for testing).
     */
    public abstract void resetMetrics();
    
    /**
     * Check if all security modules are ready.
     *
     * @return true if all modules are initialized
     */
    public abstract boolean areAllModulesReady();
    
    /**
     * Get the list of modules that are not yet ready.
     *
     * @return List of module names that are not ready
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getUnreadyModules();
    
    /**
     * Get the overall platform security status.
     *
     * @return Status string describing platform state
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPlatformStatus();
    
    /**
     * ISecurityMonitor - SECURITY-005
     *
     * Main security orchestrator interface for the Authentication Platform.
     * Coordinates all security services and provides unified security monitoring.
     *
     * Contract Reference: CORE-012, SECURITY-005
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}