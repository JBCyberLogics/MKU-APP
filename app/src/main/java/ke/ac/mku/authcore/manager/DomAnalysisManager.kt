package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager
import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * DomAnalysisManager - PROGRAM-006
 *
 * Coordinates complete DOM analysis of portal pages.
 */
@Singleton
class DomAnalysisManager @Inject constructor(
    private val parser: HtmlDocumentParser,
    private val tableAnalyzer: TableAnalyzer,
    private val formAnalyzer: FormAnalyzer,
    private val authEventManager: IAuthenticationEventManager
) : IDomAnalysisManager, BootstrapObserver {

    private val moduleId = "PROGRAM-006"
    private val moduleName = "DOM Analysis Engine"

    companion object {
        private const val TAG = "DomAnalysis"
    }

    private var latestReport: AnalysisReport? = null
    private var latestSemanticDom: SemanticDom? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IDomAnalysisManager Implementation ====================

    override fun analyzeDocument(html: String, pageId: String): SemanticDom {
        val startTime = System.currentTimeMillis()
        authEventManager.publish(BootstrapEvent.DomAnalysisStarted)
        
        Log.i(TAG, "Analyzing document for page: $pageId")

        try {
            // 1. Parse and Normalize
            val doc = parser.parse(html)
            parser.normalize(doc)
            authEventManager.publish(BootstrapEvent.DocumentParsed)

            // 2. Specialized Analysis
            val tables = tableAnalyzer.analyze(doc)
            if (tables.isNotEmpty()) {
                authEventManager.publish(BootstrapEvent.TablesDetected(tables.size))
            }

            val forms = formAnalyzer.analyze(doc)
            if (forms.isNotEmpty()) {
                authEventManager.publish(BootstrapEvent.FormsDetected(forms.size))
            }

            // 3. Assemble Semantic DOM
            val semanticDom = SemanticDom(
                documentId = "doc_${System.nanoTime()}",
                pageId = pageId,
                pageTitle = doc.title(),
                fingerprint = generateFingerprint(html),
                tables = tables,
                forms = forms
            )

            // 4. Update Metrics & Report
            val duration = System.currentTimeMillis() - startTime
            latestReport = AnalysisReport(
                timestamp = System.currentTimeMillis(),
                durationMs = duration,
                elementCounts = mapOf(
                    "tables" to tables.size,
                    "forms" to forms.size
                ),
                confidenceScore = 1.0f // Simplified
            )

            latestSemanticDom = semanticDom
            authEventManager.publish(BootstrapEvent.SemanticDomCreated)
            authEventManager.publish(BootstrapEvent.DomAnalysisCompleted)
            
            Log.i(TAG, "Analysis completed in ${duration}ms")
            return semanticDom

        } catch (e: Exception) {
            Log.e(TAG, "DOM analysis failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.DomAnalysisFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getLatestAnalysisReport(): AnalysisReport? = latestReport

    override fun getLatestSemanticDom(): SemanticDom? = latestSemanticDom

    override fun clearCache() {
        latestReport = null
        latestSemanticDom = null
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.PortalMonitorStarted -> {
                // Potential trigger
            }
            else -> {}
        }
    }

    private fun generateFingerprint(html: String): String {
        return "sha256_${html.hashCode()}" // Simplified
    }
}
