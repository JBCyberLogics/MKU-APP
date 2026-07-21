package ke.ac.mku.authcore.contracts.crypto

/**
 * ICryptoManager - SECURITY-002 / CORE-012
 *
 * Central cryptographic service contract.
 * All cryptographic operations must go through this interface.
 */
interface ICryptoManager {

    // ==================== ENCRYPTION ====================

    /**
     * Encrypt plaintext using AES-256-GCM with hardware-backed key.
     */
    fun encrypt(plaintext: ByteArray, keyAlias: KeyAlias): EncryptedData

    /**
     * Decrypt ciphertext using AES-256-GCM with hardware-backed key.
     */
    fun decrypt(encrypted: EncryptedData, keyAlias: KeyAlias): ByteArray

    /**
     * Encrypt a string and return Base64-encoded result.
     */
    fun encryptString(plaintext: String, keyAlias: KeyAlias = KeyAlias.SESSION): String

    /**
     * Decrypt a Base64-encoded string.
     */
    fun decryptString(encoded: String, keyAlias: KeyAlias = KeyAlias.SESSION): String

    // ==================== HASHING ====================

    /**
     * Generate a secure hash of the input data.
     */
    fun hash(data: String, algorithm: HashAlgorithm = HashAlgorithm.SHA256): String

    /**
     * Verify a hash matches the input data.
     */
    fun verifyHash(data: String, hash: String, algorithm: HashAlgorithm = HashAlgorithm.SHA256): Boolean

    // ==================== HMAC ====================

    /**
     * Generate HMAC for data integrity verification.
     */
    fun generateHmac(data: ByteArray, keyAlias: KeyAlias = KeyAlias.HMAC): ByteArray

    /**
     * Generate HMAC for a string.
     */
    fun generateStringHmac(data: String, keyAlias: KeyAlias = KeyAlias.HMAC): String

    /**
     * Verify HMAC matches expected value.
     */
    fun verifyHmac(data: ByteArray, expectedHmac: ByteArray, keyAlias: KeyAlias = KeyAlias.HMAC): Boolean

    /**
     * Verify string HMAC.
     */
    fun verifyStringHmac(data: String, expectedHmac: String, keyAlias: KeyAlias = KeyAlias.HMAC): Boolean

    // ==================== SIGNATURES ====================

    /**
     * Digitally sign data using RSA-4096.
     */
    fun sign(data: ByteArray, keyAlias: KeyAlias = KeyAlias.SIGNATURE): ByteArray

    /**
     * Verify digital signature.
     */
    fun verifySignature(data: ByteArray, signature: ByteArray, keyAlias: KeyAlias = KeyAlias.SIGNATURE): Boolean

    // ==================== RANDOM ====================

    /**
     * Generate cryptographically secure random bytes.
     */
    fun generateSecureRandom(length: Int): ByteArray

    // ==================== KEY MANAGEMENT ====================

    /**
     * Rotate a key - generates new key and updates alias.
     */
    fun rotateKey(keyAlias: KeyAlias): Boolean

    /**
     * Check if a key is valid and usable.
     */
    fun isKeyValid(keyAlias: KeyAlias): Boolean

    /**
     * Get metadata for a specific key.
     */
    fun getKeyMetadata(keyAlias: KeyAlias): KeyMetadata?

    /**
     * Get metadata for all managed keys.
     */
    fun getAllKeyMetadata(): List<KeyMetadata>

    /**
     * Check if a key is hardware-backed.
     */
    fun isHardwareBacked(keyAlias: KeyAlias): Boolean

    // ==================== ENCODING ====================

    /**
     * Encode EncryptedData to Base64 string for storage.
     */
    fun encodeEncryptedData(encrypted: EncryptedData): String

    /**
     * Decode Base64 string to EncryptedData.
     */
    fun decodeEncryptedData(encoded: String): EncryptedData
}