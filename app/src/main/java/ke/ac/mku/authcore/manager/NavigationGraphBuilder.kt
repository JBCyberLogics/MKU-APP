package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * NavigationGraphBuilder - PORTAL-002
 *
 * Creates graph relationships from discovered nodes.
 */
@Singleton
class NavigationGraphBuilder @Inject constructor() {

    private var currentGraph = NavigationGraph(
        discoveryTimestamp = System.currentTimeMillis()
    )

    fun addNode(node: NavigationNode) {
        val existingIds = currentGraph.nodes.map { it.id }.toSet()
        if (node.id !in existingIds) {
            currentGraph = currentGraph.copy(nodes = currentGraph.nodes + node)
        }
    }

    fun addEdge(edge: NavigationEdge) {
        currentGraph = currentGraph.copy(edges = currentGraph.edges + edge)
    }

    fun build(): NavigationGraph {
        return currentGraph.copy(discoveryTimestamp = System.currentTimeMillis())
    }

    fun reset() {
        currentGraph = NavigationGraph(
            discoveryTimestamp = System.currentTimeMillis()
        )
    }
}
