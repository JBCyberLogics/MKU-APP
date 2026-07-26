package ke.ac.mku.authcore.contracts.ui

import ke.ac.mku.authcore.domain.model.ui.DashboardPlan
import ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint
import ke.ac.mku.authcore.domain.model.ui.RenderTree

/**
 * IAdaptiveLayoutManager - PROGRAM-018
 *
 * Interface for the dynamic UI layout generation engine.
 */
interface IAdaptiveLayoutManager {

    /**
     * Generate an adaptive layout blueprint from a dashboard plan.
     */
    fun generateLayout(plan: DashboardPlan): LayoutBlueprint

    /**
     * Return the latest generated render tree.
     */
    fun getRenderTree(): RenderTree?

    /**
     * Return the current active layout blueprint.
     */
    fun getActiveLayout(): LayoutBlueprint?
}
