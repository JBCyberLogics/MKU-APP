package ke.ac.mku.authcore.manager.ui

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.ui.IAdaptiveLayoutManager
import ke.ac.mku.authcore.contracts.ui.IDashboardIntelligenceManager
import ke.ac.mku.authcore.domain.model.ui.*
import java.util.UUID
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * AdaptiveLayoutManager - PROGRAM-018
 *
 * Primary coordinator for the dynamic layout generation lifecycle.
 */
@Singleton
class AdaptiveLayoutManager @Inject constructor(
    private val gridEngine: GridGenerationEngine,
    private val optimizer: WidgetPlacementOptimizer,
    private val treeBuilder: RenderTreeBuilder,
    private val authEventManager: IAuthenticationEventManager,
    private val intelligenceManager: Provider<IDashboardIntelligenceManager>
) : IAdaptiveLayoutManager, BootstrapObserver {

    private val moduleId = "PROGRAM-018"
    private val moduleName = "Adaptive Layout Engine"

    companion object {
        private const val TAG = "AdaptiveLayout"
    }

    private var currentBlueprint: LayoutBlueprint? = null
    private var currentRenderTree: RenderTree? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IAdaptiveLayoutManager Implementation ====================

    override fun generateLayout(plan: DashboardPlan): LayoutBlueprint {
        Log.i(TAG, "Executing dynamic layout generation...")
        authEventManager.publish(BootstrapEvent.LayoutGenerationStarted)

        try {
            // 1. Generate Responsive Grid
            val grid = gridEngine.generateGrid()
            authEventManager.publish(BootstrapEvent.ResponsiveGridCreated(grid.columnCount))

            // 2. Optimize Widget Placement
            val allWidgets = plan.sections.flatMap { it.widgets }
            val positions = optimizer.optimize(allWidgets, grid)
            authEventManager.publish(BootstrapEvent.LayoutOptimized)

            // 3. Build Render Tree
            val tree = treeBuilder.build(plan.sections)
            currentRenderTree = tree
            authEventManager.publish(BootstrapEvent.RenderTreeGenerated)

            // 4. Finalize Blueprint
            val blueprint = LayoutBlueprint(
                blueprintId = "lyt_${UUID.randomUUID()}",
                timestamp = System.currentTimeMillis(),
                grid = grid,
                widgetPositions = positions,
                mode = if (grid.columnCount > 2) LayoutMode.COMFORTABLE else LayoutMode.COMPACT
            )

            currentBlueprint = blueprint
            authEventManager.publish(BootstrapEvent.LayoutReady)
            authEventManager.publish(BootstrapEvent.LayoutGenerationCompleted)
            
            Log.i(TAG, "Adaptive dashboard layout finalized. Rendering ready.")
            return blueprint

        } catch (e: Exception) {
            Log.e(TAG, "Layout generation failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.LayoutGenerationFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getRenderTree(): RenderTree? = currentRenderTree

    override fun getActiveLayout(): LayoutBlueprint? = currentBlueprint

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.DashboardGenerationCompleted -> {
                Log.i(TAG, "Dashboard intelligence ready. Calculating adaptive layout...")
                intelligenceManager.get().getLatestPlan()?.let { plan ->
                    generateLayout(plan)
                }
            }
            else -> {}
        }
    }
}
