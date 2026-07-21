package ke.ac.mku.authcore.contracts.security;

/**
 * PinSet - SECURITY-004
 *
 * Collection of certificate pins for a specific host.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u000bJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinSet;", "", "host", "", "pins", "", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "validFrom", "", "validUntil", "enforcePinning", "", "(Ljava/lang/String;Ljava/util/List;JJZ)V", "getEnforcePinning", "()Z", "getHost", "()Ljava/lang/String;", "getPins", "()Ljava/util/List;", "getValidFrom", "()J", "getValidUntil", "backupPins", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "isExpired", "isValid", "primaryPins", "toString", "validPins", "Companion", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinSet$Companion;", "", "()V", "create", "Lke/ac/mku/authcore/contracts/security/PinSet;", "host", "", "pins", "", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "validityDays", "", "app_debug"})
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