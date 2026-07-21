package ke.ac.mku.authcore.contracts.session

/**
 * SessionValidatorMetrics - SESSION-002
 *
 * Metrics for session validation operations.
 * Tracks validation statistics and outcomes.
 */
interface SessionValidatorMetrics {
    val totalValidations: Long
    val passedValidations: Long
    val failedValidations: Long
    val integrityFailures: Long
    val expirationEvents: Long
    val recoveryRequests: Long
    val lastValidationTime: Long
    val lastValidationResult: String
    val continuousValidationActive: Boolean
}