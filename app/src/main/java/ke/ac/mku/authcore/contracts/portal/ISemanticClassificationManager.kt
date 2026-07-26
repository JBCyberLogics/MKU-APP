package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.SemanticDom
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import ke.ac.mku.authcore.domain.model.portal.SemanticRegistry

/**
 * ISemanticClassificationManager - PROGRAM-007
 *
 * Interface for the AI-driven semantic classification engine.
 */
interface ISemanticClassificationManager {

    /**
     * Perform semantic classification on a normalized DOM.
     */
    fun classify(dom: SemanticDom): List<SemanticEntity>

    /**
     * Return the current semantic registry.
     */
    fun getRegistry(): SemanticRegistry

    /**
     * Return the confidence score for a specific classified entity.
     */
    fun getConfidenceScore(entityId: String): Float

    /**
     * Clear all classification data.
     */
    fun clearRegistry()
}
