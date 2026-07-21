package ke.ac.mku.authcore.contracts.session

import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.domain.model.Session

/**
 * SessionValidationResult - SESSION-002
 *
 * Result of session validation operations.
 * Provides detailed validation outcomes for proper error handling.
 */
sealed class SessionValidationResult {

    /**
     * Session is valid and can be used.
     * @param session The validated session
     * @param validationTime When validation occurred
     * @param warnings Optional warnings (e.g., near expiry)
     */
    data class Valid(
        val session: Session,
        val validationTime: Long,
        val warnings: List<SessionWarning> = emptyList()
    ) : SessionValidationResult()

    /**
     * Session is valid but with warnings.
     * @param session The session (may be null if not retrievable)
     * @param reason Why validation produced a warning
     * @param validationTime When validation occurred
     * @param warnings List of warnings
     */
    data class Warning(
        val session: Session?,
        val reason: String,
        val validationTime: Long,
        val warnings: List<SessionWarning>
    ) : SessionValidationResult()

    /**
     * Session has expired.
     * @param sessionId The expired session ID
     * @param expiredAt When the session expired
     * @param validationTime When validation occurred
     */
    data class Expired(
        val sessionId: String?,
        val expiredAt: Long,
        val validationTime: Long
    ) : SessionValidationResult()

    /**
     * Session is invalid (not expired, but invalid for other reasons).
     * @param sessionId The invalid session ID
     * @param reason Why validation failed
     * @param validationTime When validation occurred
     * @param errors List of specific validation errors
     */
    data class Invalid(
        val sessionId: String?,
        val reason: String,
        val validationTime: Long,
        val errors: List<SessionValidationError>
    ) : SessionValidationResult()

    /**
     * Session data has been tampered with.
     * @param sessionId The tampered session ID
     * @param reason Why tampering was detected
     * @param validationTime When validation occurred
     */
    data class Tampered(
        val sessionId: String?,
        val reason: String,
        val validationTime: Long
    ) : SessionValidationResult()

    /**
     * Session data is corrupted (unreadable).
     * @param sessionId The corrupted session ID
     * @param reason Why corruption was detected
     * @param validationTime When validation occurred
     */
    data class Corrupted(
        val sessionId: String?,
        val reason: String,
        val validationTime: Long
    ) : SessionValidationResult()

    /**
     * Session requires recovery (can be recovered).
     * @param sessionId The session requiring recovery
     * @param reason Why recovery is needed
     * @param validationTime When validation occurred
     */
    data class RecoveryRequired(
        val sessionId: String?,
        val reason: String,
        val validationTime: Long
    ) : SessionValidationResult()

    /**
     * Validation operation itself failed (system error).
     * @param sessionId The session ID (may be null)
     * @param reason Why validation failed
     * @param validationTime When validation occurred
     */
    data class Failed(
        val sessionId: String?,
        val reason: String,
        val validationTime: Long
    ) : SessionValidationResult()
}

/**
 * Session validation warning types.
 */
enum class SessionWarningType {
    NEAR_EXPIRY,
    EXCESSIVE_REFRESH_COUNT,
    SUSPICIOUS_ACTIVITY,
    SECURITY_CHECK_FAILED,
    DEVICE_BINDING_WEAK
}

/**
 * A warning detected during session validation.
 */
data class SessionWarning(
    val type: SessionWarningType,
    val message: String,
    val severity: RiskLevel
)

/**
 * Specific validation error types.
 */
enum class SessionValidationError {
    SESSION_NOT_FOUND,
    SESSION_CORRUPTED,
    HMAC_VERIFICATION_FAILED,
    SIGNATURE_VERIFICATION_FAILED,
    PLATFORM_INSECURE,
    DEVICE_MISMATCH,
    UNEXPECTED_STATE,
    STORAGE_ERROR,
    CRYPTO_ERROR
}