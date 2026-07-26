package ke.ac.mku.authcore.contracts.session

import ke.ac.mku.authcore.domain.model.Session

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
interface ISessionRecoveryManager {

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
     8. Re-authenticate if verification failed
     * 9. Restore cookies, portal state, sync with SessionManager
     * 10. Publish SessionRecoveryCompleted
     *
     * @return RecoveryResult indicating outcome
     */
    fun recoverSession(): RecoveryResult

    /**
     * Attempts to restore session from backup without full recovery.
     * Used when backup is known to be valid.
     *
     * @return RecoveryResult with restoration outcome
     */
    fun restoreBackup(): RecoveryResult

    /**
     * Recreates session from scratch using stored credentials.
     * Used when backup is invalid and re-authentication is needed.
     *
     * @return RecoveryResult with recreation outcome
     */
    fun recreateSession(): RecoveryResult

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
    fun abortRecovery(): Boolean

    /**
     * Gets the current recovery state.
     *
     * @return Current RecoveryState
     */
    fun getRecoveryState(): RecoveryState

    /**
     * Checks if recovery is currently in progress.
     *
     * @return true if recovery is running
     */
    fun isRecoveryRunning(): Boolean

    /**
     * Gets recovery metrics.
     *
     * @return SessionRecoveryMetrics with current statistics
     */
    fun getMetrics(): SessionRecoveryMetrics

    /**
     * Generates a comprehensive recovery report.
     * Useful for diagnostics and auditing.
     *
     * @return String containing the recovery report
     */
    fun getRecoveryReport(): String
    
    // AUTH-TXN-001: Transaction Lock
    fun setEnabled(enabled: Boolean)
}
