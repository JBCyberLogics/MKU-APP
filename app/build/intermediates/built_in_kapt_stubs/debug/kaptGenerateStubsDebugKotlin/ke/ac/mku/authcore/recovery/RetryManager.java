package ke.ac.mku.authcore.recovery;

/**
 * Execute an operation with retry policy.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0084\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2J\b\u0002\u0010\f\u001aD\b\u0001\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH\u0086@\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/recovery/RetryManager;", "", "policy", "Lke/ac/mku/authcore/recovery/RetryPolicy;", "<init>", "(Lke/ac/mku/authcore/recovery/RetryPolicy;)V", "execute", "Lke/ac/mku/authcore/recovery/RetryResult;", "T", "operation", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onRetry", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "attempt", "", "error", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"})
public final class RetryManager {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.recovery.RetryPolicy policy = null;
    
    public RetryManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.recovery.RetryPolicy policy) {
        super();
    }
    
    /**
     * Execute an operation with automatic retries.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> operation, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onRetry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.recovery.RetryResult<? extends T>> $completion) {
        return null;
    }
    
    public RetryManager() {
        super();
    }
}