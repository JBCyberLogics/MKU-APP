package ke.ac.mku.authcore.security.crypto

/**
 * SecureSession - SECURITY-001
 *
 * Represents a securely stored authentication session.
 * Contains encrypted credentials and integrity verification.
 */
data class SecureSession(
    val regNumber: String,
    val studentName: String?,
    val sessionToken: String,
    val cookies: Map<String, String>,
    val loginTimestamp: Long,
    val deviceFingerprint: String,
    val sessionHmac: String,
    val lastAccessed: Long = System.currentTimeMillis()
) {
    /**
     * Check if session has expired based on absolute timeout.
     */
    fun isExpired(absoluteTimeoutMs: Long): Boolean {
        return System.currentTimeMillis() - loginTimestamp > absoluteTimeoutMs
    }

    /**
     * Check if session has been idle too long.
     */
    fun isIdle(idleTimeoutMs: Long): Boolean {
        return System.currentTimeMillis() - lastAccessed > idleTimeoutMs
    }

    /**
     * Create a copy with updated lastAccessed timestamp.
     */
    fun touch(): SecureSession = copy(lastAccessed = System.currentTimeMillis())
}

/**
 * Encrypted data container.
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
 * Result of a security operation.
 */
sealed class SecurityResult {
    object Success : SecurityResult()
    data class Failure(val error: String) : SecurityResult()
    object DeviceCompromised : SecurityResult()
    object SessionExpired : SecurityResult()
    object SessionTampered : SecurityResult()
}