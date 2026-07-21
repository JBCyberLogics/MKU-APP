package ke.ac.mku.authcore.contracts.security

/**
 * IThreatMonitor - SECURITY-005
 *
 * Threat detection and monitoring interface.
 * Coordinates with ThreatDetector and provides continuous monitoring.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
interface IThreatMonitor {

    // ==================== SCANNING ====================

    /**
     * Scan for all known threats.
     *
     * @return List of detected threats
     */
    fun scanForThreats(): List<ThreatReport>

    /**
     * Quick scan for a specific threat category.
     *
     * @param category The threat category to check
     * @return true if threat is present
     */
    fun isThreatPresent(category: ThreatCategory): Boolean

    /**
     * Get the results of the last scan.
     *
     * @return Last scan results or empty list
     */
    fun getLastScanResults(): List<ThreatReport>

    /**
     * Get the time of the last scan.
     *
     * @return Timestamp of last scan, or 0 if never scanned
     */
    fun getLastScanTime(): Long

    // ==================== CONTINUOUS MONITORING ====================

    /**
     * Start continuous threat monitoring.
     */
    fun startMonitoring()

    /**
     * Stop continuous threat monitoring.
     */
    fun stopMonitoring()

    /**
     * Check if monitoring is active.
     *
     * @return true if monitoring is running
     */
    fun isMonitoring(): Boolean

    /**
     * Get the monitoring interval in seconds.
     *
     * @return Interval in seconds
     */
    fun getMonitoringInterval(): Int

    /**
     * Set the monitoring interval.
     *
     * @param intervalSeconds Interval between scans
     */
    fun setMonitoringInterval(intervalSeconds: Int)

    // ==================== THREAT STATUS ====================

    /**
     * Get count of currently detected threats.
     *
     * @return Number of active threats
     */
    fun getActiveThreatCount(): Int

    /**
     * Get the highest risk level of active threats.
     *
     * @return Highest risk level, or null if no threats
     */
    fun getHighestActiveThreatLevel(): RiskLevel?

    /**
     * Clear all cached threat results.
     */
    fun clearThreatCache()
}