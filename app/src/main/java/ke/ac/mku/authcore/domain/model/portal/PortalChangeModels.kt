package ke.ac.mku.authcore.domain.model.portal

/**
 * PortalChangeModels - PORTAL-005
 *
 * Models for portal evolution detection and compatibility analysis.
 */

data class ChangeReport(
    val monitorId: String,
    val timestamp: Long,
    val changes: List<PortalChange>,
    val overallImpact: ChangeSeverity
)

data class PortalChange(
    val component: String,
    val changeType: String,
    val description: String,
    val severity: ChangeSeverity
)

enum class ChangeSeverity {
    NONE,
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}

data class CompatibilityReport(
    val level: CompatibilityLevel,
    val status: String,
    val issues: List<String>,
    val rediscoveryRequired: Boolean
)

enum class CompatibilityLevel {
    FULLY_COMPATIBLE,
    MINOR_CHANGES,
    PARTIALLY_COMPATIBLE,
    REDISCOVERY_REQUIRED,
    SEMANTIC_REBUILD_REQUIRED,
    MANUAL_REVIEW_REQUIRED
}

data class PortalSnapshot(
    val snapshotId: String,
    val timestamp: Long,
    val portalMap: PortalMap,
    val navigationGraph: NavigationGraph,
    val requestRegistry: RequestRegistry
)
