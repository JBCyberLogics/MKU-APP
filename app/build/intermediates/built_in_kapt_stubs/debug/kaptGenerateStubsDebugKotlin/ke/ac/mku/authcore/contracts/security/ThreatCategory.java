package ke.ac.mku.authcore.contracts.security;

/**
 * ThreatCategory - SECURITY-005
 *
 * Enumeration of security threat categories that can be detected.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "", "displayName", "", "defaultRiskLevel", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lke/ac/mku/authcore/contracts/security/RiskLevel;)V", "getDisplayName", "()Ljava/lang/String;", "getDefaultRiskLevel", "()Lke/ac/mku/authcore/contracts/security/RiskLevel;", "ROOTED_DEVICE", "EMULATOR", "DEBUGGER_ATTACHED", "HOOK_FRAMEWORK", "APP_TAMPERING", "SIGNATURE_MISMATCH", "CERTIFICATE_BYPASS", "RUNTIME_INJECTION", "MEMORY_MODIFICATION", "UNKNOWN", "Companion", "app"})
public enum ThreatCategory {
    /*public static final*/ ROOTED_DEVICE /* = new ROOTED_DEVICE(null, null) */,
    /*public static final*/ EMULATOR /* = new EMULATOR(null, null) */,
    /*public static final*/ DEBUGGER_ATTACHED /* = new DEBUGGER_ATTACHED(null, null) */,
    /*public static final*/ HOOK_FRAMEWORK /* = new HOOK_FRAMEWORK(null, null) */,
    /*public static final*/ APP_TAMPERING /* = new APP_TAMPERING(null, null) */,
    /*public static final*/ SIGNATURE_MISMATCH /* = new SIGNATURE_MISMATCH(null, null) */,
    /*public static final*/ CERTIFICATE_BYPASS /* = new CERTIFICATE_BYPASS(null, null) */,
    /*public static final*/ RUNTIME_INJECTION /* = new RUNTIME_INJECTION(null, null) */,
    /*public static final*/ MEMORY_MODIFICATION /* = new MEMORY_MODIFICATION(null, null) */,
    /*public static final*/ UNKNOWN /* = new UNKNOWN(null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.RiskLevel defaultRiskLevel = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.ThreatCategory.Companion Companion = null;
    
    ThreatCategory(java.lang.String displayName, ke.ac.mku.authcore.contracts.security.RiskLevel defaultRiskLevel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.RiskLevel getDefaultRiskLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.ThreatCategory> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ThreatCategory$Companion;", "", "<init>", "()V", "fromName", "Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "name", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get threat category by name (case-insensitive).
         */
        @org.jetbrains.annotations.Nullable()
        public final ke.ac.mku.authcore.contracts.security.ThreatCategory fromName(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
    }
}