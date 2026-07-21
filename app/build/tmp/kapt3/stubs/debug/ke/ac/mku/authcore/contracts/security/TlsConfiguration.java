package ke.ac.mku.authcore.contracts.security;

/**
 * TlsConfiguration - SECURITY-004
 *
 * TLS/SSL configuration for secure connections.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "", "minimumVersion", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "allowTls12Fallback", "", "requireSecureRenegotiation", "requireServerAuthentication", "requireClientAuthentication", "(Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;ZZZZ)V", "getAllowTls12Fallback", "()Z", "getMinimumVersion", "()Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "getRequireClientAuthentication", "getRequireSecureRenegotiation", "getRequireServerAuthentication", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "TlsVersion", "app_debug"})
public final class TlsConfiguration {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion minimumVersion = null;
    private final boolean allowTls12Fallback = false;
    private final boolean requireSecureRenegotiation = false;
    private final boolean requireServerAuthentication = false;
    private final boolean requireClientAuthentication = false;
    
    /**
     * Default secure TLS configuration.
     */
    @org.jetbrains.annotations.NotNull()
    private static final ke.ac.mku.authcore.contracts.security.TlsConfiguration SECURE_CONFIG = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.TlsConfiguration.Companion Companion = null;
    
    public TlsConfiguration(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion minimumVersion, boolean allowTls12Fallback, boolean requireSecureRenegotiation, boolean requireServerAuthentication, boolean requireClientAuthentication) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion getMinimumVersion() {
        return null;
    }
    
    public final boolean getAllowTls12Fallback() {
        return false;
    }
    
    public final boolean getRequireSecureRenegotiation() {
        return false;
    }
    
    public final boolean getRequireServerAuthentication() {
        return false;
    }
    
    public final boolean getRequireClientAuthentication() {
        return false;
    }
    
    public TlsConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.TlsConfiguration copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion minimumVersion, boolean allowTls12Fallback, boolean requireSecureRenegotiation, boolean requireServerAuthentication, boolean requireClientAuthentication) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$Companion;", "", "()V", "SECURE_CONFIG", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "getSECURE_CONFIG", "()Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Default secure TLS configuration.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.TlsConfiguration getSECURE_CONFIG() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "", "version", "", "major", "", "minor", "(Ljava/lang/String;ILjava/lang/String;II)V", "getMajor", "()I", "getMinor", "getVersion", "()Ljava/lang/String;", "TLS_1_3", "TLS_1_2", "Companion", "app_debug"})
    public static enum TlsVersion {
        /*public static final*/ TLS_1_3 /* = new TLS_1_3(null, 0, 0) */,
        /*public static final*/ TLS_1_2 /* = new TLS_1_2(null, 0, 0) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String version = null;
        private final int major = 0;
        private final int minor = 0;
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion.Companion Companion = null;
        
        TlsVersion(java.lang.String version, int major, int minor) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getVersion() {
            return null;
        }
        
        public final int getMajor() {
            return 0;
        }
        
        public final int getMinor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion> getEntries() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion$Companion;", "", "()V", "fromString", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "version", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final ke.ac.mku.authcore.contracts.security.TlsConfiguration.TlsVersion fromString(@org.jetbrains.annotations.NotNull()
            java.lang.String version) {
                return null;
            }
        }
    }
}