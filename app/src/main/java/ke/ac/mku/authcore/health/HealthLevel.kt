package ke.ac.mku.authcore.health

/**
 * Health levels for system and component status.
 */
enum class HealthLevel {
    /** Component is fully operational */
    HEALTHY,

    /** Component is operational but showing minor issues */
    WARNING,

    /** Component is operational but significantly degraded */
    DEGRADED,

    /** Component is barely operational or experiencing critical issues */
    CRITICAL,

    /** Component is offline or unavailable */
    OFFLINE
}