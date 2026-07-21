package ke.ac.mku.authcore.contracts.cookie;

/**
 * Represents the different types of cookies used by the platform.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lke/ac/mku/authcore/contracts/cookie/CookieType;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_COOKIE", "AUTH_COOKIE", "CSRF_COOKIE", "REMEMBER_ME_COOKIE", "PORTAL_COOKIE", "SECURITY_COOKIE", "app"})
public enum CookieType {
    /*public static final*/ SESSION_COOKIE /* = new SESSION_COOKIE() */,
    /*public static final*/ AUTH_COOKIE /* = new AUTH_COOKIE() */,
    /*public static final*/ CSRF_COOKIE /* = new CSRF_COOKIE() */,
    /*public static final*/ REMEMBER_ME_COOKIE /* = new REMEMBER_ME_COOKIE() */,
    /*public static final*/ PORTAL_COOKIE /* = new PORTAL_COOKIE() */,
    /*public static final*/ SECURITY_COOKIE /* = new SECURITY_COOKIE() */;
    
    CookieType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.cookie.CookieType> getEntries() {
        return null;
    }
}