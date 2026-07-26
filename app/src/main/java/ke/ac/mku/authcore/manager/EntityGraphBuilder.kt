package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.*
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * EntityGraphBuilder - PROGRAM-009
 *
 * Builds the directed graph of relationships between entities.
 */
@Singleton
class EntityGraphBuilder @Inject constructor() {

    private val nodes = ConcurrentHashMap<String, RelationshipNode>()
    private val edges = ConcurrentHashMap<String, RelationshipEdge>()

    fun addNode(entity: SemanticEntity) {
        val node = RelationshipNode(
            entityId = entity.entityId,
            type = entity.type,
            label = entity.name
        )
        nodes[node.entityId] = node
    }

    fun addEdge(edge: RelationshipEdge) {
        edges[edge.relationshipId] = edge
    }

    fun build(): EntityRelationshipGraph {
        return EntityRelationshipGraph(
            nodes = nodes.values.toList(),
            edges = edges.values.toList(),
            metadata = GraphMetadata(
                lastUpdated = System.currentTimeMillis(),
                nodeCount = nodes.size,
                edgeCount = edges.size,
                orphanCount = calculateOrphans()
            )
        )
    }

    private fun calculateOrphans(): Int {
        val linkedIds = edges.values.flatMap { listOf(it.sourceEntityId, it.targetEntityId) }.toSet()
        return nodes.keys.count { it !in linkedIds }
    }

    fun reset() {
        nodes.clear()
        edges.clear()
    }
}
