package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.ChangeReport
import ke.ac.mku.authcore.domain.model.portal.CompatibilityReport

/**
 * IPortalChangeMonitor - PORTAL-005
 *
 * Interface for the continuous portal evolution detection engine.
 */
interface IPortalChangeMonitor {

    /**
     * Start continuous monitoring of the portal.
     */
    fun startMonitoring()

    /**
     * Stop the change monitor engine.
     */
    fun stopMonitoring()

    /**
     * Perform an immediate comparison of the current portal state against the last snapshot.
     */
    fun performFullComparison(): ChangeReport

    /**
     * Get the latest compatibility report.
     */
    fun getCompatibilityReport(): CompatibilityReport

    /**
     * Trigger an automated rediscovery if major changes are detected.
     */
    fun triggerRediscovery()

    /**
     * Get the current detected portal version.
     */
    fun getPortalVersion(): String
}
