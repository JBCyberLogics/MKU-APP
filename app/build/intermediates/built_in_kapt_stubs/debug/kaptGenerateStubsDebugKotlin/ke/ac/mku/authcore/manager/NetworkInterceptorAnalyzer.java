package ke.ac.mku.authcore.manager;

/**
 * NetworkInterceptorAnalyzer - PORTAL-004
 *
 * Captures all authenticated HTTP traffic and forwards to RequestDiscoveryManager.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\f\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/manager/NetworkInterceptorAnalyzer;", "Lokhttp3/Interceptor;", "discoveryManager", "Lke/ac/mku/authcore/manager/RequestDiscoveryManager;", "<init>", "(Lke/ac/mku/authcore/manager/RequestDiscoveryManager;)V", "Ljavax/inject/Inject;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app", "Ljavax/inject/Singleton;"})
public final class NetworkInterceptorAnalyzer implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.RequestDiscoveryManager discoveryManager = null;
    
    @javax.inject.Inject()
    public NetworkInterceptorAnalyzer(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.RequestDiscoveryManager discoveryManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}