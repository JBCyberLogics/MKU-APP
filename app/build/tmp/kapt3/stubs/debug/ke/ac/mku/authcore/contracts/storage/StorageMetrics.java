package ke.ac.mku.authcore.contracts.storage;

/**
 * Storage metrics aggregated across all domains.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u00c6\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageMetrics;", "", "totalDomains", "", "totalKeys", "totalSizeBytes", "", "totalFailedReads", "totalFailedWrites", "totalIntegrityFailures", "domainHealth", "", "Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "Lke/ac/mku/authcore/contracts/storage/StorageHealth;", "(IIJIIILjava/util/Map;)V", "getDomainHealth", "()Ljava/util/Map;", "isOverallHealthy", "", "()Z", "getTotalDomains", "()I", "getTotalFailedReads", "getTotalFailedWrites", "getTotalIntegrityFailures", "getTotalKeys", "getTotalSizeBytes", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class StorageMetrics {
    private final int totalDomains = 0;
    private final int totalKeys = 0;
    private final long totalSizeBytes = 0L;
    private final int totalFailedReads = 0;
    private final int totalFailedWrites = 0;
    private final int totalIntegrityFailures = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<ke.ac.mku.authcore.contracts.storage.StorageDomain, ke.ac.mku.authcore.contracts.storage.StorageHealth> domainHealth = null;
    
    public StorageMetrics(int totalDomains, int totalKeys, long totalSizeBytes, int totalFailedReads, int totalFailedWrites, int totalIntegrityFailures, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.storage.StorageDomain, ke.ac.mku.authcore.contracts.storage.StorageHealth> domainHealth) {
        super();
    }
    
    public final int getTotalDomains() {
        return 0;
    }
    
    public final int getTotalKeys() {
        return 0;
    }
    
    public final long getTotalSizeBytes() {
        return 0L;
    }
    
    public final int getTotalFailedReads() {
        return 0;
    }
    
    public final int getTotalFailedWrites() {
        return 0;
    }
    
    public final int getTotalIntegrityFailures() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.storage.StorageDomain, ke.ac.mku.authcore.contracts.storage.StorageHealth> getDomainHealth() {
        return null;
    }
    
    public final boolean isOverallHealthy() {
        return false;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<ke.ac.mku.authcore.contracts.storage.StorageDomain, ke.ac.mku.authcore.contracts.storage.StorageHealth> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.storage.StorageMetrics copy(int totalDomains, int totalKeys, long totalSizeBytes, int totalFailedReads, int totalFailedWrites, int totalIntegrityFailures, @org.jetbrains.annotations.NotNull()
    java.util.Map<ke.ac.mku.authcore.contracts.storage.StorageDomain, ke.ac.mku.authcore.contracts.storage.StorageHealth> domainHealth) {
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