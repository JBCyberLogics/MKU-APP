package ke.ac.mku.authcore.contracts.authentication;

/**
 * IAuthenticationEngine - CORE-012
 *
 * Public platform contract for authentication orchestration.
 * This is the SINGLE ENTRY POINT for all authentication operations.
 *
 * Coordinates secure authentication against the MKU Student Portal without
 * owning networking, storage, cryptography, or session management.
 *
 * All authentication traffic passes through [IAuthNetworkService] interface.
 * Security validation via [SecurityMonitor] before every auth request.
 *
 * Future modules (AUTH-002, AUTH-003, SESSION-*, PORTAL-*) will consume this contract.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&\u00a8\u0006\u0018\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;", "", "authenticate", "Lke/ac/mku/authcore/domain/model/AuthResult;", "request", "Lke/ac/mku/authcore/contracts/authentication/AuthRequest;", "(Lke/ac/mku/authcore/contracts/authentication/AuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAuthentication", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryAuthentication", "validateRequest", "Lke/ac/mku/authcore/contracts/authentication/ValidationResult;", "processResult", "result", "(Lke/ac/mku/authcore/domain/model/AuthResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAuthenticated", "", "getCurrentSession", "Lke/ac/mku/authcore/contracts/authentication/Session;", "getAuthState", "Lke/ac/mku/authcore/contracts/authentication/AuthState;", "getMetrics", "Lke/ac/mku/authcore/contracts/authentication/AuthMetrics;", "app"})
public abstract interface IAuthenticationEngine {
    
    /**
     * Start authentication with the given request.
     *
     * @param request The authentication request containing credentials
     * @return The authentication result
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.AuthRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Cancel any active authentication operation.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelAuthentication(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Retry the last failed authentication.
     *
     * @return The authentication result from retry
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retryAuthentication(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Validate an authentication request before processing.
     *
     * @param request The authentication request to validate
     * @return The validation result
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object validateRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.AuthRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.authentication.ValidationResult> $completion);
    
    /**
     * Process an authentication result, handling any post-processing.
     *
     * @param result The authentication result to process
     * @return The processed authentication result
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object processResult(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.AuthResult result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Check if currently authenticated.
     *
     * @return True if authenticated, false otherwise
     */
    public abstract boolean isAuthenticated();
    
    /**
     * Get the current session if authenticated.
     *
     * @return The current session or null if not authenticated
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.authentication.Session getCurrentSession();
    
    /**
     * Get the current authentication state.
     *
     * @return The authentication state enum
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.AuthState getAuthState();
    
    /**
     * Get authentication metrics.
     *
     * @return Current authentication metrics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.AuthMetrics getMetrics();
}