package ke.ac.mku.authcore.contracts.security

/**
 * ISecurityMonitor - SECURITY-005
 *
 * Main security orchestrator interface for the Authentication Platform.
 * Coordinates all security services and provides unified security monitoring.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
interface ISecurityMonitor {

    // ==================== INITIALIZATION ====================

    /**
     * Check if the security monitor is initialized and ready.
     */
    fun isInitialized(): Boolean

    /**
     * Initialize the security monitor and all sub-components.
     * Must be called before any security operations.
     */
    fun initialize(): Boolean

    // ==================== SECURITY SCAN ====================

    /**
     * Perform a complete security scan of the platform.
     * Scans for all threat categories and returns aggregated report.
     *
     * @return List of detected threats
     */
    fun performSecurityScan(): List<ThreatReport>

    /**
     * Perform a quick security health check.
     * Does not perform full threat scan.
     *
     * @return true if platform appears secure
     */
    fun isPlatformSecure(): Boolean

    // ==================== THREAT EVALUATION ====================

    /**
     * Evaluate a detected threat and determine its risk level.
     *
     * @param category The threat category
     * @return The evaluated risk level
     */
    fun evaluateThreat(category: ThreatCategory): RiskLevel

    /**
     * Process a detected threat and take appropriate action.
     *
     * @param report The threat report
     * @return The action taken
     */
    fun processThreat(report: ThreatReport): Action

    // ==================== INCIDENTS ====================

    /**
     * Get all active (unresolved) security incidents.
     *
     * @return List of active incidents
     */
    fun getActiveIncidents(): List<SecurityIncident>

    /**
     * Get all security incidents including resolved ones.
     *
     * @param limit Maximum number to return
     * @return List of incidents
     */
    fun getAllIncidents(limit: Int = 100): List<SecurityIncident>

    /**
     * Resolve a security incident.
     *
     * @param incidentId The incident ID
     * @param resolution The resolution description
     * @return true if resolved successfully
     */
    fun resolveIncident(incidentId: String, resolution: String): Boolean

    // ==================== METRICS ====================

    /**
     * Get current security metrics.
     *
     * @return SecurityMetrics
     */
    fun getMetrics(): SecurityMetrics

    /**
     * Reset security metrics (for testing).
     */
    fun resetMetrics()

    // ==================== PLATFORM STATUS ====================

    /**
     * Check if all security modules are ready.
     *
     * @return true if all modules are initialized
     */
    fun areAllModulesReady(): Boolean

    /**
     * Get the list of modules that are not yet ready.
     *
     * @return List of module names that are not ready
     */
    fun getUnreadyModules(): List<String>

    /**
     * Get the overall platform security status.
     *
     * @return Status string describing platform state
     */
    fun getPlatformStatus(): String
}