package ke.ac.mku.authcore.contracts.storage;

/**
 * Integrity status for stored data verification.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/IntegrityStatus;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "INVALID", "NOT_FOUND", "ERROR", "app"})
public enum IntegrityStatus {
    /*public static final*/ VALID /* = new VALID() */,
    /*public static final*/ INVALID /* = new INVALID() */,
    /*public static final*/ NOT_FOUND /* = new NOT_FOUND() */,
    /*public static final*/ ERROR /* = new ERROR() */;
    
    IntegrityStatus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.storage.IntegrityStatus> getEntries() {
        return null;
    }
}