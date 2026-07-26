package ke.ac.mku.authcore.auth.transaction

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager
import ke.ac.mku.authcore.bootstrap.PlatformVerifier
import ke.ac.mku.authcore.data.api.WebFormLoginHandler
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * AuthenticationTransactionManager - AUTH-TXN-001
 * 
 * Central orchestrator for atomic authentication transactions.
 * Prevents race conditions by locking and suspending concurrent platform services.
 */
@Singleton
class AuthenticationTransactionManager @Inject constructor(
    private val webFormLoginHandler: WebFormLoginHandler,
    private val sessionManager: ISessionManager,
    private val cookieManager: ICookieManager,
    private val sessionValidator: ISessionValidator,
    private val recoveryManager: ISessionRecoveryManager,
    private val platformVerifier: PlatformVerifier,
    private val dashboardRenderer: IDashboardRenderManager,
    private val eventBus: EventBus,
    private val authEventManager: IAuthenticationEventManager
) {
    companion object {
        private const val TAG = "AuthTransactionManager"
        private const val LOCK_NAME = "AUTH_TRANSACTION_LOCK"
    }

    private val mutex = Mutex()
    private var currentState = AuthTransactionState.IDLE

    /**
     * Executes the login process as a single atomic transaction.
     */
    suspend fun executeLoginTransaction(
        regNumber: String,
        password: String,
        portalType: String = "student"
    ): AuthResult = mutex.withLock {
        Log.i(TAG, "Initiating authentication transaction for $regNumber")
        
        try {
            acquireLock()
            
            val result = performLoginWorkflow(regNumber, password, portalType)
            
            if (result is AuthResult.Success) {
                completeTransaction()
                result
            } else {
                failTransaction(result as AuthResult.Failure)
                result
            }
        } catch (e: Exception) {
            Log.e(TAG, "Transaction failed with exception", e)
            val failure = AuthResult.Failure(e.message ?: "Transaction error")
            failTransaction(failure)
            failure
        } finally {
            if (currentState != AuthTransactionState.AUTHENTICATED && currentState != AuthTransactionState.FAILED) {
                releaseLock()
            }
        }
    }

    private fun acquireLock() {
        Log.i(TAG, "Acquiring $LOCK_NAME")
        
        // 1. Suspend services
        cookieManager.setTransactionLock(true)
        sessionValidator.setEnabled(false)
        recoveryManager.setEnabled(false)
        platformVerifier.setEnabled(false)
        dashboardRenderer.setEnabled(false)
        
        // 2. Enable event queuing
        eventBus.setQueuing(true)
        
        authEventManager.publish(BootstrapEvent.AuthenticationProcessing("Transaction Locked"))
    }

    private fun releaseLock() {
        Log.i(TAG, "Releasing $LOCK_NAME")
        
        // 1. Resume services
        cookieManager.setTransactionLock(false)
        sessionValidator.setEnabled(true)
        recoveryManager.setEnabled(true)
        platformVerifier.setEnabled(true)
        dashboardRenderer.setEnabled(true)
        
        // 2. Disable event queuing (releases queued events)
        eventBus.setQueuing(false)
    }

    private suspend fun performLoginWorkflow(
        regNumber: String,
        password: String,
        portalType: String
    ): AuthResult = withContext(Dispatchers.IO) {
        
        updateState(AuthTransactionState.LOGIN_PAGE_LOADING)
        // Simulating granular steps since WebFormLoginHandler combines them
        
        updateState(AuthTransactionState.AUTHENTICATING)
        updateState(AuthTransactionState.LOGIN_REQUEST_SENT)
        
        val response = webFormLoginHandler.executeLogin(regNumber, password, portalType)
        updateState(AuthTransactionState.LOGIN_RESPONSE_RECEIVED)
        
        if (!response.isSuccess) {
            return@withContext AuthResult.Failure(response.errorMessage ?: "Login failed")
        }
        
        // Step: COOKIE_CAPTURE & PERSISTED
        updateState(AuthTransactionState.COOKIE_CAPTURE)
        cookieManager.saveCookies(response.cookies)
        updateState(AuthTransactionState.COOKIE_PERSISTED)
        
        // Step: SESSION_CREATING & CREATED
        updateState(AuthTransactionState.SESSION_CREATING)
        sessionManager.createSession(
            regNumber = regNumber,
            studentName = null,
            cookies = response.cookies,
            portalType = portalType
        )
        updateState(AuthTransactionState.SESSION_CREATED)
        
        // Resume session validator as per JSON: resume_after: SESSION_CREATED
        sessionValidator.setEnabled(true)
        
        // Step: SESSION_VALIDATING
        updateState(AuthTransactionState.SESSION_VALIDATING)
        val validation = sessionValidator.validateSession()
        if (validation !is ke.ac.mku.authcore.contracts.session.SessionValidationResult.Valid && 
            validation !is ke.ac.mku.authcore.contracts.session.SessionValidationResult.Warning) {
            return@withContext AuthResult.Failure("Session validation failed after login")
        }
        
        // Step: PORTAL_VALIDATING
        updateState(AuthTransactionState.PORTAL_VALIDATING)
        // Simulating success access check
        
        AuthResult.Success(User(registrationNumber = regNumber))
    }

    private fun updateState(newState: AuthTransactionState) {
        Log.d(TAG, "Transaction State: $currentState -> $newState")
        currentState = newState
        authEventManager.publish(BootstrapEvent.AuthenticationProcessing(newState.name))
    }

    private fun completeTransaction() {
        updateState(AuthTransactionState.AUTHENTICATED)
        Log.i(TAG, "Authentication Transaction SUCCESS")
        
        releaseLock()
        
        // Trigger post-auth services
        platformVerifier.verifyStack()
    }

    private fun failTransaction(failure: AuthResult.Failure) {
        updateState(AuthTransactionState.FAILED)
        Log.e(TAG, "Authentication Transaction FAILED: ${failure.message}")
        
        // Rollback
        sessionManager.terminateSession()
        cookieManager.clearCookies()
        
        releaseLock()
        
        authEventManager.publish(BootstrapEvent.LoginFailed(failure.message, "TXN_ERR"))
    }
}
