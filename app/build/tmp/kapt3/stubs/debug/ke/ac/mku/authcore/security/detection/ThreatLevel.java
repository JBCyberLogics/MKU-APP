package ke.ac.mku.authcore.security.detection;

/**
 * ThreatLevel - SECURITY-001
 *
 * Risk classification for security threats detected on the device.
 * Determines the action taken by the security system.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatLevel;", "", "(Ljava/lang/String;I)V", "CRITICAL", "HIGH", "MEDIUM", "LOW", "app_debug"})
public enum ThreatLevel {
    /*public static final*/ CRITICAL /* = new CRITICAL() */,
    /*public static final*/ HIGH /* = new HIGH() */,
    /*public static final*/ MEDIUM /* = new MEDIUM() */,
    /*public static final*/ LOW /* = new LOW() */;
    
    ThreatLevel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.security.detection.ThreatLevel> getEntries() {
        return null;
    }
}