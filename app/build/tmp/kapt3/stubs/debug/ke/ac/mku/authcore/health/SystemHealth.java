package ke.ac.mku.authcore.health;

/**
 * Aggregated system health status.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \'2\u00020\u0001:\u0001\'BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003J\t\u0010 \u001a\u00020\u000eH\u00c6\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lke/ac/mku/authcore/health/SystemHealth;", "", "overall", "Lke/ac/mku/authcore/health/HealthLevel;", "components", "", "", "Lke/ac/mku/authcore/health/ComponentHealth;", "memoryUsagePercent", "", "cpuUsagePercent", "lastUpdated", "", "metrics", "Lke/ac/mku/authcore/health/HealthMetrics;", "(Lke/ac/mku/authcore/health/HealthLevel;Ljava/util/Map;IIJLke/ac/mku/authcore/health/HealthMetrics;)V", "getComponents", "()Ljava/util/Map;", "getCpuUsagePercent", "()I", "getLastUpdated", "()J", "getMemoryUsagePercent", "getMetrics", "()Lke/ac/mku/authcore/health/HealthMetrics;", "getOverall", "()Lke/ac/mku/authcore/health/HealthLevel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/health/SystemHealth$Companion;", "", "()V", "calculateOverallHealth", "Lke/ac/mku/authcore/health/HealthLevel;", "components", "", "", "Lke/ac/mku/authcore/health/ComponentHealth;", "memoryPercent", "", "cpuPercent", "initial", "Lke/ac/mku/authcore/health/SystemHealth;", "operational", "memoryUsagePercent", "cpuUsagePercent", "app_debug"})
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