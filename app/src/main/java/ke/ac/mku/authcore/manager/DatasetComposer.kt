package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.DashboardDataset
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DatasetComposer - PROGRAM-008
 *
 * Creates dashboard-ready datasets from semantic entities.
 */
@Singleton
class DatasetComposer @Inject constructor() {

    fun composeDashboard(entities: List<SemanticEntity>): DashboardDataset {
        // Transform entities into widget models
        val widgets = mutableListOf<Map<String, Any>>()
        val charts = mutableListOf<Map<String, Any>>()
        
        // Simplified mapping logic
        entities.forEach { entity ->
            widgets.add(mapOf(
                "id" to entity.entityId,
                "title" to entity.name,
                "value" to (entity.value ?: ""),
                "type" to "CARD"
            ))
        }

        return DashboardDataset(
            widgets = widgets,
            charts = charts,
            summary = mapOf("total_entities" to entities.size)
        )
    }
}
