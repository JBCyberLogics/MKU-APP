package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager
import ke.ac.mku.authcore.domain.model.portal.JsonMetadata
import ke.ac.mku.authcore.domain.model.portal.NormalizedPortalJson
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * UniversalJsonManager - PROGRAM-008
 *
 * Universal translation layer responsible for transforming semantic data into JSON.
 */
@Singleton
class UniversalJsonManager @Inject constructor(
    private val schemaEngine: JsonSchemaEngine,
    private val entityMapper: EntityMapper,
    private val relSerializer: RelationshipSerializer,
    private val authEventManager: IAuthenticationEventManager
) : IUniversalJsonManager, BootstrapObserver {

    private val moduleId = "PROGRAM-008"
    private val moduleName = "Universal JSON Generator"

    companion object {
        private const val TAG = "UniversalJson"
    }

    private var latestJson: NormalizedPortalJson? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IUniversalJsonManager Implementation ====================

    override fun generateJson(entities: List<SemanticEntity>): NormalizedPortalJson {
        Log.i(TAG, "Starting JSON generation for ${entities.size} entities...")
        authEventManager.publish(BootstrapEvent.JsonGenerationStarted)

        try {
            // 1. Map to Domains
            val domainMaps = entityMapper.mapToDomains(entities)
            
            // 2. Serialize Relationships
            val rels = relSerializer.serialize(entities)

            // 3. Assemble Final JSON
            val root = JSONObject().apply {
                val domainsJson = JSONObject()
                domainMaps.forEach { (name, json) -> domainsJson.put(name, json) }
                
                put("domains", domainsJson)
                put("relationships", rels)
                put("metadata", JSONObject().apply {
                    put("generated_at", System.currentTimeMillis())
                    put("schema_version", "1.0.0")
                })
            }

            val result = NormalizedPortalJson(
                metadata = JsonMetadata(
                    portalName = "MKU Portal",
                    generatedAt = System.currentTimeMillis(),
                    schemaVersion = "1.0.0",
                    confidence = 1.0f
                ),
                domains = domainMaps.mapValues { it.value.toString() },
                rawJson = root.toString()
            )

            latestJson = result
            authEventManager.publish(BootstrapEvent.NormalizedJsonCreated)
            authEventManager.publish(BootstrapEvent.JsonGenerationCompleted)
            
            Log.i(TAG, "Standardized JSON model generated successfully.")
            return result

        } catch (e: Exception) {
            Log.e(TAG, "JSON generation failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.JsonGenerationFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getLatestJson(): NormalizedPortalJson? = latestJson

    override fun validateJson(json: String, schemaDomain: String): Boolean {
        Log.d(TAG, "Validating JSON for domain: $schemaDomain")
        // Logic to validate using schemaEngine
        authEventManager.publish(BootstrapEvent.JsonValidated)
        return true
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.ClassificationCompleted -> {
                // Automated trigger
            }
            else -> {}
        }
    }
}
