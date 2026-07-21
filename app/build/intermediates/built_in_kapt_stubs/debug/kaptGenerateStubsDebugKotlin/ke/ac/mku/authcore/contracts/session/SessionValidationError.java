package ke.ac.mku.authcore.contracts.session;

/**
 * Specific validation error types.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/session/SessionValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_NOT_FOUND", "SESSION_CORRUPTED", "HMAC_VERIFICATION_FAILED", "SIGNATURE_VERIFICATION_FAILED", "PLATFORM_INSECURE", "DEVICE_MISMATCH", "UNEXPECTED_STATE", "STORAGE_ERROR", "CRYPTO_ERROR", "app"})
public enum SessionValidationError {
    /*public static final*/ SESSION_NOT_FOUND /* = new SESSION_NOT_FOUND() */,
    /*public static final*/ SESSION_CORRUPTED /* = new SESSION_CORRUPTED() */,
    /*public static final*/ HMAC_VERIFICATION_FAILED /* = new HMAC_VERIFICATION_FAILED() */,
    /*public static final*/ SIGNATURE_VERIFICATION_FAILED /* = new SIGNATURE_VERIFICATION_FAILED() */,
    /*public static final*/ PLATFORM_INSECURE /* = new PLATFORM_INSECURE() */,
    /*public static final*/ DEVICE_MISMATCH /* = new DEVICE_MISMATCH() */,
    /*public static final*/ UNEXPECTED_STATE /* = new UNEXPECTED_STATE() */,
    /*public static final*/ STORAGE_ERROR /* = new STORAGE_ERROR() */,
    /*public static final*/ CRYPTO_ERROR /* = new CRYPTO_ERROR() */;
    
    SessionValidationError() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.session.SessionValidationError> getEntries() {
        return null;
    }
}