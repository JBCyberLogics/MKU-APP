package ke.ac.mku.authcore.session.validation

import ke.ac.mku.authcore.contracts.session.SessionValidatorMetrics

/**
 * SessionValidatorMetricsImpl - SESSION-002
 *
 * Implementation of SessionValidatorMetrics.
 * Tracks validation statistics for the SessionValidator.
 *
 * @property totalValidations Total validation operations performed
 * @property passedValidations Validations that returned Valid or Warning
 * @property failedValidations Validations that returned Invalid, Tampered, Corrupted, or Failed
 * @property integrityFailures HMAC/signature verification failures
 * @property expirationEvents Sessions detected as expired
 * @property recoveryRequests Sessions requiring recovery
 * @property lastValidationTime Timestamp of last validation
 * @property lastValidationResult Type of last validation result
 * @property continuousValidationActive Whether continuous validation is running
 */
data class SessionValidatorMetricsImpl(
    override val totalValidations: Long = 0,
    override val passedValidations: Long = 0,
    override val failedValidations: Long = 0,
    override val integrityFailures: Long = 0,
    override val expirationEvents: Long = 0,
    override val recoveryRequests: Long = 0,
    override val lastValidationTime: Long = 0,
    override val lastValidationResult: String = "None",
    override val continuousValidationActive: Boolean = false
) : SessionValidatorMetrics