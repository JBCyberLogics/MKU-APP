package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.ui.RecommendationAction
import ke.ac.mku.authcore.domain.model.ui.RecommendationModel
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RecommendationEngine - PROGRAM-017
 *
 * Generates intelligent recommendations for the student dashboard.
 */
@Singleton
class RecommendationEngine @Inject constructor() {

    fun generateRecommendations(context: StudentContext): RecommendationModel {
        val actions = mutableListOf<RecommendationAction>()
        
        // 1. Academic recommendations
        if (context.academic.gpa ?: 0.0 < 2.5) {
            actions.add(RecommendationAction(
                id = "rec_${UUID.randomUUID()}",
                title = "Academic Support",
                description = "Consider meeting with your advisor to discuss your academic progress.",
                category = "ACADEMIC"
            ))
        }

        // 2. Financial recommendations
        if (context.finance.feeBalance > 0) {
            actions.add(RecommendationAction(
                id = "rec_${UUID.randomUUID()}",
                title = "Payment Plan",
                description = "Clear your balance of ${context.finance.feeBalance} to avoid registration delays.",
                category = "FINANCE"
            ))
        }

        return RecommendationModel(
            recommendations = actions,
            generatedAt = System.currentTimeMillis()
        )
    }
}
