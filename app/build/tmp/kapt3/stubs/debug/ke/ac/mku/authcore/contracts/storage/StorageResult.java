package ke.ac.mku.authcore.contracts.storage;

/**
 * Result wrapper for storage operations.
 * Provides detailed status for each operation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\r\u0010\u001a\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u0000\"\u0004\b\u0001\u0010\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001f0!J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006$"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageResult;", "T", "", "success", "", "data", "error", "", "integrityValid", "(ZLjava/lang/Object;Ljava/lang/String;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/String;", "getIntegrityValid", "()Z", "getSuccess", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Object;Ljava/lang/String;Z)Lke/ac/mku/authcore/contracts/storage/StorageResult;", "equals", "other", "getOrNull", "getOrThrow", "hashCode", "", "map", "R", "transform", "Lkotlin/Function1;", "toString", "Companion", "app_debug"})
public final class StorageResult<T extends java.lang.Object> {
    private final boolean success = false;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean integrityValid = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.storage.StorageResult.Companion Companion = null;
    
    public StorageResult(boolean success, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean integrityValid) {
        super();
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean getIntegrityValid() {
        return false;
    }
    
    /**
     * Map the data to a different type.
     */
    @org.jetbrains.annotations.NotNull()
    public final <R extends java.lang.Object>ke.ac.mku.authcore.contracts.storage.StorageResult<R> map(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
    
    /**
     * Get data or throw if failed.
     */
    public final T getOrThrow() {
        return null;
    }
    
    /**
     * Get data or null if failed.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getOrNull() {
        return null;
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.storage.StorageResult<T> copy(boolean success, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean integrityValid) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\b\u001a\u0002H\u00052\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lke/ac/mku/authcore/contracts/storage/StorageResult$Companion;", "", "()V", "failure", "Lke/ac/mku/authcore/contracts/storage/StorageResult;", "T", "error", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lke/ac/mku/authcore/contracts/storage/StorageResult;", "integrityFailure", "success", "integrityValid", "", "(Ljava/lang/Object;Z)Lke/ac/mku/authcore/contracts/storage/StorageResult;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a successful result.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ke.ac.mku.authcore.contracts.storage.StorageResult<T> success(T data, boolean integrityValid) {
            return null;
        }
        
        /**
         * Create a failure result.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ke.ac.mku.authcore.contracts.storage.StorageResult<T> failure(@org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        /**
         * Create an integrity failure result.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ke.ac.mku.authcore.contracts.storage.StorageResult<T> integrityFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
    }
}