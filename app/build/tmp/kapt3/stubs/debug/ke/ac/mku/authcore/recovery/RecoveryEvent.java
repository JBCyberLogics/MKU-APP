package ke.ac.mku.authcore.recovery;

/**
 * RecoveryEvent - CORE-011
 *
 * Internal events published by RecoveryManager.
 * These are received by LifecycleManager to perform actual recovery actions.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent;", "", "()V", "CircuitClosed", "CircuitOpened", "CircuitStateChanged", "RecoveryCompleted", "RecoveryFailed", "RecoveryManagerReady", "RecoveryStarted", "ReinitializeServiceRequested", "RetryFailed", "RetryStarted", "RollbackCompleted", "RollbackRequested", "ServiceRestartRequested", "ServiceRestarted", "SystemRecovered", "Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitClosed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitOpened;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryFailed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryStarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RetryFailed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RetryStarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RollbackCompleted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$RollbackRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$ServiceRestarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent$SystemRecovered;", "app_debug"})
public abstract class RecoveryEvent {
    
    private RecoveryEvent() {
        super();
    }
    
    /**
     * Circuit breaker closed for a service
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitClosed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitClosed extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitClosed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.CircuitClosed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * Circuit breaker opened for a service
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitOpened;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitOpened extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitOpened(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.CircuitOpened copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * Circuit breaker state changed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "previousState", "Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "newState", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/CircuitBreakerState;Lke/ac/mku/authcore/recovery/CircuitBreakerState;)V", "getNewState", "()Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "getPreviousState", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitStateChanged extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState previousState = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState newState = null;
        
        public CircuitStateChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getPreviousState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getNewState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.CircuitStateChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
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
    
    /**
     * A recovery operation completed successfully
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "durationMs", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;J)V", "getDurationMs", "()J", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RecoveryCompleted extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final long durationMs = 0L;
        
        public RecoveryCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final long getDurationMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RecoveryCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
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
    
    /**
     * A recovery operation failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryFailed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "error", "attempts", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;Ljava/lang/String;I)V", "getAttempts", "()I", "getError", "()Ljava/lang/String;", "getServiceName", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RecoveryFailed extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
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
    
    /**
     * RecoveryManager is ready
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "()V", "app_debug"})
    public static final class RecoveryManagerReady extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.recovery.RecoveryEvent.RecoveryManagerReady INSTANCE = null;
        
        private RecoveryManagerReady() {
        }
    }
    
    /**
     * A recovery operation has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RecoveryStarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "attempt", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;I)V", "getAttempt", "()I", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RecoveryStarted extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final int attempt = 0;
        
        public RecoveryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RecoveryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
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
    
    /**
     * Request to reinitialize a service
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ReinitializeServiceRequested extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ReinitializeServiceRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.ReinitializeServiceRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * Retry failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RetryFailed;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "error", "attempts", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAttempts", "()I", "getError", "()Ljava/lang/String;", "getServiceName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RetryFailed extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RetryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RetryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
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
    
    /**
     * Retry started for an operation
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RetryStarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "attempt", "", "maxAttempts", "(Ljava/lang/String;II)V", "getAttempt", "()I", "getMaxAttempts", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RetryStarted extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        private final int attempt = 0;
        private final int maxAttempts = 0;
        
        public RetryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        public final int getMaxAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RetryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
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
    
    /**
     * Rollback completed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RollbackCompleted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "()V", "app_debug"})
    public static final class RollbackCompleted extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.recovery.RecoveryEvent.RollbackCompleted INSTANCE = null;
        
        private RollbackCompleted() {
        }
    }
    
    /**
     * Request to rollback a service to previous state
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$RollbackRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RollbackRequested extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public RollbackRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.RollbackRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * Request to restart a service (RecoveryManager -> LifecycleManager)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRestartRequested extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestartRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.ServiceRestartRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * Service was restarted (LifecycleManager -> RecoveryManager)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$ServiceRestarted;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRestarted extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryEvent.ServiceRestarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    /**
     * System has recovered from a degraded state
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryEvent$SystemRecovered;", "Lke/ac/mku/authcore/recovery/RecoveryEvent;", "()V", "app_debug"})
    public static final class SystemRecovered extends ke.ac.mku.authcore.recovery.RecoveryEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.recovery.RecoveryEvent.SystemRecovered INSTANCE = null;
        
        private SystemRecovered() {
        }
    }
}