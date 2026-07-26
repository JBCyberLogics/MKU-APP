package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager
import ke.ac.mku.authcore.contracts.portal.IUniversalJsonManager
import ke.ac.mku.authcore.domain.model.portal.*
import org.json.JSONObject
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * UniversalJsonManager - PROGRAM-008
 *
 * Coordinates complete JSON generation lifecycle.
 */
@Singleton
class UniversalJsonManager @Inject constructor(
    private val schemaBuilder: JsonSchemaBuilder,
    private val entitySerializer: EntitySerializer,
    private val datasetComposer: DatasetComposer,
    private val relSerializer: RelationshipSerializer,
    private val metadataGenerator: MetadataGenerator,
    private val validator: JsonValidator,
    private val cacheManager: JsonCacheManager,
    private val authEventManager: IAuthenticationEventManager,
    private val classificationManager: Provider<ISemanticClassificationManager>
) : IUniversalJsonManager, BootstrapObserver {

    private val moduleId = "PROGRAM-008"
    private val moduleName = "Universal JSON Generator"

    companion object {
        private const val TAG = "UniversalJson"
    }

    private var latestJson: UniversalPortalJson? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IUniversalJsonManager Implementation ====================

    override fun generateUniversalJson(entities: List<SemanticEntity>): UniversalPortalJson {
        Log.i(TAG, "Starting universal JSON generation pipeline...")
        authEventManager.publish(BootstrapEvent.JsonGenerationStarted)

        try {
            // Stage 1: BUILDING_SCHEMA
            authEventManager.publish(BootstrapEvent.SchemaGenerated("universal"))

            // Stage 2: SERIALIZING
            val domainMaps = entitySerializer.mapToDomains(entities)
            authEventManager.publish(BootstrapEvent.EntitySerialized("all"))

            // Stage 3: COMPOSING
            val dashboardDataset = datasetComposer.composeDashboard(entities)
            authEventManager.publish(BootstrapEvent.DashboardDatasetCreated)

            // Stage 4: NORMALIZING & Assembling
            val root = JSONObject().apply {
                val domainsJson = JSONObject()
                domainMaps.forEach { (name, json) -> domainsJson.put(name, json) }
                
                put("student", domainMaps["student"] ?: JSONObject())
                put("finance", domainMaps["finance"] ?: JSONObject())
                put("dashboard", JSONObject().apply {
                    put("widgets", dashboardDataset.widgets.size)
                })
                put("metadata", metadataGenerator.generateMetadata("SESSION_ACTIVE", 1.0f).let {
                    JSONObject().apply {
                        put("generated_at", it.generatedAt)
                        put("schema_version", it.schemaVersion)
                    }
                })
            }

            // Stage 5: VALIDATING
            val rawJson = root.toString()
            if (validator.validate(rawJson)) {
                authEventManager.publish(BootstrapEvent.JsonValidationCompleted)
            }

            val result = UniversalPortalJson(
                metadata = metadataGenerator.generateMetadata("ACTIVE", 1.0f),
                student = domainMaps["student"]?.let { mapOf("raw" to it.toString()) } ?: emptyMap(),
                rawEntities = entities,
                rawJson = rawJson
            )

            // Stage 6: CACHING
            cacheManager.cacheJson(rawJson)

            // Stage 7: COMPLETED
            latestJson = result
            authEventManager.publish(BootstrapEvent.PortalJsonReady)
            authEventManager.publish(BootstrapEvent.JsonGenerationCompleted)
            
            Log.i(TAG, "Universal JSON generation pipeline completed successfully.")
            return result

        } catch (e: Exception) {
            Log.e(TAG, "JSON generation failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.JsonGenerationFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getLatestUniversalJson(): UniversalPortalJson? = latestJson

    override fun getDashboardDataset(): DashboardDataset? {
        return latestJson?.let { datasetComposer.composeDashboard(it.rawEntities) }
    }

    override fun validateUniversalJson(json: String): Boolean = validator.validate(json)

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.ClassificationCompleted -> {
                Log.i(TAG, "Classification ready. Generating Universal JSON...")
                classificationManager.get().getRegistry().entities.let {
                    if (it.isNotEmpty()) {
                        generateUniversalJson(it)
                    }
                }
            }
            else -> {}
        }
    }
}
