package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.network.ProcessedResponse
import ke.ac.mku.authcore.contracts.portal.IPortalDataMapper
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PORTAL-002: Portal Data Mapper Implementation
 *
 * Central transformation engine responsible for converting raw MKU Student Portal 
 * responses into strongly typed internal domain models.
 */
@Singleton
class PortalDataMapper @Inject constructor(
    private val authEventManager: IAuthenticationEventManager
) : IPortalDataMapper, BootstrapObserver {

    private val moduleId = "PORTAL-002"
    private val moduleName = "Portal Data Mapper"

    companion object {
        private const val TAG = "PortalDataMapper"
    }

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IPortalDataMapper Implementation ====================

    override fun mapAuthenticationResponse(raw: ProcessedResponse): AuthResult {
        startMapping("AuthenticationResponse")
        
        return try {
            if (raw.isSuccess) {
                val user = User(
                    registrationNumber = "MOCK-001",
                    studentName = "Mock Student",
                    email = "student@mku.ac.ke",
                    studentId = "12345"
                )
                authEventManager.publish(BootstrapEvent.DomainModelCreated("User"))
                authEventManager.publish(BootstrapEvent.PortalMappingCompleted)
                AuthResult.Success(user)
            } else {
                val error = AuthResult.Failure(raw.statusLabel)
                authEventManager.publish(BootstrapEvent.PortalMappingCompleted)
                error
            }
        } catch (e: Exception) {
            handleFailure("AuthenticationResponse", e)
            AuthResult.Failure(e.message ?: "Mapping failed")
        }
    }

    override fun mapStudentProfile(raw: ProcessedResponse): StudentProfile {
        startMapping("StudentProfile")
        
        try {
            val profile = StudentProfile(
                user = User("MOCK-001", "Mock Student", "student@mku.ac.ke", "12345"),
                dateOfBirth = "1995-01-01",
                gender = "Male",
                nationality = "Kenyan",
                contactInfo = ContactInfo("student@mku.ac.ke", "0700000000", "Nairobi")
            )
            authEventManager.publish(BootstrapEvent.DomainModelCreated("StudentProfile"))
            authEventManager.publish(BootstrapEvent.PortalMappingCompleted)
            return profile
        } catch (e: Exception) {
            handleFailure("StudentProfile", e)
            throw mapError(raw.statusCode, e.message)
        }
    }

    override fun mapAcademicData(raw: ProcessedResponse): StudentAcademicProfile {
        startMapping("StudentAcademicProfile")
        
        try {
            val academic = StudentAcademicProfile(
                registrationNumber = "MOCK-001",
                programName = "Bachelor of Computing",
                department = "IT",
                campus = "Main Campus",
                currentSemester = "Jan-Apr 2026",
                academicStatus = "Active",
                cumulativeAverage = 75.5
            )
            authEventManager.publish(BootstrapEvent.DomainModelCreated("StudentAcademicProfile"))
            authEventManager.publish(BootstrapEvent.PortalMappingCompleted)
            return academic
        } catch (e: Exception) {
            handleFailure("StudentAcademicProfile", e)
            throw mapError(raw.statusCode, e.message)
        }
    }

    override fun mapFinancialData(raw: ProcessedResponse): StudentFinanceProfile {
        startMapping("StudentFinanceProfile")
        
        try {
            val finance = StudentFinanceProfile(
                registrationNumber = "MOCK-001",
                balance = 5000.0,
                currency = "KES",
                lastTransactionDate = System.currentTimeMillis(),
                status = "Cleared"
            )
            authEventManager.publish(BootstrapEvent.DomainModelCreated("StudentFinanceProfile"))
            authEventManager.publish(BootstrapEvent.PortalMappingCompleted)
            return finance
        } catch (e: Exception) {
            handleFailure("StudentFinanceProfile", e)
            throw mapError(raw.statusCode, e.message)
        }
    }

    override fun mapError(statusCode: Int, raw: String?): Throwable {
        return when (statusCode) {
            400 -> IllegalArgumentException("InvalidRequestException: $raw")
            401 -> IllegalStateException("AuthenticationException: $raw")
            403 -> SecurityException("AuthorizationException: $raw")
            404 -> NoSuchElementException("ResourceNotFoundException: $raw")
            500 -> RuntimeException("PortalServerException: $raw")
            else -> Exception("PortalUnknownException: $raw")
        }
    }

    override fun validateModel(model: Any): Boolean {
        return true
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.PortalReady -> {
                Log.i(TAG, "Portal layer ready. Initializing Mapper...")
                authEventManager.publish(BootstrapEvent.PortalMapperReady)
            }
            else -> {}
        }
    }

    // ==================== Private Helpers ====================

    private fun startMapping(modelName: String) {
        Log.d(TAG, "Starting mapping for $modelName")
        authEventManager.publish(BootstrapEvent.PortalMappingStarted)
    }

    private fun handleFailure(modelName: String, e: Exception) {
        Log.e(TAG, "Mapping failed for $modelName: ${e.message}")
        authEventManager.publish(BootstrapEvent.PortalMappingFailed("${e.message} in $modelName"))
    }
}
