package ke.ac.mku.authcore.contracts.portal;

/**
 * IDomAnalysisManager - PROGRAM-006
 *
 * Interface for the semantic DOM analysis engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IDomAnalysisManager;", "", "analyzeDocument", "Lke/ac/mku/authcore/domain/model/portal/SemanticDom;", "html", "", "pageId", "getLatestAnalysisReport", "Lke/ac/mku/authcore/domain/model/portal/AnalysisReport;", "getLatestSemanticDom", "clearCache", "", "app"})
public abstract interface IDomAnalysisManager {
    
    /**
     * Analyze an authenticated HTML document and build a semantic model.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.SemanticDom analyzeDocument(@org.jetbrains.annotations.NotNull()
    java.lang.String html, @org.jetbrains.annotations.NotNull()
    java.lang.String pageId);
    
    /**
     * Return the report from the most recent analysis.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.AnalysisReport getLatestAnalysisReport();
    
    /**
     * Return the most recent semantic DOM.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.SemanticDom getLatestSemanticDom();
    
    /**
     * Clear cached analysis data.
     */
    public abstract void clearCache();
}