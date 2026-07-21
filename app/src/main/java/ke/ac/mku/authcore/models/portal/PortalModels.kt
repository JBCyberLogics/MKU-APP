package ke.ac.mku.authcore.models.portal

/**
 * Portal connection state enum.
 *
 * Represents the lifecycle states of a portal connection.
 */
enum class PortalConnectionState {
    /** No active portal connection */
    DISCONNECTED,

    /** Connection establishment in progress */
    CONNECTING,

    /** Successfully connected to portal */
    CONNECTED,

    /** Connection termination in progress */
    DISCONNECTING,

    /** Connection error occurred */
    ERROR
}

/**
 * Portal information data class.
 *
 * Contains metadata about a connected portal.
 *
 * @property portalId Unique portal identifier
 * @property portalName Human-readable portal name
 * @property baseUrl The base URL of the portal
 * @property portalType The type of portal (e.g., STUDENT_PORTAL, VLMS)
 * @property version Portal API/version information
 */
data class PortalInfo(
    val portalId: String,
    val portalName: String,
    val baseUrl: String,
    val portalType: PortalType,
    val version: String? = null
)

/**
 * Portal type enum.
 */
enum class PortalType {
    STUDENT_PORTAL,
    VLMS
}

/**
 * Portal connection result sealed class.
 *
 * Represents the outcome of a portal connection attempt.
 *
 * @property portalInfo The portal information on successful connection
 * @property errorMessage The error description on failure
 * @property connectionState The state at time of result
 */
sealed class PortalConnectionResult {
    data class Success(
        val portalInfo: PortalInfo
    ) : PortalConnectionResult()

    data class Failure(
        val message: String,
        val errorCode: String? = null
    ) : PortalConnectionResult()
}