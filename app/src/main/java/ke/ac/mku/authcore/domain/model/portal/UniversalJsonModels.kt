package ke.ac.mku.authcore.domain.model.portal

/**
 * UniversalJsonModels - PROGRAM-008
 *
 * Models for the universal, standardized representation of portal data.
 */

data class UniversalPortalJson(
    val metadata: JsonMetadata,
    val student: Map<String, Any> = emptyMap(),
    val academics: Map<String, Any> = emptyMap(),
    val finance: Map<String, Any> = emptyMap(),
    val learning: Map<String, Any> = emptyMap(),
    val resources: Map<String, Any> = emptyMap(),
    val dashboard: Map<String, Any> = emptyMap(),
    val relationships: Map<String, Any> = emptyMap(),
    val rawEntities: List<SemanticEntity> = emptyList(),
    val rawJson: String
)

data class JsonMetadata(
    val portalVersion: String,
    val schemaVersion: String,
    val generatedAt: Long,
    val studentSession: String,
    val confidence: Float
)

data class DashboardDataset(
    val widgets: List<Map<String, Any>>,
    val charts: List<Map<String, Any>>,
    val summary: Map<String, Any>
)

data class SchemaDefinition(
    val domain: String,
    val version: String,
    val fields: List<SchemaField>
)

data class SchemaField(
    val name: String,
    val type: String,
    val isRequired: Boolean
)
