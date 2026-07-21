package ke.ac.mku.authcore.health;

/**
 * Aggregated system health status.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\fH\u00c6\u0003J\t\u0010!\u001a\u00020\u000eH\u00c6\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010\'\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lke/ac/mku/authcore/health/SystemHealth;", "", "overall", "Lke/ac/mku/authcore/health/HealthLevel;", "components", "", "", "Lke/ac/mku/authcore/health/ComponentHealth;", "memoryUsagePercent", "", "cpuUsagePercent", "lastUpdated", "", "metrics", "Lke/ac/mku/authcore/health/HealthMetrics;", "<init>", "(Lke/ac/mku/authcore/health/HealthLevel;Ljava/util/Map;IIJLke/ac/mku/authcore/health/HealthMetrics;)V", "getOverall", "()Lke/ac/mku/authcore/health/HealthLevel;", "getComponents", "()Ljava/util/Map;", "getMemoryUsagePercent", "()I", "getCpuUsagePercent", "getLastUpdated", "()J", "getMetrics", "()Lke/ac/mku/authcore/health/HealthMetrics;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app"})
public final class SystemHealth {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.health.HealthLevel overall = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> components = null;
    private final int memoryUsagePercent = 0;
    private final int cpuUsagePercent = 0;
    private final long lastUpdated = 0L;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.health.HealthMetrics metrics = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.health.SystemHealth.Companion Companion = null;
    
    public SystemHealth(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthLevel overall, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> components, int memoryUsagePercent, int cpuUsagePercent, long lastUpdated, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthMetrics metrics) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthLevel getOverall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> getComponents() {
        return null;
    }
    
    public final int getMemoryUsagePercent() {
        return 0;
    }
    
    public final int getCpuUsagePercent() {
        return 0;
    }
    
    public final long getLastUpdated() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthMetrics getMetrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthLevel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.HealthMetrics component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.SystemHealth copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthLevel overall, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> components, int memoryUsagePercent, int cpuUsagePercent, long lastUpdated, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.HealthMetrics metrics) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J*\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ,\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/health/SystemHealth$Companion;", "", "<init>", "()V", "initial", "Lke/ac/mku/authcore/health/SystemHealth;", "operational", "components", "", "", "Lke/ac/mku/authcore/health/ComponentHealth;", "memoryUsagePercent", "", "cpuUsagePercent", "calculateOverallHealth", "Lke/ac/mku/authcore/health/HealthLevel;", "memoryPercent", "cpuPercent", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create initial/uninitialized system health.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.SystemHealth initial() {
            return null;
        }
        
        /**
         * Create operational system health.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.SystemHealth operational(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> components, int memoryUsagePercent, int cpuUsagePercent) {
            return null;
        }
        
        private final ke.ac.mku.authcore.health.HealthLevel calculateOverallHealth(java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentHealth> components, int memoryPercent, int cpuPercent) {
            return null;
        }
    }
}