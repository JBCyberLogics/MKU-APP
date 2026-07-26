package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.EntityRelationshipGraph
import ke.ac.mku.authcore.domain.model.portal.RelationshipEdge
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity

/**
 * IRelationshipManager - PROGRAM-009
 *
 * Interface for the dynamic entity relationship engine.
 */
interface IRelationshipManager {

    /**
     * Build the relationship graph from a set of semantic entities.
     */
    fun buildGraph(entities: List<SemanticEntity>)

    /**
     * Return the current entity relationship graph.
     */
    fun getGraph(): EntityRelationshipGraph?

    /**
     * Query all relationships for a specific entity.
     */
    fun queryRelationships(entityId: String): List<RelationshipEdge>

    /**
     * Clear the relationship registry.
     */
    fun clear()
}
