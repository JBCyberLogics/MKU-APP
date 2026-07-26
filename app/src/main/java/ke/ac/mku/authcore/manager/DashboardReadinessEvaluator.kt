package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.DashboardReadiness
import ke.ac.mku.authcore.domain.model.portal.ValidationResult
import ke.ac.mku.authcore.domain.model.portal.IssueSeverity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DashboardReadinessEvaluator - PROGRAM-015
 * 
 * Determines if the context is safe for UI rendering.
 */
@Singleton
class DashboardReadinessEvaluator @Inject constructor() {

    fun evaluate(result: ValidationResult): DashboardReadiness {
        val criticalIssues = result.issues.any { it.severity == IssueSeverity.CRITICAL }
        val isReady = !criticalIssues && result.overallConfidence >= 0.90f

        return DashboardReadiness(
            isReady = isReady,
            missingRequiredWidgets = emptyList(),
            overallConfidence = result.overallConfidence,
            recommendation = if (isReady) "Safe to render" else "Data integrity check failed"
        )
    }
}
