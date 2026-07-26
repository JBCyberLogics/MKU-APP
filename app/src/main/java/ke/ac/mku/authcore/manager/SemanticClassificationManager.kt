package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager
import ke.ac.mku.authcore.contracts.portal.ISemanticClassificationManager
import ke.ac.mku.authcore.domain.model.portal.SemanticDom
import ke.ac.mku.authcore.domain.model.portal.SemanticEntity
import ke.ac.mku.authcore.domain.model.portal.SemanticRegistry
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * SemanticClassificationManager - PROGRAM-007
 *
 * Coordinates the semantic classification pipeline.
 */
@Singleton
class SemanticClassificationManager @Inject constructor(
    private val classifier: EntityClassifier,
    private val contextAnalyzer: ContextAnalyzer,
    private val confidenceEngine: ConfidenceEngine,
    private val authEventManager: IAuthenticationEventManager,
    private val domAnalysisProvider: Provider<IDomAnalysisManager>
) : ISemanticClassificationManager, BootstrapObserver {

    private val moduleId = "PROGRAM-007"
    private val moduleName = "Semantic Classification Engine"

    companion object {
        private const val TAG = "SemanticClassification"
    }

    private var currentRegistry = SemanticRegistry(lastUpdated = System.currentTimeMillis())

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== ISemanticClassificationManager Implementation ====================

    override fun classify(dom: SemanticDom): List<SemanticEntity> {
        Log.i(TAG, "Starting semantic classification for: ${dom.pageId}")
        authEventManager.publish(BootstrapEvent.SemanticClassificationStarted)

        try {
            // 1. Initial Classification
            val rawEntities = classifier.classify(dom)

            // 2. Contextual Enrichment
            val enrichedEntities = contextAnalyzer.enrichWithContext(rawEntities, dom)

            // 3. Update Registry
            currentRegistry = currentRegistry.copy(
                entities = (currentRegistry.entities + enrichedEntities).distinctBy { it.entityId },
                lastUpdated = System.currentTimeMillis()
            )

            // 4. Publish Results
            enrichedEntities.forEach { entity ->
                authEventManager.publish(BootstrapEvent.EntityClassified(
                    entity.entityId,
                    entity.type.name,
                    entity.confidence
                ))
            }

            authEventManager.publish(BootstrapEvent.SemanticRegistryUpdated)
            authEventManager.publish(BootstrapEvent.ClassificationCompleted)

            Log.i(TAG, "Successfully classified ${enrichedEntities.size} new entities.")
            return enrichedEntities

        } catch (e: Exception) {
            Log.e(TAG, "Classification failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.ClassificationFailed(e.message ?: "Unknown error"))
            return emptyList()
        }
    }

    override fun getRegistry(): SemanticRegistry = currentRegistry

    override fun getConfidenceScore(entityId: String): Float {
        return currentRegistry.entities.find { it.entityId == entityId }?.confidence ?: 0f
    }

    override fun clearRegistry() {
        currentRegistry = SemanticRegistry(lastUpdated = System.currentTimeMillis())
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.DomAnalysisCompleted -> {
                Log.i(TAG, "DOM Analysis ready. Starting semantic classification...")
                domAnalysisProvider.get().getLatestSemanticDom()?.let {
                    classify(it)
                }
            }
            else -> {}
        }
    }
}
