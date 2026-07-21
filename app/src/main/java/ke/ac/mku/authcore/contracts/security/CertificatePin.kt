package ke.ac.mku.authcore.contracts.security

/**
 * CertificatePin - SECURITY-004
 *
 * Represents a certificate public key pin for certificate pinning.
 * Pins are SHA-256 hashes of certificate public keys.
 */
data class CertificatePin(
    val publicKeyHash: String,
    val algorithm: String = "SHA-256",
    val isBackup: Boolean = false,
    val addedAt: Long = System.currentTimeMillis()
) {
    companion object {
        const val DEFAULT_ALGORITHM = "SHA-256"
    }

    /**
     * Validate the pin format (Base64-encoded SHA-256 = 44 chars).
     */
    fun isValid(): Boolean {
        return publicKeyHash.isNotBlank() &&
                publicKeyHash.length == 44 &&
                algorithm.equals("SHA-256", ignoreCase = true)
    }
}

/**
 * PinSet - SECURITY-004
 *
 * Collection of certificate pins for a specific host.
 */
data class PinSet(
    val host: String,
    val pins: List<CertificatePin>,
    val validFrom: Long,
    val validUntil: Long,
    val enforcePinning: Boolean = true
) {
    /**
     * Check if the pin set has expired.
     */
    fun isExpired(): Boolean = System.currentTimeMillis() > validUntil

    /**
     * Check if the pin set is currently valid.
     */
    fun isValid(): Boolean = !isExpired() && pins.isNotEmpty() && pins.any { it.isValid() }

    /**
     * Get primary (non-backup) pins.
     */
    fun primaryPins(): List<CertificatePin> = pins.filter { !it.isBackup }

    /**
     * Get backup pins for rotation.
     */
    fun backupPins(): List<CertificatePin> = pins.filter { it.isBackup }

    /**
     * Get all valid pins (non-expired and with valid format).
     */
    fun validPins(): List<CertificatePin> = pins.filter { it.isValid() }

    companion object {
        /**
         * Create a PinSet for a host with default validity (1 year).
         */
        fun create(host: String, pins: List<CertificatePin>, validityDays: Long = 365): PinSet {
            val now = System.currentTimeMillis()
            return PinSet(
                host = host,
                pins = pins,
                validFrom = now,
                validUntil = now + (validityDays * 24 * 60 * 60 * 1000L)
            )
        }
    }
}

/**
 * PinValidationResult - SECURITY-004
 *
 * Result of certificate pin validation.
 */
data class PinValidationResult(
    val isValid: Boolean,
    val matchedPin: CertificatePin?,
    val matchedPinType: PinType,
    val error: String?
) {
    enum class PinType {
        PRIMARY,
        BACKUP,
        NONE
    }

    companion object {
        fun success(matchedPin: CertificatePin, type: PinType): PinValidationResult {
            return PinValidationResult(
                isValid = true,
                matchedPin = matchedPin,
                matchedPinType = type,
                error = null
            )
        }

        fun failure(error: String): PinValidationResult {
            return PinValidationResult(
                isValid = false,
                matchedPin = null,
                matchedPinType = PinType.NONE,
                error = error
            )
        }
    }
}