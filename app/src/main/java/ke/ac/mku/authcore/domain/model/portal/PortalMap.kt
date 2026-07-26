package ke.ac.mku.authcore.domain.model.portal

/**
 * PortalMap - PORTAL-001
 *
 * Represents the complete runtime structure of the Student Portal.
 */
data class PortalMap(
    val portalName: String,
    val baseUrl: String,
    val version: String,
    val discoveryTimestamp: Long,
    val pages: List<PortalPage> = emptyList(),
    val navigation: List<PortalNavigation> = emptyList(),
    val features: List<PortalFeature> = emptyList(),
    val forms: List<PortalForm> = emptyList(),
    val downloads: List<PortalDownload> = emptyList(),
    val unknownEntities: List<String> = emptyList()
)

data class PortalPage(
    val title: String,
    val url: String,
    val category: String,
    val depth: Int
)

data class PortalNavigation(
    val label: String,
    val url: String,
    val parentLabel: String? = null,
    val isHidden: Boolean = false
)

data class PortalFeature(
    val name: String,
    val isAvailable: Boolean,
    val requiredPermissions: List<String> = emptyList()
)

data class PortalForm(
    val formId: String,
    val action: String,
    val method: String,
    val fields: List<String>
)

data class PortalDownload(
    val label: String,
    val downloadUrl: String,
    val fileType: String
)
