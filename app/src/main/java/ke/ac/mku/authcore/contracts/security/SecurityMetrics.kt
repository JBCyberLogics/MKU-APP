package ke.ac.mku.authcore.contracts.security

/**
 * SecurityMetrics - SECURITY-005
 *
 * Aggregated security monitoring metrics.
 */
data class SecurityMetrics(
    val totalScans: Int = 0,
    val threatsDetected: Int = 0,
    val threatsBlocked: Int = 0,
    val incidentsCreated: Int = 0,
    val incidentsResolved: Int = 0,
    val auditRecordsWritten: Int = 0,
    val lastScanTime: Long = 0,
    val lastThreatDetectionTime: Long = 0,
    val platformHealthScore: Float = 1.0f,
    val securityEventsByLevel: Map<RiskLevel, Int> = emptyMap(),
    val isPlatformSecure: Boolean = true
) {
    /**
     * Calculate the overall health score based on metrics.
     */
    fun calculateHealthScore(): Float {
        val baseScore = 1.0f
        val threatPenalty = (threatsDetected * 0.01f).coerceAtMost(0.5f)
        val unresolvedPenalty = (incidentsCreated - incidentsResolved) * 0.05f
        val auditPenalty = if (auditRecordsWritten == 0) 0.1f else 0f

        return (baseScore - threatPenalty - unresolvedPenalty - auditPenalty).coerceIn(0f, 1f)
    }

    /**
     * Check if the platform is in a healthy security state.
     */
    fun isHealthy(): Boolean {
        return isPlatformSecure &&
                platformHealthScore >= 0.7f &&
                (incidentsCreated - incidentsResolved) < 3
    }

    companion object {
        /**
         * Create initial empty metrics.
         */
        fun empty(): SecurityMetrics = SecurityMetrics()
    }
}

/**
 * AuditFilter - SECURITY-005
 *
 * Filter criteria for querying audit records.
 */
data class AuditFilter(
    val startTime: Long? = null,
    val endTime: Long? = null,
    val levels: Set<RiskLevel>? = null,
    val categories: Set<ThreatCategory>? = null,
    val limit: Int = 100
)