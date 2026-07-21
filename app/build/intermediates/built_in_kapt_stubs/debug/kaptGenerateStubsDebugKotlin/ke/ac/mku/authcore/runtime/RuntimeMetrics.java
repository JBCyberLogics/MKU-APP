package ke.ac.mku.authcore.runtime;

/**
 * Runtime metrics for monitoring the Authentication Core.
 * Exposed as a read-only StateFlow from RuntimeEnvironment.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 62\u00020\u0001:\u000256B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000eH\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u000eH\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u00c6\u0001J\u0014\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00102\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u00103\u001a\u000204H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010\u0012\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 \u00a8\u00067"}, d2 = {"Lke/ac/mku/authcore/runtime/RuntimeMetrics;", "", "memoryUsagePercent", "", "availableMemoryMb", "", "usedMemoryMb", "totalMemoryMb", "activeThreads", "totalThreads", "dispatcherStatus", "Lke/ac/mku/authcore/runtime/RuntimeMetrics$DispatcherStatus;", "resourceCount", "isInMemoryPressure", "", "isLowMemory", "runtimeUptimeMillis", "isInitialized", "isOperational", "<init>", "(IJJJIILke/ac/mku/authcore/runtime/RuntimeMetrics$DispatcherStatus;IZZJZZ)V", "getMemoryUsagePercent", "()I", "getAvailableMemoryMb", "()J", "getUsedMemoryMb", "getTotalMemoryMb", "getActiveThreads", "getTotalThreads", "getDispatcherStatus", "()Lke/ac/mku/authcore/runtime/RuntimeMetrics$DispatcherStatus;", "getResourceCount", "()Z", "getRuntimeUptimeMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "", "DispatcherStatus", "Companion", "app"})
public final class RuntimeMetrics {
    private final int memoryUsagePercent = 0;
    private final long availableMemoryMb = 0L;
    private final long usedMemoryMb = 0L;
    private final long totalMemoryMb = 0L;
    private final int activeThreads = 0;
    private final int totalThreads = 0;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus dispatcherStatus = null;
    private final int resourceCount = 0;
    private final boolean isInMemoryPressure = false;
    private final boolean isLowMemory = false;
    private final long runtimeUptimeMillis = 0L;
    private final boolean isInitialized = false;
    private final boolean isOperational = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.runtime.RuntimeMetrics.Companion Companion = null;
    
    public RuntimeMetrics(int memoryUsagePercent, long availableMemoryMb, long usedMemoryMb, long totalMemoryMb, int activeThreads, int totalThreads, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus dispatcherStatus, int resourceCount, boolean isInMemoryPressure, boolean isLowMemory, long runtimeUptimeMillis, boolean isInitialized, boolean isOperational) {
        super();
    }
    
    public final int getMemoryUsagePercent() {
        return 0;
    }
    
    public final long getAvailableMemoryMb() {
        return 0L;
    }
    
    public final long getUsedMemoryMb() {
        return 0L;
    }
    
    public final long getTotalMemoryMb() {
        return 0L;
    }
    
    public final int getActiveThreads() {
        return 0;
    }
    
    public final int getTotalThreads() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus getDispatcherStatus() {
        return null;
    }
    
    public final int getResourceCount() {
        return 0;
    }
    
    public final boolean isInMemoryPressure() {
        return false;
    }
    
    public final boolean isLowMemory() {
        return false;
    }
    
    public final long getRuntimeUptimeMillis() {
        return 0L;
    }
    
    public final boolean isInitialized() {
        return false;
    }
    
    public final boolean isOperational() {
        return false;
    }
    
    public RuntimeMetrics() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.RuntimeMetrics copy(int memoryUsagePercent, long availableMemoryMb, long usedMemoryMb, long totalMemoryMb, int activeThreads, int totalThreads, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus dispatcherStatus, int resourceCount, boolean isInMemoryPressure, boolean isLowMemory, long runtimeUptimeMillis, boolean isInitialized, boolean isOperational) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005Jn\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\n\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/runtime/RuntimeMetrics$Companion;", "", "<init>", "()V", "uninitialized", "Lke/ac/mku/authcore/runtime/RuntimeMetrics;", "operational", "memoryUsagePercent", "", "availableMemoryMb", "", "usedMemoryMb", "totalMemoryMb", "activeThreads", "totalThreads", "mainAvailable", "", "ioAvailable", "defaultAvailable", "resourceCount", "isInMemoryPressure", "isLowMemory", "runtimeUptimeMillis", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create initial/uninitialized metrics.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.RuntimeMetrics uninitialized() {
            return null;
        }
        
        /**
         * Create operational metrics.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.RuntimeMetrics operational(int memoryUsagePercent, long availableMemoryMb, long usedMemoryMb, long totalMemoryMb, int activeThreads, int totalThreads, boolean mainAvailable, boolean ioAvailable, boolean defaultAvailable, int resourceCount, boolean isInMemoryPressure, boolean isLowMemory, long runtimeUptimeMillis) {
            return null;
        }
    }
    
    /**
     * Dispatcher status information.
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/runtime/RuntimeMetrics$DispatcherStatus;", "", "mainAvailable", "", "ioAvailable", "defaultAvailable", "<init>", "(ZZZ)V", "getMainAvailable", "()Z", "getIoAvailable", "getDefaultAvailable", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app"})
    public static final class DispatcherStatus {
        private final boolean mainAvailable = false;
        private final boolean ioAvailable = false;
        private final boolean defaultAvailable = false;
        
        public DispatcherStatus(boolean mainAvailable, boolean ioAvailable, boolean defaultAvailable) {
            super();
        }
        
        public final boolean getMainAvailable() {
            return false;
        }
        
        public final boolean getIoAvailable() {
            return false;
        }
        
        public final boolean getDefaultAvailable() {
            return false;
        }
        
        public DispatcherStatus() {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.RuntimeMetrics.DispatcherStatus copy(boolean mainAvailable, boolean ioAvailable, boolean defaultAvailable) {
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
}