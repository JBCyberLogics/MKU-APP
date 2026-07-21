package ke.ac.mku.authcore.contracts.authentication;

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
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0014H&J\b\u0010\u0019\u001a\u00020\u001aH&\u00a8\u0006\u001b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/ISessionManager;", "", "createSession", "", "regNumber", "", "studentName", "cookies", "", "restoreSession", "refreshSession", "terminateSession", "getCurrentState", "Lke/ac/mku/authcore/state/SessionState;", "getCurrentSession", "Lke/ac/mku/authcore/domain/model/Session;", "isSessionActive", "getRegNumber", "getStudentName", "getLoginTimestamp", "", "getCookies", "validateSession", "isSessionExpired", "getTimeUntilExpiry", "getMetrics", "Lke/ac/mku/authcore/contracts/session/SessionManagerMetrics;", "app"})
public abstract interface ISessionManager {
    
    /**
     * Create a new authenticated session.
     * If an existing session is active, it will be gracefully terminated first.
     *
     * @param regNumber Student registration number
     * @param studentName Student display name (nullable)
     * @param cookies Session cookies from portal authentication
     * @return true if session created successfully
     */
    public abstract boolean createSession(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String studentName, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> cookies);
    
    /**
     * Restore session from persistent storage.
     * Validates session integrity before restoration.
     *
     * @return true if session restored successfully
     */
    public abstract boolean restoreSession();
    
    /**
     * Refresh the active session to extend its lifetime.
     * Only valid if current state is ACTIVE.
     *
     * @return true if session refreshed successfully
     */
    public abstract boolean refreshSession();
    
    /**
     * Terminate the current session gracefully.
     * Clears all session data and persists termination.
     *
     * @return true if session terminated successfully
     */
    public abstract boolean terminateSession();
    
    /**
     * Get the current session state.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.state.SessionState getCurrentState();
    
    /**
     * Get the current session data.
     * @return Session object or null if no active session
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.Session getCurrentSession();
    
    /**
     * Check if a valid active session exists.
     */
    public abstract boolean isSessionActive();
    
    /**
     * Get the registration number of the authenticated user.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getRegNumber();
    
    /**
     * Get the student name of the authenticated user.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getStudentName();
    
    /**
     * Get the login timestamp (milliseconds since epoch).
     */
    public abstract long getLoginTimestamp();
    
    /**
     * Get the session cookies.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.String> getCookies();
    
    /**
     * Validate the current session integrity and expiry.
     * Updates state to EXPIRED if session has timed out.
     *
     * @return true if session is valid
     */
    public abstract boolean validateSession();
    
    /**
     * Check if the current session has expired.
     */
    public abstract boolean isSessionExpired();
    
    /**
     * Get time remaining until session expiry.
     *
     * @return Milliseconds until expiry, or 0 if already expired
     */
    public abstract long getTimeUntilExpiry();
    
    /**
     * Get session management metrics.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionManagerMetrics getMetrics();
}