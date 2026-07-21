package ke.ac.mku.authcore.recovery;

/**
 * Recovery strategy being used.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "RESTART", "REINITIALIZE", "ROLLBACK", "FULL_RECOVERY", "app"})
public enum RecoveryStrategy {
    /*public static final*/ RETRY /* = new RETRY() */,
    /*public static final*/ RESTART /* = new RESTART() */,
    /*public static final*/ REINITIALIZE /* = new REINITIALIZE() */,
    /*public static final*/ ROLLBACK /* = new ROLLBACK() */,
    /*public static final*/ FULL_RECOVERY /* = new FULL_RECOVERY() */;
    
    RecoveryStrategy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.recovery.RecoveryStrategy> getEntries() {
        return null;
    }
}