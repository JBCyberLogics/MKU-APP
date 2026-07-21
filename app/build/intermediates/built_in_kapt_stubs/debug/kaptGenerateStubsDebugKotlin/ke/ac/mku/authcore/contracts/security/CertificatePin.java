package ke.ac.mku.authcore.contracts.security;

/**
 * CertificatePin - SECURITY-004
 *
 * Represents a certificate public key pin for certificate pinning.
 * Pins are SHA-256 hashes of certificate public keys.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lke/ac/mku/authcore/contracts/security/CertificatePin;", "", "publicKeyHash", "", "algorithm", "isBackup", "", "addedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJ)V", "getPublicKeyHash", "()Ljava/lang/String;", "getAlgorithm", "()Z", "getAddedAt", "()J", "isValid", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app"})
public final class CertificatePin {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publicKeyHash = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String algorithm = null;
    private final boolean isBackup = false;
    private final long addedAt = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_ALGORITHM = "SHA-256";
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.CertificatePin.Companion Companion = null;
    
    public CertificatePin(@org.jetbrains.annotations.NotNull()
    java.lang.String publicKeyHash, @org.jetbrains.annotations.NotNull()
    java.lang.String algorithm, boolean isBackup, long addedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublicKeyHash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlgorithm() {
        return null;
    }
    
    public final boolean isBackup() {
        return false;
    }
    
    public final long getAddedAt() {
        return 0L;
    }
    
    /**
     * Validate the pin format (Base64-encoded SHA-256 = 44 chars).
     */
    public final boolean isValid() {
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
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.CertificatePin copy(@org.jetbrains.annotations.NotNull()
    java.lang.String publicKeyHash, @org.jetbrains.annotations.NotNull()
    java.lang.String algorithm, boolean isBackup, long addedAt) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/contracts/security/CertificatePin$Companion;", "", "<init>", "()V", "DEFAULT_ALGORITHM", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}