package ke.ac.mku.authcore.recovery;

/**
 * RecoveryState - CORE-011
 *
 * Represents the current state of the RecoveryManager including:
 * - Active recoveries in progress
 * - Circuit breaker states per service
 * - Recovery history
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000eH\u00c6\u0003J\t\u0010!\u001a\u00020\u0010H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0010H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryState;", "", "isRecovering", "", "activeRecoveries", "", "", "Lke/ac/mku/authcore/recovery/ActiveRecovery;", "circuitBreakerStates", "Lke/ac/mku/authcore/recovery/CircuitState;", "recoveryHistory", "", "Lke/ac/mku/authcore/recovery/RecoveryRecord;", "lastRecoveryTime", "", "consecutiveFailures", "", "(ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;JI)V", "getActiveRecoveries", "()Ljava/util/Map;", "getCircuitBreakerStates", "getConsecutiveFailures", "()I", "()Z", "getLastRecoveryTime", "()J", "getRecoveryHistory", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class RecoveryState {
    private final boolean isRecovering = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.ActiveRecovery> activeRecoveries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.CircuitState> circuitBreakerStates = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.recovery.RecoveryRecord> recoveryHistory = null;
    private final long lastRecoveryTime = 0L;
    private final int consecutiveFailures = 0;
    public static final int MAX_HISTORY_SIZE = 1000;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.recovery.RecoveryState.Companion Companion = null;
    
    public RecoveryState(boolean isRecovering, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.ActiveRecovery> activeRecoveries, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.CircuitState> circuitBreakerStates, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.recovery.RecoveryRecord> recoveryHistory, long lastRecoveryTime, int consecutiveFailures) {
        super();
    }
    
    public final boolean isRecovering() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.ActiveRecovery> getActiveRecoveries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.CircuitState> getCircuitBreakerStates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.recovery.RecoveryRecord> getRecoveryHistory() {
        return null;
    }
    
    public final long getLastRecoveryTime() {
        return 0L;
    }
    
    public final int getConsecutiveFailures() {
        return 0;
    }
    
    public RecoveryState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.ActiveRecovery> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.CircuitState> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.recovery.RecoveryRecord> component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.recovery.RecoveryState copy(boolean isRecovering, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.ActiveRecovery> activeRecoveries, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ke.ac.mku.authcore.recovery.CircuitState> circuitBreakerStates, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.recovery.RecoveryRecord> recoveryHistory, long lastRecoveryTime, int consecutiveFailures) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryState$Companion;", "", "()V", "MAX_HISTORY_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}