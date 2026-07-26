package ke.ac.mku.authcore.contracts.ui

import ke.ac.mku.authcore.domain.model.ui.DashboardPlan
import ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint

/**
 * IDashboardRenderManager - PROGRAM-020
 *
 * Interface for the dynamic dashboard rendering engine.
 */
interface IDashboardRenderManager {

    /**
     * Start the rendering process for a new dashboard plan.
     */
    fun renderDashboard(plan: DashboardPlan, layout: LayoutBlueprint)

    /**
     * Apply an incremental update to the currently rendered dashboard.
     */
    fun applyIncrementalUpdate(updateType: String)

    /**
     * Check if the dashboard is currently rendering.
     */
    fun isRendering(): Boolean

    /**
     * Determine if the dashboard is ready for user interaction.
     */
    fun isDashboardReady(): Boolean
}
