package ke.ac.mku.authcore.contracts.session;

/**
 * SESSION-003: Session Recovery Manager Contract
 *
 * Orchestrates recovery of session state after failures.
 * Coordinates with SessionManager, SessionValidator, and AuthenticationEngine.
 *
 * Recovery is triggered by:
 * - SessionRecoveryRequired event from SessionValidator
 * - SessionValidationFailed event from SessionValidator
 * - SessionExpiredDetected event from SessionValidator
 * - SessionFailed event from SessionManager
 * - Periodic health check (every 300 seconds)
 *
 * Recovery Strategy:
 * 1. Validate backup session from storage
 * 2. Attempt restore via SessionManager
 * 3. Verify restored session
 * 4. Re-authenticate if needed using stored credentials
 * 5. Restore complete session context (cookies, device binding, metadata)
 * 6. Publish session_platform_ready on success
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H&\u00a8\u0006\u0012\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;", "", "recoverSession", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "restoreBackup", "recreateSession", "abortRecovery", "", "getRecoveryState", "Lke/ac/mku/authcore/contracts/session/RecoveryState;", "isRecoveryRunning", "getMetrics", "Lke/ac/mku/authcore/contracts/session/SessionRecoveryMetrics;", "getRecoveryReport", "", "setEnabled", "", "enabled", "app"})
public abstract interface ISessionRecoveryManager {
    
    /**
     * Initiates full session recovery.
     *
     * Recovery Pipeline:
     * 1. Detect recovery trigger
     * 2. Set RECOVERY_PENDING state
     * 3. Load credentials from CREDENTIALS domain (if needed)
     * 4. Load backup from SESSIONS domain
     * 5. Validate backup via SessionValidator
     * 6. Restore via SessionManager.restoreSession()
     * 7. Verify restored session
     *    8. Re-authenticate if verification failed
     * 9. Restore cookies, portal state, sync with SessionManager
     * 10. Publish SessionRecoveryCompleted
     *
     * @return RecoveryResult indicating outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.RecoveryResult recoverSession();
    
    /**
     * Attempts to restore session from backup without full recovery.
     * Used when backup is known to be valid.
     *
     * @return RecoveryResult with restoration outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.RecoveryResult restoreBackup();
    
    /**
     * Recreates session from scratch using stored credentials.
     * Used when backup is invalid and re-authentication is needed.
     *
     * @return RecoveryResult with recreation outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.RecoveryResult recreateSession();
    
    /**
     * Aborts ongoing recovery if possible.
     *
     * Can only abort if:
     * - Recovery is in RECOVERY_PENDING state
     * - No credentials have been accessed
     * - No session modifications have been made
     *
     * @return true if recovery was aborted, false if cannot abort
     */
    public abstract boolean abortRecovery();
    
    /**
     * Gets the current recovery state.
     *
     * @return Current RecoveryState
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.RecoveryState getRecoveryState();
    
    /**
     * Checks if recovery is currently in progress.
     *
     * @return true if recovery is running
     */
    public abstract boolean isRecoveryRunning();
    
    /**
     * Gets recovery metrics.
     *
     * @return SessionRecoveryMetrics with current statistics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics getMetrics();
    
    /**
     * Generates a comprehensive recovery report.
     * Useful for diagnostics and auditing.
     *
     * @return String containing the recovery report
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRecoveryReport();
    
    public abstract void setEnabled(boolean enabled);
}