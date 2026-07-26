package ke.ac.mku.authcore.contracts.endpoint;

/**
 * Represents the current health state of an endpoint.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "HEALTHY", "DEGRADED", "UNREACHABLE", "RECOVERING", "FAILED", "DISABLED", "app"})
public enum EndpointHealthState {
    /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
    /*public static final*/ HEALTHY /* = new HEALTHY() */,
    /*public static final*/ DEGRADED /* = new DEGRADED() */,
    /*public static final*/ UNREACHABLE /* = new UNREACHABLE() */,
    /*public static final*/ RECOVERING /* = new RECOVERING() */,
    /*public static final*/ FAILED /* = new FAILED() */,
    /*public static final*/ DISABLED /* = new DISABLED() */;
    
    EndpointHealthState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.endpoint.EndpointHealthState> getEntries() {
        return null;
    }
}