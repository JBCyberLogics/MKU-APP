package ke.ac.mku.authcore.contracts.security

/**
 * ThreatCategory - SECURITY-005
 *
 * Enumeration of security threat categories that can be detected.
 */
enum class ThreatCategory(
    val displayName: String,
    val defaultRiskLevel: RiskLevel
) {
    ROOTED_DEVICE("Rooted Device Detected", RiskLevel.HIGH),
    EMULATOR("Emulator Environment Detected", RiskLevel.MEDIUM),
    DEBUGGER_ATTACHED("Debugger Attached", RiskLevel.MEDIUM),
    HOOK_FRAMEWORK("Hook Framework Detected", RiskLevel.HIGH),
    APP_TAMPERING("Application Tampering Detected", RiskLevel.CRITICAL),
    SIGNATURE_MISMATCH("Application Signature Mismatch", RiskLevel.CRITICAL),
    CERTIFICATE_BYPASS("Certificate Validation Bypass", RiskLevel.CRITICAL),
    RUNTIME_INJECTION("Runtime Code Injection", RiskLevel.CRITICAL),
    MEMORY_MODIFICATION("Memory Modification Detected", RiskLevel.HIGH),
    UNKNOWN("Unknown Threat", RiskLevel.LOW);

    companion object {
        /**
         * Get threat category by name (case-insensitive).
         */
        fun fromName(name: String): ThreatCategory? {
            return entries.find { it.name.equals(name, ignoreCase = true) }
        }
    }
}