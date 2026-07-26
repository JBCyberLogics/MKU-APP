package ke.ac.mku.authcore.contracts.session

/**
 * ISessionValidator - SESSION-002
 *
 * Central session validation engine contract.
 * Provides continuous and on-demand session validation.
 *
 * Responsibilities:
 * - Session integrity verification (HMAC, signature)
 * - Session expiration verification
 * - Device binding verification
 * - Cookie consistency verification
 * - Continuous validation with adaptive frequency
 *
 * Architecture:
 * - Single validation authority
 * - Events published via IAuthenticationEventManager
 * - Uses ICryptoManager for cryptographic verification
 * - Uses ISessionManager for session data access
 */
interface ISessionValidator {

    // ==================== CORE VALIDATION ====================

    /**
     * Perform complete session validation.
     * Checks all validation aspects: integrity, expiration, device, cookies.
     *
     * @return SessionValidationResult with detailed outcome
     */
    fun validateSession(): SessionValidationResult

    /**
     * Verify session integrity (HMAC/signature).
     *
     * @return SessionValidationResult with integrity check outcome
     */
    fun validateIntegrity(): SessionValidationResult

    /**
     * Verify session expiration status.
     *
     * @return SessionValidationResult with expiration check outcome
     */
    fun validateExpiration(): SessionValidationResult

    /**
     * Verify device binding.
     * Compares stored device ID with current device fingerprint.
     *
     * @return SessionValidationResult with device check outcome
     */
    fun validateDevice(): SessionValidationResult

    /**
     * Verify cookie consistency.
     * Ensures cookies match session data.
     *
     * @return SessionValidationResult with cookie check outcome
     */
    fun validateCookies(): SessionValidationResult

    // ==================== STATUS ====================

    /**
     * Get the last validation result.
     *
     * @return Last validation result or null if never validated
     */
    fun getLastValidationResult(): SessionValidationResult?

    /**
     * Check if continuous validation is active.
     *
     * @return true if continuous validation is running
     */
    fun isValidationActive(): Boolean

    // ==================== CONTROL ====================

    /**
     * Start continuous validation.
     * Validation runs at adaptive intervals based on app state.
     *
     * @param foregroundIntervalSeconds Interval when app is in foreground (default 60)
     * @param backgroundIntervalSeconds Interval when app is in background (default 300)
     */
    fun startContinuousValidation(
        foregroundIntervalSeconds: Int = 60,
        backgroundIntervalSeconds: Int = 300
    )

    /**
     * Stop continuous validation.
     */
    fun stopContinuousValidation()

    // ==================== METRICS ====================

    /**
     * Get validation metrics.
     *
     * @return SessionValidatorMetrics
     */
    fun getMetrics(): SessionValidatorMetrics

    /**
     * AUTH-TXN-001: Transaction Lock
     * When disabled, all validation operations are skipped.
     */
    fun setEnabled(enabled: Boolean)
}