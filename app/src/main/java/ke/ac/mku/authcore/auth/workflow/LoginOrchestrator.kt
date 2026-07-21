package ke.ac.mku.authcore.auth.workflow

import android.util.Log
import ke.ac.mku.authcore.auth.engine.AuthenticationEngine
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.AuthRequest
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ILoginOrchestrator
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.authentication.LoginRequest
import ke.ac.mku.authcore.contracts.authentication.LoginResult
import ke.ac.mku.authcore.contracts.authentication.WorkflowMetrics
import ke.ac.mku.authcore.contracts.authentication.WorkflowState
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.models.portal.PortalConnectionResult
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.security.monitor.SecurityMonitor
import ke.ac.mku.authcore.state.AuthenticationState
import ke.ac.mku.authcore.state.StateRegistry
import kotlinx.coroutines.delay
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * LoginOrchestrator - AUTH-002
 *
 * Primary login workflow orchestrator that coordinates the complete login process.
 * This is the SINGLE ENTRY POINT for the login workflow.
 *
 * Coordinates the following modules:
 * - [AuthenticationEngine] for authentication operations
 * - [SecurityMonitor] for security verification
 * - [ISessionManager] for session management
 * - [ICookieManager] for cookie management
 * - [IPortalConnector] for portal connection
 *
 * Workflow state machine (12 steps):
 * IDLE → PLATFORM_VALIDATION → CREDENTIAL_VALIDATION → AUTHENTICATION →
 * RESPONSE_VERIFICATION → SESSION_INITIALIZATION → COOKIE_INITIALIZATION →
 * PORTAL_CONNECTION → NOTIFICATION → COMPLETED (or FAILED/CANCELLED)
 *
 * Policy:
 * - Single active login (allow_parallel_logins: false)
 * - Maximum retry attempts: 3
 * - Authentication timeout: 60 seconds
 */
@Singleton
class LoginOrchestrator @Inject constructor(
    private val authenticationEngine: IAuthenticationEngine,
    private val portalConnector: IPortalConnector,
    private val sessionManager: ISessionManager,
    private val cookieManager: ICookieManager,
    private val securityMonitor: SecurityMonitor,
    private val eventBus: EventBus,
    private val stateRegistry: StateRegistry,
    private val dependencyRegistry: DependencyRegistry,
    private val authEventManager: IAuthenticationEventManager
) : ILoginOrchestrator, BootstrapObserver {

    companion object {
        private const val TAG = "LoginOrchestrator"
        private const val MAX_RETRY_ATTEMPTS = 3
        private const val AUTHENTICATION_TIMEOUT_MS = 60_000L
        private const val RETRY_DELAY_MS = 1_000L

        // Error codes
        private const val ERROR_CODE_PLATFORM_NOT_SECURE = "AUTH_002_001"
        private const val ERROR_CODE_INVALID_REQUEST = "AUTH_002_002"
        private const val ERROR_CODE_AUTH_FAILED = "AUTH_002_003"
        private const val ERROR_CODE_SESSION_FAILED = "AUTH_002_004"
        private const val ERROR_CODE_COOKIE_FAILED = "AUTH_002_005"
        private const val ERROR_CODE_PORTAL_FAILED = "AUTH_002_006"
        private const val ERROR_CODE_TIMEOUT = "AUTH_002_007"
        private const val ERROR_CODE_CANCELLED = "AUTH_002_008"
    }

    // Workflow state
    @Volatile
    private var currentState: WorkflowState = WorkflowState.IDLE

    // Metrics
    @Volatile
    private var startTimestamp: Long = 0
    @Volatile
    private var stepsCompleted: Int = 0
    @Volatile
    private var retryCount: Int = 0
    @Volatile
    private var failureCount: Int = 0
    @Volatile
    private var lastErrorCode: String? = null

    // Last request for retry
    @Volatile
    private var lastLoginRequest: LoginRequest? = null

    // Session tracking
    @Volatile
    private var currentSessionId: String? = null

    init {
        eventBus.subscribe(this)
        registerWithDependencyRegistry()
    }

    private fun registerWithDependencyRegistry() {
        dependencyRegistry.register(
            name = "login_orchestrator",
            instance = this,
            dependencies = listOf(
                "authentication_engine",
                "portal_connector",
                "session_manager",
                "cookie_manager",
                "security_monitor",
                "event_bus",
                "state_registry"
            ),
            startupOrder = 4,
            isRequired = true
        )
    }

    // ILoginOrchestrator implementation

    override suspend fun startLogin(request: LoginRequest): LoginResult {
        Log.i(TAG, "Starting login workflow for: ${request.registrationNumber}")

        // Cancel any existing login if allow_parallel_logins is false
        if (isLoginActive()) {
            Log.w(TAG, "Active login exists, cancelling before new login")
            cancelLogin()
        }

        // Reset metrics
        resetMetrics()
        startTimestamp = System.currentTimeMillis()
        lastLoginRequest = request

        // Publish workflow started event
        authEventManager.publish(BootstrapEvent.LoginWorkflowStarted)
        updateState(WorkflowState.PLATFORM_VALIDATION)

        try {
            // Step 02: Verify Security Platform readiness
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Platform validation"))
            if (!securityMonitor.isPlatformSecure()) {
                return handleFailure(
                    message = "Platform security verification failed",
                    errorCode = ERROR_CODE_PLATFORM_NOT_SECURE,
                    canRetry = false
                )
            }
            stepsCompleted++

            // Step 03: Validate login request
            updateState(WorkflowState.CREDENTIAL_VALIDATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Credential validation"))
            val validationResult = authenticationEngine.validateRequest(
                AuthRequest(request.registrationNumber, request.password)
            )
            if (validationResult is ke.ac.mku.authcore.contracts.authentication.ValidationResult.Invalid) {
                return handleFailure(
                    message = validationResult.errors.joinToString(", "),
                    errorCode = ERROR_CODE_INVALID_REQUEST,
                    canRetry = false
                )
            }
            stepsCompleted++

            // Step 04-06: Invoke AuthenticationEngine (with retry)
            updateState(WorkflowState.AUTHENTICATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Authentication"))
            val authResult = executeAuthenticationWithRetry(request)
            stepsCompleted++

            // Step 07: Verify authentication response
            updateState(WorkflowState.RESPONSE_VERIFICATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Response verification"))
            when (authResult) {
                is AuthResult.Success -> {
                    authEventManager.publish(BootstrapEvent.LoginAuthenticated(request.registrationNumber))
                }
                is AuthResult.Failure -> {
                    return handleFailure(
                        message = authResult.message,
                        errorCode = ERROR_CODE_AUTH_FAILED,
                        canRetry = true
                    )
                }
            }
            stepsCompleted++

            // Step 08: Create authenticated session
            updateState(WorkflowState.SESSION_INITIALIZATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Session initialization"))
            val sessionId = UUID.randomUUID().toString()
            currentSessionId = sessionId
            sessionManager.createSession(
                regNumber = request.registrationNumber,
                studentName = authResult.user.studentName,
                cookies = emptyMap()
            )
            authEventManager.publish(BootstrapEvent.LoginSessionCreated(request.registrationNumber))
            stepsCompleted++

            // Step 09: Initialize secure cookies
            updateState(WorkflowState.COOKIE_INITIALIZATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Cookie initialization"))
            // Cookies are managed by CookieManager via network responses
            stepsCompleted++

            // Step 10: Initialize portal connection
            updateState(WorkflowState.PORTAL_CONNECTION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Portal connection"))
            val portalResult = portalConnector.connect()
            when (portalResult) {
                is PortalConnectionResult.Success -> {
                    authEventManager.publish(BootstrapEvent.LoginPortalConnected(portalResult.portalInfo.baseUrl))
                }
                is PortalConnectionResult.Failure -> {
                    // Log but don't fail - portal connection is secondary
                    Log.w(TAG, "Portal connection failed: ${portalResult.message}")
                }
            }
            stepsCompleted++

            // Step 11: Notify dependent modules
            updateState(WorkflowState.NOTIFICATION)
            authEventManager.publish(BootstrapEvent.LoginWorkflowProcessing("Notifications"))
            // Notify state registry
            stateRegistry.updateAuthenticationState(AuthenticationState.AUTHENTICATED)
            stepsCompleted++

            // Step 12: Complete authentication workflow
            updateState(WorkflowState.COMPLETED)
            authEventManager.publish(BootstrapEvent.LoginCompleted(request.registrationNumber))

            Log.i(TAG, "Login workflow completed successfully")
            return LoginResult.Success(
                user = authResult.user,
                sessionId = sessionId,
                portalConnectionResult = (portalResult as? ke.ac.mku.authcore.models.portal.PortalConnectionResult.Success)?.let {
                    ke.ac.mku.authcore.models.portal.PortalConnectionResult.Success(it.portalInfo)
                }
            )

        } catch (e: Exception) {
            Log.e(TAG, "Login workflow failed: ${e.message}", e)
            return handleFailure(
                message = e.message ?: "Unknown error during login",
                errorCode = ERROR_CODE_AUTH_FAILED,
                canRetry = true
            )
        }
    }

    private suspend fun executeAuthenticationWithRetry(request: LoginRequest): AuthResult {
        var lastException: Exception? = null

        for (attempt in 1..MAX_RETRY_ATTEMPTS) {
            if (attempt > 1) {
                Log.i(TAG, "Retry attempt $attempt of $MAX_RETRY_ATTEMPTS")
                retryCount++
                delay(RETRY_DELAY_MS * attempt)
            }

            try {
                val result = authenticationEngine.authenticate(
                    AuthRequest(request.registrationNumber, request.password)
                )

                // Check if result indicates a non-retryable failure
                if (result is AuthResult.Failure) {
                    val isRetryable = isRetryableError(result.message)
                    if (!isRetryable && attempt < MAX_RETRY_ATTEMPTS) {
                        // Don't retry invalid credentials
                        return result
                    }
                }

                return result

            } catch (e: Exception) {
                Log.w(TAG, "Authentication attempt $attempt failed: ${e.message}")
                lastException = e

                if (attempt < MAX_RETRY_ATTEMPTS && isRetryableException(e)) {
                    continue
                } else {
                    break
                }
            }
        }

        return AuthResult.Failure(lastException?.message ?: "Authentication failed after $MAX_RETRY_ATTEMPTS attempts")
    }

    private fun isRetryableError(message: String): Boolean {
        val lowerMessage = message.lowercase()
        return lowerMessage.contains("timeout") ||
                lowerMessage.contains("connection") ||
                lowerMessage.contains("network") ||
                lowerMessage.contains("socket")
    }

    private fun isRetryableException(e: Exception): Boolean {
        val message = e.message?.lowercase() ?: ""
        return message.contains("timeout") ||
                message.contains("connection") ||
                message.contains("network") ||
                message.contains("socket")
    }

    override suspend fun cancelLogin(): Unit {
        Log.i(TAG, "Cancelling login workflow")

        // Cancel authentication if in progress
        if (currentState == WorkflowState.AUTHENTICATION) {
            authenticationEngine.cancelAuthentication()
        }

        // Rollback partial login
        rollbackPartialLogin()

        updateState(WorkflowState.CANCELLED)
        authEventManager.publish(BootstrapEvent.LoginCancelled)
        authEventManager.publish(BootstrapEvent.LoginFailed("Login cancelled by user", ERROR_CODE_CANCELLED))
    }

    override suspend fun retryLogin(): LoginResult {
        val request = lastLoginRequest
        if (request == null) {
            Log.w(TAG, "No previous login request to retry")
            return LoginResult.Failure(
                message = "No login request to retry",
                errorCode = ERROR_CODE_INVALID_REQUEST,
                canRetry = false
            )
        }

        Log.i(TAG, "Retrying login workflow")
        return startLogin(request)
    }

    override suspend fun resumeWorkflow(): LoginResult {
        if (currentState == WorkflowState.IDLE ||
            currentState == WorkflowState.COMPLETED ||
            currentState == WorkflowState.FAILED ||
            currentState == WorkflowState.CANCELLED) {
            return LoginResult.Failure(
                message = "No workflow to resume",
                errorCode = ERROR_CODE_INVALID_REQUEST,
                canRetry = false
            )
        }

        Log.i(TAG, "Resuming workflow from state: $currentState")
        // For now, restart the workflow from the beginning
        // A more sophisticated implementation would resume from the current step
        val request = lastLoginRequest
        if (request == null) {
            return LoginResult.Failure(
                message = "No login request to resume",
                errorCode = ERROR_CODE_INVALID_REQUEST,
                canRetry = false
            )
        }

        return startLogin(request)
    }

    override suspend fun resetWorkflow(): Unit {
        Log.i(TAG, "Resetting workflow state to IDLE")
        rollbackPartialLogin()
        updateState(WorkflowState.IDLE)
        resetMetrics()
    }

    private suspend fun rollbackPartialLogin() {
        Log.d(TAG, "Rolling back partial login")

        // Clear session if created
        if (currentSessionId != null) {
            try {
                sessionManager.terminateSession()
            } catch (e: Exception) {
                Log.w(TAG, "Error clearing session: ${e.message}")
            }
            currentSessionId = null
        }

        // Clear cookies if initialized
        try {
            cookieManager.clearCookies()
        } catch (e: Exception) {
            Log.w(TAG, "Error clearing cookies: ${e.message}")
        }

        // Disconnect portal if connected
        try {
            if (portalConnector.getConnectionState() != ke.ac.mku.authcore.models.portal.PortalConnectionState.DISCONNECTED) {
                portalConnector.disconnect()
            }
        } catch (e: Exception) {
            Log.w(TAG, "Error disconnecting portal: ${e.message}")
        }
    }

    override fun getWorkflowState(): WorkflowState = currentState

    override fun isLoginActive(): Boolean {
        return currentState != WorkflowState.IDLE &&
                currentState != WorkflowState.COMPLETED &&
                currentState != WorkflowState.FAILED &&
                currentState != WorkflowState.CANCELLED
    }

    override fun getWorkflowMetrics(): WorkflowMetrics {
        val duration = if (startTimestamp > 0) {
            System.currentTimeMillis() - startTimestamp
        } else {
            0
        }

        return WorkflowMetrics(
            loginDurationMs = duration,
            stepsCompleted = stepsCompleted,
            retryCount = retryCount,
            failureCount = failureCount,
            lastErrorCode = lastErrorCode,
            startTimestamp = startTimestamp
        )
    }

    private suspend fun handleFailure(message: String, errorCode: String, canRetry: Boolean): LoginResult {
        failureCount++
        lastErrorCode = errorCode
        updateState(WorkflowState.FAILED)

        authEventManager.publish(BootstrapEvent.LoginFailed(message, errorCode))

        // Rollback partial login
        rollbackPartialLogin()

        return LoginResult.Failure(
            message = message,
            errorCode = errorCode,
            canRetry = canRetry
        )
    }

    private fun updateState(newState: WorkflowState) {
        val previousState = currentState
        currentState = newState
        Log.d(TAG, "Workflow state: $previousState -> $newState")
    }

    private fun resetMetrics() {
        startTimestamp = 0
        stepsCompleted = 0
        retryCount = 0
        failureCount = 0
        lastErrorCode = null
        currentSessionId = null
    }

    // BootstrapObserver implementation

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.BootstrapCompleted -> {
                Log.i(TAG, "Bootstrap completed - LoginOrchestrator ready")
            }
            is BootstrapEvent.AuthenticationCoreInitialized -> {
                Log.i(TAG, "Authentication core initialized")
            }
            else -> { /* Ignore other events */ }
        }
    }
}