package ke.ac.mku.authcore.contracts.crypto;

/**
 * ICryptoManager - SECURITY-002 / CORE-012
 *
 * Central cryptographic service contract.
 * All cryptographic operations must go through this interface.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010!\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\"\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001cH&J\"\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\"\u0010%\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\"\u0010\'\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&\u00a8\u0006("}, d2 = {"Lke/ac/mku/authcore/contracts/crypto/ICryptoManager;", "", "decodeEncryptedData", "Lke/ac/mku/authcore/contracts/crypto/EncryptedData;", "encoded", "", "decrypt", "", "encrypted", "keyAlias", "Lke/ac/mku/authcore/contracts/crypto/KeyAlias;", "decryptString", "encodeEncryptedData", "encrypt", "plaintext", "encryptString", "generateHmac", "data", "generateSecureRandom", "length", "", "generateStringHmac", "getAllKeyMetadata", "", "Lke/ac/mku/authcore/contracts/crypto/KeyMetadata;", "getKeyMetadata", "hash", "algorithm", "Lke/ac/mku/authcore/contracts/crypto/HashAlgorithm;", "isHardwareBacked", "", "isKeyValid", "rotateKey", "sign", "verifyHash", "verifyHmac", "expectedHmac", "verifySignature", "signature", "verifyStringHmac", "app_debug"})
public abstract interface ICryptoManager {
    
    /**
     * Encrypt plaintext using AES-256-GCM with hardware-backed key.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.crypto.EncryptedData encrypt(@org.jetbrains.annotations.NotNull()
    byte[] plaintext, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Decrypt ciphertext using AES-256-GCM with hardware-backed key.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] decrypt(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.EncryptedData encrypted, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Encrypt a string and return Base64-encoded result.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String plaintext, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Decrypt a Base64-encoded string.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String decryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Generate a secure hash of the input data.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String hash(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.HashAlgorithm algorithm);
    
    /**
     * Verify a hash matches the input data.
     */
    public abstract boolean verifyHash(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String hash, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.HashAlgorithm algorithm);
    
    /**
     * Generate HMAC for data integrity verification.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] generateHmac(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Generate HMAC for a string.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateStringHmac(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Verify HMAC matches expected value.
     */
    public abstract boolean verifyHmac(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] expectedHmac, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Verify string HMAC.
     */
    public abstract boolean verifyStringHmac(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String expectedHmac, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Digitally sign data using RSA-4096.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] sign(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Verify digital signature.
     */
    public abstract boolean verifySignature(@org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    byte[] signature, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Generate cryptographically secure random bytes.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] generateSecureRandom(int length);
    
    /**
     * Rotate a key - generates new key and updates alias.
     */
    public abstract boolean rotateKey(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Check if a key is valid and usable.
     */
    public abstract boolean isKeyValid(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Get metadata for a specific key.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.contracts.crypto.KeyMetadata getKeyMetadata(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Get metadata for all managed keys.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.crypto.KeyMetadata> getAllKeyMetadata();
    
    /**
     * Check if a key is hardware-backed.
     */
    public abstract boolean isHardwareBacked(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.KeyAlias keyAlias);
    
    /**
     * Encode EncryptedData to Base64 string for storage.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encodeEncryptedData(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.EncryptedData encrypted);
    
    /**
     * Decode Base64 string to EncryptedData.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.crypto.EncryptedData decodeEncryptedData(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded);
    
    /**
     * ICryptoManager - SECURITY-002 / CORE-012
     *
     * Central cryptographic service contract.
     * All cryptographic operations must go through this interface.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}