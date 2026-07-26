package ke.ac.mku.authcore.manager.ui

import android.util.Log
import ke.ac.mku.authcore.domain.model.ui.DashboardSection
import ke.ac.mku.authcore.domain.model.ui.WidgetMetadata
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DashboardDecisionEngine - PROGRAM-017
 *
 * Makes high-level decisions on dashboard structure and widget visibility.
 */
@Singleton
class DashboardDecisionEngine @Inject constructor() {

    companion object {
        private const val TAG = "DashboardDecision"
    }

    fun composeSections(widgets: List<WidgetMetadata>): List<DashboardSection> {
        Log.d(TAG, "Composing dashboard sections for ${widgets.size} active widgets")
        
        val sections = mutableListOf<DashboardSection>()
        
        // Group widgets into logical domains
        val grouped = widgets.groupBy { it.definition.category }
        
        grouped.forEach { (category, categoryWidgets) ->
            sections.add(DashboardSection(
                sectionId = "sec_${category.name.lowercase()}",
                title = formatCategoryTitle(category.name),
                category = category.name,
                widgets = categoryWidgets,
                priority = categoryWidgets.maxOf { it.currentPriority }
            ))
        }

        return sections.sortedByDescending { it.priority }
    }

    private fun formatCategoryTitle(name: String): String {
        return name.replace("_", " ").lowercase().capitalize()
    }
}
