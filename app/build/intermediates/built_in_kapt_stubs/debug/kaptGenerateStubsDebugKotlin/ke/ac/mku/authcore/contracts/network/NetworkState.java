package ke.ac.mku.authcore.contracts.network;

/**
 * Represents the current state of network connectivity.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/contracts/network/NetworkState;", "", "<init>", "(Ljava/lang/String;I)V", "UNINITIALIZED", "INITIALIZING", "ONLINE", "OFFLINE", "LIMITED", "CONNECTING", "CONNECTED", "DISCONNECTED", "RECOVERING", "FAILED", "app"})
public enum NetworkState {
    /*public static final*/ UNINITIALIZED /* = new UNINITIALIZED() */,
    /*public static final*/ INITIALIZING /* = new INITIALIZING() */,
    /*public static final*/ ONLINE /* = new ONLINE() */,
    /*public static final*/ OFFLINE /* = new OFFLINE() */,
    /*public static final*/ LIMITED /* = new LIMITED() */,
    /*public static final*/ CONNECTING /* = new CONNECTING() */,
    /*public static final*/ CONNECTED /* = new CONNECTED() */,
    /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
    /*public static final*/ RECOVERING /* = new RECOVERING() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    NetworkState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.network.NetworkState> getEntries() {
        return null;
    }
}