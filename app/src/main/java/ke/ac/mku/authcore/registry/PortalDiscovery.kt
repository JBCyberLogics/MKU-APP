package ke.ac.mku.authcore.registry

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PortalDiscovery @Inject constructor() {

    data class Portal(
        val id: String,
        val name: String,
        val baseUrl: String,
        val type: PortalType
    )

    enum class PortalType {
        STUDENT_PORTAL,
        VLMS
    }

    fun discoverPortals(): List<Portal> {
        return listOf(
            Portal(
                id = "student",
                name = "Student Portal",
                baseUrl = "https://login.mku.ac.ke/",
                type = PortalType.STUDENT_PORTAL
            ),
            Portal(
                id = "vlms",
                name = "VLMS",
                baseUrl = "https://vlms.mku.ac.ke/",
                type = PortalType.VLMS
            )
        )
    }

    fun getPortal(portalId: String): Portal? {
        return discoverPortals().find { it.id == portalId }
    }

    fun getStudentPortal(): Portal {
        return Portal(
            id = "student",
            name = "Student Portal",
            baseUrl = "https://login.mku.ac.ke/",
            type = PortalType.STUDENT_PORTAL
        )
    }

    fun getVLMS(): Portal {
        return Portal(
            id = "vlms",
            name = "VLMS",
            baseUrl = "https://vlms.mku.ac.ke/",
            type = PortalType.VLMS
        )
    }

    fun isPortalAvailable(portalId: String): Boolean {
        return getPortal(portalId) != null
    }
}