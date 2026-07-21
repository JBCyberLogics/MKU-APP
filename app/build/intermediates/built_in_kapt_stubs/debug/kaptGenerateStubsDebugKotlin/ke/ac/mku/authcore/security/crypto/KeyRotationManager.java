package ke.ac.mku.authcore.security.crypto;

/**
 * KeyRotationManager - SECURITY-002
 *
 * Manages automatic and manual key rotation for all cryptographic keys.
 * Automatic rotation occurs every 90 days by default.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0003\'()B#\b\u0007\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0002\b\t\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u001eH\u0086@\u00a2\u0006\u0002\u0010\u0016J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\rJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u000e\u0010&\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0010R\u0015\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u0092\u0002\u0002\b\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b+\u00a8\u0006*"}, d2 = {"Lke/ac/mku/authcore/security/crypto/KeyRotationManager;", "", "context", "Landroid/content/Context;", "Ldagger/hilt/android/qualifiers/ApplicationContext;", "cryptoManager", "Lke/ac/mku/authcore/contracts/crypto/ICryptoManager;", "<init>", "(Landroid/content/Context;Lke/ac/mku/authcore/contracts/crypto/ICryptoManager;)V", "Ljavax/inject/Inject;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isRunning", "", "rotationConfig", "", "Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "Lke/ac/mku/authcore/security/crypto/KeyRotationManager$RotationConfig;", "start", "", "stop", "runRotationChecker", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAndRotateKeys", "rotateKey", "Lkotlin/Result;", "keyAlias", "rotateKey-gIAlu-s", "(Lke/ac/mku/authcore/contracts/crypto/KeyAlias;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateAllKeys", "", "configureRotation", "rotationDays", "", "autoRotate", "getRotationStatus", "", "Lke/ac/mku/authcore/security/crypto/KeyRotationManager$KeyRotationStatus;", "needsRotation", "Companion", "RotationConfig", "KeyRotationStatus", "app", "Ljavax/inject/Singleton;"})
public final class KeyRotationManager {
    @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "KeyRotationManager";
    private static final long ROTATION_CHECK_INTERVAL_MS = 86400000L;
    private static final long DEFAULT_ROTATION_DAYS = 90L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private boolean isRunning = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<ke.ac.mku.authcore.contracts.crypto.KeyAlias, ke.ac.mku.authcore.security.crypto.KeyRotationManager.RotationConfig> rotationConfig = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.security.crypto.KeyRotationManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public KeyRotationManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager) {
        super();
    }
    
    /**
     * Start the automatic rotation checker.
     */
    public final void start() {
    }
    
    /**
     * Stop the automatic rotation checker.
     */
    public final void stop() {
    }
    
    private final java.lang.Object runRotationChecker(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Check all keys and rotate if necessary.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkAndRotateKeys(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Manually rotate all keys.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object rotateAllKeys(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<ke.ac.mku.authcore.contracts.crypto.KeyAlias, java.lang.Boolean>> $completion) {
        return null;
    }
    
    /**
     * Configure rotation for a specific key.
     */
    public final void configureRotation(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias, long rotationDays, boolean autoRotate) {
    }
    
    /**
     * Get rotation status for all keys.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.security.crypto.KeyRotationManager.KeyRotationStatus> getRotationStatus() {
        return null;
    }
    
    /**
     * Check if a specific key needs rotation.
     */
    public final boolean needsRotation(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias) {
        return false;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/security/crypto/KeyRotationManager$Companion;", "", "<init>", "()V", "TAG", "", "ROTATION_CHECK_INTERVAL_MS", "", "DEFAULT_ROTATION_DAYS", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010&\u001a\u00020\u00052\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010(\u001a\u00020\u000bH\u00d6\u0081\u0004J\n\u0010)\u001a\u00020*H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015\u00a8\u0006+"}, d2 = {"Lke/ac/mku/authcore/security/crypto/KeyRotationManager$KeyRotationStatus;", "", "keyAlias", "Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "isValid", "", "lastRotated", "", "daysSinceRotation", "daysUntilRotation", "rotationCount", "", "isHardwareBacked", "autoRotate", "configuredRotationDays", "<init>", "(Lke/ac/mku/authcore/contracts/crypto/KeyAlias;ZJJJIZZJ)V", "getKeyAlias", "()Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "()Z", "getLastRotated", "()J", "getDaysSinceRotation", "getDaysUntilRotation", "getRotationCount", "()I", "getAutoRotate", "getConfiguredRotationDays", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app"})
    public static final class KeyRotationStatus {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias = null;
        private final boolean isValid = false;
        private final long lastRotated = 0L;
        private final long daysSinceRotation = 0L;
        private final long daysUntilRotation = 0L;
        private final int rotationCount = 0;
        private final boolean isHardwareBacked = false;
        private final boolean autoRotate = false;
        private final long configuredRotationDays = 0L;
        
        public KeyRotationStatus(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias, boolean isValid, long lastRotated, long daysSinceRotation, long daysUntilRotation, int rotationCount, boolean isHardwareBacked, boolean autoRotate, long configuredRotationDays) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.crypto.KeyAlias getKeyAlias() {
            return null;
        }
        
        public final boolean isValid() {
            return false;
        }
        
        public final long getLastRotated() {
            return 0L;
        }
        
        public final long getDaysSinceRotation() {
            return 0L;
        }
        
        public final long getDaysUntilRotation() {
            return 0L;
        }
        
        public final int getRotationCount() {
            return 0;
        }
        
        public final boolean isHardwareBacked() {
            return false;
        }
        
        public final boolean getAutoRotate() {
            return false;
        }
        
        public final long getConfiguredRotationDays() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.crypto.KeyAlias component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final long component5() {
            return 0L;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final long component9() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.security.crypto.KeyRotationManager.KeyRotationStatus copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias, boolean isValid, long lastRotated, long daysSinceRotation, long daysUntilRotation, int rotationCount, boolean isHardwareBacked, boolean autoRotate, long configuredRotationDays) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lke/ac/mku/authcore/security/crypto/KeyRotationManager$RotationConfig;", "", "keyAlias", "Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "rotationDays", "", "autoRotate", "", "lastNotifiedAt", "<init>", "(Lke/ac/mku/authcore/contracts/crypto/KeyAlias;JZJ)V", "getKeyAlias", "()Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "getRotationDays", "()J", "getAutoRotate", "()Z", "getLastNotifiedAt", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app"})
    public static final class RotationConfig {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias = null;
        private final long rotationDays = 0L;
        private final boolean autoRotate = false;
        private final long lastNotifiedAt = 0L;
        
        public RotationConfig(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias, long rotationDays, boolean autoRotate, long lastNotifiedAt) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.crypto.KeyAlias getKeyAlias() {
            return null;
        }
        
        public final long getRotationDays() {
            return 0L;
        }
        
        public final boolean getAutoRotate() {
            return false;
        }
        
        public final long getLastNotifiedAt() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.crypto.KeyAlias component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.security.crypto.KeyRotationManager.RotationConfig copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias, long rotationDays, boolean autoRotate, long lastNotifiedAt) {
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
}