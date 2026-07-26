package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid
import ke.ac.mku.authcore.domain.model.ui.WidgetMetadata
import ke.ac.mku.authcore.domain.model.ui.WidgetPosition
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WidgetPlacementOptimizer - PROGRAM-018
 *
 * Calculates optimal widget positions within the responsive grid.
 */
@Singleton
class WidgetPlacementOptimizer @Inject constructor() {

    fun optimize(widgets: List<WidgetMetadata>, grid: ResponsiveGrid): List<WidgetPosition> {
        val positions = mutableListOf<WidgetPosition>()
        var currentColumn = 0
        var currentRow = 0

        widgets.forEach { widget ->
            // Hero widgets (High priority) span full width if possible
            val span = if (widget.currentPriority >= 150) grid.columnCount else 1
            
            // Layout logic simplified
            if (currentColumn + span > grid.columnCount) {
                currentColumn = 0
                currentRow++
            }

            positions.add(WidgetPosition(
                widgetId = widget.definition.widgetId,
                column = currentColumn,
                row = currentRow,
                columnSpan = span,
                rowSpan = 1
            ))

            currentColumn += span
        }

        return positions
    }
}
