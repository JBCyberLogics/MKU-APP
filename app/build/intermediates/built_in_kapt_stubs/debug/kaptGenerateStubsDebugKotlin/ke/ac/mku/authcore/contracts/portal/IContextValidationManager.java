package ke.ac.mku.authcore.contracts.portal;

/**
 * IContextValidationManager - PROGRAM-015
 *
 * Interface for the single validation gateway for Student Context.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IContextValidationManager;", "", "validate", "Lke/ac/mku/authcore/domain/model/portal/ValidationResult;", "context", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "getReadinessReport", "Lke/ac/mku/authcore/domain/model/portal/DashboardReadiness;", "repairContext", "getLatestResult", "app"})
public abstract interface IContextValidationManager {
    
    /**
     * Validate the complete Student Context.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.ValidationResult validate(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext context);
    
    /**
     * Determine whether the current context is safe for UI rendering.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.DashboardReadiness getReadinessReport();
    
    /**
     * Automatically repair minor context inconsistencies.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentContext repairContext(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext context);
    
    /**
     * Return the report from the most recent validation.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.ValidationResult getLatestResult();
}