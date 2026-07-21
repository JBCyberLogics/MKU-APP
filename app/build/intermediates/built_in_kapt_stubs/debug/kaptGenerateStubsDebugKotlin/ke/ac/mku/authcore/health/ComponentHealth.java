package ke.ac.mku.authcore.health;

/**
 * Health status for an individual component.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001J\u0014\u0010&\u001a\u00020\b2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010(\u001a\u00020\rH\u00d6\u0081\u0004J\n\u0010)\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u0006+"}, d2 = {"Lke/ac/mku/authcore/health/ComponentHealth;", "", "name", "", "level", "Lke/ac/mku/authcore/health/HealthLevel;", "message", "isAvailable", "", "lastCheck", "", "responseTimeMs", "failureCount", "", "recoveryCount", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/health/HealthLevel;Ljava/lang/String;ZJJII)V", "getName", "()Ljava/lang/String;", "getLevel", "()Lke/ac/mku/authcore/health/HealthLevel;", "getMessage", "()Z", "getLastCheck", "()J", "getResponseTimeMs", "getFailureCount", "()I", "getRecoveryCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Companion", "app"})
public final class ComponentHealth {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.health.HealthLevel level = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    private final boolean isAvailable = false;
    private final long lastCheck = 0L;
    private final long responseTimeMs = 0L;
    private final int failureCount = 0;
    private final int recoveryCount = 0;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.health.ComponentHealth.Companion Companion = null;
    
    public ComponentHealth(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthLevel level, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isAvailable, long lastCheck, long responseTimeMs, int failureCount, int recoveryCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthLevel getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    public final long getLastCheck() {
        return 0L;
    }
    
    public final long getResponseTimeMs() {
        return 0L;
    }
    
    public final int getFailureCount() {
        return 0;
    }
    
    public final int getRecoveryCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthLevel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.ComponentHealth copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthLevel level, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isAvailable, long lastCheck, long responseTimeMs, int failureCount, int recoveryCount) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/health/ComponentHealth$Companion;", "", "<init>", "()V", "healthy", "Lke/ac/mku/authcore/health/ComponentHealth;", "name", "", "message", "offline", "warning", "critical", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a healthy component status.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.ComponentHealth healthy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        /**
         * Create an offline component status.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.ComponentHealth offline(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        /**
         * Create a warning component status.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.ComponentHealth warning(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        /**
         * Create a critical component status.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.ComponentHealth critical(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
    }
}