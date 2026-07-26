package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.EventAuditEntry
import ke.ac.mku.authcore.domain.model.portal.RefreshPlan

/**
 * IContextEventManager - PROGRAM-014
 *
 * Interface for the high-level student context event engine.
 */
interface IContextEventManager {

    /**
     * Return the history of intelligence events.
     */
    fun getEventHistory(limit: Int = 100): List<EventAuditEntry>

    /**
     * Force the calculation of a refresh plan based on current state.
     */
    fun calculateRefreshPlan(): RefreshPlan

    /**
     * Clear the event audit log.
     */
    fun clearAuditLog()
}
