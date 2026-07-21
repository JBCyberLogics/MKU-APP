package ke.ac.mku.authcore.contracts.network

/**
 * IAuthNetworkService - CORE-012
 *
 * Contract for authentication network operations.
 * All authentication traffic passes through this interface.
 *
 * AuthenticationEngine never communicates directly with WebFormLoginHandler.
 * This abstraction allows future network implementations (REST API, OAuth2, etc.).
 */
interface IAuthNetworkService {

    /**
     * Perform authentication network call.
     *
     * @param credentials The network credentials for authentication
     * @return The network authentication response
     */
    suspend fun authenticate(credentials: NetworkCredentials): NetworkAuthResponse

    /**
     * Cancel any in-flight request.
     */
    suspend fun cancel(): Unit

    /**
     * Check if secure connection is required.
     *
     * @return True if secure connection (HTTPS) is required
     */
    fun isSecureConnectionRequired(): Boolean

    /**
     * Get the connection timeout in milliseconds.
     *
     * @return Connection timeout in ms
     */
    fun getConnectionTimeout(): Long

    /**
     * Get the read timeout in milliseconds.
     *
     * @return Read timeout in ms
     */
    fun getReadTimeout(): Long
}

/**
 * Network credentials for authentication.
 *
 * @property registrationNumber The student's registration number
 * @property password The student's password
 */
data class NetworkCredentials(
    val registrationNumber: String,
    val password: String
)

/**
 * Network authentication response.
 *
 * @property isSuccess Whether the authentication was successful
 * @property sessionCookies The session cookies from successful authentication
 * @property errorMessage The error message if authentication failed
 * @property authToken The authentication token if available
 */
data class NetworkAuthResponse(
    val isSuccess: Boolean,
    val sessionCookies: Map<String, String> = emptyMap(),
    val errorMessage: String? = null,
    val authToken: String? = null
)