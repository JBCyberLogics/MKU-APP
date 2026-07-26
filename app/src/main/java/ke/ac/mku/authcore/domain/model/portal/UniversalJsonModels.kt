package ke.ac.mku.authcore.domain.model.portal

/**
 * UniversalJsonModels - PROGRAM-008
 *
 * Models for the standardized JSON representation of portal data.
 */

data class NormalizedPortalJson(
    val metadata: JsonMetadata,
    val domains: Map<String, Any>,
    val rawJson: String
)

data class JsonMetadata(
    val portalName: String,
    val generatedAt: Long,
    val schemaVersion: String,
    val confidence: Float
)

data class PortalDataDomain(
    val name: String,
    val data: Map<String, Any>,
    val relationships: List<String>
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
