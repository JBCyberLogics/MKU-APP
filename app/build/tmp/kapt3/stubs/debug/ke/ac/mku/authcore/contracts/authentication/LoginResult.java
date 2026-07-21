package ke.ac.mku.authcore.contracts.authentication;

import ke.ac.mku.authcore.domain.model.User;

/**
 * Login result sealed class.
 *
 * @property user The authenticated user on success
 * @property errorMessage The error description on failure
 * @property errorCode The error code for programmatic handling
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/LoginResult;", "", "()V", "Failure", "Success", "Lke/ac/mku/authcore/contracts/authentication/LoginResult$Failure;", "Lke/ac/mku/authcore/contracts/authentication/LoginResult$Success;", "app_debug"})
public abstract class LoginResult {
    
    private LoginResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/LoginResult$Failure;", "Lke/ac/mku/authcore/contracts/authentication/LoginResult;", "message", "", "errorCode", "canRetry", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCanRetry", "()Z", "getErrorCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Failure extends ke.ac.mku.authcore.contracts.authentication.LoginResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorCode = null;
        private final boolean canRetry = false;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String errorCode, boolean canRetry) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        public final boolean getCanRetry() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.authentication.LoginResult.Failure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String errorCode, boolean canRetry) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/LoginResult$Success;", "Lke/ac/mku/authcore/contracts/authentication/LoginResult;", "user", "Lke/ac/mku/authcore/domain/model/User;", "sessionId", "", "portalConnectionResult", "Lke/ac/mku/authcore/models/portal/PortalConnectionResult;", "(Lke/ac/mku/authcore/domain/model/User;Ljava/lang/String;Lke/ac/mku/authcore/models/portal/PortalConnectionResult;)V", "getPortalConnectionResult", "()Lke/ac/mku/authcore/models/portal/PortalConnectionResult;", "getSessionId", "()Ljava/lang/String;", "getUser", "()Lke/ac/mku/authcore/domain/model/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Success extends ke.ac.mku.authcore.contracts.authentication.LoginResult {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.domain.model.User user = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sessionId = null;
        @org.jetbrains.annotations.Nullable()
        private final ke.ac.mku.authcore.models.portal.PortalConnectionResult portalConnectionResult = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.User user, @org.jetbrains.annotations.NotNull()
        java.lang.String sessionId, @org.jetbrains.annotations.Nullable()
        ke.ac.mku.authcore.models.portal.PortalConnectionResult portalConnectionResult) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.User getUser() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSessionId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.models.portal.PortalConnectionResult getPortalConnectionResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.User component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.models.portal.PortalConnectionResult component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.authentication.LoginResult.Success copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.User user, @org.jetbrains.annotations.NotNull()
        java.lang.String sessionId, @org.jetbrains.annotations.Nullable()
        ke.ac.mku.authcore.models.portal.PortalConnectionResult portalConnectionResult) {
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