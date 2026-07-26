package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * StudentContextBuilder - PROGRAM-011
 *
 * Constructs a unified StudentContext from KnowledgeGraph data.
 */
@Singleton
class StudentContextBuilder @Inject constructor() {

    fun build(graph: KnowledgeGraph): StudentContext {
        // In a real implementation, we would extract properties from the graph nodes
        
        return StudentContext(
            student = StudentProfileContext(
                registrationNumber = "MOCK-001",
                name = "Mock Student",
                programme = "Bachelor of Computer Science",
                department = "IT"
            ),
            academic = AcademicContext(
                currentSemester = "JAN-APR 2026",
                academicYear = "2026",
                totalUnits = 7,
                gpa = 3.8,
                academicStatus = "GOOD STANDING",
                progressPercent = 0.75f
            ),
            finance = FinancialContext(
                feeBalance = 0.0,
                lastPaymentAmount = 50000.0,
                lastPaymentDate = System.currentTimeMillis() - 86400000,
                financialStatus = "CLEARED",
                hasOverdueInvoices = false
            ),
            learning = LearningContext(
                todayClasses = 3,
                upcomingExams = 0,
                pendingAssignments = 2,
                recentActivity = listOf("Portal Login", "Fee Payment Checked")
            ),
            campus = CampusContext(
                hostelRoom = "A12",
                libraryBooksDue = 0,
                campusLocation = "Main Campus"
            ),
            activity = ActivityContext(
                lastPortalAccess = System.currentTimeMillis(),
                sessionDurationMs = 3600000,
                frequentlyAccessedModules = listOf("Finance", "Results")
            ),
            priorities = emptyList(), // Filled by PriorityEngine
            healthScore = 0.95f
        )
    }
}
