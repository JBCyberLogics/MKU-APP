package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.contracts.portal.IPortalDiscoveryManager
import ke.ac.mku.authcore.domain.model.portal.PortalMap
import ke.ac.mku.authcore.domain.model.portal.PortalPage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * PortalDiscoveryManager - PORTAL-001
 *
 * Coordinates the entire discovery workflow.
 */
@Singleton
class PortalDiscoveryManager @Inject constructor(
    private val portalConnector: IPortalConnector,
    private val crawler: PortalCrawler,
    private val mapBuilder: PortalMapBuilder,
    private val scanner: NavigationScanner,
    private val sessionManager: ISessionManager,
    private val authEventManager: IAuthenticationEventManager,
    private val domAnalysisManager: IDomAnalysisManager
) : IPortalDiscoveryManager, BootstrapObserver {

    private val moduleId = "PORTAL-001"
    private val moduleName = "Portal Discovery Core"

    companion object {
        private const val TAG = "PortalDiscovery"
    }

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private var isComplete = false

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IPortalDiscoveryManager Implementation ====================

    override fun startDiscovery() {
        if (!sessionManager.isSessionActive()) {
            Log.w(TAG, "Cannot start discovery: No active session")
            return
        }

        scope.launch {
            executeDiscoveryPipeline()
        }
    }

    override fun getPortalMap(): PortalMap? {
        return mapBuilder.build()
    }

    override fun isDiscoveryComplete(): Boolean = isComplete

    // ==================== Private Discovery Pipeline ====================

    private suspend fun executeDiscoveryPipeline() {
        Log.i(TAG, "Starting discovery pipeline...")
        authEventManager.publish(BootstrapEvent.PortalDiscoveryStarted)
        isComplete = false
        
        try {
            // Stage 1: Load Dashboard
            val baseUrl = "https://login.mku.ac.ke/" // Default entry point
            
            crawler.crawl(baseUrl) { url, html ->
                // Stage 2: Extract Navigation
                val navItems = scanner.scan(html)
                mapBuilder.addNavigation(navItems)
                authEventManager.publish(BootstrapEvent.PortalNavigationDiscovered)

                // Stage 3: Analyze Structure
                val page = PortalPage(
                    title = "Dashboard", // Simplified
                    url = url,
                    category = "Dashboard",
                    depth = 0
                )
                mapBuilder.addPage(page)
                authEventManager.publish(BootstrapEvent.PortalPageDiscovered(url))

                // TRIGGER DOM ANALYSIS
                domAnalysisManager.analyzeDocument(html, url)
                
                // Publish updates
                authEventManager.publish(BootstrapEvent.PortalMapUpdated)
            }

            // Stage 4: Finalize
            isComplete = true
            authEventManager.publish(BootstrapEvent.PortalDiscoveryCompleted)
            Log.i(TAG, "Discovery pipeline completed successfully")

        } catch (e: Exception) {
            Log.e(TAG, "Discovery pipeline failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.PortalDiscoveryFailed(e.message ?: "Unknown error"))
        }
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.AuthenticationSuccess,
            is BootstrapEvent.SessionRestored -> {
                Log.i(TAG, "Authentication trigger detected. Launching discovery...")
                startDiscovery()
            }
            is BootstrapEvent.PortalReady -> {
                // Initial check
            }
            else -> {}
        }
    }
}
