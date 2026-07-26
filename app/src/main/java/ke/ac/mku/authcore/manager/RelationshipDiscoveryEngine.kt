package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.EntityCategory
import ke.ac.mku.authcore.domain.model.portal.EntityRelationshipType
import ke.ac.mku.authcore.domain.model.portal.RelationshipEdge
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RelationshipDiscoveryEngine - PROGRAM-009
 *
 * Automatically discovers links between entities based on categories and context.
 */
@Singleton
class RelationshipDiscoveryEngine @Inject constructor() {

    companion object {
        private const val TAG = "RelationshipDiscovery"
    }

    fun discoverLinks(entities: List<SemanticEntity>): List<RelationshipEdge> {
        val links = mutableListOf<RelationshipEdge>()
        
        entities.forEach { source ->
            entities.forEach { target ->
                if (source.entityId != target.entityId) {
                    val relType = inferRelationship(source, target)
                    if (relType != null) {
                        links.add(createEdge(source, target, relType))
                    }
                }
            }
        }
        
        return links
    }

    private fun inferRelationship(source: SemanticEntity, target: SemanticEntity): EntityRelationshipType? {
        return when {
            // Student -> Profile data
            source.type == EntityCategory.STUDENT_NAME && target.type == EntityCategory.REGISTRATION_NUMBER -> EntityRelationshipType.RELATED_TO
            
            // Results -> Units
            source.type == EntityCategory.RESULTS && target.type == EntityCategory.UNITS -> EntityRelationshipType.BELONGS_TO
            
            // Fee Balance -> Student
            source.type == EntityCategory.FEE_BALANCE && target.type == EntityCategory.REGISTRATION_NUMBER -> EntityRelationshipType.HAS_INVOICE
            
            else -> null
        }
    }

    private fun createEdge(source: SemanticEntity, target: SemanticEntity, type: EntityRelationshipType): RelationshipEdge {
        return RelationshipEdge(
            relationshipId = "rel_${UUID.randomUUID()}",
            sourceEntityId = source.entityId,
            targetEntityId = target.entityId,
            type = type,
            confidence = 0.90f
        )
    }
}
