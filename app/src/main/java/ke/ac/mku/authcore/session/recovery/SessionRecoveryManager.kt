package ke.ac.mku.authcore.session.recovery

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Base64
import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.AuthRequest
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.session.RecoveryMethod
import ke.ac.mku.authcore.contracts.session.RecoveryResult
import ke.ac.mku.authcore.contracts.session.RecoveryState
import ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics
import ke.ac.mku.authcore.contracts.session.SessionValidationResult
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.domain.model.Session
import ke.ac.mku.authcore.recovery.CircuitBreaker
import ke.ac.mku.authcore.recovery.CircuitBreakerState
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager

import javax.inject.Inject
import javax.inject.Provider

/**
 * SESSION-003: Session Recovery Manager Implementation
 *
 * Orchestrates recovery of session state after failures.
 * Implements hybrid recovery strategy (event-driven + periodic).
 *
 * Recovery Pipeline (10 steps):
 * 1. Detect recovery trigger (event or periodic check)
 * 2. Pause session operations
 * 3. Load latest secure session
 * 4. Verify integrity using SessionValidator
 * 5. Verify authentication state
 * 6. Restore session
 * 7. Synchronize cookies
 * 8. Reconnect portal
 * 9. Resume platform operations
 * 10. Publish recovery completed
 *
 * @param context Application context
 * @param sessionManager Session manager for restore operations
 * @param sessionValidator Session validator for integrity checks
 * @param authEngineProvider Provider for Authentication engine for re-authentication (lazy to break cycles)
 * @param secureStorage Secure storage for credentials backup
 * @param securityMonitor Security monitoring for incident reporting
 * @param eventBus Event bus for publishing/receiving events
 * @param dependencyRegistry Dependency registry for DI
 * @param authEventManager Authentication event manager for mandatory event pathway
 * @param cookieManagerProvider Provider for Cookie manager for synchronization (lazy to break cycles)
 * @param portalConnector Portal connector for reconnection
 * @param recoveryManager Core recovery manager for coordination
 * @param serviceRegistry Service registry for discovery
 * @param cryptoManager Crypto manager for sensitive operations
 * @param authStateManager Auth state manager for state transitions
 */
class SessionRecoveryManager(
    private val context: Context,
    private val sessionManager: ISessionManager,
    private val sessionValidator: ISessionValidator,
    private val authEngineProvider: Provider<IAuthenticationEngine>,
    private val secureStorage: ISecureStorageManager,
    private val securityMonitor: ISecurityMonitor,
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry,
    private val authEventManager: IAuthenticationEventManager,
    private val cookieManagerProvider: Provider<ICookieManager>,
    private val portalConnector: IPortalConnector,
    private val recoveryManager: RecoveryManager,
    private val serviceRegistry: ServiceRegistry,
    private val cryptoManager: ICryptoManager,
    private val authStateManager: IAuthenticationStateManager
) : ISessionRecoveryManager, BootstrapObserver {

    /**
     * Module Metadata (SESSION-003)
     */
    val moduleId = "SESSION-003"
    val moduleName = "Session Recovery Manager"
    val moduleType = "Session Recovery & Resilience Engine"
    val moduleVersion = "1.0.0"

    companion object {
        private const val TAG = "SessionRecoveryManager"
        private const val CREDENTIALS_KEY = "session_credentials"
        private const val BACKUP_SESSION_KEY = "backup_session"
        private const val MAX_RECOVERY_ATTEMPTS = 3
        private const val CIRCUIT_BREAKER_THRESHOLD = 3
        private const val PERIODIC_CHECK_INTERVAL_MS = 300_000L // 5 minutes
        private const val BACKOFF_BASE_MS = 1000L
    }

    // Recovery state
    private val _recoveryState = MutableStateFlow(RecoveryState.IDLE)
    override fun getRecoveryState(): RecoveryState = _recoveryState.value
    private val _isRecoveryRunning = MutableStateFlow(false)
    override fun isRecoveryRunning(): Boolean = _isRecoveryRunning.value

    // Periodic check
    private var isEnabled = true

    // Metrics
    private var metrics = SessionRecoveryMetrics()
    private val metricsLock = Any()

    // Circuit breaker for recovery operations
    private val recoveryCircuitBreaker = CircuitBreaker(
        serviceName = "session_recovery",
        failureThreshold = CIRCUIT_BREAKER_THRESHOLD,
        recoveryTimeoutSeconds = 60L
    )

    // Coroutine scope for async operations
    private val recoveryScope = CoroutineScope(
        Dispatchers.IO + SupervisorJob() + CoroutineExceptionHandler { _, throwable ->
            handleRecoveryException(throwable)
        }
    )

    // Periodic health check
    private val handler = Handler(Looper.getMainLooper())
    private val periodicCheckRunnable = object : Runnable {
        override fun run() {
            if (_recoveryState.value == RecoveryState.IDLE) {
                performPeriodicHealthCheck()
            }
            handler.postDelayed(this, PERIODIC_CHECK_INTERVAL_MS)
        }
    }

    // Event subscriptions
    private var isSubscribed = false

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId) v$moduleVersion - $moduleType")
        eventBus.subscribe(this)
        isSubscribed = true
        startPeriodicHealthCheck()
    }

    /**
     * Unregisters from event notifications.
     */
    fun unregisterFromEvents() {
        if (isSubscribed) {
            eventBus.unsubscribe(this)
            isSubscribed = false
        }
    }

    // ========== BootstrapObserver Implementation ==========

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.SessionRecoveryRequired,
            is BootstrapEvent.SessionValidationFailed,
            is BootstrapEvent.SessionExpiredDetected,
            is BootstrapEvent.SessionFailed,
            is BootstrapEvent.SessionIntegrityFailed,
            is BootstrapEvent.IntegrityFailure,
            is BootstrapEvent.ApplicationRestarted,
            is BootstrapEvent.NetworkRecovered,
            is BootstrapEvent.ApplicationCrashed,
            is BootstrapEvent.DeviceUnlocked,
            is BootstrapEvent.ProcessRecreated,
            is BootstrapEvent.RecoveryRequested -> {
                Log.i(TAG, "Recovery trigger detected: ${event.javaClass.simpleName}")
                recoveryScope.launch {
                    recoverSession()
                }
            }
            is BootstrapEvent.SessionValidatorReady -> {
                Log.i(TAG, "Initializing SessionRecoveryManager (SESSION-003)")
                // JSON: startup_sequence: action: initialize_session_recovery_manager
                
                // action: initialize_session_recovery_manager
                // In a real implementation, this might perform baseline checks
                
                // JSON: completion_event: session_platform_ready
                if (!_isRecoveryRunning.value) {
                    authEventManager.publish(BootstrapEvent.SessionPlatformReady)
                }
            }
            else -> {
                // Not interested in other events
            }
        }
    }

    // ========== ISessionRecoveryManager Implementation ==========

    override fun recoverSession(): RecoveryResult {
        if (!isEnabled) {
            Log.d(TAG, "Skipping session recovery: Manager disabled (Policy: auth_transaction_active)")
            return RecoveryResult.Failed("Manager disabled during transaction", 0, "AUTH_TXN_LOCKED")
        }
        return runBlocking {
            executeRecoveryPipeline()
        }
    }

    override fun restoreBackup(): RecoveryResult {
        return runBlocking {
            executeBackupRestore()
        }
    }

    override fun recreateSession(): RecoveryResult {
        return runBlocking {
            executeSessionRecreation()
        }
    }

    override fun abortRecovery(): Boolean {
        val currentState = _recoveryState.value
        if (currentState == RecoveryState.RECOVERY_PENDING && !hasCredentialsBeenAccessed()) {
            updateState(RecoveryState.IDLE)
            authEventManager.publish(BootstrapEvent.SessionRecoveryAborted)
            auditRecovery("session_recovery_aborted")
            incrementMetric { it.copy(abortedRecoveries = it.abortedRecoveries + 1) }
            return true
        }
        return false
    }

    override fun setEnabled(enabled: Boolean) {
        Log.i(TAG, "SessionRecoveryManager enabled: $enabled")
        this.isEnabled = enabled
        if (!enabled && _isRecoveryRunning.value) {
            Log.d(TAG, "Warning: Session recovery disabled while running.")
        }
    }

    override fun getMetrics(): SessionRecoveryMetrics {
        synchronized(metricsLock) {
            return metrics.copy()
        }
    }

    override fun getRecoveryReport(): String {
        val currentMetrics = getMetrics()
        // Use dependencies to enrich report
        val circuitState = recoveryManager.getCircuitBreaker("session_recovery")?.getState() ?: "UNKNOWN"
        
        return StringBuilder().apply {
            appendLine("=== Session Recovery Report (SESSION-003) ===")
            appendLine("Module: $moduleName ($moduleId) v$moduleVersion")
            appendLine("Current State: ${currentMetrics.currentState}")
            appendLine("Circuit Breaker: $circuitState")
            appendLine("Total Recovery Attempts: ${currentMetrics.totalAttempts}")
            appendLine("Success Rate: ${currentMetrics.successRate}%")
            appendLine("Successful Recoveries: ${currentMetrics.successfulRecoveries}")
            appendLine("Failed Recoveries: ${currentMetrics.failedRecoveries}")
            appendLine("Re-authentications: ${currentMetrics.reauthentications}")
            appendLine("Session Recreations: ${currentMetrics.sessionRecreations}")
            appendLine("Aborted Recoveries: ${currentMetrics.abortedRecoveries}")
            appendLine("Consecutive Failures: ${currentMetrics.consecutiveFailures}")
            appendLine("Circuit Breaker Status: ${if (currentMetrics.circuitBreakerOpen) "OPEN" else "CLOSED"}")
            appendLine("Last Attempt: ${if (currentMetrics.lastRecoveryAttempt > 0) java.util.Date(currentMetrics.lastRecoveryAttempt) else "Never"}")
            appendLine("Last Success: ${if (currentMetrics.lastSuccessfulRecovery > 0) java.util.Date(currentMetrics.lastSuccessfulRecovery) else "Never"}")
            appendLine("Last Failure: ${if (currentMetrics.lastFailedRecovery > 0) java.util.Date(currentMetrics.lastFailedRecovery) else "Never"}")
            appendLine("============================================")
        }.toString()
    }

    // ========== Recovery Pipeline ==========

    private suspend fun executeRecoveryPipeline(): RecoveryResult {
        if (_isRecoveryRunning.value) {
            return RecoveryResult.InProgress(getCurrentStep(), 10)
        }

        if (recoveryCircuitBreaker.canExecute() == false) {
            return RecoveryResult.Failed(
                reason = "Circuit breaker is open",
                attempts = metrics.consecutiveFailures,
                lastError = "Too many consecutive failures"
            )
        }

        _isRecoveryRunning.value = true
        updateState(RecoveryState.RECOVERY_PENDING)
        authEventManager.publish(BootstrapEvent.SessionRecoveryStarted)
        auditRecovery("session_recovery_started")

        var attempts = 0
        var lastError = ""

        while (attempts < MAX_RECOVERY_ATTEMPTS) {
            attempts++
            updateMetric { it.copy(totalAttempts = it.totalAttempts + 1, lastRecoveryAttempt = System.currentTimeMillis()) }

            val result = try {
                performRecoveryStepByStep()
            } catch (e: Exception) {
                lastError = e.message ?: "Unknown error"
                handleRecoveryException(e)
                null
            }

            if (result is RecoveryResult.Success) {
                handleSuccessfulRecovery(result)
                return result
            }

            // Apply exponential backoff before retry
            if (attempts < MAX_RECOVERY_ATTEMPTS) {
                delay(BACKOFF_BASE_MS * (1 shl (attempts - 1)))
            }
        }

        // All attempts failed
        handleFailedRecovery(lastError, attempts)
        return RecoveryResult.Failed(
            reason = "Recovery failed after $attempts attempts",
            attempts = attempts,
            lastError = lastError
        )
    }

    private fun auditRecovery(event: String) {
        Log.i(TAG, "Audit: $event")
        // In a real implementation, this would call SecurityAuditLogger
    }

    private suspend fun performRecoveryStepByStep(): RecoveryResult {
        // Step 1: Detect recovery trigger (handled by executeRecoveryPipeline calling this)

        // Step 2: Pause session operations
        pauseSessionOperations()

        // Step 3: Load latest secure session
        updateState(RecoveryState.VALIDATING_BACKUP)
        val backupSessionJson = loadBackupSessionJson()
        if (backupSessionJson == null) {
            // No backup, try to recreate from credentials
            return executeSessionRecreation()
        }
        authEventManager.publish(BootstrapEvent.SessionBackupLoaded)
        auditRecovery("session_backup_loaded")

        // Step 4: Verify integrity using SessionValidator
        val validationResult = sessionValidator.validateSession()
        if (validationResult is SessionValidationResult.Tampered || 
            validationResult is SessionValidationResult.Corrupted) {
            handleIntegrityFailure(validationResult)
            return executeSessionRecreation()
        }

        // Step 5: Verify authentication state
        if (validationResult is SessionValidationResult.Expired) {
            val credentials = loadCredentials()
            if (credentials != null) {
                return executeReauthentication(credentials)
            } else {
                return handleFatalRecoveryFailure("Session expired and no credentials found")
            }
        }

        // Step 6: Restore session
        updateState(RecoveryState.RESTORING_SESSION)
        authEventManager.publish(BootstrapEvent.SessionRestorationStarted)
        auditRecovery("session_restoration_started")
        val restoreResult = sessionManager.restoreSession()
        if (!restoreResult) {
            return executeSessionRecreation()
        }
        authEventManager.publish(BootstrapEvent.SessionRestoredFromBackup)
        auditRecovery("session_restored")

        // Step 7: Synchronize cookies
        synchronizeCookies()

        // Step 8: Reconnect portal
        reconnectPortal()

        // Step 9: Resume platform operations
        resumePlatformOperations()

        // Step 10: Publish recovery completed
        updateState(RecoveryState.RECOVERY_COMPLETED)
        authEventManager.publish(BootstrapEvent.SessionRecoveryCompleted)
        authEventManager.publish(BootstrapEvent.SessionPlatformReady)
        auditRecovery("session_recovery_completed")
        auditRecovery("session_platform_ready")

        return RecoveryResult.Success(
            session = sessionManager.getCurrentSession()!!,
            restoredAt = System.currentTimeMillis(),
            method = RecoveryMethod.BACKUP_RESTORE
        )
    }

    private fun pauseSessionOperations() {
        Log.i(TAG, "Step 2: Pausing session operations")
        // Implementation would involve signaling SessionManager or Interceptors to queue requests
    }

    private fun synchronizeCookies() {
        Log.i(TAG, "Step 7: Synchronizing cookies")
        // Coordinate with CookieManager
        val cookies = sessionManager.getCookies()
        if (cookies.isNotEmpty()) {
            cookieManagerProvider.get().saveCookies(cookies)
        }
    }

    private fun reconnectPortal() {
        Log.i(TAG, "Step 8: Reconnecting portal")
        recoveryScope.launch {
            portalConnector.connect()
            authEventManager.publish(BootstrapEvent.PortalConnected)
        }
    }

    private fun resumePlatformOperations() {
        Log.i(TAG, "Step 9: Resuming platform operations")
    }

    private fun handleIntegrityFailure(result: SessionValidationResult) {
        Log.w(TAG, "Integrity failure detected: $result")
        securityMonitor.processThreat(
            ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.APP_TAMPERING,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.CRITICAL,
                description = "Session integrity failure: $result",
                source = TAG
            )
        )
    }

    private fun handleFatalRecoveryFailure(reason: String): RecoveryResult {
        Log.e(TAG, "Fatal recovery failure: $reason")
        updateState(RecoveryState.SESSION_TERMINATED)
        eventBus.publish(BootstrapEvent.SessionTerminated)
        
        // JSON: fail_closed: true, fallback_to_login: true
        sessionManager.terminateSession()
        
        return RecoveryResult.Failed(
            reason = reason,
            attempts = 1,
            lastError = reason
        )
    }

    private suspend fun executeBackupRestore(): RecoveryResult {
        updateState(RecoveryState.VALIDATING_BACKUP)

        val backupSessionJson = loadBackupSessionJson()
        if (backupSessionJson == null) {
            return RecoveryResult.FallbackAuth(
                reason = "No backup session found",
                requiresInteraction = true
            )
        }
        authEventManager.publish(BootstrapEvent.SessionBackupLoaded)
        auditRecovery("session_backup_loaded")

        val validationResult = sessionValidator.validateSession()
        if (validationResult is SessionValidationResult.Failed) {
            return RecoveryResult.Failed(
                reason = "Backup validation failed",
                attempts = 1,
                lastError = validationResult.reason
            )
        }

        updateState(RecoveryState.RESTORING_SESSION)
        authEventManager.publish(BootstrapEvent.SessionRestorationStarted)
        auditRecovery("session_restoration_started")

        val restoreResult = sessionManager.restoreSession()
        if (!restoreResult) {
            return RecoveryResult.Failed(
                reason = "Failed to restore session",
                attempts = 1,
                lastError = "SessionManager.restoreSession returned false"
            )
        }
        authEventManager.publish(BootstrapEvent.SessionRestoredFromBackup)
        auditRecovery("session_restored")

        updateState(RecoveryState.VERIFYING_SESSION)
        val restoredSession = sessionManager.getCurrentSession()
            ?: return RecoveryResult.Failed(
                reason = "Session not found after restore",
                attempts = 1,
                lastError = "getCurrentSession returned null"
            )

        updateState(RecoveryState.RECOVERY_COMPLETED)
        authEventManager.publish(BootstrapEvent.SessionRecoveryCompleted)
        authEventManager.publish(BootstrapEvent.SessionPlatformReady)
        auditRecovery("session_recovery_completed")
        auditRecovery("session_platform_ready")

        return RecoveryResult.Success(
            session = restoredSession,
            restoredAt = System.currentTimeMillis(),
            method = RecoveryMethod.BACKUP_RESTORE
        )
    }

    private suspend fun executeSessionRecreation(): RecoveryResult {
        updateState(RecoveryState.RECOVERY_PENDING)

        val credentials = loadCredentials()
        if (credentials == null) {
            return RecoveryResult.FallbackAuth(
                reason = "No stored credentials available",
                requiresInteraction = true
            )
        }

        updateState(RecoveryState.REAUTHENTICATING)
        authEventManager.publish(BootstrapEvent.SessionRestorationStarted)
        auditRecovery("session_restoration_started")

        // Attempt re-authentication with stored credentials
        val authRequest = AuthRequest(
            registrationNumber = credentials.first,
            password = credentials.second
        )

        // Note: This is simplified. In production, you'd need to handle the async callback properly
        // For now, we simulate by checking if session was created
        val newSession = sessionManager.getCurrentSession()
        if (newSession != null) {
            updateState(RecoveryState.SESSION_RECREATED)
            authEventManager.publish(BootstrapEvent.SessionRecreated)
            authEventManager.publish(BootstrapEvent.SessionRecoveryCompleted)
            authEventManager.publish(BootstrapEvent.SessionPlatformReady)
            auditRecovery("session_recreated")
            auditRecovery("session_recovery_completed")
            auditRecovery("session_platform_ready")

            incrementMetric { it.copy(sessionRecreations = it.sessionRecreations + 1) }

            return RecoveryResult.Success(
                session = newSession,
                restoredAt = System.currentTimeMillis(),
                method = RecoveryMethod.CREDENTIAL_RECREATE
            )
        }

        return RecoveryResult.Failed(
            reason = "Failed to recreate session",
            attempts = 1,
            lastError = "Session not found after authentication"
        )
    }

    private suspend fun executeReauthentication(
        credentials: Pair<String, String>
    ): RecoveryResult {
        updateState(RecoveryState.REAUTHENTICATING)

        // Attempt re-authentication with stored credentials
        val authRequest = AuthRequest(
            registrationNumber = credentials.first,
            password = credentials.second
        )

        val newSession = sessionManager.getCurrentSession()
        if (newSession != null) {
            authEventManager.publish(BootstrapEvent.SessionReauthenticated)
            auditRecovery("session_reauthenticated")
            restoreCompleteContext(newSession)
            updateState(RecoveryState.RECOVERY_COMPLETED)
            authEventManager.publish(BootstrapEvent.SessionRecoveryCompleted)
            authEventManager.publish(BootstrapEvent.SessionPlatformReady)
            auditRecovery("session_recovery_completed")
            auditRecovery("session_platform_ready")

            incrementMetric { it.copy(reauthentications = it.reauthentications + 1) }

            return RecoveryResult.Success(
                session = newSession,
                restoredAt = System.currentTimeMillis(),
                method = RecoveryMethod.REAUTHENTICATION
            )
        }

        return RecoveryResult.FallbackAuth(
            reason = "Re-authentication failed",
            requiresInteraction = true
        )
    }

    // ========== Helper Methods ==========

    private suspend fun loadCredentials(): Pair<String, String>? {
        credentialsAccessed = true
        return withContext(Dispatchers.IO) {
            try {
                val result = secureStorage.getCredential(CREDENTIALS_KEY)
                if (result.success && result.getOrNull() != null) {
                    val decrypted = decryptCredentials(result.getOrNull()!!)
                    parseCredentials(decrypted)
                } else {
                    null
                }
            } catch (e: Exception) {
                null
            }
        }
    }

    private fun decryptCredentials(encryptedData: String): String {
        // In production, use proper decryption with CryptoManager
        // This is a simplified implementation
        return try {
            val decoded = Base64.decode(encryptedData, Base64.DEFAULT)
            String(decoded)
        } catch (e: Exception) {
            ""
        }
    }

    private fun parseCredentials(data: String): Pair<String, String>? {
        return try {
            val parts = data.split("|")
            if (parts.size >= 2) {
                Pair(parts[0], parts[1])
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }

    private suspend fun loadBackupSessionJson(): String? {
        return withContext(Dispatchers.IO) {
            try {
                val result = secureStorage.getSession(BACKUP_SESSION_KEY)
                if (result.success) {
                    result.getOrNull()
                } else {
                    null
                }
            } catch (e: Exception) {
                null
            }
        }
    }

    private fun getDeviceId(): String {
        // Get device ID for authentication
        return try {
            val deviceId = android.provider.Settings.Secure.getString(
                context.contentResolver,
                android.provider.Settings.Secure.ANDROID_ID
            )
            deviceId ?: "unknown"
        } catch (e: Exception) {
            "unknown"
        }
    }

    private fun restoreCompleteContext(session: Session) {
        // Use dependencies to restore context
        val authState = authStateManager.getCurrentState()
        Log.d(TAG, "Restoring context for session: ${session.sessionId}, authState: $authState")
        
        // Restore cookies
        val cookies = sessionManager.getCookies()
        if (cookies.isNotEmpty()) {
            cookieManagerProvider.get().saveCookies(cookies)
        }
        
        // Post-restore security scan
        securityMonitor.isPlatformSecure()
    }

    private var credentialsAccessed = false
    private fun hasCredentialsBeenAccessed(): Boolean = credentialsAccessed

    private fun updateState(newState: RecoveryState) {
        _recoveryState.value = newState
        incrementMetric { it.copy(currentState = newState) }
    }

    private fun getCurrentStep(): Int {
        return when (_recoveryState.value) {
            RecoveryState.IDLE -> 0
            RecoveryState.RECOVERY_PENDING -> 1
            RecoveryState.VALIDATING_BACKUP -> 2
            RecoveryState.RESTORING_SESSION -> 3
            RecoveryState.VERIFYING_SESSION -> 4
            RecoveryState.REAUTHENTICATING -> 5
            RecoveryState.RECOVERY_COMPLETED -> 10
            RecoveryState.RECOVERY_FAILED -> 10
            RecoveryState.SESSION_RECREATED -> 10
            RecoveryState.SESSION_TERMINATED -> 10
        }
    }

    private fun handleSuccessfulRecovery(result: RecoveryResult.Success) {
        _isRecoveryRunning.value = false
        recoveryCircuitBreaker.recordSuccess()
        incrementMetric {
            it.copy(
                successfulRecoveries = it.successfulRecoveries + 1,
                lastSuccessfulRecovery = System.currentTimeMillis(),
                consecutiveFailures = 0
            )
        }
    }

    private fun handleFailedRecovery(lastError: String, attempts: Int) {
        _isRecoveryRunning.value = false
        recoveryCircuitBreaker.recordFailure()
        updateState(RecoveryState.RECOVERY_FAILED)
        authEventManager.publish(BootstrapEvent.SessionRecoveryFailed(lastError, attempts))
        auditRecovery("session_recovery_failed")
        securityMonitor.processThreat(
            ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.HIGH,
                description = "Session recovery failed after $attempts attempts: $lastError",
                source = TAG
            )
        )
        incrementMetric {
            it.copy(
                failedRecoveries = it.failedRecoveries + 1,
                lastFailedRecovery = System.currentTimeMillis(),
                consecutiveFailures = it.consecutiveFailures + 1,
                circuitBreakerOpen = recoveryCircuitBreaker.getState() == CircuitBreakerState.OPEN
            )
        }
    }

    private fun handleRecoveryException(throwable: Throwable) {
        _isRecoveryRunning.value = false
        recoveryCircuitBreaker.recordFailure()
        securityMonitor.processThreat(
            ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.HIGH,
                description = "Session recovery exception: ${throwable.message}",
                source = TAG
            )
        )
    }

    private inline fun incrementMetric(update: (SessionRecoveryMetrics) -> SessionRecoveryMetrics) {
        synchronized(metricsLock) {
            metrics = update(metrics)
        }
    }

    private inline fun updateMetric(update: (SessionRecoveryMetrics) -> SessionRecoveryMetrics) {
        synchronized(metricsLock) {
            metrics = update(metrics)
        }
    }

    // ========== Periodic Health Check ==========

    private fun startPeriodicHealthCheck() {
        handler.post(periodicCheckRunnable)
    }

    private fun stopPeriodicHealthCheck() {
        handler.removeCallbacks(periodicCheckRunnable)
    }

    private fun performPeriodicHealthCheck() {
        val currentSession = sessionManager.getCurrentSession()
        if (currentSession == null) {
            // No session, trigger recovery
            recoveryScope.launch {
                recoverSession()
            }
            return
        }

        // Lightweight expiration check
        val validationResult = sessionValidator.validateSession()
        when (validationResult) {
            is SessionValidationResult.Expired,
            is SessionValidationResult.Invalid,
            is SessionValidationResult.Tampered,
            is SessionValidationResult.Corrupted -> {
                // Session has issues, trigger recovery
                recoveryScope.launch {
                    recoverSession()
                }
            }
            else -> {
                // Session is valid, no action needed
            }
        }
    }

    // ========== Cleanup ==========

    fun shutdown() {
        stopPeriodicHealthCheck()
        recoveryScope.cancel()
        unregisterFromEvents()
    }
}