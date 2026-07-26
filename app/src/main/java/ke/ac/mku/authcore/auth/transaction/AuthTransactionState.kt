package ke.ac.mku.authcore.auth.transaction

/**
 * Authentication states for the transactional state machine as defined in AUTH-TXN-001.
 */
enum class AuthTransactionState {
    /** Initial state */
    IDLE,
    
    /** Fetching the login page */
    LOGIN_PAGE_LOADING,
    
    /** Login page loaded and ready for credentials */
    LOGIN_PAGE_READY,
    
    /** Authentication process initiated */
    AUTHENTICATING,
    
    /** POST login request sent to the server */
    LOGIN_REQUEST_SENT,
    
    /** Server response received */
    LOGIN_RESPONSE_RECEIVED,
    
    /** Extracting cookies from response */
    COOKIE_CAPTURE,
    
    /** Cookies saved to secure storage */
    COOKIE_PERSISTED,
    
    /** Initiating session creation */
    SESSION_CREATING,
    
    /** Session successfully created */
    SESSION_CREATED,
    
    /** Validating the new session */
    SESSION_VALIDATING,
    
    /** Verifying access to portal dashboard */
    PORTAL_VALIDATING,
    
    /** Transaction successfully completed */
    AUTHENTICATED,
    
    /** Transaction failed at any stage */
    FAILED
}
