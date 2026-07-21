package ke.ac.mku.authcore.contracts.session;

/**
 * Session validation warning types.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionWarningType;", "", "<init>", "(Ljava/lang/String;I)V", "NEAR_EXPIRY", "EXCESSIVE_REFRESH_COUNT", "SUSPICIOUS_ACTIVITY", "SECURITY_CHECK_FAILED", "DEVICE_BINDING_WEAK", "app"})
public enum SessionWarningType {
    /*public static final*/ NEAR_EXPIRY /* = new NEAR_EXPIRY() */,
    /*public static final*/ EXCESSIVE_REFRESH_COUNT /* = new EXCESSIVE_REFRESH_COUNT() */,
    /*public static final*/ SUSPICIOUS_ACTIVITY /* = new SUSPICIOUS_ACTIVITY() */,
    /*public static final*/ SECURITY_CHECK_FAILED /* = new SECURITY_CHECK_FAILED() */,
    /*public static final*/ DEVICE_BINDING_WEAK /* = new DEVICE_BINDING_WEAK() */;
    
    SessionWarningType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.session.SessionWarningType> getEntries() {
        return null;
    }
}