package ke.ac.mku.authcore.manager;

/**
 * ContextValidationManager - PROGRAM-015
 *
 * Single validation gateway for the Student Context.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u0002\b\u0012\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b%\u00a8\u0006$"}, d2 = {"Lke/ac/mku/authcore/manager/ContextValidationManager;", "Lke/ac/mku/authcore/contracts/portal/IContextValidationManager;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "schemaValidator", "Lke/ac/mku/authcore/manager/SchemaValidator;", "integrityValidator", "Lke/ac/mku/authcore/manager/IntegrityValidator;", "repairEngine", "Lke/ac/mku/authcore/manager/ContextRepairEngine;", "readinessEvaluator", "Lke/ac/mku/authcore/manager/DashboardReadinessEvaluator;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "contextManagerProvider", "Ljavax/inject/Provider;", "Lke/ac/mku/authcore/contracts/portal/IStudentContextManager;", "<init>", "(Lke/ac/mku/authcore/manager/SchemaValidator;Lke/ac/mku/authcore/manager/IntegrityValidator;Lke/ac/mku/authcore/manager/ContextRepairEngine;Lke/ac/mku/authcore/manager/DashboardReadinessEvaluator;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;Ljavax/inject/Provider;)V", "Ljavax/inject/Inject;", "moduleId", "", "moduleName", "latestResult", "Lke/ac/mku/authcore/domain/model/portal/ValidationResult;", "validate", "context", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "getReadinessReport", "Lke/ac/mku/authcore/domain/model/portal/DashboardReadiness;", "repairContext", "getLatestResult", "onBootstrapEvent", "", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class ContextValidationManager implements ke.ac.mku.authcore.contracts.portal.IContextValidationManager, ke.ac.mku.authcore.bootstrap.BootstrapObserver {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.SchemaValidator schemaValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.IntegrityValidator integrityValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.ContextRepairEngine repairEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.DashboardReadinessEvaluator readinessEvaluator = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final javax.inject.Provider<ke.ac.mku.authcore.contracts.portal.IStudentContextManager> contextManagerProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleId = "PROGRAM-015";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleName = "Context Validator";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ContextValidator";
    @org.jetbrains.annotations.Nullable()
    private ke.ac.mku.authcore.domain.model.portal.ValidationResult latestResult;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.ContextValidationManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public ContextValidationManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.SchemaValidator schemaValidator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.IntegrityValidator integrityValidator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.ContextRepairEngine repairEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.DashboardReadinessEvaluator readinessEvaluator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<ke.ac.mku.authcore.contracts.portal.IStudentContextManager> contextManagerProvider) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.domain.model.portal.ValidationResult validate(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext context) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.domain.model.portal.DashboardReadiness getReadinessReport() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.domain.model.portal.StudentContext repairContext(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext context) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public ke.ac.mku.authcore.domain.model.portal.ValidationResult getLatestResult() {
        return null;
    }
    
    @java.lang.Override()
    public void onBootstrapEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/ContextValidationManager$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}