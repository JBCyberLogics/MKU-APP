package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.PortalMap

/**
 * IPortalDiscoveryManager - PORTAL-001
 *
 * Interface for the dynamic portal discovery engine.
 */
interface IPortalDiscoveryManager {

    /**
     * Start the portal discovery process.
     */
    fun startDiscovery()

    /**
     * Return the current discovered portal map.
     */
    fun getPortalMap(): PortalMap?

    /**
     * Determine if the discovery process has completed.
     */
    fun isDiscoveryComplete(): Boolean
}
