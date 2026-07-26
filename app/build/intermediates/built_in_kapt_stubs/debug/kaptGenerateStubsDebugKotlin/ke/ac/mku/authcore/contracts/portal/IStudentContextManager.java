package ke.ac.mku.authcore.contracts.portal;

/**
 * IStudentContextManager - PROGRAM-011
 *
 * Interface for the unified student context engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IStudentContextManager;", "", "getStudentContext", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "refreshContext", "", "getContextSnapshot", "Lke/ac/mku/authcore/domain/model/portal/ContextSnapshot;", "clearContext", "app"})
public abstract interface IStudentContextManager {
    
    /**
     * Return the current live student context.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentContext getStudentContext();
    
    /**
     * Trigger a manual refresh of the student context from the knowledge graph.
     */
    public abstract void refreshContext();
    
    /**
     * Return a historical snapshot of the student context.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.ContextSnapshot getContextSnapshot();
    
    /**
     * Clear the current context.
     */
    public abstract void clearContext();
}