package ke.ac.mku.authcore.manager.ui

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager
import ke.ac.mku.authcore.domain.model.ui.DashboardPlan
import ke.ac.mku.authcore.domain.model.ui.RecommendationModel
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DashboardIntelligenceManager - PROGRAM-017
 *
 * Coordinates the complete intelligent dashboard generation lifecycle.
 */
@Singleton
class DashboardIntelligenceManager @Inject constructor(
    private val contextManager: IStudentContextManager,
    private val widgetRegistry: IWidgetRegistryManager,
    private val decisionEngine: DashboardDecisionEngine,
    private val placementEngine: WidgetPlacementEngine,
    private val recommendationEngine: RecommendationEngine,
    private val authEventManager: IAuthenticationEventManager
) : IDashboardIntelligenceManager, BootstrapObserver {

    private val moduleId = "PROGRAM-017"
    private val moduleName = "Dashboard Intelligence Engine"

    companion object {
        private const val TAG = "DashboardIntelligence"
    }

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    private var lastPlan: DashboardPlan? = null

    // ==================== IDashboardIntelligenceManager Implementation ====================

    override fun generateDashboardPlan(): DashboardPlan {
        Log.i(TAG, "Generating intelligent dashboard blueprint...")
        authEventManager.publish(BootstrapEvent.DashboardGenerationStarted)

        try {
            // 1. Fetch contextual blueprint from registry
            val blueprint = widgetRegistry.getDashboardBlueprint()
            
            // 2. Analyze widget placement
            val finalizedWidgets = placementEngine.finalizeOrder(blueprint.widgets)
            authEventManager.publish(BootstrapEvent.WidgetOrderFinalized)

            // 3. Compose sections
            val sections = decisionEngine.composeSections(finalizedWidgets)
            
            // 4. Finalize Plan
            val plan = DashboardPlan(
                planId = "plan_${UUID.randomUUID()}",
                timestamp = System.currentTimeMillis(),
                sections = sections,
                dashboardScore = 0.98f // Initial score
            )

            lastPlan = plan
            authEventManager.publish(BootstrapEvent.DashboardReadyForLayout)
            authEventManager.publish(BootstrapEvent.DashboardGenerationCompleted)
            
            Log.i(TAG, "Personalized dashboard blueprint ready for rendering.")
            return plan

        } catch (e: Exception) {
            Log.e(TAG, "Dashboard generation failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.DashboardGenerationFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getLatestPlan(): DashboardPlan? = lastPlan

    override fun getRecommendationModel(): RecommendationModel {
        val context = contextManager.getStudentContext()
            ?: throw IllegalStateException("Context required for recommendations")
        
        val model = recommendationEngine.generateRecommendations(context)
        authEventManager.publish(BootstrapEvent.RecommendationsGenerated)
        return model
    }

    override fun getDashboardScore(): Float = 0.98f

    override fun refreshIntelligence() {
        Log.d(TAG, "Refreshing intelligence model...")
        generateDashboardPlan()
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.WidgetRegistryCompleted -> {
                Log.i(TAG, "Widget Ecosystem ready. Activating Intelligence Engine...")
                generateDashboardPlan()
            }
            else -> {}
        }
    }
}
