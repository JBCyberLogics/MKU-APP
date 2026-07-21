package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User

/**
 * IAuthenticationEngine - CORE-012
 *
 * Public platform contract for authentication orchestration.
 * This is the SINGLE ENTRY POINT for all authentication operations.
 *
 * Coordinates secure authentication against the MKU Student Portal without
 * owning networking, storage, cryptography, or session management.
 *
 * All authentication traffic passes through [IAuthNetworkService] interface.
 * Security validation via [SecurityMonitor] before every auth request.
 *
 * Future modules (AUTH-002, AUTH-003, SESSION-*, PORTAL-*) will consume this contract.
 */
interface IAuthenticationEngine {

    /**
     * Start authentication with the given request.
     *
     * @param request The authentication request containing credentials
     * @return The authentication result
     */
    suspend fun authenticate(request: AuthRequest): AuthResult

    /**
     * Cancel any active authentication operation.
     */
    suspend fun cancelAuthentication(): Unit

    /**
     * Retry the last failed authentication.
     *
     * @return The authentication result from retry
     */
    suspend fun retryAuthentication(): AuthResult

    /**
     * Validate an authentication request before processing.
     *
     * @param request The authentication request to validate
     * @return The validation result
     */
    suspend fun validateRequest(request: AuthRequest): ValidationResult

    /**
     * Process an authentication result, handling any post-processing.
     *
     * @param result The authentication result to process
     * @return The processed authentication result
     */
    suspend fun processResult(result: AuthResult): AuthResult

    /**
     * Check if currently authenticated.
     *
     * @return True if authenticated, false otherwise
     */
    fun isAuthenticated(): Boolean

    /**
     * Get the current session if authenticated.
     *
     * @return The current session or null if not authenticated
     */
    fun getCurrentSession(): Session?

    /**
     * Get the current authentication state.
     *
     * @return The authentication state enum
     */
    fun getAuthState(): AuthState

    /**
     * Get authentication metrics.
     *
     * @return Current authentication metrics
     */
    fun getMetrics(): AuthMetrics
}

/**
 * Authentication request data class.
 *
 * @property registrationNumber The student's registration number
 * @property password The student's password
 */
data class AuthRequest(
    val registrationNumber: String,
    val password: String
)

/**
 * Validation result sealed class.
 */
sealed class ValidationResult {
    data class Valid(val request: AuthRequest) : ValidationResult()
    data class Invalid(val errors: List<String>) : ValidationResult()
}

/**
 * Session data class representing an authenticated session.
 *
 * @property user The authenticated user
 * @property sessionId The unique session identifier
 * @property createdAt The session creation timestamp
 */
data class Session(
    val user: User,
    val sessionId: String,
    val createdAt: Long
)

/**
 * Authentication state enum.
 */
enum class AuthState {
    /** No authentication in progress */
    IDLE,
    /** Authentication in progress */
    AUTHENTICATING,
    /** Successfully authenticated */
    AUTHENTICATED,
    /** Authentication failed */
    FAILED,
    /** Authentication cancelled */
    CANCELLED
}

/**
 * Authentication metrics data class.
 *
 * @property totalAttempts Total number of authentication attempts
 * @property successfulAttempts Number of successful attempts
 * @property failedAttempts Number of failed attempts
 * @property lastAttemptTimestamp Timestamp of last attempt
 */
data class AuthMetrics(
    val totalAttempts: Int = 0,
    val successfulAttempts: Int = 0,
    val failedAttempts: Int = 0,
    val lastAttemptTimestamp: Long = 0
)