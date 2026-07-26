package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.NormalizedPortalJson
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity

/**
 * IUniversalJsonManager - PROGRAM-008
 *
 * Interface for the universal translation layer between portal data and UI models.
 */
interface IUniversalJsonManager {

    /**
     * Generate a normalized JSON model from semantic entities.
     */
    fun generateJson(entities: List<SemanticEntity>): NormalizedPortalJson

    /**
     * Return the report from the most recent JSON generation.
     */
    fun getLatestJson(): NormalizedPortalJson?

    /**
     * Validate a JSON string against a specific schema.
     */
    fun validateJson(json: String, schemaDomain: String): Boolean
}
