package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.UniversalPortalJson
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import ke.ac.mku.authcore.domain.model.portal.DashboardDataset

/**
 * IUniversalJsonManager - PROGRAM-008
 *
 * Interface for the universal translation layer between portal data and UI models.
 */
interface IUniversalJsonManager {

    /**
     * Generate a universal JSON model from semantic entities.
     */
    fun generateUniversalJson(entities: List<SemanticEntity>): UniversalPortalJson

    /**
     * Return the latest universal JSON model.
     */
    fun getLatestUniversalJson(): UniversalPortalJson?

    /**
     * Return a dashboard-optimized dataset.
     */
    fun getDashboardDataset(): DashboardDataset?

    /**
     * Validate a JSON string against the universal schema.
     */
    fun validateUniversalJson(json: String): Boolean
}
