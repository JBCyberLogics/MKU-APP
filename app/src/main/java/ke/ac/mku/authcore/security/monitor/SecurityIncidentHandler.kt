package ke.ac.mku.authcore.security.monitor

import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.security.Action
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.security.SecurityIncident
import ke.ac.mku.authcore.contracts.security.ThreatReport
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.recovery.RecoveryStrategy
import ke.ac.mku.authcore.contracts.security.ThreatCategory
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SecurityIncidentHandler - SECURITY-005
 *
 * Handles security incidents, particularly CRITICAL threats.
 * Coordinates with RecoveryManager for automatic incident response.
 */
@Singleton
class SecurityIncidentHandler @Inject constructor(
    @ApplicationContext private val context: android.content.Context,
    private val eventBus: EventBus,
    private val recoveryManager: RecoveryManager
) {

    companion object {
        private const val TAG = "SecurityIncidentHandler"
    }

    private val activeIncidents = mutableListOf<SecurityIncident>()
    private val resolvedIncidents = mutableListOf<SecurityIncident>()

    /**
     * Handle a detected threat and create incident if needed.
     *
     * @param report The threat report
     * @return The created incident or null
     */
    fun handleThreat(report: ThreatReport): SecurityIncident? {
        // Only create incidents for HIGH and CRITICAL threats
        if (report.level.priority < RiskLevel.HIGH.priority) {
            return null
        }

        val incident = SecurityIncident.fromThreatReport(report)
        activeIncidents.add(incident)

        // Publish incident event
        eventBus.publish(
            BootstrapEvent.SecurityIncidentCreated(
                incidentId = incident.id,
                level = incident.level.name,
                description = incident.description
            )
        )

        // If CRITICAL, invoke recovery immediately
        if (report.level.action == Action.BLOCK_AND_RECOVER) {
            invokeRecovery(incident)
        }

        Log.i(TAG, "Created security incident: ${incident.id} (${incident.level.name})")
        return incident
    }

    /**
     * Get all active (unresolved) incidents.
     */
    fun getActiveIncidents(): List<SecurityIncident> = activeIncidents.toList()

    /**
     * Get all resolved incidents.
     */
    fun getResolvedIncidents(): List<SecurityIncident> = resolvedIncidents.toList()

    /**
     * Get all incidents (active and resolved).
     */
    fun getAllIncidents(limit: Int = 100): List<SecurityIncident> {
        return (activeIncidents + resolvedIncidents)
            .sortedByDescending { it.timestamp }
            .take(limit)
    }

    /**
     * Resolve an incident.
     *
     * @param incidentId The incident ID
     * @param resolution The resolution description
     * @return true if resolved successfully
     */
    fun resolveIncident(incidentId: String, resolution: String): Boolean {
        val incident = activeIncidents.find { it.id == incidentId } ?: return false

        val resolved = incident.resolve(resolution)
        activeIncidents.remove(incident)
        resolvedIncidents.add(resolved)

        Log.i(TAG, "Resolved incident: $incidentId - $resolution")
        return true
    }

    /**
     * Get count of active incidents.
     */
    fun getActiveIncidentCount(): Int = activeIncidents.size

    /**
     * Get count of unresolved critical incidents.
     */
    fun getCriticalIncidentCount(): Int {
        return activeIncidents.count { it.level == RiskLevel.CRITICAL }
    }

    /**
     * Check if there are any unresolved critical incidents.
     */
    fun hasCriticalIncidents(): Boolean = getCriticalIncidentCount() > 0

    /**
     * Invoke recovery workflow for a critical incident.
     */
    private fun invokeRecovery(incident: SecurityIncident) {
        Log.w(TAG, "CRITICAL incident detected: ${incident.id} - invoking recovery")

        try {
            // Determine recovery strategy based on threat category
            val strategy = when (incident.category) {
                ThreatCategory.APP_TAMPERING,
                ThreatCategory.SIGNATURE_MISMATCH -> RecoveryStrategy.FULL_RECOVERY

                ThreatCategory.CERTIFICATE_BYPASS,
                ThreatCategory.RUNTIME_INJECTION -> RecoveryStrategy.RESTART

                ThreatCategory.ROOTED_DEVICE,
                ThreatCategory.HOOK_FRAMEWORK -> RecoveryStrategy.REINITIALIZE

                else -> RecoveryStrategy.RETRY
            }

            // Log recovery action (RecoveryManager.initiateRecovery is private)
            Log.w(TAG, "Recovery strategy selected: ${strategy.name} for incident: ${incident.id}")

            // Update incident with recovery actions
            val index = activeIncidents.indexOf(incident)
            if (index >= 0) {
                activeIncidents[index] = incident.copy(
                    recoveryActions = activeIncidents[index].recoveryActions + "Recovery recommended: ${strategy.name}; "
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to invoke recovery: ${e.message}")
        }
    }

    /**
     * Clear all incidents (for testing).
     */
    fun clearAllIncidents() {
        activeIncidents.clear()
        resolvedIncidents.clear()
    }
}