package ke.ac.mku.authcore.contracts.network;

/**
 * NETWORK-003: Request Pipeline Manager Contract
 *
 * Central request orchestration engine responsible for validating, enriching, prioritizing 
 * and preparing every outbound request before execution by the Authentication Network Service.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/network/IRequestPipelineManager;", "", "processRequest", "Lke/ac/mku/authcore/contracts/network/ProcessedRequest;", "request", "Lke/ac/mku/authcore/contracts/network/OutboundRequest;", "validateRequest", "Lke/ac/mku/authcore/contracts/network/ValidatedRequest;", "enrichRequest", "Lke/ac/mku/authcore/contracts/network/EnrichedRequest;", "assignPriority", "Lke/ac/mku/authcore/contracts/network/PrioritizedRequest;", "prepareExecution", "Lke/ac/mku/authcore/contracts/network/ExecutionReadyRequest;", "getPipelineStatus", "Lke/ac/mku/authcore/contracts/network/PipelineStatus;", "app"})
public abstract interface IRequestPipelineManager {
    
    /**
     * Process a request through the complete pipeline.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.network.ProcessedRequest processRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest request);
    
    /**
     * Validate an outbound request before processing.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.ValidatedRequest validateRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest request);
    
    /**
     * Enrich a request with headers, cookies and metadata.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.EnrichedRequest enrichRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest request);
    
    /**
     * Assign execution priority to a request.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.PrioritizedRequest assignPriority(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest request);
    
    /**
     * Prepare a request for execution by the HTTP client.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest prepareExecution(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest request);
    
    /**
     * Returns the current pipeline state and metrics.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.PipelineStatus getPipelineStatus();
}