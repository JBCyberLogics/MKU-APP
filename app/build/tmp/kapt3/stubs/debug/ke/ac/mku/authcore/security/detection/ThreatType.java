package ke.ac.mku.authcore.security.detection;

/**
 * Types of threats that can be detected.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatType;", "", "(Ljava/lang/String;I)V", "ROOT_DETECTION", "DEBUG_DETECTION", "EMULATOR_DETECTION", "HOOKING_DETECTION", "TAMPERING_DETECTION", "UNKNOWN_SOURCES", "DEVELOPER_OPTIONS", "USB_DEBUGGING", "CERTIFICATE_BYPASS", "RUNTIME_INJECTION", "DEVICE_SPECIFICATION", "app_debug"})
public enum ThreatType {
    /*public static final*/ ROOT_DETECTION /* = new ROOT_DETECTION() */,
    /*public static final*/ DEBUG_DETECTION /* = new DEBUG_DETECTION() */,
    /*public static final*/ EMULATOR_DETECTION /* = new EMULATOR_DETECTION() */,
    /*public static final*/ HOOKING_DETECTION /* = new HOOKING_DETECTION() */,
    /*public static final*/ TAMPERING_DETECTION /* = new TAMPERING_DETECTION() */,
    /*public static final*/ UNKNOWN_SOURCES /* = new UNKNOWN_SOURCES() */,
    /*public static final*/ DEVELOPER_OPTIONS /* = new DEVELOPER_OPTIONS() */,
    /*public static final*/ USB_DEBUGGING /* = new USB_DEBUGGING() */,
    /*public static final*/ CERTIFICATE_BYPASS /* = new CERTIFICATE_BYPASS() */,
    /*public static final*/ RUNTIME_INJECTION /* = new RUNTIME_INJECTION() */,
    /*public static final*/ DEVICE_SPECIFICATION /* = new DEVICE_SPECIFICATION() */;
    
    ThreatType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.security.detection.ThreatType> getEntries() {
        return null;
    }
}