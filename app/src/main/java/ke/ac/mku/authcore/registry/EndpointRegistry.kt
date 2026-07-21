package ke.ac.mku.authcore.registry

import ke.ac.mku.authcore.config.ConfigManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EndpointRegistry @Inject constructor(
    private val configManager: ConfigManager,
    private val portalDiscovery: PortalDiscovery
) {

    data class Endpoint(
        val name: String,
        val url: String,
        val method: HttpMethod
    )

    enum class HttpMethod {
        GET,
        POST,
        PUT,
        DELETE
    }

    fun getLoginEndpoint(): Endpoint {
        val baseUrl = configManager.config.portal.baseUrl
        return Endpoint(
            name = "login",
            url = baseUrl,
            method = HttpMethod.POST
        )
    }

    fun getLogoutEndpoint(): Endpoint {
        val baseUrl = configManager.config.portal.baseUrl
        return Endpoint(
            name = "logout",
            url = "${baseUrl}logout",
            method = HttpMethod.POST
        )
    }

    fun getStudentPortalEndpoint(): Endpoint {
        val portal = portalDiscovery.getStudentPortal()
        return Endpoint(
            name = "student_portal",
            url = portal.baseUrl,
            method = HttpMethod.GET
        )
    }

    fun getVLMSEndpoint(): Endpoint {
        val portal = portalDiscovery.getVLMS()
        return Endpoint(
            name = "vlms",
            url = portal.baseUrl,
            method = HttpMethod.GET
        )
    }

    fun getEndpoint(name: String): Endpoint? {
        return when (name.lowercase()) {
            "login" -> getLoginEndpoint()
            "logout" -> getLogoutEndpoint()
            "student_portal" -> getStudentPortalEndpoint()
            "vlms" -> getVLMSEndpoint()
            else -> null
        }
    }

    fun listEndpoints(): List<Endpoint> {
        return listOf(
            getLoginEndpoint(),
            getLogoutEndpoint(),
            getStudentPortalEndpoint(),
            getVLMSEndpoint()
        )
    }
}