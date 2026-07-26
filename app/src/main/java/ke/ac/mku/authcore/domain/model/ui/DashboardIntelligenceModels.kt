package ke.ac.mku.authcore.domain.model.ui

/**
 * DashboardIntelligenceModels - PROGRAM-017
 *
 * Models for the intelligent composition and personalization of the dashboard.
 */

data class DashboardPlan(
    val planId: String,
    val timestamp: Long,
    val sections: List<DashboardSection>,
    val dashboardScore: Float
)

data class DashboardSection(
    val sectionId: String,
    val title: String,
    val category: String,
    val widgets: List<WidgetMetadata>,
    val priority: Int
)

data class RecommendationModel(
    val recommendations: List<RecommendationAction>,
    val generatedAt: Long
)

data class RecommendationAction(
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val actionUrl: String? = null
)

data class DashboardScore(
    val value: Float,
    val description: String,
    val metrics: Map<String, Any>
)
