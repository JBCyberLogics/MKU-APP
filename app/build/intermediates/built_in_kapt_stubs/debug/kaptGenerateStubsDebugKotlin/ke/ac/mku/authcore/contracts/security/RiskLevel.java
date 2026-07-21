package ke.ac.mku.authcore.contracts.security;

/**
 * RiskLevel - SECURITY-005
 *
 * Risk levels for threat evaluation with corresponding actions.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/contracts/security/RiskLevel;", "", "action", "Lke/ac/mku/authcore/contracts/security/Action;", "priority", "", "<init>", "(Ljava/lang/String;ILke/ac/mku/authcore/contracts/security/Action;I)V", "getAction", "()Lke/ac/mku/authcore/contracts/security/Action;", "getPriority", "()I", "LOW", "MEDIUM", "HIGH", "CRITICAL", "Companion", "app"})
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/contracts/security/RiskLevel$Companion;", "", "<init>", "()V", "max", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "a", "b", "min", "app"})
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