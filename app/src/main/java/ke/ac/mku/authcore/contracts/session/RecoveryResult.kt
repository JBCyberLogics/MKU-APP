package ke.ac.mku.authcore.contracts.session

import ke.ac.mku.authcore.domain.model.Session

/**
 * SESSION-003: Session Recovery Result
 *
 * Represents the outcome of a session recovery attempt.
 * Five result types cover all recovery scenarios.
 */
sealed class RecoveryResult {

    /**
     * Recovery completed successfully.
     * Session has been restored and validated.
     *
     * @param session The restored session
     * @param restoredAt Timestamp when restoration completed
     * @param method How recovery was accomplished
     */
    data class Success(
        val session: Session,
        val restoredAt: Long,
        val method: RecoveryMethod
    ) : RecoveryResult()

    /**
     * Recovery failed but user can attempt interactive authentication.
     *
     * @param reason Why recovery failed
     * @param requiresInteraction True if user must provide credentials
     */
    data class FallbackAuth(
        val reason: String,
        val requiresInteraction: Boolean = true
    ) : RecoveryResult()

    /**
     * Recovery failed after all retry attempts.
     *
     * @param reason Why recovery failed
     * @param attempts Number of recovery attempts made
     * @param lastError The error from the last attempt
     */
    data class Failed(
        val reason: String,
        val attempts: Int,
        val lastError: String
    ) : RecoveryResult()

    /**
     * Recovery was aborted by caller or system.
     *
     * @param reason Why recovery was aborted
     * @param completedSteps Number of recovery steps completed before abort
     */
    data class Aborted(
        val reason: String,
        val completedSteps: Int
    ) : RecoveryResult()

    /**
     * Recovery is already in progress.
     *
     * @param currentStep Current step in recovery pipeline
     * @param totalSteps Total steps in recovery pipeline
     */
    data class InProgress(
        val currentStep: Int,
        val totalSteps: Int = 10
    ) : RecoveryResult()
}

/**
 * How the session was recovered.
 */
enum class RecoveryMethod {
    /** Session restored from backup without re-authentication */
    BACKUP_RESTORE,

    /** Session restored after successful re-authentication */
    REAUTHENTICATION,

    /** Session recreated from stored credentials */
    CREDENTIAL_RECREATE,

    /** Session restored after network recovery */
    NETWORK_RECOVERY,

    /** Session restored after app restart */
    RESTART_RECOVERY
}