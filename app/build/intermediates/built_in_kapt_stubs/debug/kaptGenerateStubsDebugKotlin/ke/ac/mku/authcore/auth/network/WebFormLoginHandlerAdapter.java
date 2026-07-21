package ke.ac.mku.authcore.auth.network;

/**
 * WebFormLoginHandlerAdapter - AUTH-001 / NETWORK-002
 *
 * Adapter wrapping WebFormLoginHandler behind IAuthNetworkService interface.
 * AuthenticationEngine never calls WebFormLoginHandler directly - it uses this adapter.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0016\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/auth/network/WebFormLoginHandlerAdapter;", "Lke/ac/mku/authcore/contracts/network/IAuthNetworkService;", "webFormLoginHandler", "Lke/ac/mku/authcore/data/api/WebFormLoginHandler;", "<init>", "(Lke/ac/mku/authcore/data/api/WebFormLoginHandler;)V", "Ljavax/inject/Inject;", "authenticate", "Lke/ac/mku/authcore/contracts/network/NetworkAuthResponse;", "credentials", "Lke/ac/mku/authcore/contracts/network/NetworkCredentials;", "(Lke/ac/mku/authcore/contracts/network/NetworkCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSecureConnectionRequired", "", "getConnectionTimeout", "", "getReadTimeout", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class WebFormLoginHandlerAdapter implements ke.ac.mku.authcore.contracts.network.IAuthNetworkService {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.data.api.WebFormLoginHandler webFormLoginHandler = null;
    private static final long DEFAULT_TIMEOUT_MS = 30000L;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.auth.network.WebFormLoginHandlerAdapter.Companion Companion = null;
    
    @javax.inject.Inject()
    public WebFormLoginHandlerAdapter(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.data.api.WebFormLoginHandler webFormLoginHandler) {
        super();
    }
    
    /**
     * Perform authentication network call via WebFormLoginHandler.
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.NetworkCredentials credentials, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.network.NetworkAuthResponse> $completion) {
        return null;
    }
    
    /**
     * Cancel any in-flight request.
     * WebFormLoginHandler doesn't support cancellation - this is a no-op.
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object cancel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Secure connection is required for authentication.
     */
    @java.lang.Override()
    public boolean isSecureConnectionRequired() {
        return false;
    }
    
    /**
     * Get the connection timeout in milliseconds.
     */
    @java.lang.Override()
    public long getConnectionTimeout() {
        return 0L;
    }
    
    /**
     * Get the read timeout in milliseconds.
     */
    @java.lang.Override()
    public long getReadTimeout() {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/auth/network/WebFormLoginHandlerAdapter$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT_MS", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}