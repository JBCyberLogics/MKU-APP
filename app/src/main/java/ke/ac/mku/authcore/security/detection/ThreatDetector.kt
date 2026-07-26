package ke.ac.mku.authcore.security.detection

import android.content.Context
import android.content.pm.ApplicationInfo
import android.os.Build
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.audit.SecurityEvent
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ThreatDetector - SECURITY-001
 *
 * Detects security threats on the device including root, debug, emulator,
 * and hooking/tampering detection.
 */
@Singleton
class ThreatDetector @Inject constructor(
    @ApplicationContext private val context: Context,
    private val auditLogger: SecurityAuditLogger,
    private val eventBus: EventBus
) {
    companion object {
        // Root detection paths
        private val ROOT_PATHS = arrayOf(
            "/system/app/Superuser.apk",
            "/sbin/su",
            "/system/bin/su",
            "/system/xbin/su",
            "/data/local/xbin/su",
            "/data/local/bin/su",
            "/system/sd/xbin/su",
            "/system/bin/failsafe/su",
            "/data/local/su",
            "/su/bin/su",
            "/system/bin/.ext/su",
            "/system/usr/we-need-root/su",
            "/system/xbin/daemonsu"
        )

        // Emulator indicators
        private val EMULATOR_INDICATORS = arrayOf(
            "generic",
            "goldfish",
            "ranchu",
            "sdk",
            "emulator",
            "simulator"
        )

        // Hooking framework paths
        private val HOOK_PATHS = arrayOf(
            "/system/lib/libsubstrate.so",
            "/system/lib/libxposed.so",
            "/data/data/de.robv.android.xposed/shared_prefs/xposed.pb",
            "/data/data/com.saurik.substrate/shared_prefs/substrate.xml"
        )
    }

    init {
        eventBus.publish(BootstrapEvent.ThreatDetectorReady)
    }

    /**
     * Perform a full threat assessment.
     */
    fun assessThreats(): ThreatAssessment {
        val threats = mutableListOf<Threat>()
        var highestLevel = ThreatLevel.LOW

        // Check for root
        checkRoot().let { threat ->
            if (threat != null) {
                threats.add(threat)
                if (threat.level.priority > highestLevel.priority) {
                    highestLevel = threat.level
                }
            }
        }

        // Check for debug
        checkDebug().let { threat ->
            if (threat != null) {
                threats.add(threat)
                if (threat.level.priority > highestLevel.priority) {
                    highestLevel = threat.level
                }
            }
        }

        // Check for emulator
        checkEmulator().let { threat ->
            if (threat != null) {
                threats.add(threat)
                if (threat.level.priority > highestLevel.priority) {
                    highestLevel = threat.level
                }
            }
        }

        // Check for hooking frameworks
        checkHooking().let { threat ->
            if (threat != null) {
                threats.add(threat)
                if (threat.level.priority > highestLevel.priority) {
                    highestLevel = threat.level
                }
            }
        }

        // Check for developer options
        checkDeveloperOptions().let { threat ->
            if (threat != null) {
                threats.add(threat)
            }
        }

        // Check for USB debugging
        checkUsbDebugging().let { threat ->
            if (threat != null) {
                threats.add(threat)
            }
        }

        val isCompromised = highestLevel >= ThreatLevel.HIGH

        // Log threats
        threats.forEach { threat ->
            auditLogger.logSecurityEvent(
                SecurityEvent.ThreatDetected(threat.type, threat.level.name, threat.description)
            )
        }

        return ThreatAssessment(
            level = highestLevel,
            threats = threats,
            isDeviceCompromised = isCompromised
        )
    }

    /**
     * Quick check if device is compromised at all.
     */
    fun isDeviceCompromised(): Boolean {
        return assessThreats().isDeviceCompromised
    }

    /**
     * Get the current threat level.
     */
    fun getThreatLevel(): ThreatLevel {
        return assessThreats().level
    }

    private fun checkRoot(): Threat? {
        val found = ROOT_PATHS.any { File(it).exists() }
        return if (found) {
            Threat(
                type = ThreatType.ROOT_DETECTION,
                level = ThreatLevel.HIGH,
                description = "Root binary detected on device"
            )
        } else null
    }

    private fun checkDebug(): Threat? {
        val isDebuggable = (context.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0
        return if (isDebuggable) {
            Threat(
                type = ThreatType.DEBUG_DETECTION,
                level = ThreatLevel.HIGH,
                description = "Application is running in debug mode"
            )
        } else null
    }

    private fun checkEmulator(): Threat? {
        val isEmulator = EMULATOR_INDICATORS.any { indicator ->
            Build.FINGERPRINT.contains(indicator, ignoreCase = true) ||
            Build.MODEL.contains(indicator, ignoreCase = true) ||
            Build.MANUFACTURER.contains(indicator, ignoreCase = true) ||
            Build.BRAND.contains(indicator, ignoreCase = true)
        }

        return if (isEmulator) {
            Threat(
                type = ThreatType.EMULATOR_DETECTION,
                level = ThreatLevel.MEDIUM,
                description = "Device appears to be an emulator: ${Build.MODEL}"
            )
        } else null
    }

    private fun checkHooking(): Threat? {
        val hasHooks = HOOK_PATHS.any { File(it).exists() }
        return if (hasHooks) {
            Threat(
                type = ThreatType.HOOKING_DETECTION,
                level = ThreatLevel.CRITICAL,
                description = "Hooking framework detected (Substrate/Xposed)"
            )
        } else null
    }

    private fun checkDeveloperOptions(): Threat? {
        val developerEnabled = android.provider.Settings.Secure.getInt(
            context.contentResolver,
            android.provider.Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED,
            0
        ) == 1

        return if (developerEnabled) {
            Threat(
                type = ThreatType.DEVELOPER_OPTIONS,
                level = ThreatLevel.MEDIUM,
                description = "Developer options enabled on device"
            )
        } else null
    }

    private fun checkUsbDebugging(): Threat? {
        val usbDebugging = android.provider.Settings.Secure.getInt(
            context.contentResolver,
            android.provider.Settings.Secure.ADB_ENABLED,
            0
        ) == 1

        return if (usbDebugging) {
            Threat(
                type = ThreatType.USB_DEBUGGING,
                level = ThreatLevel.MEDIUM,
                description = "USB debugging enabled on device"
            )
        } else null
    }

    /**
     * Extension property to compare threat levels by severity.
     */
    private val ThreatLevel.priority: Int
        get() = when (this) {
            ThreatLevel.CRITICAL -> 4
            ThreatLevel.HIGH -> 3
            ThreatLevel.MEDIUM -> 2
            ThreatLevel.LOW -> 1
        }
}