package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import org.json.JSONArray
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RelationshipSerializer - PROGRAM-008
 *
 * Serializes linked entities and preserves data graph integrity.
 */
@Singleton
class RelationshipSerializer @Inject constructor() {

    /**
     * Serialize relationships between entities into a JSON array.
     */
    fun serialize(entities: List<SemanticEntity>): JSONArray {
        val relationships = JSONArray()
        
        entities.forEach { entity ->
            entity.relationships.forEach { rel ->
                val relJson = JSONObject().apply {
                    put("source", entity.entityId)
                    put("target", rel.targetEntityId)
                    put("type", rel.type)
                }
                relationships.put(relJson)
            }
        }
        
        return relationships
    }
}
