package ke.ac.mku.authcore.contracts.crypto

/**
 * KeyAlias - SECURITY-002
 *
 * Well-known key aliases for platform cryptographic operations.
 */
enum class KeyAlias {
    /**
     * Session encryption key.
     */
    SESSION,

    /**
     * Cookie encryption key.
     */
    COOKIE,

    /**
     * General storage encryption key.
     */
    STORAGE,

    /**
     * Digital signature key.
     */
    SIGNATURE,

    /**
     * HMAC generation key.
     */
    HMAC
}

/**
 * Hash algorithm options.
 */
enum class HashAlgorithm {
    SHA256,
    SHA512
}

/**
 * Signature algorithm options.
 */
enum class SignatureAlgorithm {
    RSA_4096,
    EC_P256
}

/**
 * Encrypted data container with IV for authenticated encryption.
 */
data class EncryptedData(
    val ciphertext: ByteArray,
    val iv: ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as EncryptedData
        return ciphertext.contentEquals(other.ciphertext) && iv.contentEquals(other.iv)
    }

    override fun hashCode(): Int {
        var result = ciphertext.contentHashCode()
        result = 31 * result + iv.contentHashCode()
        return result
    }
}

/**
 * Metadata about a managed cryptographic key.
 */
data class KeyMetadata(
    val alias: KeyAlias,
    val createdAt: Long,
    val lastRotated: Long,
    val rotationCount: Int,
    val isHardwareBacked: Boolean
) {
    /**
     * Check if key is due for rotation based on policy.
     */
    fun isDueForRotation(rotationIntervalDays: Int): Boolean {
        val ageMs = System.currentTimeMillis() - lastRotated
        val ageDays = ageMs / (24 * 60 * 60 * 1000)
        return ageDays >= rotationIntervalDays
    }
}