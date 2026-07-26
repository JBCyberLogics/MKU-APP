package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.GraphQuery
import ke.ac.mku.authcore.domain.model.portal.KnowledgeGraph
import ke.ac.mku.authcore.domain.model.portal.KnowledgeNode
import ke.ac.mku.authcore.domain.model.portal.StudentContextSeed

/**
 * IKnowledgeGraphManager - PROGRAM-010
 *
 * Interface for the portal knowledge graph and reasoning engine.
 */
interface IKnowledgeGraphManager {

    /**
     * Return the complete living knowledge graph.
     */
    fun getKnowledgeGraph(): KnowledgeGraph

    /**
     * Execute a semantic query against the knowledge graph.
     */
    fun query(query: GraphQuery): List<KnowledgeNode>

    /**
     * Return the student context seed for Layer 3 initialization.
     */
    fun getStudentContextSeed(): StudentContextSeed

    /**
     * Force a reasoning cycle to infer new relationships.
     */
    fun triggerReasoning()

    /**
     * Clear the knowledge base.
     */
    fun clear()
}
