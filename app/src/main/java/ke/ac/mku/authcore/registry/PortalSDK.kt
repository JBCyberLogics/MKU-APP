package ke.ac.mku.authcore.registry

import android.util.Log
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.manager.AuthCoreManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PortalSDK @Inject constructor(
    private val authCoreManager: AuthCoreManager,
    private val endpointRegistry: EndpointRegistry,
    private val portalDiscovery: PortalDiscovery,
    private val securityManager: SecurityManager
) {
    companion object {
        private const val TAG = "PortalSDK"
    }

    val isInitialized: Boolean
        get() = authCoreManager.isConfigLoaded()

    val availablePortals: List<PortalDiscovery.Portal>
        get() = portalDiscovery.discoverPortals()

    val securityLevel: SecurityLevel
        get() = securityManager.getSecurityLevel()

    suspend fun login(regNumber: String, password: String): AuthResult {
        Log.i(TAG, "PortalSDK login initiated for: $regNumber")
        return authCoreManager.login(regNumber, password)
    }

    suspend fun logout() {
        Log.i(TAG, "PortalSDK logout initiated")
        authCoreManager.logout()
    }

    suspend fun getCurrentUser(): User? {
        return authCoreManager.getCurrentUser()
    }

    suspend fun isLoggedIn(): Boolean {
        return authCoreManager.isLoggedIn()
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

    fun validateSecurity(url: String): Boolean {
        return securityManager.validateConnection(url)
    }

    fun getSecurityInfo(): SecurityInfo {
        return SecurityInfo(
            isHttpsOnly = securityManager.isHttpsOnly,
            isCertValidationEnabled = securityManager.isCertValidationEnabled,
            isHostnameVerificationEnabled = securityManager.isHostnameVerificationEnabled,
            securityLevel = securityManager.getSecurityLevel()
        )
    }
}

data class SecurityInfo(
    val isHttpsOnly: Boolean,
    val isCertValidationEnabled: Boolean,
    val isHostnameVerificationEnabled: Boolean,
    val securityLevel: SecurityLevel
)