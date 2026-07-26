package ke.ac.mku.authcore.manager

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
import ke.ac.mku.authcore.contracts.session.SessionManagerMetrics
import ke.ac.mku.authcore.contracts.session.SessionTransition
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.domain.model.Session
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.state.SessionState
import ke.ac.mku.authcore.state.StateRegistry
import org.json.JSONObject
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SessionManager - SESSION-001
 *
 * Central authority for session lifecycle management.
 * Implements FSM pattern with validated transitions only.
 * Single source of truth for session state across the platform.
 *
 * Architecture:
 * - Single active session policy
 * - Events published via IAuthenticationEventManager
 * - State updates via StateRegistry
 * - Persistence via ISecureStorageManager (SESSIONS domain)
 * - Recovery via RecoveryManager
 */
@Singleton
class SessionManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val stateRegistry: StateRegistry,
    private val secureStorage: ISecureStorageManager,
    private val recoveryManager: RecoveryManager,
    private val securityMonitor: ISecurityMonitor,
    private val eventBus: EventBus,
    private val dependencyRegistry: ke.ac.mku.authcore.contracts.registry.IDependencyRegistry,
    private val authEventManager: IAuthenticationEventManager,
    private val cryptoManager: ICryptoManager
) : ISessionManager, BootstrapObserver {

    companion object {
        private const val TAG = "SessionManager"
        private const val SESSION_KEY = "current_session"
        private const val SESSION_INDEX_KEY = "session_index"
        private const val SESSION_TIMEOUT_MS = 1800000L // 30 minutes
        private const val REFRESH_BEFORE_EXPIRY_MS = 300000L // 5 minutes
        private const val MAX_REFRESH_COUNT = 24
    }

    // Current and previous state
    @Volatile
    private var currentState: SessionState = SessionState.NONE

    @Volatile
    private var previousState: SessionState = SessionState.NONE

    // Current session data
    @Volatile
    private var currentSession: Session? = null

    // State transition history
    private val transitionHistory = mutableListOf<SessionTransition>()

    // Metrics
    private var totalSessions = 0
    private var activeSessions = 0
    private var expiredSessions = 0
    private var totalRefreshCount = 0
    private var failedRefreshCount = 0
    private var lastSessionTimestamp = 0L
    private val startTime = System.currentTimeMillis()

    // Valid state transitions map
    private val validTransitions: Map<SessionState, Set<SessionState>> by lazy {
        buildValidTransitionsMap()
    }

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "SessionManager initialized")
    }

    // ==================== ISessionManager Implementation ====================

    override fun createSession(
        regNumber: String,
        studentName: String?,
        cookies: Map<String, String>,
        portalType: String
    ): Boolean {
        val from = currentState

        // Validate transition
        if (!isValidTransition(from, SessionState.CREATING)) {
            Log.w(TAG, "Invalid transition: $from -> CREATING")
            authEventManager.publish(BootstrapEvent.SessionFailed("Invalid transition: $from -> CREATING"))
            return false
        }

        // Security check
        if (!securityMonitor.isPlatformSecure()) {
            Log.w(TAG, "Security check failed")
            authEventManager.publish(BootstrapEvent.SessionFailed("Security check failed"))
            return false
        }

        // Transition to CREATING
        transitionTo(SessionState.CREATING)

        // Take snapshot for potential rollback
        recoveryManager.takeSnapshot("SessionManager", mapOf(
            "previousState" to previousState.name,
            "currentState" to currentState.name
        ))

        return try {
            // Terminate existing session if any
            if (currentSession != null) {
                Log.i(TAG, "Terminating existing session before creating new one")
                authEventManager.publish(BootstrapEvent.SessionTerminating)
                clearSessionData()
            }

            // Create new session
            val sessionId = UUID.randomUUID().toString()
            val now = System.currentTimeMillis()
            val user = User(registrationNumber = regNumber, studentName = studentName)
            val deviceFingerprint = getDeviceFingerprint()

            val session = Session(
                user = user,
                cookies = cookies,
                loginTimestamp = now,
                sessionId = sessionId,
                deviceId = deviceFingerprint,
                lastRefreshTimestamp = now,
                refreshCount = 0,
                expiryTimestamp = now + SESSION_TIMEOUT_MS,
                portalType = portalType,
                isEncrypted = true
            )

            // Generate and store HMAC for session integrity
            val hmac = generateSessionHmac(session)
            secureStorage.store(StorageDomain.SESSIONS, "session_hmac_$sessionId", hmac)

            // Persist session
            persistSession(session)

            // Update state
            currentSession = session
            transitionTo(SessionState.ACTIVE)
            stateRegistry.updateSessionState(SessionState.ACTIVE)

            // Update metrics
            totalSessions++
            activeSessions++
            lastSessionTimestamp = now

            // Publish events
            authEventManager.publish(BootstrapEvent.SessionCreated(portalType))

            Log.i(TAG, "Session created: $sessionId for user: $regNumber")
            true

        } catch (e: Exception) {
            Log.e(TAG, "Failed to create session: ${e.message}", e)
            transitionTo(SessionState.FAILED)
            authEventManager.publish(BootstrapEvent.SessionFailed("Creation failed: ${e.message}"))

            // Attempt rollback
            rollbackState()
            false
        }
    }

    override fun restoreSession(): Boolean {
        val from = currentState

        if (!isValidTransition(from, SessionState.RESTORING)) {
            Log.w(TAG, "Invalid transition: $from -> RESTORING")
            return false
        }

        transitionTo(SessionState.RESTORING)
        authEventManager.publish(BootstrapEvent.SessionRestoring)

        return try {
            val result = secureStorage.retrieve(StorageDomain.SESSIONS, SESSION_KEY)
            if (!result.success || result.data == null) {
                Log.i(TAG, "No persisted session found")
                transitionTo(SessionState.NONE)
                return false
            }

            val json = JSONObject(result.data)
            val session = sessionFromJson(json)

            // Validate session hasn't expired
            if (session.isExpired()) {
                Log.i(TAG, "Persisted session has expired")
                clearSessionData()
                transitionTo(SessionState.EXPIRED)
                authEventManager.publish(BootstrapEvent.SessionExpired)
                return false
            }

            // Security validation
            if (!securityMonitor.isPlatformSecure()) {
                Log.w(TAG, "Platform not secure, cannot restore session")
                transitionTo(SessionState.FAILED)
                authEventManager.publish(BootstrapEvent.SessionFailed("Platform security check failed"))
                return false
            }

            currentSession = session
            transitionTo(SessionState.ACTIVE)
            stateRegistry.updateSessionState(SessionState.ACTIVE)
            activeSessions++

            authEventManager.publish(BootstrapEvent.SessionRestored)
            Log.i(TAG, "Session restored: ${session.sessionId}")
            true

        } catch (e: Exception) {
            Log.e(TAG, "Failed to restore session: ${e.message}", e)
            transitionTo(SessionState.FAILED)
            authEventManager.publish(BootstrapEvent.SessionFailed("Restore failed: ${e.message}"))
            false
        }
    }

    override fun refreshSession(): Boolean {
        val session = currentSession ?: run {
            Log.w(TAG, "No active session to refresh")
            return false
        }

        if (session.refreshCount >= MAX_REFRESH_COUNT) {
            Log.w(TAG, "Maximum refresh count reached")
            authEventManager.publish(BootstrapEvent.SessionFailed("Maximum refresh count reached"))
            return false
        }

        if (!isValidTransition(currentState, SessionState.REFRESHING)) {
            Log.w(TAG, "Invalid transition: $currentState -> REFRESHING")
            return false
        }

        transitionTo(SessionState.REFRESHING)
        authEventManager.publish(BootstrapEvent.SessionRefreshing)

        return try {
            val refreshedSession = session.refreshed()

            // Regenerate HMAC after refresh
            val hmac = generateSessionHmac(refreshedSession)
            secureStorage.store(StorageDomain.SESSIONS, "session_hmac_${refreshedSession.sessionId}", hmac)

            persistSession(refreshedSession)
            currentSession = refreshedSession
            totalRefreshCount++

            transitionTo(SessionState.ACTIVE)
            authEventManager.publish(BootstrapEvent.SessionRefreshed)
            Log.i(TAG, "Session refreshed: ${session.sessionId}, count: ${refreshedSession.refreshCount}")
            true

        } catch (e: Exception) {
            Log.e(TAG, "Failed to refresh session: ${e.message}", e)
            failedRefreshCount++
            authEventManager.publish(BootstrapEvent.SessionFailed("Refresh failed: ${e.message}"))
            false
        }
    }

    override fun terminateSession(): Boolean {
        if (currentSession == null) {
            Log.w(TAG, "No active session to terminate")
            return false
        }

        if (!isValidTransition(currentState, SessionState.TERMINATING)) {
            Log.w(TAG, "Invalid transition: $currentState -> TERMINATING")
            return false
        }

        transitionTo(SessionState.TERMINATING)
        authEventManager.publish(BootstrapEvent.SessionTerminating)

        return try {
            clearSessionData()
            transitionTo(SessionState.TERMINATED)
            stateRegistry.updateSessionState(SessionState.TERMINATED)
            activeSessions--

            authEventManager.publish(BootstrapEvent.SessionTerminated)
            Log.i(TAG, "Session terminated")
            true

        } catch (e: Exception) {
            Log.e(TAG, "Failed to terminate session: ${e.message}", e)
            transitionTo(SessionState.FAILED)
            authEventManager.publish(BootstrapEvent.SessionFailed("Termination failed: ${e.message}"))
            false
        }
    }

    override fun getCurrentState(): SessionState = currentState

    override fun getCurrentSession(): Session? = currentSession

    override fun isSessionActive(portalType: String?): Boolean {
        val isActive = currentState == SessionState.ACTIVE &&
               currentSession?.isExpired() == false
        
        if (!isActive) return false
        
        return portalType == null || currentSession?.portalType == portalType
    }

    override fun getRegNumber(): String? = currentSession?.user?.registrationNumber

    override fun getStudentName(): String? = currentSession?.user?.studentName

    override fun getPortalType(): String? = currentSession?.portalType

    override fun getLoginTimestamp(): Long = currentSession?.loginTimestamp ?: 0L

    override fun getCookies(): Map<String, String> = currentSession?.cookies ?: emptyMap()

    override fun validateSession(): Boolean {
        if (currentSession == null) return false

        if (!isValidTransition(currentState, SessionState.VALIDATING)) {
            return false
        }

        transitionTo(SessionState.VALIDATING)
        authEventManager.publish(BootstrapEvent.SessionValidating)

        val session = currentSession!!

        // Check expiry
        if (session.isExpired()) {
            Log.i(TAG, "Session expired")
            transitionTo(SessionState.EXPIRING)
            authEventManager.publish(BootstrapEvent.SessionExpiring)
            transitionTo(SessionState.EXPIRED)
            authEventManager.publish(BootstrapEvent.SessionExpired)
            expiredSessions++
            activeSessions--
            return false
        }

        // Check if should refresh
        if (session.shouldRefresh()) {
            Log.i(TAG, "Session should be refreshed")
            // Don't transition back to ACTIVE here, let refreshSession handle it
            return true
        }

        transitionTo(SessionState.ACTIVE)
        return true
    }

    override fun isSessionExpired(): Boolean {
        return currentSession?.isExpired() == true || currentState == SessionState.EXPIRED
    }

    override fun getTimeUntilExpiry(): Long {
        val session = currentSession ?: return 0L
        val remaining = session.expiryTimestamp - System.currentTimeMillis()
        return if (remaining > 0) remaining else 0L
    }

    override fun getMetrics(): SessionManagerMetrics {
        val avgDuration = if (totalSessions > 0) {
            (System.currentTimeMillis() - startTime) / totalSessions
        } else 0L

        return SessionManagerMetrics(
            totalSessions = totalSessions.toLong(),
            activeSessions = activeSessions,
            expiredSessions = expiredSessions.toLong(),
            averageSessionDurationMs = avgDuration,
            totalRefreshCount = totalRefreshCount.toLong(),
            failedRefreshCount = failedRefreshCount.toLong(),
            lastSessionTimestamp = lastSessionTimestamp
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.AuthenticationReady -> {
                Log.i(TAG, "Authentication platform ready, attempting session restore")
                restoreSession()
            }
            else -> { /* Ignore other events */ }
        }
    }

    // ==================== Private Helper Methods ====================

    private fun transitionTo(target: SessionState): Boolean {
        val from = currentState

        if (!isValidTransition(from, target)) {
            Log.w(TAG, "Invalid transition: $from -> $target")
            return false
        }

        previousState = from
        currentState = target
        recordTransition(from, target, success = true)
        Log.d(TAG, "State transition: $from -> $target")

        return true
    }

    private fun rollbackState(): Boolean {
        val target = previousState
        if (target == currentState) {
            Log.w(TAG, "Cannot rollback: no previous state")
            return false
        }

        Log.i(TAG, "Rolling back from $currentState to $target")
        currentState = target
        authEventManager.publish(BootstrapEvent.SessionRecovered)
        return true
    }

    private fun isValidTransition(from: SessionState, to: SessionState): Boolean {
        return validTransitions[from]?.contains(to) == true
    }

    private fun buildValidTransitionsMap(): Map<SessionState, Set<SessionState>> {
        return mapOf(
            SessionState.NONE to setOf(SessionState.CREATING, SessionState.RESTORING),
            SessionState.CREATING to setOf(SessionState.ACTIVE, SessionState.FAILED),
            SessionState.ACTIVE to setOf(
                SessionState.REFRESHING, SessionState.VALIDATING,
                SessionState.EXPIRING, SessionState.TERMINATING, SessionState.RECOVERING
            ),
            SessionState.RESTORING to setOf(SessionState.ACTIVE, SessionState.NONE, SessionState.FAILED),
            SessionState.REFRESHING to setOf(SessionState.ACTIVE, SessionState.FAILED),
            SessionState.VALIDATING to setOf(SessionState.ACTIVE, SessionState.EXPIRING),
            SessionState.EXPIRING to setOf(SessionState.EXPIRED),
            SessionState.EXPIRED to setOf(SessionState.TERMINATING, SessionState.RESTORING),
            SessionState.TERMINATING to setOf(SessionState.TERMINATED),
            SessionState.TERMINATED to setOf(SessionState.NONE, SessionState.CREATING),
            SessionState.FAILED to setOf(SessionState.RECOVERING, SessionState.NONE),
            SessionState.RECOVERING to setOf(SessionState.ACTIVE, SessionState.NONE, SessionState.FAILED)
        )
    }

    private fun recordTransition(from: SessionState, to: SessionState, success: Boolean, reason: String? = null) {
        val transition = SessionTransition(
            fromState = from,
            toState = to,
            timestamp = System.currentTimeMillis(),
            success = success,
            reason = reason,
            correlationId = UUID.randomUUID().toString()
        )
        transitionHistory.add(transition)

        // Trim history if needed
        while (transitionHistory.size > 100) {
            transitionHistory.removeAt(0)
        }
    }

    private fun persistSession(session: Session) {
        val json = sessionToJson(session)
        secureStorage.store(StorageDomain.SESSIONS, SESSION_KEY, json.toString())
    }

    private fun clearSessionData() {
        currentSession = null
        secureStorage.delete(StorageDomain.SESSIONS, SESSION_KEY)
    }

    private fun sessionToJson(session: Session): JSONObject {
        return JSONObject().apply {
            put("session_id", session.sessionId)
            put("reg_number", session.user.registrationNumber)
            put("student_name", session.user.studentName ?: "")
            put("login_timestamp", session.loginTimestamp)
            put("last_refresh_timestamp", session.lastRefreshTimestamp)
            put("refresh_count", session.refreshCount)
            put("expiry_timestamp", session.expiryTimestamp)
            put("device_id", session.deviceId ?: "")
            put("portal_type", session.portalType)
            put("is_encrypted", session.isEncrypted)
            put("cookies", JSONObject(session.cookies).toString())
        }
    }

    private fun sessionFromJson(json: JSONObject): Session {
        val cookiesJson = json.optString("cookies", "{}")
        val cookiesMap = mutableMapOf<String, String>()
        try {
            val cookiesObj = JSONObject(cookiesJson)
            cookiesObj.keys().forEach { key ->
                cookiesMap[key] = cookiesObj.getString(key)
            }
        } catch (e: Exception) {
            Log.w(TAG, "Failed to parse cookies: ${e.message}")
        }

        val user = User(
            registrationNumber = json.getString("reg_number"),
            studentName = json.optString("student_name", null).takeIf { it.isNotEmpty() }
        )

        return Session(
            user = user,
            cookies = cookiesMap,
            loginTimestamp = json.getLong("login_timestamp"),
            sessionId = json.getString("session_id"),
            deviceId = json.optString("device_id", null).takeIf { it.isNotEmpty() },
            lastRefreshTimestamp = json.optLong("last_refresh_timestamp", json.getLong("login_timestamp")),
            refreshCount = json.optInt("refresh_count", 0),
            expiryTimestamp = json.optLong("expiry_timestamp", json.getLong("login_timestamp") + SESSION_TIMEOUT_MS),
            portalType = json.optString("portal_type", "student"),
            isEncrypted = json.optBoolean("is_encrypted", true)
        )
    }

    // ==================== Device Fingerprint & HMAC Methods ====================

    /**
     * Generate device fingerprint combining ANDROID_ID with cumulative boot time.
     * Format: ANDROID_ID_cumulativeBootTime
     */
    private fun getDeviceFingerprint(): String {
        val androidId = Secure.getString(
            context.contentResolver,
            Secure.ANDROID_ID
        ) ?: "unknown"
        val cumulativeBootTime = SystemClock.elapsedRealtime()
        return "${androidId}_$cumulativeBootTime"
    }

    /**
     * Generate HMAC for session data integrity verification.
     * Data format: sessionId|regNumber|loginTimestamp|expiryTimestamp
     */
    private fun generateSessionHmac(session: Session): String {
        val dataToSign = "${session.sessionId}|${session.user.registrationNumber}|${session.loginTimestamp}|${session.expiryTimestamp}"
        return cryptoManager.generateStringHmac(dataToSign, KeyAlias.HMAC)
    }

    /**
     * Verify session HMAC matches expected value.
     */
    private fun verifySessionHmac(session: Session, storedHmac: String): Boolean {
        val expectedHmac = generateSessionHmac(session)
        return expectedHmac == storedHmac
    }

    /**
     * Get stored HMAC for a session.
     */
    fun getStoredHmac(sessionId: String): String? {
        val result = secureStorage.retrieve(StorageDomain.SESSIONS, "session_hmac_$sessionId")
        return result.getOrNull()
    }
}