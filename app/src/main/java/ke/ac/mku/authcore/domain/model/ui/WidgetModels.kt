package ke.ac.mku.authcore.domain.model.ui

import ke.ac.mku.authcore.domain.model.portal.PriorityLevel

/**
 * WidgetModels - PROGRAM-016
 *
 * Models for the dynamic dashboard widget registry.
 */

data class WidgetDefinition(
    val widgetId: String,
    val name: String,
    val category: WidgetCategory,
    val requiredContext: List<String>,
    val defaultPriority: Int,
    val supportsOffline: Boolean = true
)

data class WidgetMetadata(
    val definition: WidgetDefinition,
    val currentPriority: Int,
    val visibility: WidgetVisibility,
    val configuration: Map<String, Any> = emptyMap()
)

data class DashboardBlueprint(
    val blueprintId: String,
    val timestamp: Long,
    val widgets: List<WidgetMetadata>,
    val layoutStrategy: String = "AUTO"
)

enum class WidgetCategory {
    PROFILE,
    ACADEMIC_SUMMARY,
    REGISTERED_UNITS,
    RESULTS,
    GPA,
    FEE_BALANCE,
    PAYMENTS,
    TIMETABLE,
    TODAY_CLASSES,
    UPCOMING_EXAMS,
    CAT_SCHEDULE,
    ATTENDANCE,
    ANNOUNCEMENTS,
    NOTIFICATIONS,
    DOWNLOADS,
    LIBRARY,
    HOSTEL,
    CALENDAR,
    QUICK_ACTIONS,
    STATISTICS,
    CHARTS,
    RECOMMENDATIONS
}

enum class WidgetVisibility {
    AUTO,
    HIDDEN,
    FORCED
}
