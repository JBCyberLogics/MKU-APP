package ke.ac.mku.authcore.contracts.endpoint;

/**
 * ENDPOINT-002: Endpoint Health Manager Contract
 *
 * Central authority responsible for continuously monitoring the health and reliability 
 * of every registered portal endpoint.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/endpoint/IEndpointHealthManager;", "", "startMonitoring", "", "stopMonitoring", "checkEndpointHealth", "Lke/ac/mku/authcore/contracts/endpoint/EndpointHealthReport;", "identifier", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEndpointHealth", "getAllHealthReports", "", "markEndpointUnavailable", "triggerRecovery", "app"})
public abstract interface IEndpointHealthManager {
    
    /**
     * Begin continuous endpoint health monitoring.
     */
    public abstract void startMonitoring();
    
    /**
     * Stop monitoring engine.
     */
    public abstract void stopMonitoring();
    
    /**
     * Execute an immediate health check on a specific endpoint.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkEndpointHealth(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.endpoint.EndpointHealthReport> $completion);
    
    /**
     * Return the current health status for an endpoint.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.endpoint.EndpointHealthReport getEndpointHealth(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
    
    /**
     * Return health reports for every registered endpoint.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.endpoint.EndpointHealthReport> getAllHealthReports();
    
    /**
     * Mark an endpoint as unavailable.
     */
    public abstract void markEndpointUnavailable(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
    
    /**
     * Initiate the endpoint recovery workflow.
     */
    public abstract void triggerRecovery(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier);
}