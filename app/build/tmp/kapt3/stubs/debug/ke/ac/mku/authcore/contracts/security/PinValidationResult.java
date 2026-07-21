package ke.ac.mku.authcore.contracts.security;

/**
 * PinValidationResult - SECURITY-004
 *
 * Result of certificate pin validation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinValidationResult;", "", "isValid", "", "matchedPin", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "matchedPinType", "Lke/ac/mku/authcore/contracts/security/PinValidationResult$PinType;", "error", "", "(ZLke/ac/mku/authcore/contracts/security/CertificatePin;Lke/ac/mku/authcore/contracts/security/PinValidationResult$PinType;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getMatchedPin", "()Lke/ac/mku/authcore/contracts/security/CertificatePin;", "getMatchedPinType", "()Lke/ac/mku/authcore/contracts/security/PinValidationResult$PinType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "PinType", "app_debug"})
public final class PinValidationResult {
    private final boolean isValid = false;
    @org.jetbrains.annotations.Nullable()
    private final ke.ac.mku.authcore.contracts.security.CertificatePin matchedPin = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType matchedPinType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.PinValidationResult.Companion Companion = null;
    
    public PinValidationResult(boolean isValid, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.contracts.security.CertificatePin matchedPin, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType matchedPinType, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.contracts.security.CertificatePin getMatchedPin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType getMatchedPinType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.contracts.security.CertificatePin component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.PinValidationResult copy(boolean isValid, @org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.contracts.security.CertificatePin matchedPin, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType matchedPinType, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinValidationResult$Companion;", "", "()V", "failure", "Lke/ac/mku/authcore/contracts/security/PinValidationResult;", "error", "", "success", "matchedPin", "Lke/ac/mku/authcore/contracts/security/CertificatePin;", "type", "Lke/ac/mku/authcore/contracts/security/PinValidationResult$PinType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.PinValidationResult success(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.CertificatePin matchedPin, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.PinValidationResult failure(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/contracts/security/PinValidationResult$PinType;", "", "(Ljava/lang/String;I)V", "PRIMARY", "BACKUP", "NONE", "app_debug"})
    public static enum PinType {
        /*public static final*/ PRIMARY /* = new PRIMARY() */,
        /*public static final*/ BACKUP /* = new BACKUP() */,
        /*public static final*/ NONE /* = new NONE() */;
        
        PinType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.PinValidationResult.PinType> getEntries() {
            return null;
        }
    }
}