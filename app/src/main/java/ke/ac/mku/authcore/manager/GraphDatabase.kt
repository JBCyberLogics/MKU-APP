package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.*
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * GraphDatabase - PROGRAM-010
 *
 * In-memory graph store with indexing and relationship tracking.
 */
@Singleton
class GraphDatabase @Inject constructor() {

    private val nodes = ConcurrentHashMap<String, KnowledgeNode>()
    private val edges = ConcurrentHashMap<String, KnowledgeEdge>()

    fun addNode(node: KnowledgeNode) {
        nodes[node.id] = node
    }

    fun addEdge(edge: KnowledgeEdge) {
        edges[edge.id] = edge
    }

    fun getAllNodes(): List<KnowledgeNode> = nodes.values.toList()

    fun getAllEdges(): List<KnowledgeEdge> = edges.values.toList()

    fun getNode(id: String): KnowledgeNode? = nodes[id]

    fun findNodesByCategory(category: EntityCategory): List<KnowledgeNode> {
        return nodes.values.filter { it.category == category }
    }

    fun clear() {
        nodes.clear()
        edges.clear()
    }

    fun size(): Int = nodes.size
}
