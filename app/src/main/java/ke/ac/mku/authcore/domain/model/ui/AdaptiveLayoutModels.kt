package ke.ac.mku.authcore.domain.model.ui

/**
 * AdaptiveLayoutModels - PROGRAM-018
 *
 * Models for the dynamic and responsive dashboard layout generation.
 */

data class LayoutBlueprint(
    val blueprintId: String,
    val timestamp: Long,
    val grid: ResponsiveGrid,
    val widgetPositions: List<WidgetPosition>,
    val mode: LayoutMode
)

data class RenderTree(
    val root: RenderNode,
    val generatedAt: Long
)

data class RenderNode(
    val id: String,
    val type: String, // SECTION, WIDGET, CONTAINER
    val children: List<RenderNode> = emptyList(),
    val metadata: Map<String, Any> = emptyMap()
)

data class ResponsiveGrid(
    val columnCount: Int,
    val horizontalSpacing: Int,
    val verticalSpacing: Int
)

data class WidgetPosition(
    val widgetId: String,
    val column: Int,
    val row: Int,
    val columnSpan: Int,
    val rowSpan: Int
)

enum class LayoutMode {
    COMPACT,
    COMFORTABLE,
    EXPANDED
}
