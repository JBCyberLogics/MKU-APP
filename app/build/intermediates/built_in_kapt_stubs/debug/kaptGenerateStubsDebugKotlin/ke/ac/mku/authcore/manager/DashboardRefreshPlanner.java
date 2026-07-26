package ke.ac.mku.authcore.manager;

/**
 * DashboardRefreshPlanner - PROGRAM-014
 *
 * Determines the minimum scope required for a UI refresh.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00ca\u0001\u0002\b\n\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/manager/DashboardRefreshPlanner;", "", "<init>", "()V", "Ljavax/inject/Inject;", "planRefresh", "Lke/ac/mku/authcore/domain/model/portal/RefreshPlan;", "delta", "Lke/ac/mku/authcore/domain/model/portal/ContextDelta;", "app", "Ljavax/inject/Singleton;"})
public final class DashboardRefreshPlanner {
    
    @javax.inject.Inject()
    public DashboardRefreshPlanner() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.RefreshPlan planRefresh(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ContextDelta delta) {
        return null;
    }
}