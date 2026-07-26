package ke.ac.mku.authcore.manager;

/**
 * PriorityEventDispatcher - PROGRAM-014
 *
 * Dispatches events based on their urgency levels.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0002\b\b\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0010\u00a8\u0006\u000f"}, d2 = {"Lke/ac/mku/authcore/manager/PriorityEventDispatcher;", "", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "router", "Lke/ac/mku/authcore/manager/ContextEventRouter;", "<init>", "(Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;Lke/ac/mku/authcore/manager/ContextEventRouter;)V", "Ljavax/inject/Inject;", "dispatch", "", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "priority", "Lke/ac/mku/authcore/domain/model/portal/PriorityLevel;", "app", "Ljavax/inject/Singleton;"})
public final class PriorityEventDispatcher {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.ContextEventRouter router = null;
    
    @javax.inject.Inject()
    public PriorityEventDispatcher(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.ContextEventRouter router) {
        super();
    }
    
    public final void dispatch(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.PriorityLevel priority) {
    }
}