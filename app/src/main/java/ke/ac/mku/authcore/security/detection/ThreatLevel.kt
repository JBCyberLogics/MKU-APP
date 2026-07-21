package ke.ac.mku.authcore.security.detection

/**
 * ThreatLevel - SECURITY-001
 *
 * Risk classification for security threats detected on the device.
 * Determines the action taken by the security system.
 */
enum class ThreatLevel {
    /**
     * Critical threats that indicate active attack or severe compromise.
     * Examples: Application tampering, hooking frameworks, certificate bypass.
     * Action: BLOCK_LOGIN
     */
    CRITICAL,

    /**
     * High-risk threats indicating significant security concerns.
     * Examples: Rooted device, unlocked bootloader.
     * Action: ALLOW_WITH_WARNING_AND_AUDIT
     */
    HIGH,

    /**
     * Medium-risk findings that may indicate development environment.
     * Examples: Developer options enabled, USB debugging, emulator detected.
     * Action: ALLOW_WITH_WARNING
     */
    MEDIUM,

    /**
     * Low-risk findings that are informational only.
     * Examples: Minor configuration anomalies.
     * Action: LOG_ONLY
     */
    LOW
}

/**
 * Result of a threat assessment.
 */
data class ThreatAssessment(
    val level: ThreatLevel,
    val threats: List<Threat>,
    val isDeviceCompromised: Boolean,
    val timestamp: Long = System.currentTimeMillis()
) {
    companion object {
        fun safe() = ThreatAssessment(
            level = ThreatLevel.LOW,
            threats = emptyList(),
            isDeviceCompromised = false
        )
    }
}

/**
 * Individual threat detected.
 */
data class Threat(
    val type: ThreatType,
    val level: ThreatLevel,
    val description: String,
    val detectedAt: Long = System.currentTimeMillis()
)

/**
 * Types of threats that can be detected.
 */
enum class ThreatType {
    ROOT_DETECTION,
    DEBUG_DETECTION,
    EMULATOR_DETECTION,
    HOOKING_DETECTION,
    TAMPERING_DETECTION,
    UNKNOWN_SOURCES,
    DEVELOPER_OPTIONS,
    USB_DEBUGGING,
    CERTIFICATE_BYPASS,
    RUNTIME_INJECTION,
    DEVICE_SPECIFICATION
}