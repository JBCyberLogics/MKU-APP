package ke.ac.mku.authcore.session.validation

import android.util.Log
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.session.SessionValidationResult
import ke.ac.mku.authcore.contracts.session.SessionValidationError
import ke.ac.mku.authcore.domain.model.Session
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SessionIntegrityChecker - SESSION-002
 *
 * Verifies session integrity using cryptographic methods.
 * Checks HMAC signatures and detects tampering.
 */
@Singleton
class SessionIntegrityChecker @Inject constructor(
    private val cryptoManager: ICryptoManager
) {

    companion object {
        private const val TAG = "SessionIntegrityChecker"
    }

    /**
     * Verify the integrity of a session by checking its HMAC.
     *
     * @param session The session to verify
     * @param storedHmac The stored HMAC to compare against
     * @return SessionValidationResult indicating verification outcome
     */
    fun verifySessionIntegrity(session: Session, storedHmac: String?): SessionValidationResult {
        val now = System.currentTimeMillis()

        if (storedHmac == null) {
            Log.w(TAG, "No HMAC found for session ${session.sessionId}")
            return SessionValidationResult.Tampered(
                sessionId = session.sessionId,
                reason = "No HMAC signature found for session",
                validationTime = now
            )
        }

        // Generate expected HMAC
        val expectedHmac = generateSessionHmac(session)

        // Compare HMACs
        if (!cryptoManager.verifyStringHmac(
                buildHmacData(session),
                storedHmac,
                KeyAlias.HMAC
            )
        ) {
            Log.w(TAG, "HMAC verification failed for session ${session.sessionId}")
            return SessionValidationResult.Tampered(
                sessionId = session.sessionId,
                reason = "HMAC signature verification failed - session data may have been tampered",
                validationTime = now
            )
        }

        Log.d(TAG, "Session ${session.sessionId} integrity verified")
        return SessionValidationResult.Valid(
            session = session,
            validationTime = now,
            warnings = emptyList()
        )
    }

    /**
     * Generate HMAC for session data.
     * Format: sessionId|regNumber|loginTimestamp|expiryTimestamp
     */
    fun generateSessionHmac(session: Session): String {
        val data = buildHmacData(session)
        return cryptoManager.generateStringHmac(data, KeyAlias.HMAC)
    }

    /**
     * Build the data string used for HMAC generation.
     */
    private fun buildHmacData(session: Session): String {
        return "${session.sessionId}|${session.user.registrationNumber}|${session.loginTimestamp}|${session.expiryTimestamp}"
    }

    /**
     * Check if session data appears corrupted (unreadable).
     */
    fun isSessionCorrupted(session: Session): Boolean {
        return try {
            // Basic sanity checks
            session.sessionId.isEmpty() ||
            session.user.registrationNumber.isEmpty() ||
            session.loginTimestamp <= 0 ||
            session.expiryTimestamp <= 0 ||
            session.expiryTimestamp < session.loginTimestamp
        } catch (e: Exception) {
            Log.e(TAG, "Error checking session corruption: ${e.message}")
            true
        }
    }

    /**
     * Verify session signature (if signature is stored separately).
     */
    fun verifySessionSignature(session: Session, storedSignature: String?): Boolean {
        if (storedSignature == null) return true // No signature to verify

        return try {
            val dataToSign = buildHmacData(session)
            val dataBytes = dataToSign.toByteArray(Charsets.UTF_8)
            cryptoManager.verifySignature(dataBytes, storedSignature.toByteArray(), KeyAlias.SIGNATURE)
        } catch (e: Exception) {
            Log.e(TAG, "Signature verification error: ${e.message}")
            false
        }
    }
}