package ke.ac.mku.authcore.contracts.security;

/**
 * PinSet - SECURITY-004
 *
 * Collection of certificate pins for a specific host.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0014\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010$\u001a\u00020%H\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinSet;", "", "host", "", "pins", "", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "validFrom", "", "validUntil", "enforcePinning", "", "<init>", "(Ljava/lang/String;Ljava/util/List;JJZ)V", "getHost", "()Ljava/lang/String;", "getPins", "()Ljava/util/List;", "getValidFrom", "()J", "getValidUntil", "getEnforcePinning", "()Z", "isExpired", "isValid", "primaryPins", "backupPins", "validPins", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app"})
public final class PinSet {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String host = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> pins = null;
    private final long validFrom = 0L;
    private final long validUntil = 0L;
    private final boolean enforcePinning = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.PinSet.Companion Companion = null;
    
    public PinSet(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> pins, long validFrom, long validUntil, boolean enforcePinning) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> getPins() {
        return null;
    }
    
    public final long getValidFrom() {
        return 0L;
    }
    
    public final long getValidUntil() {
        return 0L;
    }
    
    public final boolean getEnforcePinning() {
        return false;
    }
    
    /**
     * Check if the pin set has expired.
     */
    public final boolean isExpired() {
        return false;
    }
    
    /**
     * Check if the pin set is currently valid.
     */
    public final boolean isValid() {
        return false;
    }
    
    /**
     * Get primary (non-backup) pins.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> primaryPins() {
        return null;
    }
    
    /**
     * Get backup pins for rotation.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> backupPins() {
        return null;
    }
    
    /**
     * Get all valid pins (non-expired and with valid format).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> validPins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.PinSet copy(@org.jetbrains.annotations.NotNull()
    java.lang.String host, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> pins, long validFrom, long validUntil, boolean enforcePinning) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinSet$Companion;", "", "<init>", "()V", "create", "Lke/ac/mku/authcore/contracts/security/PinSet;", "host", "", "pins", "", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "validityDays", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a PinSet for a host with default validity (1 year).
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.PinSet create(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.security.CertificatePin> pins, long validityDays) {
            return null;
        }
    }
}