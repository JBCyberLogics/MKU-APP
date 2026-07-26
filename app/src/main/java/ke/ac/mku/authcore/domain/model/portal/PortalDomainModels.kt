package ke.ac.mku.authcore.domain.model.portal

import ke.ac.mku.authcore.domain.model.User

/**
 * PORTAL-002: Portal Domain Models
 *
 * Immutable domain models representing Student Portal data.
 */

data class StudentProfile(
    val user: User,
    val dateOfBirth: String?,
    val gender: String?,
    val nationality: String?,
    val contactInfo: ContactInfo
)

data class ContactInfo(
    val email: String,
    val phoneNumber: String?,
    val address: String?
)

data class StudentAcademicProfile(
    val registrationNumber: String,
    val programName: String,
    val department: String,
    val campus: String,
    val currentSemester: String,
    val academicStatus: String,
    val cumulativeAverage: Double?
)

data class StudentFinanceProfile(
    val registrationNumber: String,
    val balance: Double,
    val currency: String,
    val lastTransactionDate: Long?,
    val status: String
)

data class StudentUnits(
    val registrationNumber: String,
    val semester: String,
    val units: List<UnitRecord>
)

data class UnitRecord(
    val unitCode: String,
    val unitName: String,
    val status: String,
    val grade: String? = null
)

data class SemesterInformation(
    val semesterId: String,
    val name: String,
    val startDate: Long,
    val endDate: Long,
    val isActive: Boolean
)

data class PortalSession(
    val sessionId: String,
    val createdAt: Long,
    val expiresAt: Long,
    val portalVersion: String
)

data class PortalConfiguration(
    val baseUrl: String,
    val authType: String,
    val features: List<String>
)

data class PortalCapabilities(
    val canRegisterUnits: Boolean,
    val canViewGrades: Boolean,
    val canRequestTranscripts: Boolean,
    val canMakePayments: Boolean
)

data class PortalMetadata(
    val serverTime: Long,
    val location: String,
    val loadBalancerNode: String?
)

data class PortalError(
    val code: String,
    val message: String,
    val timestamp: Long,
    val details: String? = null
)

data class PortalHealthStatus(
    val status: String,
    val uptimeSeconds: Long,
    val version: String
)
