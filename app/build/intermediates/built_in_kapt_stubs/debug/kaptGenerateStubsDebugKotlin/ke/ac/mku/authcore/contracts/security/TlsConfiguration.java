package ke.ac.mku.authcore.contracts.security;

/**
 * TlsConfiguration - SECURITY-004
 *
 * TLS/SSL configuration for secure connections.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "", "minimumVersion", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "allowTls12Fallback", "", "requireSecureRenegotiation", "requireServerAuthentication", "requireClientAuthentication", "<init>", "(Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;ZZZZ)V", "getMinimumVersion", "()Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "getAllowTls12Fallback", "()Z", "getRequireSecureRenegotiation", "getRequireServerAuthentication", "getRequireClientAuthentication", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "TlsVersion", "Companion", "app"})
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$Companion;", "", "<init>", "()V", "SECURE_CONFIG", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "getSECURE_CONFIG", "()Lke/ac/mku/authcore/contracts/security/TlsConfiguration;", "app"})
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "", "version", "", "major", "", "minor", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "getVersion", "()Ljava/lang/String;", "getMajor", "()I", "getMinor", "TLS_1_3", "TLS_1_2", "Companion", "app"})
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
        
        @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion$Companion;", "", "<init>", "()V", "fromString", "Lke/ac/mku/authcore/contracts/security/TlsConfiguration$TlsVersion;", "version", "", "app"})
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