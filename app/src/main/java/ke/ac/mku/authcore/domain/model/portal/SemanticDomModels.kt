package ke.ac.mku.authcore.domain.model.portal

/**
 * SemanticDomModels - PROGRAM-006
 *
 * Models for the normalized semantic representation of portal pages.
 */

data class SemanticDom(
    val documentId: String,
    val pageId: String,
    val pageTitle: String,
    val fingerprint: String,
    val sections: List<SemanticSection> = emptyList(),
    val tables: List<TableMap> = emptyList(),
    val forms: List<FormMap> = emptyList(),
    val cards: List<CardMap> = emptyList(),
    val lists: List<ListMap> = emptyList(),
    val labelValuePairs: List<LabelValuePair> = emptyList(),
    val metadata: Map<String, String> = emptyMap()
)

data class SemanticSection(
    val id: String,
    val heading: String?,
    val level: Int,
    val content: String?
)

data class TableMap(
    val id: String,
    val headers: List<String>,
    val rows: List<List<String>>,
    val summary: String? = null
)

data class FormMap(
    val id: String,
    val action: String?,
    val method: String?,
    val controls: List<FormControl>
)

data class FormControl(
    val name: String,
    val type: String,
    val label: String?,
    val value: String?,
    val isRequired: Boolean
)

data class CardMap(
    val id: String,
    val title: String?,
    val content: Map<String, String>,
    val actions: List<String>
)

data class ListMap(
    val id: String,
    val items: List<String>
)

data class LabelValuePair(
    val label: String,
    val value: String
)

data class AnalysisReport(
    val timestamp: Long,
    val durationMs: Long,
    val elementCounts: Map<String, Int>,
    val confidenceScore: Float
)
