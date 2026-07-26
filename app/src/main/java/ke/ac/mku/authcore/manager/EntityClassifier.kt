package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.EntityCategory
import ke.ac.mku.authcore.domain.model.portal.SemanticDom
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * EntityClassifier - PROGRAM-007
 *
 * Core classification logic that maps DOM elements to academic entities.
 */
@Singleton
class EntityClassifier @Inject constructor() {

    companion object {
        private const val TAG = "EntityClassifier"
    }

    /**
     * Classify elements from a SemanticDom.
     */
    fun classify(dom: SemanticDom): List<SemanticEntity> {
        Log.d(TAG, "Starting entity classification for page: ${dom.pageId}")
        val entities = mutableListOf<SemanticEntity>()

        // 1. Classify Labels and Values
        dom.labelValuePairs.forEach { pair ->
            val category = detectCategory(pair.label, pair.value)
            if (category != EntityCategory.UNKNOWN) {
                entities.add(createEntity(category, pair.label, pair.value, dom.pageId))
            }
        }

        // 2. Classify Tables (e.g. Fee Statement, Unit Registration)
        dom.tables.forEach { table ->
            val category = detectTableCategory(table.headers, table.summary)
            if (category != EntityCategory.UNKNOWN) {
                entities.add(createEntity(category, "Table Data", table.id, dom.pageId))
            }
        }

        return entities
    }

    private fun detectCategory(label: String, value: String?): EntityCategory {
        val l = label.lowercase()
        return when {
            l.contains("reg") && l.contains("no") -> EntityCategory.REGISTRATION_NUMBER
            l.contains("name") || l.contains("student") -> EntityCategory.STUDENT_NAME
            l.contains("program") || l.contains("course") -> EntityCategory.PROGRAMME
            l.contains("balance") || l.contains("fee") -> EntityCategory.FEE_BALANCE
            l.contains("semester") -> EntityCategory.SEMESTER
            else -> EntityCategory.UNKNOWN
        }
    }

    private fun detectTableCategory(headers: List<String>, summary: String?): EntityCategory {
        val s = summary?.lowercase() ?: ""
        val h = headers.joinToString(" ").lowercase()
        
        return when {
            h.contains("unit") || h.contains("code") -> EntityCategory.UNITS
            h.contains("grade") || h.contains("mark") || h.contains("result") -> EntityCategory.RESULTS
            h.contains("debit") || h.contains("credit") || s.contains("fee") -> EntityCategory.FEE_BALANCE
            else -> EntityCategory.UNKNOWN
        }
    }

    private fun createEntity(category: EntityCategory, name: String, value: String?, pageId: String): SemanticEntity {
        return SemanticEntity(
            entityId = "ent_${System.nanoTime()}",
            type = category,
            name = name,
            value = value,
            confidence = 0.96f, // Placeholder high confidence
            sourcePage = pageId,
            sourceElement = name
        )
    }
}
