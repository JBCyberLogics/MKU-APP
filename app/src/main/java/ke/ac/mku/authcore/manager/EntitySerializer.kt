package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * EntitySerializer - PROGRAM-008
 *
 * Converts semantic entities into JSON structures.
 */
@Singleton
class EntitySerializer @Inject constructor() {

    /**
     * Map a list of entities into a JSON object grouped by domain.
     */
    fun mapToDomains(entities: List<SemanticEntity>): Map<String, JSONObject> {
        val domains = mutableMapOf<String, JSONObject>()
        
        entities.forEach { entity ->
            val domainName = detectDomain(entity)
            val domainJson = domains.getOrPut(domainName) { JSONObject() }
            
            // Map entity value to JSON field
            domainJson.put(entity.name.replace(" ", ""), entity.value)
        }
        
        return domains
    }

    private fun detectDomain(entity: ke.ac.mku.authcore.domain.model.portal.SemanticEntity): String {
        // Simple heuristic for domain detection
        val name = entity.name.lowercase()
        return when {
            name.contains("fee") || name.contains("balance") -> "finance"
            name.contains("reg") || name.contains("programme") -> "student"
            else -> "general"
        }
    }
}
