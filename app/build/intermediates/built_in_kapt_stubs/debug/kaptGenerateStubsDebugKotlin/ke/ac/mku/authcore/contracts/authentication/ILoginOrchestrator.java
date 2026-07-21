package ke.ac.mku.authcore.contracts.authentication;

/**
 * ILoginOrchestrator - CORE-012
 *
 * Public platform contract for login workflow orchestration.
 * This is the SINGLE ENTRY POINT for the complete login workflow.
 *
 * Coordinates the login workflow by delegating to specialized modules:
 * - [IAuthenticationEngine] for authentication operations
 * - [ISessionManager] for session management
 * - [ICookieManager] for cookie management
 * - [IPortalConnector] for portal connection operations
 *
 * This orchestrator does NOT make direct HTTP calls - all network operations
 * are delegated to the appropriate modules via their contracts.
 *
 * Workflow state machine with 12 states:
 * IDLE → PLATFORM_VALIDATION → CREDENTIAL_VALIDATION → AUTHENTICATION →
 * RESPONSE_VERIFICATION → SESSION_INITIALIZATION → COOKIE_INITIALIZATION →
 * PORTAL_CONNECTION → NOTIFICATION → COMPLETED (or FAILED/CANCELLED)
 *
 * Future modules (AUTH-003, AUTH-004, SESSION-*, PORTAL-*) will consume this contract.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/ILoginOrchestrator;", "", "startLogin", "Lke/ac/mku/authcore/contracts/authentication/LoginResult;", "request", "Lke/ac/mku/authcore/contracts/authentication/LoginRequest;", "(Lke/ac/mku/authcore/contracts/authentication/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelLogin", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryLogin", "resumeWorkflow", "resetWorkflow", "getWorkflowState", "Lke/ac/mku/authcore/contracts/authentication/WorkflowState;", "isLoginActive", "", "getWorkflowMetrics", "Lke/ac/mku/authcore/contracts/authentication/WorkflowMetrics;", "app"})
public abstract interface ILoginOrchestrator {
    
    /**
     * Start the complete login workflow.
     *
     * @param request The login request containing registration number and password
     * @return The login result with user data or error information
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startLogin(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.LoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.authentication.LoginResult> $completion);
    
    /**
     * Cancel any active login workflow.
     *
     * Resets workflow state to IDLE and releases any held resources.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelLogin(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Retry the last failed login workflow.
     *
     * @return The login result from retry
     * @throws IllegalStateException if no previous login attempt exists
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retryLogin(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.authentication.LoginResult> $completion);
    
    /**
     * Resume an interrupted login workflow from its current state.
     *
     * @return The login result from resume attempt
     * @throws IllegalStateException if no workflow is in progress
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resumeWorkflow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.authentication.LoginResult> $completion);
    
    /**
     * Reset the workflow state to IDLE.
     *
     * Clears any intermediate state but does NOT cancel active operations.
     * Use [cancelLogin] first if you need to cancel active operations.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resetWorkflow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Get the current workflow state.
     *
     * @return The current [WorkflowState] of the login workflow
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.WorkflowState getWorkflowState();
    
    /**
     * Check if a login workflow is currently in progress.
     *
     * @return True if workflow is active (not IDLE, COMPLETED, FAILED, or CANCELLED)
     */
    public abstract boolean isLoginActive();
    
    /**
     * Get workflow execution metrics.
     *
     * @return Current [WorkflowMetrics] including duration, steps, retries, and failures
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.WorkflowMetrics getWorkflowMetrics();
}