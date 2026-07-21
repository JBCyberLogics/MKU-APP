package ke.ac.mku.authcore.contracts.security;

/**
 * TrustedEndpoint - SECURITY-004
 *
 * Configuration for a trusted endpoint that requires certificate pinning.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/contracts/security/TrustedEndpoint;", "", "host", "", "baseUrl", "requirePinning", "", "allowSubdomains", "description", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAllowSubdomains", "()Z", "getBaseUrl", "()Ljava/lang/String;", "getDescription", "getHost", "getRequirePinning", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "isSecure", "matchesHostname", "hostname", "toString", "Companion", "app_debug"})
public final class TrustedEndpoint {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUrl = null;
    private final boolean requirePinning = false;
    private final boolean allowSubdomains = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    
    /**
     * Default MKU trusted endpoints.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<ke.ac.mku.authcore.contracts.security.TrustedEndpoint> DEFAULT_ENDPOINTS = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.TrustedEndpoint.Companion Companion = null;
    
    public TrustedEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, boolean requirePinning, boolean allowSubdomains, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    public final boolean getRequirePinning() {
        return false;
    }
    
    public final boolean getAllowSubdomains() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Check if a given hostname matches this trusted endpoint.
     */
    public final boolean matchesHostname(@org.jetbrains.annotations.NotNull()
    java.lang.String hostname) {
        return false;
    }
    
    /**
     * Check if the base URL uses HTTPS.
     */
    public final boolean isSecure() {
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
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.TrustedEndpoint copy(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, boolean requirePinning, boolean allowSubdomains, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TrustedEndpoint$Companion;", "", "()V", "DEFAULT_ENDPOINTS", "", "Lke/ac/mku/authcore/contracts/security/TrustedEndpoint;", "getDEFAULT_ENDPOINTS", "()Ljava/util/List;", "fromHostname", "hostname", "", "isTrusted", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Default MKU trusted endpoints.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.security.TrustedEndpoint> getDEFAULT_ENDPOINTS() {
            return null;
        }
        
        /**
         * Get a trusted endpoint by hostname.
         */
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.contracts.security.TrustedEndpoint fromHostname(@org.jetbrains.annotations.NotNull()
        java.lang.String hostname) {
            return null;
        }
        
        /**
         * Check if a hostname is a trusted endpoint.
         */
        public final boolean isTrusted(@org.jetbrains.annotations.NotNull()
        java.lang.String hostname) {
            return false;
        }
    }
}