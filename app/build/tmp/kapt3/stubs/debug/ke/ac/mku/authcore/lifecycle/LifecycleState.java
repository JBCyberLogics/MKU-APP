package ke.ac.mku.authcore.lifecycle;

/**
 * Lifecycle states for services managed by LifecycleManager.
 *
 * State transitions:
 * - REGISTERED -> INITIALIZED (via initializeServices)
 * - INITIALIZED -> STARTING -> RUNNING (via startServices)
 * - RUNNING -> PAUSED (via pauseServices)
 * - PAUSED -> RUNNING (via resumeServices)
 * - RUNNING -> STOPPING -> STOPPED (via stopServices)
 * - STOPPED -> RESTARTING -> RUNNING (via restartServices)
 * - Any state -> SHUTDOWN (via shutdownAll)
 * - Any state -> FAILED (on unrecoverable error)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/lifecycle/LifecycleState;", "", "(Ljava/lang/String;I)V", "REGISTERED", "INITIALIZED", "STARTING", "RUNNING", "PAUSED", "STOPPING", "STOPPED", "RESTARTING", "SHUTDOWN", "FAILED", "app_debug"})
public enum LifecycleState {
    /*public static final*/ REGISTERED /* = new REGISTERED() */,
    /*public static final*/ INITIALIZED /* = new INITIALIZED() */,
    /*public static final*/ STARTING /* = new STARTING() */,
    /*public static final*/ RUNNING /* = new RUNNING() */,
    /*public static final*/ PAUSED /* = new PAUSED() */,
    /*public static final*/ STOPPING /* = new STOPPING() */,
    /*public static final*/ STOPPED /* = new STOPPED() */,
    /*public static final*/ RESTARTING /* = new RESTARTING() */,
    /*public static final*/ SHUTDOWN /* = new SHUTDOWN() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    LifecycleState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.lifecycle.LifecycleState> getEntries() {
        return null;
    }
}