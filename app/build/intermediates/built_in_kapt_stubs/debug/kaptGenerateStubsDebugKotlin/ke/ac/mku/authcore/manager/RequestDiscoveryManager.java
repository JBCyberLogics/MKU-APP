package ke.ac.mku.authcore.manager;

/**
 * RequestDiscoveryManager - PORTAL-004
 *
 * Coordinates complete request discovery lifecycle.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u001a\u0002\b\r\u00a2\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000fH\u0016J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b,\u00a8\u0006+"}, d2 = {"Lke/ac/mku/authcore/manager/RequestDiscoveryManager;", "Lke/ac/mku/authcore/contracts/portal/IRequestDiscoveryManager;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "fingerprintEngine", "Lke/ac/mku/authcore/manager/RequestFingerprintEngine;", "parameterAnalyzer", "Lke/ac/mku/authcore/manager/ParameterAnalyzer;", "csrfManager", "Lke/ac/mku/authcore/manager/CsrfTokenManager;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "<init>", "(Lke/ac/mku/authcore/manager/RequestFingerprintEngine;Lke/ac/mku/authcore/manager/ParameterAnalyzer;Lke/ac/mku/authcore/manager/CsrfTokenManager;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;)V", "Ljavax/inject/Inject;", "moduleId", "", "moduleName", "isMonitoring", "", "requestStore", "Ljava/util/concurrent/ConcurrentHashMap;", "Lke/ac/mku/authcore/domain/model/portal/DiscoveredRequest;", "endpointStore", "Lke/ac/mku/authcore/domain/model/portal/DiscoveredEndpoint;", "startMonitoring", "", "stopMonitoring", "getRequestRegistry", "Lke/ac/mku/authcore/domain/model/portal/RequestRegistry;", "getDiscoveredEndpoints", "", "isRequestDiscovered", "fingerprint", "captureRequest", "request", "Lokhttp3/Request;", "learnEndpoint", "method", "url", "onBootstrapEvent", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class RequestDiscoveryManager implements ke.ac.mku.authcore.contracts.portal.IRequestDiscoveryManager, ke.ac.mku.authcore.bootstrap.BootstrapObserver {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.RequestFingerprintEngine fingerprintEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.ParameterAnalyzer parameterAnalyzer = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.CsrfTokenManager csrfManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleId = "PORTAL-004";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String moduleName = "Request Discovery Engine";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "RequestDiscovery";
    private boolean isMonitoring = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> requestStore = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> endpointStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.RequestDiscoveryManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public RequestDiscoveryManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.RequestFingerprintEngine fingerprintEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.ParameterAnalyzer parameterAnalyzer, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.CsrfTokenManager csrfManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager) {
        super();
    }
    
    @java.lang.Override()
    public void startMonitoring() {
    }
    
    @java.lang.Override()
    public void stopMonitoring() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.domain.model.portal.RequestRegistry getRequestRegistry() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> getDiscoveredEndpoints() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRequestDiscovered(@org.jetbrains.annotations.NotNull()
    java.lang.String fingerprint) {
        return false;
    }
    
    public final void captureRequest(@org.jetbrains.annotations.NotNull()
    okhttp3.Request request) {
    }
    
    private final void learnEndpoint(java.lang.String method, java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onBootstrapEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/RequestDiscoveryManager$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}