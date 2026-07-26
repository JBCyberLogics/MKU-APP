package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager
import ke.ac.mku.authcore.contracts.portal.IRelationshipManager
import ke.ac.mku.authcore.domain.model.portal.*
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * KnowledgeGraphManager - PROGRAM-010
 *
 * Primary coordinator for the portal knowledge ecosystem.
 */
@Singleton
class KnowledgeGraphManager @Inject constructor(
    private val db: GraphDatabase,
    private val reasoningEngine: ReasoningEngine,
    private val queryEngine: SemanticQueryEngine,
    private val relationshipManager: IRelationshipManager,
    private val authEventManager: IAuthenticationEventManager
) : IKnowledgeGraphManager, BootstrapObserver {

    private val moduleId = "PROGRAM-010"
    private val moduleName = "Portal Knowledge Graph"

    companion object {
        private const val TAG = "KnowledgeGraph"
    }

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IKnowledgeGraphManager Implementation ====================

    override fun getKnowledgeGraph(): KnowledgeGraph {
        return KnowledgeGraph(
            graphId = "kg_${System.nanoTime()}",
            nodes = db.getAllNodes(),
            edges = db.getAllEdges(),
            metadata = KnowledgeMetadata(
                lastUpdated = System.currentTimeMillis(),
                nodeCount = db.size(),
                edgeCount = db.getAllEdges().size,
                reasoningScore = 1.0f
            )
        )
    }

    override fun query(query: GraphQuery): List<KnowledgeNode> {
        return queryEngine.execute(db, query)
    }

    override fun getStudentContextSeed(): StudentContextSeed {
        val studentNodes = db.findNodesByCategory(EntityCategory.STUDENT_NAME)
        val studentId = studentNodes.firstOrNull()?.id ?: "UNKNOWN"
        
        return StudentContextSeed(
            studentId = studentId,
            primaryCluster = null,
            activeAcademicYear = "2026"
        )
    }

    override fun triggerReasoning() {
        Log.i(TAG, "Triggering manual reasoning cycle...")
        val inferred = reasoningEngine.inferKnowledge(db)
        inferred.forEach { db.addEdge(it) }
        authEventManager.publish(BootstrapEvent.ReasoningCompleted)
        authEventManager.publish(BootstrapEvent.KnowledgeGraphUpdated)
    }

    override fun clear() {
        db.clear()
    }

    // ==================== Private Building Pipeline ====================

    private fun buildKnowledgeBase() {
        Log.i(TAG, "Constructing knowledge base from relationship graph...")
        authEventManager.publish(BootstrapEvent.KnowledgeGraphStarted)

        try {
            val relGraph = relationshipManager.getGraph() ?: return
            
            // 1. Convert Nodes
            relGraph.nodes.forEach { node ->
                val kNode = KnowledgeNode(
                    id = node.entityId,
                    label = node.label,
                    category = node.type,
                    importanceScore = 0.5f // Initial
                )
                db.addNode(kNode)
                authEventManager.publish(BootstrapEvent.KnowledgeNodeCreated(node.entityId))
            }

            // 2. Convert Edges
            relGraph.edges.forEach { edge ->
                val kEdge = KnowledgeEdge(
                    id = edge.relationshipId,
                    sourceId = edge.sourceEntityId,
                    targetId = edge.targetEntityId,
                    relationship = edge.type,
                    confidence = edge.confidence
                )
                db.addEdge(kEdge)
                authEventManager.publish(BootstrapEvent.KnowledgeEdgeCreated(edge.sourceEntityId, edge.targetEntityId))
            }

            // 3. Inference & Context
            triggerReasoning()
            authEventManager.publish(BootstrapEvent.StudentContextSeedReady)
            authEventManager.publish(BootstrapEvent.KnowledgeGraphCompleted)
            
            Log.i(TAG, "Portal Knowledge Graph fully constructed.")
            Log.i(TAG, "--- LAYER 2 (SEMANTIC LAYER) STATUS: COMPLETE ---")

        } catch (e: Exception) {
            Log.e(TAG, "Knowledge base construction failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.KnowledgeGraphFailed(e.message ?: "Unknown error"))
        }
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.RelationshipEngineCompleted -> {
                Log.i(TAG, "Relationship Engine ready. Starting Knowledge Graph construction...")
                buildKnowledgeBase()
            }
            else -> {}
        }
    }
}
