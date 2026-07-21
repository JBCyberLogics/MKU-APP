package ke.ac.mku.authcore.contracts.security;

/**
 * Action - SECURITY-005
 *
 * Actions to take based on risk level.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/Action;", "", "<init>", "(Ljava/lang/String;I)V", "LOG_ONLY", "LOG_AND_WARN", "AUDIT_AND_NOTIFY", "BLOCK_AND_RECOVER", "app"})
public enum Action {
    /*public static final*/ LOG_ONLY /* = new LOG_ONLY() */,
    /*public static final*/ LOG_AND_WARN /* = new LOG_AND_WARN() */,
    /*public static final*/ AUDIT_AND_NOTIFY /* = new AUDIT_AND_NOTIFY() */,
    /*public static final*/ BLOCK_AND_RECOVER /* = new BLOCK_AND_RECOVER() */;
    
    Action() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.Action> getEntries() {
        return null;
    }
}