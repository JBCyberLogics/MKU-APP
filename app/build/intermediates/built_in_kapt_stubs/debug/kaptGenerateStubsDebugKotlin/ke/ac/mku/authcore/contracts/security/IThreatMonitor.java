package ke.ac.mku.authcore.contracts.security;

/**
 * IThreatMonitor - SECURITY-005
 *
 * Threat detection and monitoring interface.
 * Coordinates with ThreatDetector and provides continuous monitoring.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0011H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\rH&\u00a8\u0006\u0018\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/security/IThreatMonitor;", "", "scanForThreats", "", "Lke/ac/mku/authcore/contracts/security/ThreatReport;", "isThreatPresent", "", "category", "Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "getLastScanResults", "getLastScanTime", "", "startMonitoring", "", "stopMonitoring", "isMonitoring", "getMonitoringInterval", "", "setMonitoringInterval", "intervalSeconds", "getActiveThreatCount", "getHighestActiveThreatLevel", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "clearThreatCache", "app"})
public abstract interface IThreatMonitor {
    
    /**
     * Scan for all known threats.
     *
     * @return List of detected threats
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.ThreatReport> scanForThreats();
    
    /**
     * Quick scan for a specific threat category.
     *
     * @param category The threat category to check
     * @return true if threat is present
     */
    public abstract boolean isThreatPresent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ThreatCategory category);
    
    /**
     * Get the results of the last scan.
     *
     * @return Last scan results or empty list
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.ThreatReport> getLastScanResults();
    
    /**
     * Get the time of the last scan.
     *
     * @return Timestamp of last scan, or 0 if never scanned
     */
    public abstract long getLastScanTime();
    
    /**
     * Start continuous threat monitoring.
     */
    public abstract void startMonitoring();
    
    /**
     * Stop continuous threat monitoring.
     */
    public abstract void stopMonitoring();
    
    /**
     * Check if monitoring is active.
     *
     * @return true if monitoring is running
     */
    public abstract boolean isMonitoring();
    
    /**
     * Get the monitoring interval in seconds.
     *
     * @return Interval in seconds
     */
    public abstract int getMonitoringInterval();
    
    /**
     * Set the monitoring interval.
     *
     * @param intervalSeconds Interval between scans
     */
    public abstract void setMonitoringInterval(int intervalSeconds);
    
    /**
     * Get count of currently detected threats.
     *
     * @return Number of active threats
     */
    public abstract int getActiveThreatCount();
    
    /**
     * Get the highest risk level of active threats.
     *
     * @return Highest risk level, or null if no threats
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.security.RiskLevel getHighestActiveThreatLevel();
    
    /**
     * Clear all cached threat results.
     */
    public abstract void clearThreatCache();
}