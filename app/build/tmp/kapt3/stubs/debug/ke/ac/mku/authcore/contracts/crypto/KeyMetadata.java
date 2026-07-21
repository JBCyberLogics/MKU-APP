package ke.ac.mku.authcore.contracts.crypto;

/**
 * Metadata about a managed cryptographic key.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\nH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lke/ac/mku/authcore/contracts/crypto/KeyMetadata;", "", "alias", "Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "createdAt", "", "lastRotated", "rotationCount", "", "isHardwareBacked", "", "(Lke/ac/mku/authcore/contracts/crypto/KeyAlias;JJIZ)V", "getAlias", "()Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "getCreatedAt", "()J", "()Z", "getLastRotated", "getRotationCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "isDueForRotation", "rotationIntervalDays", "toString", "", "app_debug"})
public final class KeyMetadata {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.crypto.KeyAlias alias = null;
    private final long createdAt = 0L;
    private final long lastRotated = 0L;
    private final int rotationCount = 0;
    private final boolean isHardwareBacked = false;
    
    public KeyMetadata(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias alias, long createdAt, long lastRotated, int rotationCount, boolean isHardwareBacked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.crypto.KeyAlias getAlias() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final long getLastRotated() {
        return 0L;
    }
    
    public final int getRotationCount() {
        return 0;
    }
    
    public final boolean isHardwareBacked() {
        return false;
    }
    
    /**
     * Check if key is due for rotation based on policy.
     */
    public final boolean isDueForRotation(int rotationIntervalDays) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.crypto.KeyAlias component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.crypto.KeyMetadata copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias alias, long createdAt, long lastRotated, int rotationCount, boolean isHardwareBacked) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}