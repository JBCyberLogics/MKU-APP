package ke.ac.mku.authcore.contracts.authentication;

/**
 * Workflow state enum representing the 12 states of the login workflow.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/WorkflowState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "PLATFORM_VALIDATION", "CREDENTIAL_VALIDATION", "AUTHENTICATION", "RESPONSE_VERIFICATION", "SESSION_INITIALIZATION", "COOKIE_INITIALIZATION", "PORTAL_CONNECTION", "NOTIFICATION", "COMPLETED", "FAILED", "CANCELLED", "app"})
public enum WorkflowState {
    /*public static final*/ IDLE /* = new IDLE() */,
    /*public static final*/ PLATFORM_VALIDATION /* = new PLATFORM_VALIDATION() */,
    /*public static final*/ CREDENTIAL_VALIDATION /* = new CREDENTIAL_VALIDATION() */,
    /*public static final*/ AUTHENTICATION /* = new AUTHENTICATION() */,
    /*public static final*/ RESPONSE_VERIFICATION /* = new RESPONSE_VERIFICATION() */,
    /*public static final*/ SESSION_INITIALIZATION /* = new SESSION_INITIALIZATION() */,
    /*public static final*/ COOKIE_INITIALIZATION /* = new COOKIE_INITIALIZATION() */,
    /*public static final*/ PORTAL_CONNECTION /* = new PORTAL_CONNECTION() */,
    /*public static final*/ NOTIFICATION /* = new NOTIFICATION() */,
    /*public static final*/ COMPLETED /* = new COMPLETED() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ CANCELLED /* = new CANCELLED() */;
    
    WorkflowState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.authentication.WorkflowState> getEntries() {
        return null;
    }
}