package ke.ac.mku.authcore.state

/**
 * Authentication state enumeration representing the complete authentication lifecycle.
 * 
 * States are ordered to support ordinal-based comparisons while maintaining backward
 * compatibility with the original 5 states.
 */
enum class AuthenticationState {
    // =========================================================================
    // Original 5 states (maintained for backward compatibility)
    // =========================================================================
    
    /** No authentication attempt has been made yet */
    UNAUTHENTICATED,
    
    /** Authentication process is in progress */
    AUTHENTICATING,
    
    /** Successfully authenticated */
    AUTHENTICATED,
    
    /** Session has expired */
    SESSION_EXPIRED,
    
    /** User has explicitly logged out */
    LOGGED_OUT,
    
    // =========================================================================
    // New 10 states for AUTH-003 Authentication State Manager
    // =========================================================================
    
    /** Initial state before any auth infrastructure initialization */
    UNINITIALIZED,
    
    /** Auth infrastructure is initializing */
    INITIALIZING,
    
    /** Auth infrastructure ready to process requests */
    READY,
    
    /** Session creation is in progress */
    SESSION_INITIALIZING,
    
    /** Session has been established */
    SESSION_ACTIVE,
    
    /** Portal connection is being established */
    PORTAL_CONNECTING,
    
    /** Portal connection has been established */
    PORTAL_CONNECTED,
    
    /** Session or token refresh is in progress */
    REFRESHING,
    
    /** Logout process is in progress */
    LOGGING_OUT,
    
    /** Authentication operation failed */
    FAILED,
    
    /** Attempting to recover from a failure state */
    RECOVERING
}