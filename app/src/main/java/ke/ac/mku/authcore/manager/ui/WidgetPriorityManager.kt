package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.ui.WidgetCategory
import ke.ac.mku.authcore.domain.model.ui.WidgetMetadata
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WidgetPriorityManager - PROGRAM-016
 *
 * Dynamically adjusts widget priority based on urgency.
 */
@Singleton
class WidgetPriorityManager @Inject constructor() {

    fun calculatePriority(widget: WidgetMetadata, context: StudentContext): Int {
        var priority = widget.definition.defaultPriority

        // Escalation rules
        when (widget.definition.category) {
            WidgetCategory.FEE_BALANCE -> if (context.finance.feeBalance > 10000) priority += 100
            WidgetCategory.UPCOMING_EXAMS -> if (context.learning.upcomingExams > 0) priority += 200
            WidgetCategory.NOTIFICATIONS -> if (context.learning.recentActivity.size > 5) priority += 50
            else -> {}
        }

        return priority
    }
}
