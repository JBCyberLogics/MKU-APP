package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.PortalNavigation
import java.util.regex.Pattern
import javax.inject.Inject
import javax.inject.Singleton

/**
 * NavigationScanner - PORTAL-001
 *
 * Discovers menus, navigation trees, and links from portal HTML.
 */
@Singleton
class NavigationScanner @Inject constructor() {

    companion object {
        private const val TAG = "NavigationScanner"
        
        // Patterns for link extraction
        private val LINK_PATTERN = Pattern.compile("<a[^>]+href=\"([^\"]+)\"[^>]*>(.*?)</a>", Pattern.CASE_INSENSITIVE)
        private val NAV_ITEM_PATTERN = Pattern.compile("class=\"nav-item\"|id=\"menu\"", Pattern.CASE_INSENSITIVE)
    }

    /**
     * Scan HTML content for navigation elements.
     */
    fun scan(html: String): List<PortalNavigation> {
        Log.d(TAG, "Scanning HTML for navigation elements...")
        val navItems = mutableListOf<PortalNavigation>()
        
        val matcher = LINK_PATTERN.matcher(html)
        while (matcher.find()) {
            val url = matcher.group(1) ?: ""
            val label = stripHtml(matcher.group(2) ?: "")
            
            if (isInternalLink(url) && label.isNotBlank()) {
                navItems.add(PortalNavigation(
                    label = label,
                    url = url
                ))
            }
        }
        
        return navItems.distinctBy { it.url }
    }

    private fun isInternalLink(url: String): Boolean {
        return !url.startsWith("http") || url.contains("mku.ac.ke")
    }

    private fun stripHtml(html: String): String {
        return html.replace(Regex("<[^>]*>"), "").trim()
    }
}
