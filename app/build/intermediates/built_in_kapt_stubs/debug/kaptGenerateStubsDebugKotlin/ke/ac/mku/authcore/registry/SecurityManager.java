package ke.ac.mku.authcore.registry;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/registry/SecurityManager;", "", "configManager", "Lke/ac/mku/authcore/config/ConfigManager;", "<init>", "(Lke/ac/mku/authcore/config/ConfigManager;)V", "isHttpsOnly", "", "()Z", "isCertValidationEnabled", "isHostnameVerificationEnabled", "allowsSelfSignedCertificates", "getAllowsSelfSignedCertificates", "allowsUntrustedCertificates", "getAllowsUntrustedCertificates", "validateConnection", "url", "", "getSecurityLevel", "Lke/ac/mku/authcore/registry/SecurityLevel;", "app"})
public final class SecurityManager {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.config.ConfigManager configManager = null;
    
    public SecurityManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.ConfigManager configManager) {
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
    
    public final boolean getAllowsSelfSignedCertificates() {
        return false;
    }
    
    public final boolean getAllowsUntrustedCertificates() {
        return false;
    }
    
    public final boolean validateConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.SecurityLevel getSecurityLevel() {
        return null;
    }
}