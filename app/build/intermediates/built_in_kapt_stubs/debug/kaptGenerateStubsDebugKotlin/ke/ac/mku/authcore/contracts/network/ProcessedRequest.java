package ke.ac.mku.authcore.contracts.network;

/**
 * Represents a processed request after all pipeline stages.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\"H\u00d6\u0081\u0004J\n\u0010#\u001a\u00020$H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lke/ac/mku/authcore/contracts/network/ProcessedRequest;", "", "original", "Lke/ac/mku/authcore/contracts/network/OutboundRequest;", "validated", "Lke/ac/mku/authcore/contracts/network/ValidatedRequest;", "enriched", "Lke/ac/mku/authcore/contracts/network/EnrichedRequest;", "prioritized", "Lke/ac/mku/authcore/contracts/network/PrioritizedRequest;", "executionReady", "Lke/ac/mku/authcore/contracts/network/ExecutionReadyRequest;", "<init>", "(Lke/ac/mku/authcore/contracts/network/OutboundRequest;Lke/ac/mku/authcore/contracts/network/ValidatedRequest;Lke/ac/mku/authcore/contracts/network/EnrichedRequest;Lke/ac/mku/authcore/contracts/network/PrioritizedRequest;Lke/ac/mku/authcore/contracts/network/ExecutionReadyRequest;)V", "getOriginal", "()Lke/ac/mku/authcore/contracts/network/OutboundRequest;", "getValidated", "()Lke/ac/mku/authcore/contracts/network/ValidatedRequest;", "getEnriched", "()Lke/ac/mku/authcore/contracts/network/EnrichedRequest;", "getPrioritized", "()Lke/ac/mku/authcore/contracts/network/PrioritizedRequest;", "getExecutionReady", "()Lke/ac/mku/authcore/contracts/network/ExecutionReadyRequest;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
public final class ProcessedRequest {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.OutboundRequest original = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.ValidatedRequest validated = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.EnrichedRequest enriched = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.PrioritizedRequest prioritized = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest executionReady = null;
    
    public ProcessedRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest original, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ValidatedRequest validated, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.EnrichedRequest enriched, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.PrioritizedRequest prioritized, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest executionReady) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.OutboundRequest getOriginal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ValidatedRequest getValidated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.EnrichedRequest getEnriched() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.PrioritizedRequest getPrioritized() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest getExecutionReady() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.OutboundRequest component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ValidatedRequest component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.EnrichedRequest component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.PrioritizedRequest component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ProcessedRequest copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest original, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ValidatedRequest validated, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.EnrichedRequest enriched, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.PrioritizedRequest prioritized, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest executionReady) {
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