package ke.ac.mku.authcore.domain.model.portal

/**
 * ContextValidationModels - PROGRAM-015
 *
 * Models for Student Context validation results and repair actions.
 */

data class ValidationResult(
    val validationId: String,
    val status: ValidationStatus,
    val overallConfidence: Float,
    val issues: List<ValidationIssue> = emptyList(),
    val warnings: List<String> = emptyList(),
    val repairs: List<RepairAction> = emptyList(),
    val dashboardReady: Boolean,
    val validatedAt: Long = System.currentTimeMillis()
)

enum class ValidationStatus {
    VALID,
    WARNING,
    INVALID,
    REPAIRED
}

data class ValidationIssue(
    val domain: String,
    val code: String,
    val description: String,
    val severity: IssueSeverity
)

enum class IssueSeverity {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}

data class RepairAction(
    val actionId: String,
    val description: String,
    val wasSuccessful: Boolean
)

data class DashboardReadiness(
    val isReady: Boolean,
    val missingRequiredWidgets: List<String>,
    val overallConfidence: Float,
    val recommendation: String?
)
