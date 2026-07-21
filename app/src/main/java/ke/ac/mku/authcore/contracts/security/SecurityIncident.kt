package ke.ac.mku.authcore.contracts.security

import java.util.UUID

/**
 * SecurityIncident - SECURITY-005
 *
 * Represents a security incident that requires tracking and resolution.
 */
data class SecurityIncident(
    val id: String = UUID.randomUUID().toString(),
    val level: RiskLevel,
    val category: ThreatCategory,
    val description: String,
    val timestamp: Long = System.currentTimeMillis(),
    val resolved: Boolean = false,
    val resolution: String? = null,
    val resolvedAt: Long? = null,
    val recoveryActions: List<String> = emptyList(),
    val source: String = ""
) {
    /**
     * Mark the incident as resolved.
     */
    fun resolve(resolution: String): SecurityIncident {
        return copy(
            resolved = true,
            resolution = resolution,
            resolvedAt = System.currentTimeMillis()
        )
    }

    /**
     * Check if this incident requires immediate action.
     */
    val requiresImmediateAction: Boolean
        get() = level.action == Action.BLOCK_AND_RECOVER && !resolved

    companion object {
        /**
         * Create a new incident from a threat report.
         */
        fun fromThreatReport(report: ThreatReport): SecurityIncident {
            return SecurityIncident(
                level = report.level,
                category = report.category,
                description = report.description,
                source = report.source,
                recoveryActions = listOf("Threat detected: ${report.category.displayName}")
            )
        }
    }
}