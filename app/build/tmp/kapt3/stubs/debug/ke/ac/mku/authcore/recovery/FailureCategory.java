package ke.ac.mku.authcore.recovery;

/**
 * FailureCategory - CORE-011
 *
 * Classification of failure types for the Authentication Core.
 * Used by RecoveryManager to determine appropriate recovery strategies.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/recovery/FailureCategory;", "", "(Ljava/lang/String;I)V", "AUTHENTICATION_FAILURE", "SESSION_FAILURE", "NETWORK_FAILURE", "SERVICE_FAILURE", "CONFIGURATION_FAILURE", "STATE_FAILURE", "RESOURCE_FAILURE", "TIMEOUT", "UNKNOWN", "app_debug"})
public enum FailureCategory {
    /*public static final*/ AUTHENTICATION_FAILURE /* = new AUTHENTICATION_FAILURE() */,
    /*public static final*/ SESSION_FAILURE /* = new SESSION_FAILURE() */,
    /*public static final*/ NETWORK_FAILURE /* = new NETWORK_FAILURE() */,
    /*public static final*/ SERVICE_FAILURE /* = new SERVICE_FAILURE() */,
    /*public static final*/ CONFIGURATION_FAILURE /* = new CONFIGURATION_FAILURE() */,
    /*public static final*/ STATE_FAILURE /* = new STATE_FAILURE() */,
    /*public static final*/ RESOURCE_FAILURE /* = new RESOURCE_FAILURE() */,
    /*public static final*/ TIMEOUT /* = new TIMEOUT() */,
    /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
    
    FailureCategory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.recovery.FailureCategory> getEntries() {
        return null;
    }
}