package ke.ac.mku.authcore.manager;

/**
 * DomAnalysisManager - PROGRAM-006
 *
 * Coordinates complete DOM analysis of portal pages.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u001a\u0002\b\r\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\"\u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/manager/DomAnalysisManager;", "Lke/ac/mku/authcore/contracts/portal/IDomAnalysisManager;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "parser", "Lke/ac/mku/authcore/manager/HtmlDocumentParser;", "tableAnalyzer", "Lke/ac/mku/authcore/manager/TableAnalyzer;", "formAnalyzer", "Lke/ac/mku/authcore/manager/FormAnalyzer;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "<init>", "(Lke/ac/mku/authcore/manager/HtmlDocumentParser;Lke/ac/mku/authcore/manager/TableAnalyzer;Lke/ac/mku/authcore/manager/FormAnalyzer;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;)V", "Ljavax/inject/Inject;", "moduleId", "", "moduleName", "latestReport", "Lke/ac/mku/authcore/domain/model/portal/AnalysisReport;", "latestSemanticDom", "Lke/ac/mku/authcore/domain/model/portal/SemanticDom;", "analyzeDocument", "html", "pageId", "getLatestAnalysisReport", "getLatestSemanticDom", "clearCache", "", "onBootstrapEvent", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "generateFingerprint", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class DomAnalysisManager implements ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager, ke.ac.mku.authcore.bootstrap.BootstrapObserver {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.HtmlDocumentParser parser = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.TableAnalyzer tableAnalyzer = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.FormAnalyzer formAnalyzer = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleId = "PROGRAM-006";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleName = "DOM Analysis Engine";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DomAnalysis";
    @org.jetbrains.annotations.Nullable()
    private ke.ac.mku.authcore.domain.model.portal.AnalysisReport latestReport;
    @org.jetbrains.annotations.Nullable()
    private ke.ac.mku.authcore.domain.model.portal.SemanticDom latestSemanticDom;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.DomAnalysisManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public DomAnalysisManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.HtmlDocumentParser parser, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.TableAnalyzer tableAnalyzer, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.FormAnalyzer formAnalyzer, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.domain.model.portal.SemanticDom analyzeDocument(@org.jetbrains.annotations.NotNull()
    java.lang.String html, @org.jetbrains.annotations.NotNull()
    java.lang.String pageId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public ke.ac.mku.authcore.domain.model.portal.AnalysisReport getLatestAnalysisReport() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public ke.ac.mku.authcore.domain.model.portal.SemanticDom getLatestSemanticDom() {
        return null;
    }
    
    @java.lang.Override()
    public void clearCache() {
    }
    
    @java.lang.Override()
    public void onBootstrapEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    private final java.lang.String generateFingerprint(java.lang.String html) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/DomAnalysisManager$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}