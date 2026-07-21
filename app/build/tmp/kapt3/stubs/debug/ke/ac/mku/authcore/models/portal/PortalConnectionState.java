package ke.ac.mku.authcore.models.portal;

/**
 * Portal connection state enum.
 *
 * Represents the lifecycle states of a portal connection.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/models/portal/PortalConnectionState;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "DISCONNECTING", "ERROR", "app_debug"})
public enum PortalConnectionState {
    /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
    /*public static final*/ CONNECTING /* = new CONNECTING() */,
    /*public static final*/ CONNECTED /* = new CONNECTED() */,
    /*public static final*/ DISCONNECTING /* = new DISCONNECTING() */,
    /*public static final*/ ERROR /* = new ERROR() */;
    
    PortalConnectionState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.models.portal.PortalConnectionState> getEntries() {
        return null;
    }
}