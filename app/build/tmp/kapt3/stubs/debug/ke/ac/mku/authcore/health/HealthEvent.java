package ke.ac.mku.authcore.health;

/**
 * Internal health events (not published through EventBus).
 * Used for internal HealthMonitor tracking and listener notifications.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent;", "", "()V", "AuthenticationWarning", "ComponentFailed", "ComponentRecovered", "CpuWarning", "CriticalFailure", "DiagnosticReportGenerated", "HealthMonitorReady", "HealthStatusChanged", "MemoryWarning", "NetworkWarning", "RuntimeWarning", "Lke/ac/mku/authcore/health/HealthEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/health/HealthEvent$ComponentFailed;", "Lke/ac/mku/authcore/health/HealthEvent$ComponentRecovered;", "Lke/ac/mku/authcore/health/HealthEvent$CpuWarning;", "Lke/ac/mku/authcore/health/HealthEvent$CriticalFailure;", "Lke/ac/mku/authcore/health/HealthEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/health/HealthEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/health/HealthEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/health/HealthEvent$MemoryWarning;", "Lke/ac/mku/authcore/health/HealthEvent$NetworkWarning;", "Lke/ac/mku/authcore/health/HealthEvent$RuntimeWarning;", "app_debug"})
public abstract class HealthEvent {
    
    private HealthEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class AuthenticationWarning extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.AuthenticationWarning INSTANCE = null;
        
        private AuthenticationWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$ComponentFailed;", "Lke/ac/mku/authcore/health/HealthEvent;", "component", "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "getError", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ComponentFailed extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public ComponentFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String component, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.HealthEvent.ComponentFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$ComponentRecovered;", "Lke/ac/mku/authcore/health/HealthEvent;", "component", "", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ComponentRecovered extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        
        public ComponentRecovered(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.health.HealthEvent.ComponentRecovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
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
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$CpuWarning;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class CpuWarning extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.CpuWarning INSTANCE = null;
        
        private CpuWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$CriticalFailure;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class CriticalFailure extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.CriticalFailure INSTANCE = null;
        
        private CriticalFailure() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class DiagnosticReportGenerated extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.DiagnosticReportGenerated INSTANCE = null;
        
        private DiagnosticReportGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class HealthMonitorReady extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.HealthMonitorReady INSTANCE = null;
        
        private HealthMonitorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class HealthStatusChanged extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.HealthStatusChanged INSTANCE = null;
        
        private HealthStatusChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$MemoryWarning;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class MemoryWarning extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.MemoryWarning INSTANCE = null;
        
        private MemoryWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$NetworkWarning;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class NetworkWarning extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.NetworkWarning INSTANCE = null;
        
        private NetworkWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/health/HealthEvent$RuntimeWarning;", "Lke/ac/mku/authcore/health/HealthEvent;", "()V", "app_debug"})
    public static final class RuntimeWarning extends ke.ac.mku.authcore.health.HealthEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.health.HealthEvent.RuntimeWarning INSTANCE = null;
        
        private RuntimeWarning() {
        }
    }
}