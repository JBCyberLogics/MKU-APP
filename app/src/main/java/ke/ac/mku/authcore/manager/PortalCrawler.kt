package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PortalCrawler - PORTAL-001
 *
 * Traverses authenticated pages while maintaining session state.
 */
@Singleton
class PortalCrawler @Inject constructor(
    private val networkService: IAuthNetworkService
) {
    companion object {
        private const val TAG = "PortalCrawler"
        private const val MAX_DEPTH = 10
    }

    private val visitedUrls = mutableSetOf<String>()

    suspend fun crawl(baseUrl: String, onPageDiscovered: suspend (String, String) -> Unit) {
        Log.i(TAG, "Starting portal crawl from $baseUrl")
        visitedUrls.clear()
        
        // Initial crawl of base URL
        crawlInternal(baseUrl, 0, onPageDiscovered)
    }

    private suspend fun crawlInternal(url: String, depth: Int, onPageDiscovered: suspend (String, String) -> Unit) {
        if (depth > MAX_DEPTH || visitedUrls.contains(url)) return
        if (isLogoutLink(url)) return

        Log.d(TAG, "Crawling page: $url (depth: $depth)")
        visitedUrls.add(url)

        try {
            val response = networkService.getLoginPage(url) // Using GET for crawling
            if (response.isSuccessful) {
                val html = response.body()?.string() ?: ""
                onPageDiscovered(url, html)
                
                // In a real implementation, we would extract more links here and recurse
                // But for now, we'll stop here to prevent excessive network traffic
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to crawl $url: ${e.message}")
        }
    }

    private fun isLogoutLink(url: String): Boolean {
        return url.contains("logout", ignoreCase = true) || url.contains("signout", ignoreCase = true)
    }
}
