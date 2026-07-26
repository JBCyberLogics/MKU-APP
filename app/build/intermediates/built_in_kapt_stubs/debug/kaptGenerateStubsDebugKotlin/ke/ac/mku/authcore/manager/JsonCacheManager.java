package ke.ac.mku.authcore.manager;

/**
 * JsonCacheManager - PROGRAM-008
 *
 * Handles encrypted caching of generated JSON.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u000f\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/manager/JsonCacheManager;", "", "secureStorage", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "<init>", "(Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;)V", "Ljavax/inject/Inject;", "cacheJson", "", "json", "", "getCachedJson", "clearCache", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class JsonCacheManager {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorage = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CACHE_KEY = "universal_portal_json";
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.JsonCacheManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public JsonCacheManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorage) {
        super();
    }
    
    public final void cacheJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCachedJson() {
        return null;
    }
    
    public final void clearCache() {
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/JsonCacheManager$Companion;", "", "<init>", "()V", "CACHE_KEY", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}