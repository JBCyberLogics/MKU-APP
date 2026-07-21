package ke.ac.mku.authcore.registry;

import android.util.Log;
import ke.ac.mku.authcore.domain.model.AuthResult;
import ke.ac.mku.authcore.domain.model.User;
import ke.ac.mku.authcore.manager.AuthCoreManager;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/registry/SecurityInfo;", "", "isHttpsOnly", "", "isCertValidationEnabled", "isHostnameVerificationEnabled", "securityLevel", "Lke/ac/mku/authcore/registry/SecurityLevel;", "(ZZZLke/ac/mku/authcore/registry/SecurityLevel;)V", "()Z", "getSecurityLevel", "()Lke/ac/mku/authcore/registry/SecurityLevel;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class SecurityInfo {
    private final boolean isHttpsOnly = false;
    private final boolean isCertValidationEnabled = false;
    private final boolean isHostnameVerificationEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.SecurityLevel securityLevel = null;
    
    public SecurityInfo(boolean isHttpsOnly, boolean isCertValidationEnabled, boolean isHostnameVerificationEnabled, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.SecurityLevel securityLevel) {
        super();
    }
    
    public final boolean isHttpsOnly() {
        return false;
    }
    
    public final boolean isCertValidationEnabled() {
        return false;
    }
    
    public final boolean isHostnameVerificationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityLevel getSecurityLevel() {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityLevel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityInfo copy(boolean isHttpsOnly, boolean isCertValidationEnabled, boolean isHostnameVerificationEnabled, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.SecurityLevel securityLevel) {
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