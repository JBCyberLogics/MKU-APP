package ke.ac.mku.authcore.contracts.crypto;

/**
 * Signature algorithm options.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/contracts/crypto/SignatureAlgorithm;", "", "<init>", "(Ljava/lang/String;I)V", "RSA_4096", "EC_P256", "app"})
public enum SignatureAlgorithm {
    /*public static final*/ RSA_4096 /* = new RSA_4096() */,
    /*public static final*/ EC_P256 /* = new EC_P256() */;
    
    SignatureAlgorithm() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.crypto.SignatureAlgorithm> getEntries() {
        return null;
    }
}