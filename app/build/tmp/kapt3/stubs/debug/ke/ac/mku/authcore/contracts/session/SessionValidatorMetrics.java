package ke.ac.mku.authcore.contracts.session;

/**
 * SessionValidatorMetrics - SESSION-002
 *
 * Metrics for session validation operations.
 * Tracks validation statistics and outcomes.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0012\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidatorMetrics;", "", "continuousValidationActive", "", "getContinuousValidationActive", "()Z", "expirationEvents", "", "getExpirationEvents", "()J", "failedValidations", "getFailedValidations", "integrityFailures", "getIntegrityFailures", "lastValidationResult", "", "getLastValidationResult", "()Ljava/lang/String;", "lastValidationTime", "getLastValidationTime", "passedValidations", "getPassedValidations", "recoveryRequests", "getRecoveryRequests", "totalValidations", "getTotalValidations", "app_debug"})
public abstract interface SessionValidatorMetrics {
    
    public abstract long getTotalValidations();
    
    public abstract long getPassedValidations();
    
    public abstract long getFailedValidations();
    
    public abstract long getIntegrityFailures();
    
    public abstract long getExpirationEvents();
    
    public abstract long getRecoveryRequests();
    
    public abstract long getLastValidationTime();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLastValidationResult();
    
    public abstract boolean getContinuousValidationActive();
}