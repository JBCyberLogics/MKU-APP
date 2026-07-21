package ke.ac.mku.authcore.health;

import ke.ac.mku.authcore.runtime.RuntimeMetrics;

/**
 * Complete diagnostic report for the Authentication Core.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0011H\u00c6\u0003Ja\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\rH\u00d6\u0001R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e\u00a8\u0006/"}, d2 = {"Lke/ac/mku/authcore/health/DiagnosticsReport;", "", "timestamp", "", "systemHealth", "Lke/ac/mku/authcore/health/SystemHealth;", "runtimeMetrics", "Lke/ac/mku/authcore/runtime/RuntimeMetrics;", "failureHistory", "", "Lke/ac/mku/authcore/health/FailureEntry;", "componentStatistics", "", "", "Lke/ac/mku/authcore/health/ComponentStatistics;", "uptimeMillis", "recoveryStats", "Lke/ac/mku/authcore/health/RecoveryStatistics;", "(JLke/ac/mku/authcore/health/SystemHealth;Lke/ac/mku/authcore/runtime/RuntimeMetrics;Ljava/util/List;Ljava/util/Map;JLke/ac/mku/authcore/health/RecoveryStatistics;)V", "getComponentStatistics", "()Ljava/util/Map;", "getFailureHistory", "()Ljava/util/List;", "getRecoveryStats", "()Lke/ac/mku/authcore/health/RecoveryStatistics;", "getRuntimeMetrics", "()Lke/ac/mku/authcore/runtime/RuntimeMetrics;", "getSystemHealth", "()Lke/ac/mku/authcore/health/SystemHealth;", "getTimestamp", "()J", "getUptimeMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class DiagnosticsReport {
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.health.SystemHealth systemHealth = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.runtime.RuntimeMetrics runtimeMetrics = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.health.FailureEntry> failureHistory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentStatistics> componentStatistics = null;
    private final long uptimeMillis = 0L;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.health.RecoveryStatistics recoveryStats = null;
    public static final int MAX_FAILURE_HISTORY = 1000;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.health.DiagnosticsReport.Companion Companion = null;
    
    public DiagnosticsReport(long timestamp, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.SystemHealth systemHealth, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.runtime.RuntimeMetrics runtimeMetrics, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.health.FailureEntry> failureHistory, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentStatistics> componentStatistics, long uptimeMillis, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.RecoveryStatistics recoveryStats) {
        super();
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.SystemHealth getSystemHealth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.RuntimeMetrics getRuntimeMetrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.health.FailureEntry> getFailureHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentStatistics> getComponentStatistics() {
        return null;
    }
    
    public final long getUptimeMillis() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.RecoveryStatistics getRecoveryStats() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.SystemHealth component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.RuntimeMetrics component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.health.FailureEntry> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentStatistics> component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.RecoveryStatistics component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.health.DiagnosticsReport copy(long timestamp, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.SystemHealth systemHealth, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.runtime.RuntimeMetrics runtimeMetrics, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.health.FailureEntry> failureHistory, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.health.ComponentStatistics> componentStatistics, long uptimeMillis, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.health.RecoveryStatistics recoveryStats) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lke/ac/mku/authcore/health/DiagnosticsReport$Companion;", "", "()V", "MAX_FAILURE_HISTORY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}