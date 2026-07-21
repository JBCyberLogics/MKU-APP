package ke.ac.mku.authcore.contracts.storage;

/**
 * StorageDomain - SECURITY-003
 *
 * Enumeration of secure storage domains.
 * Each domain has its own encrypted SharedPreferences file.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "", "prefsName", "", "encrypted", "", "autoExpire", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "getPrefsName", "()Ljava/lang/String;", "getEncrypted", "()Z", "getAutoExpire", "SESSIONS", "AUTH_STATE", "AUTH_EVENTS", "COOKIES", "TOKENS", "CREDENTIALS", "PREFERENCES", "CACHE", "Companion", "app"})
public enum StorageDomain {
    /*public static final*/ SESSIONS /* = new SESSIONS(null, false, false) */,
    /*public static final*/ AUTH_STATE /* = new AUTH_STATE(null, false, false) */,
    /*public static final*/ AUTH_EVENTS /* = new AUTH_EVENTS(null, false, false) */,
    /*public static final*/ COOKIES /* = new COOKIES(null, false, false) */,
    /*public static final*/ TOKENS /* = new TOKENS(null, false, false) */,
    /*public static final*/ CREDENTIALS /* = new CREDENTIALS(null, false, false) */,
    /*public static final*/ PREFERENCES /* = new PREFERENCES(null, false, false) */,
    /*public static final*/ CACHE /* = new CACHE(null, false, false) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefsName = null;
    private final boolean encrypted = false;
    private final boolean autoExpire = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.storage.StorageDomain.Companion Companion = null;
    
    StorageDomain(java.lang.String prefsName, boolean encrypted, boolean autoExpire) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefsName() {
        return null;
    }
    
    public final boolean getEncrypted() {
        return false;
    }
    
    public final boolean getAutoExpire() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.storage.StorageDomain> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a8\u0006\n"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageDomain$Companion;", "", "<init>", "()V", "fromName", "Lke/ac/mku/authcore/contracts/storage/StorageDomain;", "name", "", "expirables", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get domain by name, case-insensitive.
         */
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.contracts.storage.StorageDomain fromName(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        /**
         * Get all domains that support auto-expiration.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.storage.StorageDomain> expirables() {
            return null;
        }
    }
}