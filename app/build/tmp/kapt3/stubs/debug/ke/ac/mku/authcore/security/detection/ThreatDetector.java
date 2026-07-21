package ke.ac.mku.authcore.security.detection;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dagger.hilt.android.qualifiers.ApplicationContext;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;
import ke.ac.mku.authcore.security.audit.SecurityEvent;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * ThreatDetector - SECURITY-001
 *
 * Detects security threats on the device including root, debug, emulator,
 * and hooking/tampering detection.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatDetector;", "", "context", "Landroid/content/Context;", "auditLogger", "Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;", "(Landroid/content/Context;Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;)V", "priority", "", "Lke/ac/mku/authcore/security/detection/ThreatLevel;", "getPriority", "(Lke/ac/mku/authcore/security/detection/ThreatLevel;)I", "assessThreats", "Lke/ac/mku/authcore/security/detection/ThreatAssessment;", "checkDebug", "Lke/ac/mku/authcore/security/detection/Threat;", "checkDeveloperOptions", "checkEmulator", "checkHooking", "checkRoot", "checkUsbDebugging", "getThreatLevel", "isDeviceCompromised", "", "Companion", "app_debug"})
public final class ThreatDetector {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger = null;
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
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatDetector$Companion;", "", "()V", "EMULATOR_INDICATORS", "", "", "[Ljava/lang/String;", "HOOK_PATHS", "ROOT_PATHS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}