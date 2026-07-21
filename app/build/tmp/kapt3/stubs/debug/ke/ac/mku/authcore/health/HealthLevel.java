package ke.ac.mku.authcore.health;

/**
 * Health levels for system and component status.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/health/HealthLevel;", "", "(Ljava/lang/String;I)V", "HEALTHY", "WARNING", "DEGRADED", "CRITICAL", "OFFLINE", "app_debug"})
public enum HealthLevel {
    /*public static final*/ HEALTHY /* = new HEALTHY() */,
    /*public static final*/ WARNING /* = new WARNING() */,
    /*public static final*/ DEGRADED /* = new DEGRADED() */,
    /*public static final*/ CRITICAL /* = new CRITICAL() */,
    /*public static final*/ OFFLINE /* = new OFFLINE() */;
    
    HealthLevel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.health.HealthLevel> getEntries() {
        return null;
    }
}