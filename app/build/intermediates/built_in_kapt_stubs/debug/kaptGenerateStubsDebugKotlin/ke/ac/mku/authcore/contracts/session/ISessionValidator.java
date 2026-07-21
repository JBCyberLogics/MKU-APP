package ke.ac.mku.authcore.contracts.session;

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
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/session/ISessionValidator;", "", "validateSession", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "validateIntegrity", "validateExpiration", "validateDevice", "validateCookies", "getLastValidationResult", "isValidationActive", "", "startContinuousValidation", "", "foregroundIntervalSeconds", "", "backgroundIntervalSeconds", "stopContinuousValidation", "getMetrics", "Lke/ac/mku/authcore/contracts/session/SessionValidatorMetrics;", "app"})
public abstract interface ISessionValidator {
    
    /**
     * Perform complete session validation.
     * Checks all validation aspects: integrity, expiration, device, cookies.
     *
     * @return SessionValidationResult with detailed outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult validateSession();
    
    /**
     * Verify session integrity (HMAC/signature).
     *
     * @return SessionValidationResult with integrity check outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult validateIntegrity();
    
    /**
     * Verify session expiration status.
     *
     * @return SessionValidationResult with expiration check outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult validateExpiration();
    
    /**
     * Verify device binding.
     * Compares stored device ID with current device fingerprint.
     *
     * @return SessionValidationResult with device check outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult validateDevice();
    
    /**
     * Verify cookie consistency.
     * Ensures cookies match session data.
     *
     * @return SessionValidationResult with cookie check outcome
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult validateCookies();
    
    /**
     * Get the last validation result.
     *
     * @return Last validation result or null if never validated
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidationResult getLastValidationResult();
    
    /**
     * Check if continuous validation is active.
     *
     * @return true if continuous validation is running
     */
    public abstract boolean isValidationActive();
    
    /**
     * Start continuous validation.
     * Validation runs at adaptive intervals based on app state.
     *
     * @param foregroundIntervalSeconds Interval when app is in foreground (default 60)
     * @param backgroundIntervalSeconds Interval when app is in background (default 300)
     */
    public abstract void startContinuousValidation(int foregroundIntervalSeconds, int backgroundIntervalSeconds);
    
    /**
     * Stop continuous validation.
     */
    public abstract void stopContinuousValidation();
    
    /**
     * Get validation metrics.
     *
     * @return SessionValidatorMetrics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.session.SessionValidatorMetrics getMetrics();
    
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
    @kotlin.Metadata(mv = {2, 4, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}