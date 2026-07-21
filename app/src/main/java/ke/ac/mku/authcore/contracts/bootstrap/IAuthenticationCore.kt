package ke.ac.mku.authcore.contracts.bootstrap

import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.registry.EndpointRegistry
import ke.ac.mku.authcore.registry.PortalDiscovery

/**
 * IAuthenticationCore - CORE-012
 *
 * Contract for AuthenticationCore.
 * High-level authentication facade.
 */
interface IAuthenticationCore {
    /**
     * Login to a portal.
     */
    suspend fun login(regNumber: String, password: String): AuthResult

    /**
     * Logout.
     */
    suspend fun logout()

    /**
     * Check if logged in.
     */
    suspend fun isLoggedIn(): Boolean

    /**
     * Get current user.
     */
    suspend fun getCurrentUser(): User?

    /**
     * Get available portals.
     */
    fun getAvailablePortals(): List<PortalDiscovery.Portal>

    /**
     * Get login endpoint.
     */
    fun getLoginEndpoint(): EndpointRegistry.Endpoint

    /**
     * Get logout endpoint.
     */
    fun getLogoutEndpoint(): EndpointRegistry.Endpoint

    /**
     * Get a portal by ID.
     */
    fun getPortal(portalId: String): PortalDiscovery.Portal?
}