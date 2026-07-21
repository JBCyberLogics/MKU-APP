package ke.ac.mku.authcore.contracts.lifecycle;

import ke.ac.mku.authcore.lifecycle.LifecycleEvent;
import ke.ac.mku.authcore.lifecycle.LifecycleState;
import ke.ac.mku.authcore.lifecycle.ServiceLifecycle;

/**
 * Lifecycle listener interface.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/contracts/lifecycle/LifecycleListener;", "", "onLifecycleEvent", "", "event", "Lke/ac/mku/authcore/lifecycle/LifecycleEvent;", "app_debug"})
public abstract interface LifecycleListener {
    
    public abstract void onLifecycleEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.lifecycle.LifecycleEvent event);
}