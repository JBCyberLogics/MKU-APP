package ke.ac.mku.authcore.contracts.network;

/**
 * IAuthNetworkService - CORE-012
 *
 * Contract for authentication network operations.
 * All authentication traffic passes through this interface.
 *
 * AuthenticationEngine never communicates directly with WebFormLoginHandler.
 * This abstraction allows future network implementations (REST API, OAuth2, etc.).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lke/ac/mku/authcore/contracts/network/IAuthNetworkService;", "", "authenticate", "Lke/ac/mku/authcore/contracts/network/NetworkAuthResponse;", "credentials", "Lke/ac/mku/authcore/contracts/network/NetworkCredentials;", "(Lke/ac/mku/authcore/contracts/network/NetworkCredentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConnectionTimeout", "", "getReadTimeout", "isSecureConnectionRequired", "", "app_debug"})
public abstract interface IAuthNetworkService {
    
    /**
     * Perform authentication network call.
     *
     * @param credentials The network credentials for authentication
     * @return The network authentication response
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.NetworkCredentials credentials, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.network.NetworkAuthResponse> $completion);
    
    /**
     * Cancel any in-flight request.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Check if secure connection is required.
     *
     * @return True if secure connection (HTTPS) is required
     */
    public abstract boolean isSecureConnectionRequired();
    
    /**
     * Get the connection timeout in milliseconds.
     *
     * @return Connection timeout in ms
     */
    public abstract long getConnectionTimeout();
    
    /**
     * Get the read timeout in milliseconds.
     *
     * @return Read timeout in ms
     */
    public abstract long getReadTimeout();
}