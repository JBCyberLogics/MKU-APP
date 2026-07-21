package ke.ac.mku.authcore.contracts.security;

import java.security.cert.X509Certificate;

/**
 * TrustStatus - SECURITY-004
 *
 * Enumeration of possible trust validation statuses.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/security/TrustStatus;", "", "(Ljava/lang/String;I)V", "TRUSTED", "UNTRUSTED", "PIN_MISMATCH", "EXPIRED", "NOT_YET_VALID", "HOSTNAME_MISMATCH", "CHAIN_INVALID", "SELF_SIGNED_REJECTED", "TLS_VERSION_INVALID", "ERROR", "app_debug"})
public enum TrustStatus {
    /*public static final*/ TRUSTED /* = new TRUSTED() */,
    /*public static final*/ UNTRUSTED /* = new UNTRUSTED() */,
    /*public static final*/ PIN_MISMATCH /* = new PIN_MISMATCH() */,
    /*public static final*/ EXPIRED /* = new EXPIRED() */,
    /*public static final*/ NOT_YET_VALID /* = new NOT_YET_VALID() */,
    /*public static final*/ HOSTNAME_MISMATCH /* = new HOSTNAME_MISMATCH() */,
    /*public static final*/ CHAIN_INVALID /* = new CHAIN_INVALID() */,
    /*public static final*/ SELF_SIGNED_REJECTED /* = new SELF_SIGNED_REJECTED() */,
    /*public static final*/ TLS_VERSION_INVALID /* = new TLS_VERSION_INVALID() */,
    /*public static final*/ ERROR /* = new ERROR() */;
    
    TrustStatus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.security.TrustStatus> getEntries() {
        return null;
    }
}