package ke.ac.mku.authcore.feature

/**
 * Rollout group for staged feature deployment.
 * Architecture is in place but rollout execution is disabled per decision_002.
 */
data class RolloutGroup(
    val id: String,
    val name: String,
    val description: String,
    val priority: Int = 0,
    val percentage: Int = 0,  // 0-100, 0 = not started
    val isEnabled: Boolean = false,
    val targetUsers: List<String> = emptyList()
)

/**
 * Rollout status for tracking feature deployment progress.
 */
data class RolloutStatus(
    val featureId: String,
    val rolloutGroupId: String,
    val percentage: Int,
    val isComplete: Boolean
)