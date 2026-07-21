package ke.ac.mku.authcore.state;

/**
 * Session state enumeration representing the complete session lifecycle.
 *
 * These 12 states provide granular tracking of session creation, validation,
 * refresh, expiry, and recovery operations throughout the session lifecycle.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lke/ac/mku/authcore/state/SessionState;", "", "(Ljava/lang/String;I)V", "NONE", "CREATING", "ACTIVE", "RESTORING", "REFRESHING", "VALIDATING", "EXPIRING", "EXPIRED", "TERMINATING", "TERMINATED", "FAILED", "RECOVERING", "app_debug"})
public enum SessionState {
    /*public static final*/ NONE /* = new NONE() */,
    /*public static final*/ CREATING /* = new CREATING() */,
    /*public static final*/ ACTIVE /* = new ACTIVE() */,
    /*public static final*/ RESTORING /* = new RESTORING() */,
    /*public static final*/ REFRESHING /* = new REFRESHING() */,
    /*public static final*/ VALIDATING /* = new VALIDATING() */,
    /*public static final*/ EXPIRING /* = new EXPIRING() */,
    /*public static final*/ EXPIRED /* = new EXPIRED() */,
    /*public static final*/ TERMINATING /* = new TERMINATING() */,
    /*public static final*/ TERMINATED /* = new TERMINATED() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ RECOVERING /* = new RECOVERING() */;
    
    SessionState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.state.SessionState> getEntries() {
        return null;
    }
}