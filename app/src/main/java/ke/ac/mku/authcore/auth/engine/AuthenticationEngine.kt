package ke.ac.mku.authcore.auth.engine

import android.util.Log
import ke.ac.mku.authcore.auth.network.WebFormLoginHandlerAdapter
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.AuthMetrics
import ke.ac.mku.authcore.contracts.authentication.AuthRequest
import ke.ac.mku.authcore.contracts.authentication.AuthState
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.Session
import ke.ac.mku.authcore.contracts.authentication.ValidationResult
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService
import ke.ac.mku.authcore.contracts.network.NetworkCredentials
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.manager.SessionManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.security.monitor.SecurityMonitor
import ke.ac.mku.authcore.state.StateRegistry
import kotlinx.coroutines.delay
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * AuthenticationEngine - AUTH-001
 *
 * Primary authentication orchestrator for the MKU Student Portal.
 * Coordinates secure authentication without owning networking, storage, cryptography, or session management.
 *
 * Authentication workflow:
 * 1. Receive authentication request
 * 2. Validate request structure
 * 3. Request security verification (SecurityMonitor)
 * 4. Forward credentials to Network Layer (IAuthNetworkService)
 * 5. Await authentication response
 * 6. Validate authentication result
 * 7. Notify Session Layer (SessionManager)
 * 8. Publish authentication events
 *
 * Retry policy: Maximum 3 attempts with 3 second delay between retries.
 * Only retries on network/connection failures, not invalid credentials.
 */
@Singleton
class AuthenticationEngine @Inject constructor(
    private val networkService: IAuthNetworkService,
    private val securityMonitor: SecurityMonitor,
    private val sessionManager: SessionManager,
    private val eventBus: EventBus,
    private val stateRegistry: StateRegistry,
    private val dependencyRegistry: DependencyRegistry,
    private val authEventManager: IAuthenticationEventManager
) : IAuthenticationEngine, BootstrapObserver {

    companion object {
        private const val TAG = "AuthenticationEngine"
        private const val MAX_RETRY_ATTEMPTS = 3
        private const val RETRY_DELAY_SECONDS = 3L
        private const val ERROR_CODE_INVALID_CREDENTIALS = "AUTH_001"
        private const val ERROR_CODE_SECURITY_CHECK_FAILED = "AUTH_002"
        private const val ERROR_CODE_NETWORK_FAILURE = "AUTH_003"
        private const val ERROR_CODE_PLATFORM_NOT_SECURE = "AUTH_004"
    }

    // Internal state
    @Volatile
    private var currentAuthState: AuthState = AuthState.IDLE

    @Volatile
    private var currentSession: Session? = null

    @Volatile
    private var lastAuthRequest: AuthRequest? = null

    @Volatile
    private var lastErrorCode: String? = null

    // Metrics
    @Volatile
    private var totalAttempts = 0

    @Volatile
    private var successfulAttempts = 0

    @Volatile
    private var failedAttempts = 0

    @Volatile
    private var lastAttemptTimestamp = 0L

    init {
        eventBus.subscribe(this)
        registerWithDependencyRegistry()
    }

    private fun registerWithDependencyRegistry() {
        dependencyRegistry.register(
            name = "authentication_engine",
            instance = this,
            dependencies = listOf(
                "security_monitor",
                "session_manager",
                "event_bus",
                "state_registry"
            ),
            startupOrder = 3,
            isRequired = true
        )
    }

    // IAuthenticationEngine implementation

    override suspend fun authenticate(request: AuthRequest): AuthResult {
        Log.i(TAG, "Starting authentication for: ${request.registrationNumber}")
        lastAuthRequest = request
        lastErrorCode = null

        // Step 1: Publish AuthenticationStarted event
        authEventManager.publish(BootstrapEvent.AuthenticationStarted)
        updateAuthState(AuthState.AUTHENTICATING)
        totalAttempts++
        lastAttemptTimestamp = System.currentTimeMillis()

        try {
            // Step 2: Validate request structure
            authEventManager.publish(BootstrapEvent.AuthenticationProcessing("Validating request"))
            val validationResult = validateRequest(request)
            if (validationResult is ValidationResult.Invalid) {
                val failure = AuthResult.Failure(validationResult.errors.joinToString(", "))
                handleAuthenticationFailure(failure, ERROR_CODE_INVALID_CREDENTIALS)
                return failure
            }

            // Step 3: Security pre-flight check
            authEventManager.publish(BootstrapEvent.AuthenticationProcessing("Security verification"))
            if (!securityMonitor.isPlatformSecure()) {
                Log.w(TAG, "Platform security check failed")
                val failure = AuthResult.Failure("Platform security verification failed")
                handleAuthenticationFailure(failure, ERROR_CODE_PLATFORM_NOT_SECURE)
                return failure
            }

            // Step 4-6: Execute authentication with retry logic
            authEventManager.publish(BootstrapEvent.AuthenticationProcessing("Network authentication"))
            val result = executeWithRetry(request)

            // Step 7-8: Process result and notify session layer
            return processResult(result)

        } catch (e: Exception) {
            Log.e(TAG, "Authentication error: ${e.message}", e)
            val failure = AuthResult.Failure(e.message ?: "Unknown authentication error")
            handleAuthenticationFailure(failure, ERROR_CODE_NETWORK_FAILURE)
            return failure
        }
    }

    private suspend fun executeWithRetry(request: AuthRequest): AuthResult {
        var lastException: Exception? = null

        for (attempt in 1..MAX_RETRY_ATTEMPTS) {
            if (attempt > 1) {
                Log.i(TAG, "Retry attempt $attempt of $MAX_RETRY_ATTEMPTS")
                authEventManager.publish(BootstrapEvent.AuthenticationRetrying(attempt, MAX_RETRY_ATTEMPTS))
                delay(RETRY_DELAY_SECONDS * 1000)
            }

            try {
                // Step 4: Forward credentials to Network Layer
                val networkResponse = networkService.authenticate(
                    NetworkCredentials(
                        registrationNumber = request.registrationNumber,
                        password = request.password
                    )
                )

                // Step 5: Await and validate response
                if (networkResponse.isSuccess) {
                    val user = User(
                        registrationNumber = request.registrationNumber,
                        studentName = null // Will be populated from session if available
                    )
                    return AuthResult.Success(user)
                } else {
                    // Network call succeeded but auth failed - don't retry
                    val errorMessage = networkResponse.errorMessage ?: "Authentication failed"
                    return AuthResult.Failure(errorMessage)
                }

            } catch (e: Exception) {
                Log.w(TAG, "Attempt $attempt failed with exception: ${e.message}")
                lastException = e

                // Only retry on network/connection failures
                // Don't retry on invalid credentials or other non-retryable errors
                if (isRetryableException(e) && attempt < MAX_RETRY_ATTEMPTS) {
                    continue
                } else {
                    break
                }
            }
        }

        return AuthResult.Failure(lastException?.message ?: "Authentication failed after $MAX_RETRY_ATTEMPTS attempts")
    }

    private fun isRetryableException(e: Exception): Boolean {
        // Retry on network-related exceptions
        val message = e.message?.lowercase() ?: ""
        return message.contains("timeout") ||
                message.contains("connection") ||
                message.contains("network") ||
                message.contains("socket")
    }

    override suspend fun cancelAuthentication(): Unit {
        Log.i(TAG, "Cancelling authentication")
        networkService.cancel()
        updateAuthState(AuthState.CANCELLED)
        authEventManager.publish(BootstrapEvent.AuthenticationCancelled)
    }

    override suspend fun retryAuthentication(): AuthResult {
        val request = lastAuthRequest
        if (request == null) {
            Log.w(TAG, "No previous authentication request to retry")
            return AuthResult.Failure("No authentication request to retry")
        }

        if (lastErrorCode == ERROR_CODE_INVALID_CREDENTIALS) {
            Log.w(TAG, "Cannot retry - invalid credentials error")
            return AuthResult.Failure("Cannot retry - invalid credentials")
        }

        Log.i(TAG, "Retrying authentication")
        return authenticate(request)
    }

    override suspend fun validateRequest(request: AuthRequest): ValidationResult {
        val errors = mutableListOf<String>()

        if (request.registrationNumber.isBlank()) {
            errors.add("Registration number is required")
        } else if (!isValidRegistrationNumber(request.registrationNumber)) {
            errors.add("Invalid registration number format")
        }

        if (request.password.isBlank()) {
            errors.add("Password is required")
        }

        return if (errors.isEmpty()) {
            ValidationResult.Valid(request)
        } else {
            ValidationResult.Invalid(errors)
        }
    }

    private fun isValidRegistrationNumber(regNumber: String): Boolean {
        // MKU registration numbers are typically in format like: F1/12345/2019
        // or similar patterns - basic validation
        return regNumber.length >= 5 && regNumber.matches(Regex("^[A-Za-z0-9/]+$"))
    }

    override suspend fun processResult(result: AuthResult): AuthResult {
        return when (result) {
            is AuthResult.Success -> {
                handleAuthenticationSuccess(result)
                result
            }
            is AuthResult.Failure -> {
                handleAuthenticationFailure(result, lastErrorCode ?: ERROR_CODE_INVALID_CREDENTIALS)
                result
            }
        }
    }

    private fun handleAuthenticationSuccess(result: AuthResult.Success) {
        Log.i(TAG, "Authentication successful for: ${result.user.registrationNumber}")
        updateAuthState(AuthState.AUTHENTICATED)
        successfulAttempts++

        // Create session
        val session = Session(
            user = result.user,
            sessionId = UUID.randomUUID().toString(),
            createdAt = System.currentTimeMillis()
        )
        currentSession = session

        // Notify SessionManager
        sessionManager.createSession(
            regNumber = result.user.registrationNumber,
            studentName = result.user.studentName,
            cookies = emptyMap() // Cookies come from network response
        )

        // Publish success event
        authEventManager.publish(
            BootstrapEvent.AuthenticationSuccess(
                regNumber = result.user.registrationNumber,
                studentName = result.user.studentName
            )
        )
        authEventManager.publish(BootstrapEvent.AuthenticationCompleted)
    }

    private fun handleAuthenticationFailure(result: AuthResult.Failure, errorCode: String) {
        Log.w(TAG, "Authentication failed: ${result.message}")
        updateAuthState(AuthState.FAILED)
        failedAttempts++
        lastErrorCode = errorCode

        // Publish failure event
        authEventManager.publish(
            BootstrapEvent.AuthenticationFailed(
                reason = result.message,
                errorCode = errorCode
            )
        )
        authEventManager.publish(BootstrapEvent.AuthenticationCompleted)
    }

    override fun isAuthenticated(): Boolean {
        return currentAuthState == AuthState.AUTHENTICATED && sessionManager.isSessionActive()
    }

    override fun getCurrentSession(): Session? = currentSession

    override fun getAuthState(): AuthState = currentAuthState

    override fun getMetrics(): AuthMetrics {
        return AuthMetrics(
            totalAttempts = totalAttempts,
            successfulAttempts = successfulAttempts,
            failedAttempts = failedAttempts,
            lastAttemptTimestamp = lastAttemptTimestamp
        )
    }

    private fun updateAuthState(newState: AuthState) {
        val previousState = currentAuthState
        currentAuthState = newState

        // Update StateRegistry if available
        try {
            val authState = when (newState) {
                AuthState.IDLE -> ke.ac.mku.authcore.state.AuthenticationState.UNAUTHENTICATED
                AuthState.AUTHENTICATING -> ke.ac.mku.authcore.state.AuthenticationState.AUTHENTICATING
                AuthState.AUTHENTICATED -> ke.ac.mku.authcore.state.AuthenticationState.AUTHENTICATED
                AuthState.FAILED -> ke.ac.mku.authcore.state.AuthenticationState.LOGGED_OUT
                AuthState.CANCELLED -> ke.ac.mku.authcore.state.AuthenticationState.UNAUTHENTICATED
            }
            stateRegistry.updateAuthenticationState(authState)
        } catch (e: Exception) {
            Log.w(TAG, "Failed to update state registry: ${e.message}")
        }

        Log.d(TAG, "Auth state: $previousState -> $newState")
    }

    // BootstrapObserver implementation

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.BootstrapCompleted -> {
                Log.i(TAG, "Bootstrap completed - AuthenticationEngine ready")
            }
            is BootstrapEvent.AuthenticationCoreInitialized -> {
                Log.i(TAG, "Authentication core initialized")
            }
            else -> { /* Ignore other events */ }
        }
    }
}