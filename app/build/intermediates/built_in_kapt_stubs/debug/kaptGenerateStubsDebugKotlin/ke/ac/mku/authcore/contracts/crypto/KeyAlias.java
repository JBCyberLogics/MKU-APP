package ke.ac.mku.authcore.contracts.crypto;

/**
 * KeyAlias - SECURITY-002
 *
 * Well-known key aliases for platform cryptographic operations.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION", "COOKIE", "STORAGE", "SIGNATURE", "HMAC", "app"})
public enum KeyAlias {
    /*public static final*/ SESSION /* = new SESSION() */,
    /*public static final*/ COOKIE /* = new COOKIE() */,
    /*public static final*/ STORAGE /* = new STORAGE() */,
    /*public static final*/ SIGNATURE /* = new SIGNATURE() */,
    /*public static final*/ HMAC /* = new HMAC() */;
    
    KeyAlias() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.crypto.KeyAlias> getEntries() {
        return null;
    }
}