package ke.ac.mku.authcore.domain.model.portal

/**
 * EntityRelationshipModels - PROGRAM-009
 *
 * Models for representing interconnected relationships between portal entities.
 */

data class EntityRelationshipGraph(
    val nodes: List<RelationshipNode>,
    val edges: List<RelationshipEdge>,
    val metadata: GraphMetadata
)

data class RelationshipNode(
    val entityId: String,
    val type: EntityCategory,
    val label: String
)

data class RelationshipEdge(
    val relationshipId: String,
    val sourceEntityId: String,
    val targetEntityId: String,
    val type: EntityRelationshipType,
    val confidence: Float,
    val weight: Float = 1.0f,
    val createdAt: Long = System.currentTimeMillis(),
    val metadata: Map<String, String> = emptyMap()
)

enum class EntityRelationshipType {
    ENROLLED_IN,
    REGISTERED_FOR,
    BELONGS_TO,
    TEACHES,
    HAS_TIMETABLE,
    HAS_RESULT,
    HAS_PAYMENT,
    HAS_INVOICE,
    LOCATED_IN,
    BORROWED,
    HAS_NOTIFICATION,
    DEPENDS_ON,
    PRECEDES,
    RELATED_TO
}

data class GraphMetadata(
    val lastUpdated: Long,
    val nodeCount: Int,
    val edgeCount: Int,
    val orphanCount: Int
)

data class GraphStatistics(
    val density: Float,
    val diameter: Int,
    val averagePathLength: Float
)
