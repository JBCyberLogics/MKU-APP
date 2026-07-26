package ke.ac.mku.authcore.domain.model.portal

/**
 * StudentContextModels - PROGRAM-011
 *
 * Models for the unified intelligent representation of a student.
 */

data class StudentContext(
    val student: StudentProfileContext,
    val academic: AcademicContext,
    val finance: FinancialContext,
    val learning: LearningContext,
    val campus: CampusContext,
    val activity: ActivityContext,
    val priorities: List<ContextPriority>,
    val healthScore: Float,
    val generatedAt: Long = System.currentTimeMillis()
)

data class StudentProfileContext(
    val registrationNumber: String,
    val name: String,
    val programme: String,
    val department: String,
    val email: String? = null,
    val phoneNumber: String? = null
)

data class AcademicContext(
    val currentSemester: String,
    val academicYear: String,
    val totalUnits: Int,
    val gpa: Double?,
    val academicStatus: String,
    val progressPercent: Float
)

data class FinancialContext(
    val feeBalance: Double,
    val lastPaymentAmount: Double?,
    val lastPaymentDate: Long?,
    val financialStatus: String,
    val hasOverdueInvoices: Boolean
)

data class LearningContext(
    val todayClasses: Int,
    val upcomingExams: Int,
    val pendingAssignments: Int,
    val recentActivity: List<String>
)

data class CampusContext(
    val hostelRoom: String? = null,
    val libraryBooksDue: Int = 0,
    val campusLocation: String? = null
)

data class ActivityContext(
    val lastPortalAccess: Long,
    val sessionDurationMs: Long,
    val frequentlyAccessedModules: List<String>
)

data class ContextPriority(
    val id: String,
    val title: String,
    val description: String,
    val level: PriorityLevel,
    val domain: String,
    val actionUrl: String? = null
)

enum class PriorityLevel {
    CRITICAL,
    HIGH,
    MEDIUM,
    LOW
}

data class ContextSnapshot(
    val contextId: String,
    val timestamp: Long,
    val context: StudentContext,
    val reason: String
)
