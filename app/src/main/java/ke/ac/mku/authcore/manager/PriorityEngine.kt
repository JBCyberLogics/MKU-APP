package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.ContextPriority
import ke.ac.mku.authcore.domain.model.portal.PriorityLevel
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PriorityEngine - PROGRAM-011
 *
 * Automatically prioritizes student information based on context.
 */
@Singleton
class PriorityEngine @Inject constructor() {

    fun calculatePriorities(context: StudentContext): List<ContextPriority> {
        val priorities = mutableListOf<ContextPriority>()

        // 1. Fee Balance Check
        if (context.finance.feeBalance > 0) {
            priorities.add(ContextPriority(
                id = UUID.randomUUID().toString(),
                title = "Outstanding Fee Balance",
                description = "You have an outstanding balance of ${context.finance.feeBalance}",
                level = PriorityLevel.HIGH,
                domain = "finance"
            ))
        }

        // 2. Upcoming Exams
        if (context.learning.upcomingExams > 0) {
            priorities.add(ContextPriority(
                id = UUID.randomUUID().toString(),
                title = "Upcoming Exams",
                description = "You have ${context.learning.upcomingExams} exams starting soon.",
                level = PriorityLevel.CRITICAL,
                domain = "learning"
            ))
        }

        return priorities.sortedByDescending { it.level }
    }
}
