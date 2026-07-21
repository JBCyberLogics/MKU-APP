package ke.ac.mku.authcore.health

import ke.ac.mku.authcore.runtime.RuntimeMetrics

/**
 * Complete diagnostic report for the Authentication Core.
 */
data class DiagnosticsReport(
    val timestamp: Long = System.currentTimeMillis(),
    val systemHealth: SystemHealth,
    val runtimeMetrics: RuntimeMetrics,
    val failureHistory: List<FailureEntry>,
    val componentStatistics: Map<String, ComponentStatistics>,
    val uptimeMillis: Long,
    val recoveryStats: RecoveryStatistics
) {
    companion object {
        const val MAX_FAILURE_HISTORY = 1000
    }
}

/**
 * Entry in the failure history.
 */
data class FailureEntry(
    val timestamp: Long,
    val component: String,
    val error: String,
    val level: HealthLevel,
    val recovered: Boolean = false,
    val recoveryTimestamp: Long? = null
)

/**
 * Statistics for a component.
 */
data class ComponentStatistics(
    val name: String,
    val totalChecks: Int,
    val successfulChecks: Int,
    val failedChecks: Int,
    val averageResponseTimeMs: Long,
    val lastSuccessfulCheck: Long,
    val lastFailedCheck: Long,
    val uptimePercent: Double
)

/**
 * Recovery statistics.
 */
data class RecoveryStatistics(
    val totalFailures: Int,
    val totalRecoveries: Int,
    val averageRecoveryTimeMs: Long,
    val lastFailureTimestamp: Long,
    val lastRecoveryTimestamp: Long,
    val consecutiveFailures: Int
) {
    companion object {
        fun initial(): RecoveryStatistics {
            return RecoveryStatistics(
                totalFailures = 0,
                totalRecoveries = 0,
                averageRecoveryTimeMs = 0,
                lastFailureTimestamp = 0,
                lastRecoveryTimestamp = 0,
                consecutiveFailures = 0
            )
        }
    }
}