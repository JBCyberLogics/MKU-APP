package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.AnalysisReport
import ke.ac.mku.authcore.domain.model.portal.SemanticDom

/**
 * IDomAnalysisManager - PROGRAM-006
 *
 * Interface for the semantic DOM analysis engine.
 */
interface IDomAnalysisManager {

    /**
     * Analyze an authenticated HTML document and build a semantic model.
     */
    fun analyzeDocument(html: String, pageId: String): SemanticDom

    /**
     * Return the report from the most recent analysis.
     */
    fun getLatestAnalysisReport(): AnalysisReport?

    /**
     * Clear cached analysis data.
     */
    fun clearCache()
}
