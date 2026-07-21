package ke.ac.mku.authcore.domain.model;

/**
 * Session - SESSION-001
 *
 * Represents an authenticated user session with full metadata.
 * Stored encrypted in SESSIONS domain via ISecureStorageManager.
 *
 * @property user The authenticated user
 * @property cookies Session cookies from portal authentication
 * @property loginTimestamp When the session was created (milliseconds since epoch)
 * @property sessionId Unique session identifier (UUID)
 * @property deviceId Device identifier bound to this session
 * @property lastRefreshTimestamp When the session was last refreshed
 * @property refreshCount Number of times session has been refreshed
 * @property expiryTimestamp When the session will expire (milliseconds since epoch)
 * @property isEncrypted Whether session data is encrypted
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0000J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0014\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00100\u001a\u00020\rH\u00d6\u0081\u0004J\n\u00101\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 \u00a8\u00063"}, d2 = {"Lke/ac/mku/authcore/domain/model/Session;", "", "user", "Lke/ac/mku/authcore/domain/model/User;", "cookies", "", "", "loginTimestamp", "", "sessionId", "deviceId", "lastRefreshTimestamp", "refreshCount", "", "expiryTimestamp", "isEncrypted", "", "<init>", "(Lke/ac/mku/authcore/domain/model/User;Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;JIJZ)V", "getUser", "()Lke/ac/mku/authcore/domain/model/User;", "getCookies", "()Ljava/util/Map;", "getLoginTimestamp", "()J", "getSessionId", "()Ljava/lang/String;", "getDeviceId", "getLastRefreshTimestamp", "getRefreshCount", "()I", "getExpiryTimestamp", "()Z", "isExpired", "shouldRefresh", "refreshed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "app"})
public final class Session {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> cookies = null;
    private final long loginTimestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deviceId = null;
    private final long lastRefreshTimestamp = 0L;
    private final int refreshCount = 0;
    private final long expiryTimestamp = 0L;
    private final boolean isEncrypted = false;
    public static final long SESSION_TIMEOUT_MS = 1800000L;
    public static final long REFRESH_BEFORE_EXPIRY_MS = 300000L;
    public static final int MAX_REFRESH_COUNT = 24;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.domain.model.Session.Companion Companion = null;
    
    public Session(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.User user, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> cookies, long loginTimestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceId, long lastRefreshTimestamp, int refreshCount, long expiryTimestamp, boolean isEncrypted) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getCookies() {
        return null;
    }
    
    public final long getLoginTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final long getLastRefreshTimestamp() {
        return 0L;
    }
    
    public final int getRefreshCount() {
        return 0;
    }
    
    public final long getExpiryTimestamp() {
        return 0L;
    }
    
    public final boolean isEncrypted() {
        return false;
    }
    
    /**
     * Check if this session has expired.
     */
    public final boolean isExpired() {
        return false;
    }
    
    /**
     * Check if this session should be refreshed.
     */
    public final boolean shouldRefresh() {
        return false;
    }
    
    /**
     * Create a refreshed copy of this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.Session refreshed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.User component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.Session copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.User user, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> cookies, long loginTimestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceId, long lastRefreshTimestamp, int refreshCount, long expiryTimestamp, boolean isEncrypted) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/domain/model/Session$Companion;", "", "<init>", "()V", "SESSION_TIMEOUT_MS", "", "REFRESH_BEFORE_EXPIRY_MS", "MAX_REFRESH_COUNT", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}