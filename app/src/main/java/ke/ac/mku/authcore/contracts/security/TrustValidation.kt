package ke.ac.mku.authcore.contracts.security

import java.security.cert.X509Certificate

/**
 * TrustStatus - SECURITY-004
 *
 * Enumeration of possible trust validation statuses.
 */
enum class TrustStatus {
    /** Certificate is trusted and valid */
    TRUSTED,

    /** Certificate is not trusted */
    UNTRUSTED,

    /** Certificate pin does not match expected pins */
    PIN_MISMATCH,

    /** Certificate has expired */
    EXPIRED,

    /** Certificate is not yet valid */
    NOT_YET_VALID,

    /** Hostname does not match certificate */
    HOSTNAME_MISMATCH,

    /** Certificate chain is invalid */
    CHAIN_INVALID,

    /** Self-signed certificate rejected */
    SELF_SIGNED_REJECTED,

    /** TLS version not supported */
    TLS_VERSION_INVALID,

    /** An error occurred during validation */
    ERROR
}

/**
 * ValidationResult - SECURITY-004
 *
 * Result of certificate trust validation.
 */
data class ValidationResult(
    val status: TrustStatus,
    val host: String,
    val message: String?,
    val certificateFingerprint: String?,
    val validatedAt: Long = System.currentTimeMillis()
) {
    val isTrusted: Boolean
        get() = status == TrustStatus.TRUSTED

    companion object {
        fun trusted(host: String, fingerprint: String, message: String? = null): ValidationResult {
            return ValidationResult(
                status = TrustStatus.TRUSTED,
                host = host,
                message = message,
                certificateFingerprint = fingerprint
            )
        }

        fun untrusted(host: String, status: TrustStatus, message: String?, fingerprint: String? = null): ValidationResult {
            return ValidationResult(
                status = status,
                host = host,
                message = message,
                certificateFingerprint = fingerprint
            )
        }
    }
}

/**
 * CertificateInfo - SECURITY-004
 *
 * Extracted information from an X509Certificate.
 */
data class CertificateInfo(
    val subject: String,
    val issuer: String,
    val validFrom: Long,
    val validUntil: Long,
    val serialNumber: String,
    val fingerprint: String,
    val publicKeyAlgorithm: String,
    val keySize: Int,
    val isSelfSigned: Boolean,
    val signatureAlgorithm: String,
    val subjectAlternativeNames: List<String> = emptyList()
) {
    /**
     * Check if the certificate is currently valid (not expired and not yet valid).
     */
    fun isCurrentlyValid(): Boolean {
        val now = System.currentTimeMillis()
        return now >= validFrom && now <= validUntil
    }

    /**
     * Check if the certificate expires within the specified days.
     */
    fun expiresWithin(days: Int): Boolean {
        val threshold = System.currentTimeMillis() + (days * 24 * 60 * 60 * 1000L)
        return validUntil in (System.currentTimeMillis() + 1)..threshold
    }

    /**
     * Get days until expiration.
     */
    fun daysUntilExpiration(): Int {
        val now = System.currentTimeMillis()
        return if (validUntil > now) {
            ((validUntil - now) / (24 * 60 * 60 * 1000L)).toInt()
        } else {
            0
        }
    }

    companion object {
        /**
         * Extract CertificateInfo from an X509Certificate.
         */
        fun fromCertificate(certificate: X509Certificate, fingerprint: String): CertificateInfo {
            val subject = certificate.subjectX500Principal.name
            val issuer = certificate.issuerX500Principal.name
            val isSelfSigned = subject == issuer

            return CertificateInfo(
                subject = subject,
                issuer = issuer,
                validFrom = certificate.notBefore.time,
                validUntil = certificate.notAfter.time,
                serialNumber = certificate.serialNumber.toString(16),
                fingerprint = fingerprint,
                publicKeyAlgorithm = certificate.publicKey.algorithm,
                keySize = extractKeySize(certificate),
                isSelfSigned = isSelfSigned,
                signatureAlgorithm = certificate.sigAlgName
            )
        }

        private fun extractKeySize(certificate: X509Certificate): Int {
            return try {
                val publicKey = certificate.publicKey
                when (publicKey.algorithm) {
                    "RSA" -> {
                        val keyFactory = java.security.KeyFactory.getInstance("RSA")
                        val keySpec = keyFactory.getKeySpec(publicKey, java.security.spec.RSAPublicKeySpec::class.java)
                        keySpec.modulus.bitLength()
                    }
                    "EC" -> {
                        val keyFactory = java.security.KeyFactory.getInstance("EC")
                        val keySpec = keyFactory.getKeySpec(publicKey, java.security.spec.ECPublicKeySpec::class.java)
                        keySpec.params.order.bitLength()
                    }
                    else -> 0
                }
            } catch (e: Exception) {
                0
            }
        }
    }
}

/**
 * TrustMetrics - SECURITY-004
 *
 * Trust validation metrics for monitoring.
 */
data class TrustMetrics(
    val totalValidations: Int = 0,
    val successfulValidations: Int = 0,
    val failedValidations: Int = 0,
    val pinMismatches: Int = 0,
    val hostnameMismatches: Int = 0,
    val expiredCertificates: Int = 0,
    val lastValidationTime: Long = 0,
    val lastFailedHost: String? = null,
    val lastFailureReason: String? = null
) {
    val successRate: Float
        get() = if (totalValidations > 0) successfulValidations.toFloat() / totalValidations else 0f

    val isHealthy: Boolean
        get() = failedValidations < 10 && pinMismatches < 5
}