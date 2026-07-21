package ke.ac.mku.authcore.security.audit

import ke.ac.mku.authcore.security.detection.ThreatType

/**
 * SecurityEvent - SECURITY-001
 *
 * Events logged by the security system for auditing purposes.
 */
sealed class SecurityEvent {
    abstract val timestamp: Long
    abstract val source: String

    // Session Events
    data class SessionCreated(
        val regNumber: String,
        val deviceFingerprint: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureSessionManager"
    ) : SecurityEvent()

    data class SessionAccessed(
        val regNumber: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureSessionManager"
    ) : SecurityEvent()

    data class SessionDestroyed(
        val regNumber: String,
        val reason: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureSessionManager"
    ) : SecurityEvent()

    data class SessionValidationFailed(
        val regNumber: String,
        val reason: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureSessionManager"
    ) : SecurityEvent()

    // Threat Events
    data class ThreatDetected(
        val threatType: ThreatType,
        val threatLevel: String,
        val description: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "ThreatDetector"
    ) : SecurityEvent()

    data class ThreatBlocked(
        val threatType: ThreatType,
        val action: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "ThreatDetector"
    ) : SecurityEvent()

    // Device Events
    data class DeviceBindingChanged(
        val regNumber: String,
        val oldFingerprint: String,
        val newFingerprint: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureSessionManager"
    ) : SecurityEvent()

    // Cryptography Events
    data class EncryptionFailed(
        val reason: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "CryptoManager"
    ) : SecurityEvent()

    data class DecryptionFailed(
        val reason: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "CryptoManager"
    ) : SecurityEvent()

    data class KeyGenerated(
        val keyAlias: String,
        val algorithm: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "CryptoManager"
    ) : SecurityEvent()

    // Security Policy Events
    data class PolicyViolation(
        val policy: String,
        val details: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecurityPolicy"
    ) : SecurityEvent()

    // Generic Events
    data class SecurityError(
        val error: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecuritySystem"
    ) : SecurityEvent()

    data class SecurityWarning(
        val warning: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecuritySystem"
    ) : SecurityEvent()

    // SECURITY-003: Storage Events
    data class DataStored(
        val domain: String,
        val key: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureStorageManager"
    ) : SecurityEvent()

    data class DataDeleted(
        val domain: String,
        val key: String,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureStorageManager"
    ) : SecurityEvent()

    data class StorageCleared(
        val domain: String,
        val count: Int,
        override val timestamp: Long = System.currentTimeMillis(),
        override val source: String = "SecureStorageManager"
    ) : SecurityEvent()
}