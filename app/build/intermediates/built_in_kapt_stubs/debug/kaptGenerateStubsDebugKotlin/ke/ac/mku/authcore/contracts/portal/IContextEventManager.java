package ke.ac.mku.authcore.contracts.portal;

/**
 * IContextEventManager - PROGRAM-014
 *
 * Interface for the high-level student context event engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IContextEventManager;", "", "getEventHistory", "", "Lke/ac/mku/authcore/domain/model/portal/EventAuditEntry;", "limit", "", "calculateRefreshPlan", "Lke/ac/mku/authcore/domain/model/portal/RefreshPlan;", "clearAuditLog", "", "app"})
public abstract interface IContextEventManager {
    
    /**
     * Return the history of intelligence events.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.EventAuditEntry> getEventHistory(int limit);
    
    /**
     * Force the calculation of a refresh plan based on current state.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.RefreshPlan calculateRefreshPlan();
    
    /**
     * Clear the event audit log.
     */
    public abstract void clearAuditLog();
    
    /**
     * IContextEventManager - PROGRAM-014
     *
     * Interface for the high-level student context event engine.
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}