package ke.ac.mku.authcore.runtime;

/**
 * Provides managed Coroutine Dispatchers for the Authentication Core.
 * All dispatchers are backed by standard Kotlin dispatchers.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/runtime/DispatcherProvider;", "", "<init>", "()V", "main", "Lkotlinx/coroutines/CoroutineDispatcher;", "getMain", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", "default", "getDefault", "unconfined", "getUnconfined", "isAvailable", "", "dispatcher", "app"})
public final class DispatcherProvider {
    
    /**
     * Main dispatcher for UI operations.
     * WARNING: Should not be used for blocking operations.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher main = null;
    
    /**
     * IO dispatcher for network, database, and file operations.
     * Optimized for blocking IO tasks.
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.CoroutineDispatcher io = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.runtime.DispatcherProvider INSTANCE = null;
    
    private DispatcherProvider() {
        super();
    }
    
    /**
     * Main dispatcher for UI operations.
     * WARNING: Should not be used for blocking operations.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getMain() {
        return null;
    }
    
    /**
     * IO dispatcher for network, database, and file operations.
     * Optimized for blocking IO tasks.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getIo() {
        return null;
    }
    
    /**
     * Default dispatcher for CPU-intensive operations.
     * Use for computation-heavy work that would block other tasks.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
        return null;
    }
    
    /**
     * Check if a dispatcher is operational.
     */
    public final boolean isAvailable(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        return false;
    }
}