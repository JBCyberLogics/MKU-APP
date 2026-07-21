package ke.ac.mku.authcore.contracts.security;

/**
 * RiskLevel - SECURITY-005
 *
 * Risk levels for threat evaluation with corresponding actions.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/contracts/security/RiskLevel;", "", "action", "Lke/ac/mku/authcore/contracts/security/Action;", "priority", "", "(Ljava/lang/String;ILke/ac/mku/authcore/contracts/security/Action;I)V", "getAction", "()Lke/ac/mku/authcore/contracts/security/Action;", "getPriority", "()I", "LOW", "MEDIUM", "HIGH", "CRITICAL", "Companion", "app_debug"})
public enum RiskLevel {
    /*public static final*/ LOW /* = new LOW(null, 0) */,
    /*public static final*/ MEDIUM /* = new MEDIUM(null, 0) */,
    /*public static final*/ HIGH /* = new HIGH(null, 0) */,
    /*public static final*/ CRITICAL /* = new CRITICAL(null, 0) */;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.Action action = null;
    private final int priority = 0;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.RiskLevel.Companion Companion = null;
    
    RiskLevel(ke.ac.mku.authcore.contracts.security.Action action, int priority) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.Action getAction() {
        return null;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.RiskLevel> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/security/RiskLevel$Companion;", "", "()V", "max", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "a", "b", "min", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get the higher of two risk levels.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.RiskLevel max(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.RiskLevel a, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.RiskLevel b) {
            return null;
        }
        
        /**
         * Get the lower of two risk levels.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.RiskLevel min(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.RiskLevel a, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.RiskLevel b) {
            return null;
        }
    }
}