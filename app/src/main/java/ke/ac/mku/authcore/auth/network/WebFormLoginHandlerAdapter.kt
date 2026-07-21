package ke.ac.mku.authcore.auth.network

import ke.ac.mku.authcore.contracts.network.IAuthNetworkService
import ke.ac.mku.authcore.contracts.network.NetworkAuthResponse
import ke.ac.mku.authcore.contracts.network.NetworkCredentials
import ke.ac.mku.authcore.data.api.WebFormLoginHandler
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WebFormLoginHandlerAdapter - AUTH-001 / NETWORK-002
 *
 * Adapter wrapping WebFormLoginHandler behind IAuthNetworkService interface.
 * AuthenticationEngine never calls WebFormLoginHandler directly - it uses this adapter.
 */
@Singleton
class WebFormLoginHandlerAdapter @Inject constructor(
    private val webFormLoginHandler: WebFormLoginHandler
) : IAuthNetworkService {

    companion object {
        private const val DEFAULT_TIMEOUT_MS = 30_000L
    }

    /**
     * Perform authentication network call via WebFormLoginHandler.
     */
    override suspend fun authenticate(credentials: NetworkCredentials): NetworkAuthResponse {
        val loginResponse = webFormLoginHandler.executeLogin(
            regNumber = credentials.registrationNumber,
            password = credentials.password
        )

        return NetworkAuthResponse(
            isSuccess = loginResponse.isSuccess,
            sessionCookies = loginResponse.cookies,
            errorMessage = loginResponse.errorMessage,
            authToken = null // WebFormLoginHandler doesn't return auth tokens
        )
    }

    /**
     * Cancel any in-flight request.
     * WebFormLoginHandler doesn't support cancellation - this is a no-op.
     */
    override suspend fun cancel(): Unit {
        // WebFormLoginHandler doesn't support cancellation
        // This is a no-op placeholder for future implementations
    }

    /**
     * Secure connection is required for authentication.
     */
    override fun isSecureConnectionRequired(): Boolean = true

    /**
     * Get the connection timeout in milliseconds.
     */
    override fun getConnectionTimeout(): Long = DEFAULT_TIMEOUT_MS

    /**
     * Get the read timeout in milliseconds.
     */
    override fun getReadTimeout(): Long = DEFAULT_TIMEOUT_MS
}