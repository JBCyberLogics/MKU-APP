package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.domain.model.User

/**
 * ILoginOrchestrator - CORE-012
 *
 * Public platform contract for login workflow orchestration.
 * This is the SINGLE ENTRY POINT for the complete login workflow.
 *
 * Coordinates the login workflow by delegating to specialized modules:
 * - [IAuthenticationEngine] for authentication operations
 * - [ISessionManager] for session management
 * - [ICookieManager] for cookie management
 * - [IPortalConnector] for portal connection operations
 *
 * This orchestrator does NOT make direct HTTP calls - all network operations
 * are delegated to the appropriate modules via their contracts.
 *
 * Workflow state machine with 12 states:
 * IDLE → PLATFORM_VALIDATION → CREDENTIAL_VALIDATION → AUTHENTICATION →
 * RESPONSE_VERIFICATION → SESSION_INITIALIZATION → COOKIE_INITIALIZATION →
 * PORTAL_CONNECTION → NOTIFICATION → COMPLETED (or FAILED/CANCELLED)
 *
 * Future modules (AUTH-003, AUTH-004, SESSION-*, PORTAL-*) will consume this contract.
 */
interface ILoginOrchestrator {

    /**
     * Start the complete login workflow.
     *
     * @param request The login request containing registration number and password
     * @return The login result with user data or error information
     */
    suspend fun startLogin(request: LoginRequest): LoginResult

    /**
     * Cancel any active login workflow.
     *
     * Resets workflow state to IDLE and releases any held resources.
     */
    suspend fun cancelLogin(): Unit

    /**
     * Retry the last failed login workflow.
     *
     * @return The login result from retry
     * @throws IllegalStateException if no previous login attempt exists
     */
    suspend fun retryLogin(): LoginResult

    /**
     * Resume an interrupted login workflow from its current state.
     *
     * @return The login result from resume attempt
     * @throws IllegalStateException if no workflow is in progress
     */
    suspend fun resumeWorkflow(): LoginResult

    /**
     * Reset the workflow state to IDLE.
     *
     * Clears any intermediate state but does NOT cancel active operations.
     * Use [cancelLogin] first if you need to cancel active operations.
     */
    suspend fun resetWorkflow(): Unit

    /**
     * Get the current workflow state.
     *
     * @return The current [WorkflowState] of the login workflow
     */
    fun getWorkflowState(): WorkflowState

    /**
     * Check if a login workflow is currently in progress.
     *
     * @return True if workflow is active (not IDLE, COMPLETED, FAILED, or CANCELLED)
     */
    fun isLoginActive(): Boolean

    /**
     * Get workflow execution metrics.
     *
     * @return Current [WorkflowMetrics] including duration, steps, retries, and failures
     */
    fun getWorkflowMetrics(): WorkflowMetrics
}

/**
 * Login request data class.
 *
 * @property registrationNumber The student's registration number
 * @property password The student's password
 */
data class LoginRequest(
    val registrationNumber: String,
    val password: String
)

/**
 * Login result sealed class.
 *
 * @property user The authenticated user on success
 * @property errorMessage The error description on failure
 * @property errorCode The error code for programmatic handling
 */
sealed class LoginResult {
    data class Success(
        val user: User,
        val sessionId: String,
        val portalConnectionResult: ke.ac.mku.authcore.models.portal.PortalConnectionResult? = null
    ) : LoginResult()

    data class Failure(
        val message: String,
        val errorCode: String,
        val canRetry: Boolean = true
    ) : LoginResult()
}

/**
 * Workflow state enum representing the 12 states of the login workflow.
 */
enum class WorkflowState {
    /** No workflow in progress - initial state */
    IDLE,

    /** Validating platform security requirements */
    PLATFORM_VALIDATION,

    /** Validating credentials format and requirements */
    CREDENTIAL_VALIDATION,

    /** Executing authentication against backend */
    AUTHENTICATION,

    /** Verifying authentication response */
    RESPONSE_VERIFICATION,

    /** Initializing user session */
    SESSION_INITIALIZATION,

    /** Initializing authentication cookies */
    COOKIE_INITIALIZATION,

    /** Connecting to student portal */
    PORTAL_CONNECTION,

    /** Sending login notifications */
    NOTIFICATION,

    /** Workflow completed successfully */
    COMPLETED,

    /** Workflow failed */
    FAILED,

    /** Workflow was cancelled */
    CANCELLED
}

/**
 * Workflow metrics data class.
 *
 * @property loginDurationMs Total login duration in milliseconds
 * @property stepsCompleted Number of workflow steps completed
 * @property retryCount Number of retry attempts made
 * @property failureCount Number of failures encountered
 * @property lastErrorCode The error code of the last failure
 * @property startTimestamp Workflow start timestamp
 */
data class WorkflowMetrics(
    val loginDurationMs: Long = 0,
    val stepsCompleted: Int = 0,
    val retryCount: Int = 0,
    val failureCount: Int = 0,
    val lastErrorCode: String? = null,
    val startTimestamp: Long = 0
)