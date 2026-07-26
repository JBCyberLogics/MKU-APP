package ke.ac.mku.authcore.domain.model.portal

/**
 * KnowledgeGraphModels - PROGRAM-010
 *
 * Models for the living knowledge graph and reasoning engine.
 */

data class KnowledgeGraph(
    val graphId: String,
    val nodes: List<KnowledgeNode>,
    val edges: List<KnowledgeEdge>,
    val clusters: List<KnowledgeCluster> = emptyList(),
    val metadata: KnowledgeMetadata
)

data class KnowledgeNode(
    val id: String,
    val label: String,
    val category: EntityCategory,
    val properties: Map<String, Any> = emptyMap(),
    val importanceScore: Float = 0.0f
)

data class KnowledgeEdge(
    val id: String,
    val sourceId: String,
    val targetId: String,
    val relationship: EntityRelationshipType,
    val confidence: Float,
    val isImplicit: Boolean = false
)

data class KnowledgeCluster(
    val clusterId: String,
    val name: String,
    val nodeIds: List<String>,
    val significance: Float
)

data class KnowledgeMetadata(
    val version: String = "1.0",
    val lastUpdated: Long,
    val nodeCount: Int,
    val edgeCount: Int,
    val reasoningScore: Float
)

data class GraphQuery(
    val startNodeId: String? = null,
    val categories: List<EntityCategory> = emptyList(),
    val relationshipTypes: List<EntityRelationshipType> = emptyList(),
    val depth: Int = 1
)

data class StudentContextSeed(
    val studentId: String,
    val primaryCluster: KnowledgeCluster?,
    val activeAcademicYear: String?,
    val pendingActions: List<String> = emptyList(),
    val generatedAt: Long = System.currentTimeMillis()
)
