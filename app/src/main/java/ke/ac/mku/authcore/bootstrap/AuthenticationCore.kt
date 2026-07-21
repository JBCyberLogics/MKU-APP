package ke.ac.mku.authcore.bootstrap

import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.domain.repository.AuthRepository
import ke.ac.mku.authcore.registry.EndpointRegistry
import ke.ac.mku.authcore.registry.PortalDiscovery
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationCore @Inject constructor(
    private val authRepository: AuthRepository,
    private val portalDiscovery: PortalDiscovery,
    private val endpointRegistry: EndpointRegistry
) {
    suspend fun login(regNumber: String, password: String): AuthResult {
        return authRepository.login(regNumber, password)
    }

    suspend fun logout() {
        authRepository.logout()
    }

    suspend fun isLoggedIn(): Boolean {
        return authRepository.isLoggedIn()
    }

    suspend fun getCurrentUser(): User? {
        return authRepository.getCurrentUser()
    }

    fun getAvailablePortals(): List<PortalDiscovery.Portal> {
        return portalDiscovery.discoverPortals()
    }

    fun getLoginEndpoint(): EndpointRegistry.Endpoint {
        return endpointRegistry.getLoginEndpoint()
    }

    fun getLogoutEndpoint(): EndpointRegistry.Endpoint {
        return endpointRegistry.getLogoutEndpoint()
    }

    fun getPortal(portalId: String): PortalDiscovery.Portal? {
        return portalDiscovery.getPortal(portalId)
    }
}