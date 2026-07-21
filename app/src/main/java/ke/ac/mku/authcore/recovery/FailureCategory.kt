package ke.ac.mku.authcore.recovery

/**
 * FailureCategory - CORE-011
 *
 * Classification of failure types for the Authentication Core.
 * Used by RecoveryManager to determine appropriate recovery strategies.
 */
enum class FailureCategory {
    /** Authentication failed (invalid credentials, session invalid) */
    AUTHENTICATION_FAILURE,

    /** Session expired, invalid, or corrupted */
    SESSION_FAILURE,

    /** Network connectivity issues */
    NETWORK_FAILURE,

    /** Service unavailable or crashed */
    SERVICE_FAILURE,

    /** Configuration error or invalid state */
    CONFIGURATION_FAILURE,

    /** State restoration or validation failed */
    STATE_FAILURE,

    /** Resource exhaustion (memory, disk, threads) */
    RESOURCE_FAILURE,

    /** Operation timed out */
    TIMEOUT,

    /** Unknown or unclassified failure */
    UNKNOWN
}