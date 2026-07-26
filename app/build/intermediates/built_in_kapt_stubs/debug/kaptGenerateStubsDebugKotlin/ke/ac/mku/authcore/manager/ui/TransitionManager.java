package ke.ac.mku.authcore.manager.ui;

/**
 * TransitionManager - PROGRAM-019
 *
 * Controls screen and widget transitions.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00ca\u0001\u0002\b\f\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/manager/ui/TransitionManager;", "", "<init>", "()V", "Ljavax/inject/Inject;", "planTransition", "Lke/ac/mku/authcore/domain/model/ui/TransitionPlan;", "from", "", "to", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class TransitionManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "TransitionManager";
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.ui.TransitionManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public TransitionManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.TransitionPlan planTransition(@org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    java.lang.String to) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/ui/TransitionManager$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}