package ke.ac.mku.authcore.security.cert

import android.util.Base64
import android.util.Log
import ke.ac.mku.authcore.contracts.security.CertificatePin
import ke.ac.mku.authcore.contracts.security.CertificatePin.Companion.DEFAULT_ALGORITHM
import ke.ac.mku.authcore.contracts.security.PinSet
import ke.ac.mku.authcore.contracts.security.PinValidationResult
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager
import java.security.MessageDigest
import java.security.PublicKey
import java.security.cert.X509Certificate
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CertificatePinningService - SECURITY-004
 *
 * Handles certificate pin verification for certificate pinning.
 * Implements public key pinning with SHA-256 hash comparison.
 */
@Singleton
class CertificatePinningService @Inject constructor() : ICertificatePinningManager {

    companion object {
        private const val TAG = "CertificatePinningService"
    }

    // ==================== ICertificatePinningManager ====================

    override fun verifyPin(certificate: X509Certificate, host: String): Boolean {
        // Simplified implementation using computePublicKeyHash
        val hash = computeCertificateHash(certificate) ?: return false
        val pins = getPins(host)
        
        if (pins.isEmpty()) return true // No pins configured for this host
        
        val matched = pins.contains(hash)
        if (!matched) {
            Log.w(TAG, "Pin mismatch for $host. Got: $hash")
        }
        return matched
    }

    override fun isPinningRequired(host: String): Boolean {
        return host.contains("mku.ac.ke")
    }

    override fun getPins(host: String): List<String> {
        // Mock pins for mku.ac.ke
        return if (host.contains("mku.ac.ke")) {
            listOf("C5:B2:..." /* Example hash */) 
        } else {
            emptyList()
        }
    }

    /**
     * Verify a certificate against a pin set for a host.
     *
     * @param certificate The certificate to verify
     * @param pinSet The configured pins for the host
     * @return PinValidationResult indicating success or failure
     */
    fun verifyPin(certificate: X509Certificate, pinSet: PinSet): PinValidationResult {
        if (!pinSet.isValid()) {
            return PinValidationResult.failure("Pin set is invalid or expired for ${pinSet.host}")
        }

        val publicKey = certificate.publicKey
        val publicKeyHash = computePublicKeyHash(publicKey)

        if (publicKeyHash == null) {
            return PinValidationResult.failure("Failed to compute public key hash")
        }

        Log.d(TAG, "Computed hash for ${pinSet.host}: $publicKeyHash")

        // Check primary pins first
        for (pin in pinSet.primaryPins()) {
            if (pin.publicKeyHash == publicKeyHash) {
                Log.i(TAG, "Primary pin matched for ${pinSet.host}")
                return PinValidationResult.success(pin, PinValidationResult.PinType.PRIMARY)
            }
        }

        // Check backup pins if primary didn't match
        for (pin in pinSet.backupPins()) {
            if (pin.publicKeyHash == publicKeyHash) {
                Log.w(TAG, "Backup pin matched for ${pinSet.host} - rotation may be needed")
                return PinValidationResult.success(pin, PinValidationResult.PinType.BACKUP)
            }
        }

        // No pin matched - fail closed
        val primaryPins = pinSet.primaryPins().joinToString { it.publicKeyHash.take(8) + "..." }
        Log.w(TAG, "Pin mismatch for ${pinSet.host}. Expected one of: $primaryPins, got: ${publicKeyHash.take(8)}...")

        return PinValidationResult.failure(
            "Certificate pin mismatch for ${pinSet.host}. Expected pins do not match."
        )
    }

    /**
     * Compute SHA-256 hash of a public key.
     *
     * @param publicKey The public key to hash
     * @return Base64-encoded SHA-256 hash, or null on error
     */
    fun computePublicKeyHash(publicKey: PublicKey): String? {
        return try {
            val digest = MessageDigest.getInstance(DEFAULT_ALGORITHM)
            val publicKeyBytes = publicKey.encoded
            val hashBytes = digest.digest(publicKeyBytes)
            Base64.encodeToString(hashBytes, Base64.NO_WRAP)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to compute public key hash: ${e.message}")
            null
        }
    }

    /**
     * Compute SHA-256 hash of a certificate's public key.
     *
     * @param certificate The certificate to hash
     * @return Base64-encoded SHA-256 hash, or null on error
     */
    fun computeCertificateHash(certificate: X509Certificate): String? {
        return computePublicKeyHash(certificate.publicKey)
    }

    /**
     * Compute fingerprint of a certificate (SHA-256 of entire certificate).
     *
     * @param certificate The certificate
     * @return Colon-separated hex fingerprint
     */
    fun computeCertificateFingerprint(certificate: X509Certificate): String {
        return try {
            val digest = MessageDigest.getInstance(DEFAULT_ALGORITHM)
            val certBytes = certificate.encoded
            val hashBytes = digest.digest(certBytes)
            hashBytes.joinToString(":") { "%02X".format(it) }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to compute certificate fingerprint: ${e.message}")
            "UNKNOWN"
        }
    }

    /**
     * Create a CertificatePin from a certificate.
     *
     * @param certificate The certificate
     * @param isBackup Whether this is a backup pin
     * @return CertificatePin with computed hash
     */
    fun createPinFromCertificate(certificate: X509Certificate, isBackup: Boolean = false): CertificatePin? {
        val hash = computeCertificateHash(certificate) ?: return null
        return CertificatePin(
            publicKeyHash = hash,
            algorithm = DEFAULT_ALGORITHM,
            isBackup = isBackup,
            addedAt = System.currentTimeMillis()
        )
    }

    /**
     * Validate a pin format.
     *
     * @param pin The pin to validate
     * @return true if the pin format is valid
     */
    fun isValidPinFormat(pin: CertificatePin): Boolean {
        return pin.isValid()
    }
}