package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.NavigationGraph
import ke.ac.mku.authcore.domain.model.portal.NavigationTree

/**
 * INavigationDiscoveryManager - PORTAL-002
 *
 * Interface for the runtime navigation discovery engine.
 */
interface INavigationDiscoveryManager {

    /**
     * Start the navigation discovery process using discovered portal data.
     */
    fun startNavigationDiscovery()

    /**
     * Return the current navigation graph.
     */
    fun getNavigationGraph(): NavigationGraph?

    /**
     * Return the navigation tree hierarchy.
     */
    fun getNavigationTree(): NavigationTree?

    /**
     * Check if navigation discovery is currently active.
     */
    fun isDiscovering(): Boolean
}
