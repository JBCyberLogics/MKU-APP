package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PortalMapBuilder - PORTAL-001
 *
 * Constructs a complete map of discovered resources.
 */
@Singleton
class PortalMapBuilder @Inject constructor() {

    private var currentMap = PortalMap(
        portalName = "MKU Student Portal",
        baseUrl = "https://login.mku.ac.ke",
        version = "1.0.0",
        discoveryTimestamp = System.currentTimeMillis()
    )

    fun addPage(page: PortalPage) {
        currentMap = currentMap.copy(pages = currentMap.pages + page)
    }

    fun addNavigation(items: List<PortalNavigation>) {
        val existingUrls = currentMap.navigation.map { it.url }.toSet()
        val newItems = items.filter { it.url !in existingUrls }
        currentMap = currentMap.copy(navigation = currentMap.navigation + newItems)
    }

    fun updateMetadata(name: String, version: String) {
        currentMap = currentMap.copy(portalName = name, version = version)
    }

    fun build(): PortalMap {
        return currentMap.copy(discoveryTimestamp = System.currentTimeMillis())
    }

    fun reset() {
        currentMap = PortalMap(
            portalName = "MKU Student Portal",
            baseUrl = "https://login.mku.ac.ke",
            version = "1.0.0",
            discoveryTimestamp = System.currentTimeMillis()
        )
    }
}
