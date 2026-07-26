package ke.ac.mku.authcore.contracts.portal;

/**
 * Represents the current state of portal connectivity.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/PortalState;", "", "<init>", "(Ljava/lang/String;I)V", "UNINITIALIZED", "INITIALIZING", "DISCONNECTED", "CONNECTING", "CONNECTED", "AUTHENTICATED", "RECONNECTING", "FAILED", "app"})
public enum PortalState {
    /*public static final*/ UNINITIALIZED /* = new UNINITIALIZED() */,
    /*public static final*/ INITIALIZING /* = new INITIALIZING() */,
    /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
    /*public static final*/ CONNECTING /* = new CONNECTING() */,
    /*public static final*/ CONNECTED /* = new CONNECTED() */,
    /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
    /*public static final*/ RECONNECTING /* = new RECONNECTING() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    PortalState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.portal.PortalState> getEntries() {
        return null;
    }
}