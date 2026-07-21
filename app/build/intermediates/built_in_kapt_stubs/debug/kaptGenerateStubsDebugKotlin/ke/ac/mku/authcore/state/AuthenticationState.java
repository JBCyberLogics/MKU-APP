package ke.ac.mku.authcore.state;

/**
 * Authentication state enumeration representing the complete authentication lifecycle.
 *
 * States are ordered to support ordinal-based comparisons while maintaining backward
 * compatibility with the original 5 states.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/state/AuthenticationState;", "", "<init>", "(Ljava/lang/String;I)V", "UNAUTHENTICATED", "AUTHENTICATING", "AUTHENTICATED", "SESSION_EXPIRED", "LOGGED_OUT", "UNINITIALIZED", "INITIALIZING", "READY", "SESSION_INITIALIZING", "SESSION_ACTIVE", "PORTAL_CONNECTING", "PORTAL_CONNECTED", "REFRESHING", "LOGGING_OUT", "FAILED", "RECOVERING", "app"})
public enum AuthenticationState {
    /*public static final*/ UNAUTHENTICATED /* = new UNAUTHENTICATED() */,
    /*public static final*/ AUTHENTICATING /* = new AUTHENTICATING() */,
    /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
    /*public static final*/ SESSION_EXPIRED /* = new SESSION_EXPIRED() */,
    /*public static final*/ LOGGED_OUT /* = new LOGGED_OUT() */,
    /*public static final*/ UNINITIALIZED /* = new UNINITIALIZED() */,
    /*public static final*/ INITIALIZING /* = new INITIALIZING() */,
    /*public static final*/ READY /* = new READY() */,
    /*public static final*/ SESSION_INITIALIZING /* = new SESSION_INITIALIZING() */,
    /*public static final*/ SESSION_ACTIVE /* = new SESSION_ACTIVE() */,
    /*public static final*/ PORTAL_CONNECTING /* = new PORTAL_CONNECTING() */,
    /*public static final*/ PORTAL_CONNECTED /* = new PORTAL_CONNECTED() */,
    /*public static final*/ REFRESHING /* = new REFRESHING() */,
    /*public static final*/ LOGGING_OUT /* = new LOGGING_OUT() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ RECOVERING /* = new RECOVERING() */;
    
    AuthenticationState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.state.AuthenticationState> getEntries() {
        return null;
    }
}