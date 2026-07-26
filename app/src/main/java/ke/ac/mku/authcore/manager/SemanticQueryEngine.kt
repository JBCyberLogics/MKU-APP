package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.GraphQuery
import ke.ac.mku.authcore.domain.model.portal.KnowledgeNode
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SemanticQueryEngine - PROGRAM-010
 *
 * Provides intelligent graph queries and traversal.
 */
@Singleton
class SemanticQueryEngine @Inject constructor() {

    fun execute(db: GraphDatabase, query: GraphQuery): List<KnowledgeNode> {
        val result = mutableListOf<KnowledgeNode>()
        
        // Basic filtering based on categories
        if (query.categories.isNotEmpty()) {
            query.categories.forEach { cat ->
                result.addAll(db.findNodesByCategory(cat))
            }
        } else {
            result.addAll(db.getAllNodes())
        }
        
        return result.distinctBy { it.id }
    }
}
