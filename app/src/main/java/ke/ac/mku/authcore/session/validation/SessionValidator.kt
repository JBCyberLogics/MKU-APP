package ke.ac.mku.authcore.session.validation

import android.content.Context
import android.os.SystemClock
import android.provider.Settings.Secure
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.session.SessionValidationError
import ke.ac.mku.authcore.contracts.session.SessionValidationResult
import ke.ac.mku.authcore.contracts.session.SessionValidatorMetrics
import ke.ac.mku.authcore.contracts.session.SessionWarning
import ke.ac.mku.authcore.contracts.session.SessionWarningType
import ke.ac.mku.authcore.session.validation.SessionValidatorMetricsImpl
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.domain.model.Session
import ke.ac.mku.authcore.registry.DependencyRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SessionValidator - SESSION-002
 *
 * Central session validation engine.
 * Provides continuous and on-demand session validation.
 *
 * Features:
 * - Hybrid continuous validation (adaptive frequency)
 * - Event-driven immediate validation
 * - HMAC/signature verification
 * - Device binding verification
 * - Security status checks
 */
class SessionValidator constructor(
    @ApplicationContext private val context: Context,
    private val sessionManager: ISessionManager,
    private val secureStorage: ISecureStorageManager,
    private val cryptoManager: ICryptoManager,
    private val securityMonitor: ISecurityMonitor,
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry,
    private val authEventManager: IAuthenticationEventManager
) : ISessionValidator, BootstrapObserver {

    companion object {
        private const val TAG = "SessionValidator"
        private const val DEFAULT_FOREGROUND_INTERVAL = 60_000L // 60 seconds
        private const val DEFAULT_BACKGROUND_INTERVAL = 300_000L // 5 minutes
    }

    // Coroutine scope for continuous validation
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var validationJob: Job? = null

    // Validation state
    @Volatile
    private var lastValidationResult: SessionValidationResult? = null

    @Volatile
    private var isValidationActive = false

    // Metrics
    private var totalValidations = 0L
    private var passedValidations = 0L
    private var failedValidations = 0L
    private var integrityFailures = 0L
    private var expirationEvents = 0L
    private var recoveryRequests = 0L
    private var lastValidationTime = 0L

    // Configuration
    private var foregroundInterval = DEFAULT_FOREGROUND_INTERVAL
    private var backgroundInterval = DEFAULT_BACKGROUND_INTERVAL
    private var isInForeground = true

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "SessionValidator initialized")
    }

    // ==================== ISessionValidator Implementation ====================

    override fun validateSession(): SessionValidationResult {
        val now = System.currentTimeMillis()
        totalValidations++
        lastValidationTime = now

        authEventManager.publish(BootstrapEvent.SessionValidationStarted)

        // Get current session
        val session = sessionManager.getCurrentSession()
        if (session == null) {
            val result = SessionValidationResult.Invalid(
                sessionId = null,
                reason = "No active session",
                validationTime = now,
                errors = listOf(SessionValidationError.SESSION_NOT_FOUND)
            )
            lastValidationResult = result
            failedValidations++
            authEventManager.publish(BootstrapEvent.SessionValidationFailed("No active session"))
            return result
        }

        // Perform all validation checks
        val warnings = mutableListOf<SessionWarning>()

        // 1. Integrity check
        val integrityResult = validateIntegrity()
        if (integrityResult !is SessionValidationResult.Valid) {
            lastValidationResult = integrityResult
            failedValidations++
            when (integrityResult) {
                is SessionValidationResult.Tampered -> {
                    integrityFailures++
                    authEventManager.publish(BootstrapEvent.SessionIntegrityFailed(integrityResult.reason))
                }
                is SessionValidationResult.Corrupted -> {
                    integrityFailures++
                    authEventManager.publish(BootstrapEvent.SessionIntegrityFailed(integrityResult.reason))
                }
                else -> authEventManager.publish(BootstrapEvent.SessionValidationFailed(integrityResult.toString()))
            }
            return integrityResult
        }

        // 2. Expiration check
        val expirationResult = validateExpiration()
        if (expirationResult is SessionValidationResult.Expired) {
            expirationEvents++
            lastValidationResult = expirationResult
            failedValidations++
            authEventManager.publish(BootstrapEvent.SessionExpiredDetected)
            return expirationResult
        }

        // 3. Device binding check
        val deviceResult = validateDevice()
        if (deviceResult !is SessionValidationResult.Valid) {
            lastValidationResult = deviceResult
            failedValidations++
            authEventManager.publish(BootstrapEvent.SessionValidationFailed(deviceResult.toString()))
            return deviceResult
        }

        // 4. Security platform check
        if (!securityMonitor.isPlatformSecure()) {
            val warning = SessionWarning(
                type = SessionWarningType.SECURITY_CHECK_FAILED,
                message = "Platform security check failed",
                severity = RiskLevel.HIGH
            )
            warnings.add(warning)
        }

        // 5. Check for near expiry
        val timeUntilExpiry = sessionManager.getTimeUntilExpiry()
        if (timeUntilExpiry <= 300_000L) { // 5 minutes
            val warning = SessionWarning(
                type = SessionWarningType.NEAR_EXPIRY,
                message = "Session expires in ${timeUntilExpiry / 1000} seconds",
                severity = RiskLevel.MEDIUM
            )
            warnings.add(warning)
        }

        // 6. Check refresh count
        if (session.refreshCount >= 20) {
            val warning = SessionWarning(
                type = SessionWarningType.EXCESSIVE_REFRESH_COUNT,
                message = "Session has been refreshed ${session.refreshCount} times",
                severity = RiskLevel.LOW
            )
            warnings.add(warning)
        }

        // All checks passed
        val result = if (warnings.isNotEmpty()) {
            SessionValidationResult.Warning(
                session = session,
                reason = "Session valid with warnings",
                validationTime = now,
                warnings = warnings
            )
        } else {
            SessionValidationResult.Valid(
                session = session,
                validationTime = now,
                warnings = emptyList()
            )
        }

        lastValidationResult = result
        passedValidations++
        authEventManager.publish(BootstrapEvent.SessionValidationPassed)

        return result
    }

    override fun validateIntegrity(): SessionValidationResult {
        val now = System.currentTimeMillis()
        val session = sessionManager.getCurrentSession()

        if (session == null) {
            return SessionValidationResult.Invalid(
                sessionId = null,
                reason = "No session to verify",
                validationTime = now,
                errors = listOf(SessionValidationError.SESSION_NOT_FOUND)
            )
        }

        // Get stored HMAC
        val storedHmac = getStoredHmac(session.sessionId)
        if (storedHmac == null) {
            return SessionValidationResult.Tampered(
                sessionId = session.sessionId,
                reason = "No HMAC found for session",
                validationTime = now
            )
        }

        // Regenerate HMAC and compare
        val dataToSign = "${session.sessionId}|${session.user.registrationNumber}|${session.loginTimestamp}|${session.expiryTimestamp}"
        val expectedHmac = cryptoManager.generateStringHmac(dataToSign, KeyAlias.HMAC)

        if (expectedHmac != storedHmac) {
            Log.w(TAG, "HMAC mismatch for session ${session.sessionId}")
            return SessionValidationResult.Tampered(
                sessionId = session.sessionId,
                reason = "HMAC verification failed - session may have been tampered",
                validationTime = now
            )
        }

        authEventManager.publish(BootstrapEvent.SessionIntegrityVerified)
        return SessionValidationResult.Valid(
            session = session,
            validationTime = now,
            warnings = emptyList()
        )
    }

    override fun validateExpiration(): SessionValidationResult {
        val now = System.currentTimeMillis()
        val session = sessionManager.getCurrentSession()

        if (session == null) {
            return SessionValidationResult.Invalid(
                sessionId = null,
                reason = "No session to check",
                validationTime = now,
                errors = listOf(SessionValidationError.SESSION_NOT_FOUND)
            )
        }

        if (sessionManager.isSessionExpired()) {
            return SessionValidationResult.Expired(
                sessionId = session.sessionId,
                expiredAt = session.expiryTimestamp,
                validationTime = now
            )
        }

        return SessionValidationResult.Valid(
            session = session,
            validationTime = now,
            warnings = emptyList()
        )
    }

    override fun validateDevice(): SessionValidationResult {
        val now = System.currentTimeMillis()
        val session = sessionManager.getCurrentSession()

        if (session == null) {
            return SessionValidationResult.Invalid(
                sessionId = null,
                reason = "No session to verify",
                validationTime = now,
                errors = listOf(SessionValidationError.SESSION_NOT_FOUND)
            )
        }

        val storedDeviceId = session.deviceId
        if (storedDeviceId == null) {
            // Device binding not set - this is a warning, not a failure
            val warning = SessionWarning(
                type = SessionWarningType.DEVICE_BINDING_WEAK,
                message = "Session has no device binding",
                severity = RiskLevel.MEDIUM
            )
            return SessionValidationResult.Warning(
                session = session,
                reason = "No device binding",
                validationTime = now,
                warnings = listOf(warning)
            )
        }

        // Get current device fingerprint
        val currentFingerprint = getCurrentDeviceFingerprint()

        if (storedDeviceId != currentFingerprint) {
            Log.w(TAG, "Device mismatch: stored=$storedDeviceId, current=$currentFingerprint")
            return SessionValidationResult.Invalid(
                sessionId = session.sessionId,
                reason = "Device binding mismatch - session used from different device",
                validationTime = now,
                errors = listOf(SessionValidationError.DEVICE_MISMATCH)
            )
        }

        return SessionValidationResult.Valid(
            session = session,
            validationTime = now,
            warnings = emptyList()
        )
    }

    override fun validateCookies(): SessionValidationResult {
        val now = System.currentTimeMillis()
        val session = sessionManager.getCurrentSession()

        if (session == null) {
            return SessionValidationResult.Invalid(
                sessionId = null,
                reason = "No session to verify",
                validationTime = now,
                errors = listOf(SessionValidationError.SESSION_NOT_FOUND)
            )
        }

        val cookies = sessionManager.getCookies()
        if (cookies.isEmpty()) {
            return SessionValidationResult.Warning(
                session = session,
                reason = "No cookies in session",
                validationTime = now,
                warnings = listOf(
                    SessionWarning(
                        type = SessionWarningType.SUSPICIOUS_ACTIVITY,
                        message = "Session has no cookies",
                        severity = RiskLevel.LOW
                    )
                )
            )
        }

        return SessionValidationResult.Valid(
            session = session,
            validationTime = now,
            warnings = emptyList()
        )
    }

    override fun getLastValidationResult(): SessionValidationResult? = lastValidationResult

    override fun isValidationActive(): Boolean = isValidationActive

    override fun startContinuousValidation(
        foregroundIntervalSeconds: Int,
        backgroundIntervalSeconds: Int
    ) {
        if (isValidationActive) {
            Log.w(TAG, "Continuous validation already active")
            return
        }

        foregroundInterval = foregroundIntervalSeconds * 1000L
        backgroundInterval = backgroundIntervalSeconds * 1000L
        isValidationActive = true

        validationJob = scope.launch {
            Log.i(TAG, "Starting continuous validation (fg=${foregroundInterval}ms, bg=${backgroundInterval}ms)")
            
            while (isValidationActive && isActive) {
                // Only validate if there's an active session
                if (sessionManager.isSessionActive()) {
                    validateSession()
                }

                // Use adaptive interval based on foreground/background
                val interval = if (isInForeground) foregroundInterval else backgroundInterval
                delay(interval)
            }
        }

        Log.i(TAG, "Continuous validation started")
    }

    override fun stopContinuousValidation() {
        isValidationActive = false
        validationJob?.cancel()
        validationJob = null
        Log.i(TAG, "Continuous validation stopped")
    }

    override fun getMetrics(): SessionValidatorMetrics {
        return SessionValidatorMetricsImpl(
            totalValidations = totalValidations,
            passedValidations = passedValidations,
            failedValidations = failedValidations,
            integrityFailures = integrityFailures,
            expirationEvents = expirationEvents,
            recoveryRequests = recoveryRequests,
            lastValidationTime = lastValidationTime,
            lastValidationResult = lastValidationResult?.javaClass?.simpleName ?: "None",
            continuousValidationActive = isValidationActive
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.SessionCreated,
            is BootstrapEvent.SessionRestored,
            is BootstrapEvent.SessionRefreshed -> {
                // Immediate validation on session changes
                Log.d(TAG, "Session lifecycle event, triggering immediate validation")
                validateSession()
            }
            is BootstrapEvent.SessionTerminated,
            is BootstrapEvent.SessionExpired -> {
                // Stop validation when session ends
                if (isValidationActive) {
                    stopContinuousValidation()
                }
            }
            is BootstrapEvent.BootstrapCompleted -> {
                // Register with dependency registry
                dependencyRegistry.register(
                    name = "session_validator",
                    instance = this,
                    dependencies = listOf(
                        "session_manager",
                        "secure_storage_manager",
                        "crypto_manager",
                        "security_monitor"
                    ),
                    startupOrder = 21,
                    isRequired = true
                )
                Log.i(TAG, "SessionValidator registered with DependencyRegistry")
                authEventManager.publish(BootstrapEvent.SessionValidatorReady)
            }
            else -> { /* Ignore other events */ }
        }
    }

    // ==================== Private Helper Methods ====================

    /**
     * Get stored HMAC for a session from secure storage.
     */
    private fun getStoredHmac(sessionId: String): String? {
        val result = secureStorage.retrieve(StorageDomain.SESSIONS, "session_hmac_$sessionId")
        return result.getOrNull()
    }

    /**
     * Get current device fingerprint.
     * Format: ANDROID_ID_cumulativeBootTime
     */
    private fun getCurrentDeviceFingerprint(): String {
        val androidId = Secure.getString(
            context.contentResolver,
            Secure.ANDROID_ID
        ) ?: "unknown"
        val cumulativeBootTime = SystemClock.elapsedRealtime()
        return "${androidId}_$cumulativeBootTime"
    }
}