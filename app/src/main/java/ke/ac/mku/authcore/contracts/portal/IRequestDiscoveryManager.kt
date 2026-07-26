package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint
import ke.ac.mku.authcore.domain.model.portal.RequestRegistry

/**
 * IRequestDiscoveryManager - PORTAL-004
 *
 * Interface for the automated request discovery and analysis engine.
 */
interface IRequestDiscoveryManager {

    /**
     * Start monitoring and analyzing authenticated traffic.
     */
    fun startMonitoring()

    /**
     * Stop the discovery engine.
     */
    fun stopMonitoring()

    /**
     * Return the complete runtime request registry.
     */
    fun getRequestRegistry(): RequestRegistry

    /**
     * Return all discovered endpoints.
     */
    fun getDiscoveredEndpoints(): List<DiscoveredEndpoint>

    /**
     * Check if a specific request has already been discovered and cataloged.
     */
    fun isRequestDiscovered(fingerprint: String): Boolean
}
