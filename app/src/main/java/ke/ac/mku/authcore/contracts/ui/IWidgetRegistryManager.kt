package ke.ac.mku.authcore.contracts.ui

import ke.ac.mku.authcore.domain.model.ui.DashboardBlueprint
import ke.ac.mku.authcore.domain.model.ui.WidgetDefinition

/**
 * IWidgetRegistryManager - PROGRAM-016
 *
 * Interface for the dynamic dashboard widget registry.
 */
interface IWidgetRegistryManager {

    /**
     * Register a new widget definition in the catalog.
     */
    fun registerWidget(definition: WidgetDefinition)

    /**
     * Build and return a layout blueprint based on context.
     */
    fun getDashboardBlueprint(): DashboardBlueprint

    /**
     * Check if a specific widget is currently active.
     */
    fun isWidgetActive(widgetId: String): Boolean

    /**
     * Reset the registry to default state.
     */
    fun resetRegistry()
}
