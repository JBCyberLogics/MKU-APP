package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.EntityRelationshipType
import ke.ac.mku.authcore.domain.model.portal.RelationshipEdge
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DependencyAnalyzer - PROGRAM-009
 *
 * Identifies hard dependencies between entities in the graph.
 */
@Singleton
class DependencyAnalyzer @Inject constructor() {

    fun findDependencies(edges: List<RelationshipEdge>): List<RelationshipEdge> {
        return edges.filter { it.type == EntityRelationshipType.DEPENDS_ON }
    }
}
