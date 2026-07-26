package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DashboardRefreshPlanner - PROGRAM-014
 *
 * Determines the minimum scope required for a UI refresh.
 */
@Singleton
class DashboardRefreshPlanner @Inject constructor() {

    fun planRefresh(delta: ContextDelta): RefreshPlan {
        Log.d("RefreshPlanner", "Planning dashboard update for ${delta.impactedDomains.size} domains.")
        
        val scope = if (delta.impactedDomains.contains("all")) {
            RefreshScope.ENTIRE_DASHBOARD
        } else if (delta.impactedDomains.size > 2) {
            RefreshScope.SECTION
        } else {
            RefreshScope.SINGLE_WIDGET
        }

        return RefreshPlan(
            planId = "plan_${System.nanoTime()}",
            timestamp = System.currentTimeMillis(),
            targetScope = scope,
            affectedDomains = delta.impactedDomains,
            priority = PriorityLevel.MEDIUM
        )
    }
}
