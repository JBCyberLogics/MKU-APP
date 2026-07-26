package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.state.SessionState

/**
 * ISessionManager - SESSION-001
 *
 * Central authority for session lifecycle management.
 * Single source of truth for session state across the platform.
 *
 * Responsibilities:
 * - Session creation, restoration, refresh, termination
 * - Session state management via FSM
 * - Session persistence to SESSIONS domain
 * - Event publishing for all session lifecycle events
 *
 * Architecture:
 * - Single active session policy (only one authenticated session at a time)
 * - Events published via IAuthenticationEventManager
 * - State updates via StateRegistry
 * - Recovery via RecoveryManager
 */
interface ISessionManager {

    // ==================== LIFECYCLE OPERATIONS ====================

    /**
     * Create a new authenticated session.
     * If an existing session is active, it will be gracefully terminated first.
     *
     * @param regNumber Student registration number
     * @param studentName Student display name (nullable)
     * @param cookies Session cookies from portal authentication
     * @param portalType The portal this session belongs to (default: student)
     * @return true if session created successfully
     */
    fun createSession(
        regNumber: String,
        studentName: String?,
        cookies: Map<String, String>,
        portalType: String = "student"
    ): Boolean

    /**
     * Restore session from persistent storage.
     * Validates session integrity before restoration.
     *
     * @return true if session restored successfully
     */
    fun restoreSession(): Boolean

    /**
     * Refresh the active session to extend its lifetime.
     * Only valid if current state is ACTIVE.
     *
     * @return true if session refreshed successfully
     */
    fun refreshSession(): Boolean

    /**
     * Terminate the current session gracefully.
     * Clears all session data and persists termination.
     *
     * @return true if session terminated successfully
     */
    fun terminateSession(): Boolean

    // ==================== STATE QUERIES ====================

    /**
     * Get the current session state.
     */
    fun getCurrentState(): SessionState

    /**
     * Get the current session data.
     * @return Session object or null if no active session
     */
    fun getCurrentSession(): ke.ac.mku.authcore.domain.model.Session?

    /**
     * Check if a valid active session exists.
     * @param portalType Optional portal type to verify against
     */
    fun isSessionActive(portalType: String? = null): Boolean

    // ==================== SESSION DATA ACCESS ====================

    /**
     * Get the registration number of the authenticated user.
     */
    fun getRegNumber(): String?

    /**
     * Get the student name of the authenticated user.
     */
    fun getStudentName(): String?

    /**
     * Get the portal type this session belongs to.
     */
    fun getPortalType(): String?

    /**
     * Get the login timestamp (milliseconds since epoch).
     */
    fun getLoginTimestamp(): Long

    /**
     * Get the session cookies.
     */
    fun getCookies(): Map<String, String>

    // ==================== VALIDATION ====================

    /**
     * Validate the current session integrity and expiry.
     * Updates state to EXPIRED if session has timed out.
     *
     * @return true if session is valid
     */
    fun validateSession(): Boolean

    /**
     * Check if the current session has expired.
     */
    fun isSessionExpired(): Boolean

    /**
     * Get time remaining until session expiry.
     *
     * @return Milliseconds until expiry, or 0 if already expired
     */
    fun getTimeUntilExpiry(): Long

    // ==================== METRICS ====================

    /**
     * Get session management metrics.
     */
    fun getMetrics(): ke.ac.mku.authcore.contracts.session.SessionManagerMetrics
}