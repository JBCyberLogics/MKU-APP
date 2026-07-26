package ke.ac.mku.authcore.contracts.network;

/**
 * Represents a request ready for execution.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003JU\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/contracts/network/ExecutionReadyRequest;", "", "original", "Lke/ac/mku/authcore/contracts/network/OutboundRequest;", "finalUrl", "", "finalHeaders", "", "finalBody", "signatures", "<init>", "(Lke/ac/mku/authcore/contracts/network/OutboundRequest;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getOriginal", "()Lke/ac/mku/authcore/contracts/network/OutboundRequest;", "getFinalUrl", "()Ljava/lang/String;", "getFinalHeaders", "()Ljava/util/Map;", "getFinalBody", "getSignatures", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
public final class ExecutionReadyRequest {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.network.OutboundRequest original = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String finalUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> finalHeaders = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String finalBody = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> signatures = null;
    
    public ExecutionReadyRequest(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest original, @org.jetbrains.annotations.NotNull()
    java.lang.String finalUrl, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> finalHeaders, @org.jetbrains.annotations.Nullable()
    java.lang.String finalBody, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> signatures) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.OutboundRequest getOriginal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFinalUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getFinalHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFinalBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getSignatures() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.OutboundRequest component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.network.ExecutionReadyRequest copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.OutboundRequest original, @org.jetbrains.annotations.NotNull()
    java.lang.String finalUrl, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> finalHeaders, @org.jetbrains.annotations.Nullable()
    java.lang.String finalBody, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> signatures) {
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