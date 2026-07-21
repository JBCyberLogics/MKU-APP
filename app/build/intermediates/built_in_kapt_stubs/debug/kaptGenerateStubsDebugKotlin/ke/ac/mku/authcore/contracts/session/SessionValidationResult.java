package ke.ac.mku.authcore.contracts.session;

/**
 * SessionValidationResult - SESSION-002
 *
 * Result of session validation operations.
 * Provides detailed validation outcomes for proper error handling.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "", "<init>", "()V", "Valid", "Warning", "Expired", "Invalid", "Tampered", "Corrupted", "RecoveryRequired", "Failed", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Corrupted;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Expired;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Failed;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Invalid;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$RecoveryRequired;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Tampered;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Valid;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Warning;", "app"})
public abstract class SessionValidationResult {
    
    private SessionValidationResult() {
        super();
    }
    
    /**
     * Session data is corrupted (unreadable).
     * @param sessionId The corrupted session ID
     * @param reason Why corruption was detected
     * @param validationTime When validation occurred
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Corrupted;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "reason", "validationTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSessionId", "()Ljava/lang/String;", "getReason", "getValidationTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Corrupted extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        
        public Corrupted(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Corrupted copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
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
    
    /**
     * Session has expired.
     * @param sessionId The expired session ID
     * @param expiredAt When the session expired
     * @param validationTime When validation occurred
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Expired;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "expiredAt", "", "validationTime", "<init>", "(Ljava/lang/String;JJ)V", "getSessionId", "()Ljava/lang/String;", "getExpiredAt", "()J", "getValidationTime", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Expired extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        private final long expiredAt = 0L;
        private final long validationTime = 0L;
        
        public Expired(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, long expiredAt, long validationTime) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        public final long getExpiredAt() {
            return 0L;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Expired copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, long expiredAt, long validationTime) {
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
    
    /**
     * Validation operation itself failed (system error).
     * @param sessionId The session ID (may be null)
     * @param reason Why validation failed
     * @param validationTime When validation occurred
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Failed;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "reason", "validationTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSessionId", "()Ljava/lang/String;", "getReason", "getValidationTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Failed extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        
        public Failed(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Failed copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
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
    
    /**
     * Session is invalid (not expired, but invalid for other reasons).
     * @param sessionId The invalid session ID
     * @param reason Why validation failed
     * @param validationTime When validation occurred
     * @param errors List of specific validation errors
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Invalid;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "reason", "validationTime", "", "errors", "", "Lke/ac/mku/authcore/contracts/session/SessionValidationError;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getSessionId", "()Ljava/lang/String;", "getReason", "getValidationTime", "()J", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Invalid extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ke.ac.mku.authcore.contracts.session.SessionValidationError> errors = null;
        
        public Invalid(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ke.ac.mku.authcore.contracts.session.SessionValidationError> errors) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionValidationError> getErrors() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionValidationError> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Invalid copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends ke.ac.mku.authcore.contracts.session.SessionValidationError> errors) {
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
    
    /**
     * Session requires recovery (can be recovered).
     * @param sessionId The session requiring recovery
     * @param reason Why recovery is needed
     * @param validationTime When validation occurred
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$RecoveryRequired;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "reason", "validationTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSessionId", "()Ljava/lang/String;", "getReason", "getValidationTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RecoveryRequired extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        
        public RecoveryRequired(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.RecoveryRequired copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
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
    
    /**
     * Session data has been tampered with.
     * @param sessionId The tampered session ID
     * @param reason Why tampering was detected
     * @param validationTime When validation occurred
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Tampered;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "sessionId", "", "reason", "validationTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSessionId", "()Ljava/lang/String;", "getReason", "getValidationTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Tampered extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        
        public Tampered(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Tampered copy(@org.jetbrains.annotations.Nullable()
        java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime) {
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
    
    /**
     * Session is valid and can be used.
     * @param session The validated session
     * @param validationTime When validation occurred
     * @param warnings Optional warnings (e.g., near expiry)
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Valid;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "session", "Lke/ac/mku/authcore/domain/model/Session;", "validationTime", "", "warnings", "", "Lke/ac/mku/authcore/contracts/session/SessionWarning;", "<init>", "(Lke/ac/mku/authcore/domain/model/Session;JLjava/util/List;)V", "getSession", "()Lke/ac/mku/authcore/domain/model/Session;", "getValidationTime", "()J", "getWarnings", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class Valid extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.domain.model.Session session = null;
        private final long validationTime = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings = null;
        
        public Valid(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.Session session, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.Session getSession() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> getWarnings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.Session component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Valid copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.Session session, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
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
    
    /**
     * Session is valid but with warnings.
     * @param session The session (may be null if not retrievable)
     * @param reason Why validation produced a warning
     * @param validationTime When validation occurred
     * @param warnings List of warnings
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u00d6\u0081\u0004J\n\u0010 \u001a\u00020\u0005H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationResult$Warning;", "Lke/ac/mku/authcore/contracts/session/SessionValidationResult;", "session", "Lke/ac/mku/authcore/domain/model/Session;", "reason", "", "validationTime", "", "warnings", "", "Lke/ac/mku/authcore/contracts/session/SessionWarning;", "<init>", "(Lke/ac/mku/authcore/domain/model/Session;Ljava/lang/String;JLjava/util/List;)V", "getSession", "()Lke/ac/mku/authcore/domain/model/Session;", "getReason", "()Ljava/lang/String;", "getValidationTime", "()J", "getWarnings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class Warning extends ke.ac.mku.authcore.contracts.session.SessionValidationResult {
        @org.jetbrains.annotations.Nullable()
        private final ke.ac.mku.authcore.domain.model.Session session = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final long validationTime = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings = null;
        
        public Warning(@org.jetbrains.annotations.Nullable()
        ke.ac.mku.authcore.domain.model.Session session, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.domain.model.Session getSession() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final long getValidationTime() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> getWarnings() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.domain.model.Session component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.SessionValidationResult.Warning copy(@org.jetbrains.annotations.Nullable()
        ke.ac.mku.authcore.domain.model.Session session, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, long validationTime, @org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
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
}