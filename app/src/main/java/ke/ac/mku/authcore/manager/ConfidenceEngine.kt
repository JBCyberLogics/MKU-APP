package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.EntityCategory
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ConfidenceEngine - PROGRAM-007
 *
 * Scores classification results.
 */
@Singleton
class ConfidenceEngine @Inject constructor() {

    fun calculateConfidence(category: EntityCategory, matchScore: Float): Float {
        // Multi-factor scoring logic
        return (matchScore * 0.8f + 0.2f).coerceIn(0f, 1f)
    }

    fun isAutoAcceptable(score: Float): Boolean {
        return score >= 0.95f
    }
}
