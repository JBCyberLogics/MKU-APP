package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IRequestDiscoveryManager
import ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint
import ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest
import ke.ac.mku.authcore.domain.model.portal.RequestRegistry
import okhttp3.Request
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RequestDiscoveryManager - PORTAL-004
 *
 * Coordinates complete request discovery lifecycle.
 */
@Singleton
class RequestDiscoveryManager @Inject constructor(
    private val fingerprintEngine: RequestFingerprintEngine,
    private val parameterAnalyzer: ParameterAnalyzer,
    private val csrfManager: CsrfTokenManager,
    private val authEventManager: IAuthenticationEventManager
) : IRequestDiscoveryManager, BootstrapObserver {

    private val moduleId = "PORTAL-004"
    private val moduleName = "Request Discovery Engine"

    companion object {
        private const val TAG = "RequestDiscovery"
    }

    private var isMonitoring = false
    private val requestStore = ConcurrentHashMap<String, DiscoveredRequest>()
    private val endpointStore = ConcurrentHashMap<String, DiscoveredEndpoint>()

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IRequestDiscoveryManager Implementation ====================

    override fun startMonitoring() {
        Log.i(TAG, "Starting runtime request monitoring...")
        isMonitoring = true
        authEventManager.publish(BootstrapEvent.RequestDiscoveryStarted)
    }

    override fun stopMonitoring() {
        Log.i(TAG, "Stopping discovery engine.")
        isMonitoring = false
    }

    override fun getRequestRegistry(): RequestRegistry {
        return RequestRegistry(
            requests = requestStore.values.toList(),
            endpoints = endpointStore.values.toList(),
            lastUpdated = System.currentTimeMillis()
        )
    }

    override fun getDiscoveredEndpoints(): List<DiscoveredEndpoint> {
        return endpointStore.values.toList()
    }

    override fun isRequestDiscovered(fingerprint: String): Boolean {
        return requestStore.containsKey(fingerprint)
    }

    // ==================== Traffic Capture Interface ====================

    fun captureRequest(request: Request) {
        if (!isMonitoring) return

        val method = request.method
        val url = request.url.toString()
        
        // Analyze parameters
        val params = parameterAnalyzer.analyze(request)
        
        // Fingerprint
        val fingerprint = fingerprintEngine.generateFingerprint(method, url, params)

        if (!isRequestDiscovered(fingerprint)) {
            val discovered = DiscoveredRequest(
                id = "req_${System.nanoTime()}",
                method = method,
                url = url,
                category = "Unknown", // Would be classified later
                fingerprint = fingerprint,
                parameters = params,
                lastObserved = System.currentTimeMillis()
            )
            requestStore[fingerprint] = discovered
            
            // Log discovery
            Log.d(TAG, "Discovered new request: $method $url")
            authEventManager.publish(BootstrapEvent.RequestCaptured(discovered.id))
            authEventManager.publish(BootstrapEvent.RequestRegistryUpdated)
            
            // Auto-learn endpoint
            learnEndpoint(method, url)
        }
    }

    private fun learnEndpoint(method: String, url: String) {
        val endpointKey = "$method|$url"
        if (!endpointStore.containsKey(endpointKey)) {
            val endpoint = DiscoveredEndpoint(
                method = method,
                url = url,
                isSecure = url.startsWith("https"),
                discoverySource = "TrafficCapture"
            )
            endpointStore[endpointKey] = endpoint
            authEventManager.publish(BootstrapEvent.EndpointDiscovered(method, url))
        }
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.NavigationDiscoveryCompleted -> {
                Log.i(TAG, "Dependencies ready. Activating Request Discovery...")
                startMonitoring()
            }
            else -> {}
        }
    }
}
