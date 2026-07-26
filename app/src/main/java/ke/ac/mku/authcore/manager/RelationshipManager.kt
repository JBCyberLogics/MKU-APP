package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager
import ke.ac.mku.authcore.domain.model.portal.EntityRelationshipGraph
import ke.ac.mku.authcore.domain.model.portal.RelationshipEdge
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RelationshipManager - PROGRAM-009
 *
 * Coordinates the entity relationship creation and maintenance.
 */
@Singleton
class RelationshipManager @Inject constructor(
    private val graphBuilder: EntityGraphBuilder,
    private val discoveryEngine: RelationshipDiscoveryEngine,
    private val authEventManager: IAuthenticationEventManager
) : IRelationshipManager, BootstrapObserver {

    private val moduleId = "PROGRAM-009"
    private val moduleName = "Entity Relationship Engine"

    companion object {
        private const val TAG = "RelationshipManager"
    }

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IRelationshipManager Implementation ====================

    override fun buildGraph(entities: List<SemanticEntity>) {
        Log.i(TAG, "Starting graph construction for ${entities.size} entities...")
        authEventManager.publish(BootstrapEvent.RelationshipEngineStarted)

        try {
            // 1. Add Nodes
            entities.forEach { graphBuilder.addNode(it) }

            // 2. Discover and Add Edges
            val discoveredEdges = discoveryEngine.discoverLinks(entities)
            discoveredEdges.forEach { edge ->
                graphBuilder.addEdge(edge)
                authEventManager.publish(BootstrapEvent.EntityLinked(
                    edge.sourceEntityId,
                    edge.targetEntityId,
                    edge.type.name
                ))
                authEventManager.publish(BootstrapEvent.RelationshipCreated(
                    edge.relationshipId,
                    edge.confidence
                ))
            }

            // 3. Finalize Graph
            authEventManager.publish(BootstrapEvent.GraphUpdated)
            authEventManager.publish(BootstrapEvent.GraphValidated)
            authEventManager.publish(BootstrapEvent.RelationshipEngineCompleted)

            Log.i(TAG, "Successfully built relationship graph with ${discoveredEdges.size} edges.")

        } catch (e: Exception) {
            Log.e(TAG, "Graph construction failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.RelationshipEngineFailed(e.message ?: "Unknown error"))
        }
    }

    override fun getGraph(): EntityRelationshipGraph? {
        return graphBuilder.build()
    }

    override fun queryRelationships(entityId: String): List<RelationshipEdge> {
        val graph = graphBuilder.build()
        return graph.edges.filter { it.sourceEntityId == entityId || it.targetEntityId == entityId }
    }

    override fun clear() {
        graphBuilder.reset()
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.PortalJsonReady -> {
                // Logic to trigger graph building from Universal JSON
            }
            else -> {}
        }
    }
}
