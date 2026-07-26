package ke.ac.mku.authcore.domain.model.portal;

/**
 * RequestRegistryModels - PORTAL-004
 *
 * Models for cataloging and fingerprinting runtime portal requests.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lke/ac/mku/authcore/domain/model/portal/RequestRegistry;", "", "requests", "", "Lke/ac/mku/authcore/domain/model/portal/DiscoveredRequest;", "endpoints", "Lke/ac/mku/authcore/domain/model/portal/DiscoveredEndpoint;", "lastUpdated", "", "<init>", "(Ljava/util/List;Ljava/util/List;J)V", "getRequests", "()Ljava/util/List;", "getEndpoints", "getLastUpdated", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
public final class RequestRegistry {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> requests = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> endpoints = null;
    private final long lastUpdated = 0L;
    
    public RequestRegistry(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> requests, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> endpoints, long lastUpdated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> getRequests() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> getEndpoints() {
        return null;
    }
    
    public final long getLastUpdated() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.RequestRegistry copy(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredRequest> requests, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.DiscoveredEndpoint> endpoints, long lastUpdated) {
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