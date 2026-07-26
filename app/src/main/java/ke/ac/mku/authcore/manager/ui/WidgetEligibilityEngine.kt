package ke.ac.mku.authcore.manager.ui

import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.ui.WidgetCategory
import ke.ac.mku.authcore.domain.model.ui.WidgetMetadata
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WidgetEligibilityEngine - PROGRAM-016
 *
 * Determines whether a widget should be displayed based on context.
 */
@Singleton
class WidgetEligibilityEngine @Inject constructor() {

    fun isEligible(widget: WidgetMetadata, context: StudentContext): Boolean {
        // Logic to hide/show widgets based on student context
        return when (widget.definition.category) {
            WidgetCategory.FEE_BALANCE -> context.finance.feeBalance > 0
            WidgetCategory.UPCOMING_EXAMS -> context.learning.upcomingExams > 0
            WidgetCategory.NOTIFICATIONS -> context.learning.recentActivity.isNotEmpty()
            else -> true // Default visible
        }
    }
}
