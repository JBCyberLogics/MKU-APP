package ke.ac.mku.authcore.contracts.session

/**
 * SESSION-003: Session Recovery Manager
 *
 * Represents the state of the session recovery process.
 * Recovery follows a 10-step pipeline from detection to platform readiness.
 *
 * State Transitions:
 *   IDLE → RECOVERY_PENDING (on recovery trigger)
 *   RECOVERY_PENDING → VALIDATING_BACKUP
 *   VALIDATING_BACKUP → RESTORING_SESSION
 *   RESTORING_SESSION → VERIFYING_SESSION
 *   VERIFYING_SESSION → REAUTHENTICATING (if needed) or RECOVERY_COMPLETED
 *   REAUTHENTICATING → RECOVERY_COMPLETED or RECOVERY_FAILED
 *   RECOVERY_COMPLETED → IDLE (after platform ready)
 *   RECOVERY_FAILED → SESSION_RECREATED or SESSION_TERMINATED
 *   SESSION_RECREATED → IDLE
 *   SESSION_TERMINATED → IDLE (after user logs in)
 */
enum class RecoveryState {
    /**
     * No recovery in progress. System is operating normally.
     */
    IDLE,

    /**
     * Recovery has been triggered but not yet started.
     * All necessary data is being prepared.
     */
    RECOVERY_PENDING,

    /**
     * Validating the backup session from storage.
     * Checks integrity, expiry, and device binding.
     */
    VALIDATING_BACKUP,

    /**
     * Restoring session from storage via SessionManager.
     * Loads cookies, device binding, and session metadata.
     */
    RESTORING_SESSION,

    /**
     * Verifying the restored session is valid.
     * Runs full validation through SessionValidator.
     */
    VERIFYING_SESSION,

    /**
     * Re-authenticating if backup validation failed.
     * Uses stored credentials from CREDENTIALS domain.
     */
    REAUTHENTICATING,

    /**
     * Recovery completed successfully.
     * Session is restored and validated.
     */
    RECOVERY_COMPLETED,

    /**
     * Recovery failed after all retry attempts.
     * May require user intervention.
     */
    RECOVERY_FAILED,

    /**
     * Session was recreated from scratch.
     * Old session data discarded, new session created.
     */
    SESSION_RECREATED,

    /**
     * Session terminated. Cannot recover.
     * User must authenticate interactively.
     */
    SESSION_TERMINATED
}