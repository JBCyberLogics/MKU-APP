package ke.ac.mku.authcore.security.detection;

/**
 * ThreatDetector - SECURITY-001
 *
 * Detects security threats on the device including root, debug, emulator,
 * and hooking/tampering detection.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\b\u0007\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0002\b\u000b\u00a2\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002R\u0015\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u0092\u0002\u0002\b\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00ca\u0001\u0002\b\u001f\u00a8\u0006\u001e"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatDetector;", "", "context", "Landroid/content/Context;", "Ldagger/hilt/android/qualifiers/ApplicationContext;", "auditLogger", "Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "<init>", "(Landroid/content/Context;Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;Lke/ac/mku/authcore/bootstrap/EventBus;)V", "Ljavax/inject/Inject;", "assessThreats", "Lke/ac/mku/authcore/security/detection/ThreatAssessment;", "isDeviceCompromised", "", "getThreatLevel", "Lke/ac/mku/authcore/security/detection/ThreatLevel;", "checkRoot", "Lke/ac/mku/authcore/security/detection/Threat;", "checkDebug", "checkEmulator", "checkHooking", "checkDeveloperOptions", "checkUsbDebugging", "priority", "", "getPriority", "(Lke/ac/mku/authcore/security/detection/ThreatLevel;)I", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class ThreatDetector {
    @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.EventBus eventBus = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] ROOT_PATHS = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/system/bin/.ext/su", "/system/usr/we-need-root/su", "/system/xbin/daemonsu"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] EMULATOR_INDICATORS = {"generic", "goldfish", "ranchu", "sdk", "emulator", "simulator"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] HOOK_PATHS = {"/system/lib/libsubstrate.so", "/system/lib/libxposed.so", "/data/data/de.robv.android.xposed/shared_prefs/xposed.pb", "/data/data/com.saurik.substrate/shared_prefs/substrate.xml"};
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.security.detection.ThreatDetector.Companion Companion = null;
    
    @javax.inject.Inject()
    public ThreatDetector(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus) {
        super();
    }
    
    /**
     * Perform a full threat assessment.
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatAssessment assessThreats() {
        return null;
    }
    
    /**
     * Quick check if device is compromised at all.
     */
    public final boolean isDeviceCompromised() {
        return false;
    }
    
    /**
     * Get the current threat level.
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatLevel getThreatLevel() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkRoot() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkDebug() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkEmulator() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkHooking() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkDeveloperOptions() {
        return null;
    }
    
    private final ke.ac.mku.authcore.security.detection.Threat checkUsbDebugging() {
        return null;
    }
    
    private final int getPriority(ke.ac.mku.authcore.security.detection.ThreatLevel $this$priority) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatDetector$Companion;", "", "<init>", "()V", "ROOT_PATHS", "", "", "[Ljava/lang/String;", "EMULATOR_INDICATORS", "HOOK_PATHS", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}