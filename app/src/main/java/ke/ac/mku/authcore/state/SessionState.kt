package ke.ac.mku.authcore.state

/**
 * Session state enumeration representing the complete session lifecycle.
 *
 * These 12 states provide granular tracking of session creation, validation,
 * refresh, expiry, and recovery operations throughout the session lifecycle.
 */
enum class SessionState {
    /** No session exists */
    NONE,

    /** Session creation in progress */
    CREATING,

    /** Session is active and valid */
    ACTIVE,

    /** Restoring session from persistent storage */
    RESTORING,

    /** Session refresh in progress */
    REFRESHING,

    /** Session validation in progress */
    VALIDATING,

    /** Session expiry in progress */
    EXPIRING,

    /** Session has expired */
    EXPIRED,

    /** Session termination in progress */
    TERMINATING,

    /** Session has been terminated */
    TERMINATED,

    /** Session operation failed */
    FAILED,

    /** Attempting to recover from failure */
    RECOVERING
}