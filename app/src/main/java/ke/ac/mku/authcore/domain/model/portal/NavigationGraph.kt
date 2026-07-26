package ke.ac.mku.authcore.domain.model.portal

/**
 * NavigationGraph - PORTAL-002
 *
 * Represents the complete navigation structure and relationships of the portal.
 */
data class NavigationGraph(
    val nodes: List<NavigationNode> = emptyList(),
    val edges: List<NavigationEdge> = emptyList(),
    val entryPoints: List<String> = emptyList(),
    val discoveryTimestamp: Long
)

data class NavigationNode(
    val id: String,
    val label: String,
    val url: String,
    val type: NodeType,
    val metadata: Map<String, String> = emptyMap()
)

data class NavigationEdge(
    val sourceId: String,
    val targetId: String,
    val relationship: RelationshipType
)

data class NavigationTree(
    val root: NavigationTreeNode
)

data class NavigationTreeNode(
    val node: NavigationNode,
    val children: List<NavigationTreeNode> = emptyList()
)

enum class NodeType {
    MENU,
    SUBMENU,
    PAGE,
    ACTION,
    EXTERNAL_LINK
}

enum class RelationshipType {
    PARENT_OF,
    LINKED_TO,
    REDIRECTS_TO
}
