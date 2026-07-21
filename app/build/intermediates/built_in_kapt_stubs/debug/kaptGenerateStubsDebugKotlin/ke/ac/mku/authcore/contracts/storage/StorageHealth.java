package ke.ac.mku.authcore.contracts.storage;

/**
 * Storage health metrics for a domain.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\rH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0014\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\'\u001a\u00020(H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a\u00a8\u0006*"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageHealth;", "", "domain", "Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "totalKeys", "", "totalSizeBytes", "", "failedReads", "failedWrites", "integrityFailures", "lastAccessed", "isHealthy", "", "<init>", "(Lke/ac/mku/authcore/contracts/storage/StorageDomain;IJIIIJZ)V", "getDomain", "()Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "getTotalKeys", "()I", "getTotalSizeBytes", "()J", "getFailedReads", "getFailedWrites", "getIntegrityFailures", "getLastAccessed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "app"})
public final class StorageHealth {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.storage.StorageDomain domain = null;
    private final int totalKeys = 0;
    private final long totalSizeBytes = 0L;
    private final int failedReads = 0;
    private final int failedWrites = 0;
    private final int integrityFailures = 0;
    private final long lastAccessed = 0L;
    private final boolean isHealthy = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.storage.StorageHealth.Companion Companion = null;
    
    public StorageHealth(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, int totalKeys, long totalSizeBytes, int failedReads, int failedWrites, int integrityFailures, long lastAccessed, boolean isHealthy) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.storage.StorageDomain getDomain() {
        return null;
    }
    
    public final int getTotalKeys() {
        return 0;
    }
    
    public final long getTotalSizeBytes() {
        return 0L;
    }
    
    public final int getFailedReads() {
        return 0;
    }
    
    public final int getFailedWrites() {
        return 0;
    }
    
    public final int getIntegrityFailures() {
        return 0;
    }
    
    public final long getLastAccessed() {
        return 0L;
    }
    
    public final boolean isHealthy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.storage.StorageDomain component1() {
        return null;
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
    
    public final long component7() {
        return 0L;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.storage.StorageHealth copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.StorageDomain domain, int totalKeys, long totalSizeBytes, int failedReads, int failedWrites, int integrityFailures, long lastAccessed, boolean isHealthy) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageHealth$Companion;", "", "<init>", "()V", "unhealthy", "Lke/ac/mku/authcore/contracts/storage/StorageHealth;", "domain", "Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create an unhealthy storage state.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.storage.StorageHealth unhealthy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.storage.StorageDomain domain) {
            return null;
        }
    }
}