package ke.ac.mku.authcore.auth.transaction;

/**
 * Authentication states for the transactional state machine as defined in AUTH-TXN-001.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/auth/transaction/AuthTransactionState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "LOGIN_PAGE_LOADING", "LOGIN_PAGE_READY", "AUTHENTICATING", "LOGIN_REQUEST_SENT", "LOGIN_RESPONSE_RECEIVED", "COOKIE_CAPTURE", "COOKIE_PERSISTED", "SESSION_CREATING", "SESSION_CREATED", "SESSION_VALIDATING", "PORTAL_VALIDATING", "AUTHENTICATED", "FAILED", "app"})
public enum AuthTransactionState {
    /*public static final*/ IDLE /* = new IDLE() */,
    /*public static final*/ LOGIN_PAGE_LOADING /* = new LOGIN_PAGE_LOADING() */,
    /*public static final*/ LOGIN_PAGE_READY /* = new LOGIN_PAGE_READY() */,
    /*public static final*/ AUTHENTICATING /* = new AUTHENTICATING() */,
    /*public static final*/ LOGIN_REQUEST_SENT /* = new LOGIN_REQUEST_SENT() */,
    /*public static final*/ LOGIN_RESPONSE_RECEIVED /* = new LOGIN_RESPONSE_RECEIVED() */,
    /*public static final*/ COOKIE_CAPTURE /* = new COOKIE_CAPTURE() */,
    /*public static final*/ COOKIE_PERSISTED /* = new COOKIE_PERSISTED() */,
    /*public static final*/ SESSION_CREATING /* = new SESSION_CREATING() */,
    /*public static final*/ SESSION_CREATED /* = new SESSION_CREATED() */,
    /*public static final*/ SESSION_VALIDATING /* = new SESSION_VALIDATING() */,
    /*public static final*/ PORTAL_VALIDATING /* = new PORTAL_VALIDATING() */,
    /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    AuthTransactionState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.auth.transaction.AuthTransactionState> getEntries() {
        return null;
    }
}