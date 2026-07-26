package ke.ac.mku.authcore.contracts.ui

import ke.ac.mku.authcore.domain.model.ui.DashboardPlan
import ke.ac.mku.authcore.domain.model.ui.RecommendationModel

/**
 * IDashboardIntelligenceManager - PROGRAM-017
 *
 * Interface for the brain of the dashboard, responsible for automated composition.
 */
interface IDashboardIntelligenceManager {

    /**
     * Generate and return the optimal dashboard plan for the current student.
     */
    fun generateDashboardPlan(): DashboardPlan

    /**
     * Return the last generated dashboard plan.
     */
    fun getLatestPlan(): DashboardPlan?

    /**
     * Return the current set of intelligent recommendations.
     */
    fun getRecommendationModel(): RecommendationModel

    /**
     * Return an overall usability/relevance score for the current dashboard.
     */
    fun getDashboardScore(): Float

    /**
     * Trigger an immediate re-analysis of the dashboard structure.
     */
    fun refreshIntelligence()
}
