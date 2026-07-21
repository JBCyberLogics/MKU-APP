package ke.ac.mku.authcore.security.storage

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.security.crypto.SecureSession
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.audit.SecurityEvent
import javax.inject.Inject
import javax.inject.Singleton

/**
 * EncryptedSessionStore - SECURITY-002
 *
 * Securely stores authentication sessions using hardware-backed encryption.
 * Upgrades the basic SessionManager with encryption and integrity verification.
 */
@Singleton
class EncryptedSessionStore @Inject constructor(
    @ApplicationContext private val context: Context,
    private val cryptoManager: ICryptoManager,
    private val auditLogger: SecurityAuditLogger
) {
    companion object {
        private const val PREFS_NAME = "mku_secure_session_v2"
        private const val KEY_REG_NUMBER = "reg_number"
        private const val KEY_STUDENT_NAME = "student_name"
        private const val KEY_SESSION_TOKEN = "session_token"
        private const val KEY_COOKIES = "session_cookies"
        private const val KEY_LOGIN_TIMESTAMP = "login_timestamp"
        private const val KEY_DEVICE_FINGERPRINT = "device_fingerprint"
        private const val KEY_SESSION_HMAC = "session_hmac"
        private const val KEY_LAST_ACCESSED = "last_accessed"
    }

    private val masterKey: MasterKey by lazy {
        MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()
    }

    private val sharedPreferences: SharedPreferences by lazy {
        EncryptedSharedPreferences.create(
            context,
            PREFS_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    /**
     * Save a secure session.
     */
    fun saveSession(session: SecureSession) {
        try {
            // Encrypt sensitive data
            val encryptedToken = cryptoManager.encryptString(session.sessionToken, KeyAlias.SESSION)
            val encryptedCookies = cryptoManager.encryptString(serializeCookies(session.cookies), KeyAlias.COOKIE)

            // Generate session integrity HMAC
            val hmacData = "${session.regNumber}|${session.loginTimestamp}|${session.deviceFingerprint}"
            val sessionHmac = cryptoManager.generateStringHmac(hmacData, KeyAlias.HMAC)

            sharedPreferences.edit().apply {
                putString(KEY_REG_NUMBER, session.regNumber)
                putString(KEY_STUDENT_NAME, session.studentName)
                putString(KEY_SESSION_TOKEN, encryptedToken)
                putString(KEY_COOKIES, encryptedCookies)
                putLong(KEY_LOGIN_TIMESTAMP, session.loginTimestamp)
                putString(KEY_DEVICE_FINGERPRINT, session.deviceFingerprint)
                putString(KEY_SESSION_HMAC, sessionHmac)
                putLong(KEY_LAST_ACCESSED, session.lastAccessed)
                apply()
            }

            auditLogger.logSecurityEvent(
                SecurityEvent.SessionCreated(session.regNumber, session.deviceFingerprint)
            )
        } catch (e: Exception) {
            auditLogger.logSecurityEvent(
                SecurityEvent.SecurityError("Session save failed: ${e.message}")
            )
            throw SecurityException("Failed to save session", e)
        }
    }

    /**
     * Retrieve a secure session.
     */
    fun getSession(): SecureSession? {
        val regNumber = sharedPreferences.getString(KEY_REG_NUMBER, null) ?: return null
        val loginTimestamp = sharedPreferences.getLong(KEY_LOGIN_TIMESTAMP, 0L)
        if (loginTimestamp == 0L) return null

        return try {
            // Decrypt sensitive data
            val encryptedToken = sharedPreferences.getString(KEY_SESSION_TOKEN, null) ?: return null
            val encryptedCookies = sharedPreferences.getString(KEY_COOKIES, null) ?: return null

            val sessionToken = cryptoManager.decryptString(encryptedToken, KeyAlias.SESSION)
            val cookies = deserializeCookies(cryptoManager.decryptString(encryptedCookies, KeyAlias.COOKIE))
            val deviceFingerprint = sharedPreferences.getString(KEY_DEVICE_FINGERPRINT, "") ?: ""
            val lastAccessed = sharedPreferences.getLong(KEY_LAST_ACCESSED, System.currentTimeMillis())

            SecureSession(
                regNumber = regNumber,
                studentName = sharedPreferences.getString(KEY_STUDENT_NAME, null),
                sessionToken = sessionToken,
                cookies = cookies,
                loginTimestamp = loginTimestamp,
                deviceFingerprint = deviceFingerprint,
                sessionHmac = sharedPreferences.getString(KEY_SESSION_HMAC, "") ?: "",
                lastAccessed = lastAccessed
            )
        } catch (e: Exception) {
            auditLogger.logSecurityEvent(
                SecurityEvent.SessionValidationFailed(regNumber, "Decryption failed: ${e.message}")
            )
            null
        }
    }

    /**
     * Validate session integrity using HMAC.
     */
    fun validateSessionIntegrity(): Boolean {
        val session = getSession() ?: return false

        val storedHmac = sharedPreferences.getString(KEY_SESSION_HMAC, null) ?: return false
        val hmacData = "${session.regNumber}|${session.loginTimestamp}|${session.deviceFingerprint}"

        return try {
            cryptoManager.verifyStringHmac(hmacData, storedHmac, KeyAlias.HMAC)
        } catch (e: Exception) {
            auditLogger.logSecurityEvent(
                SecurityEvent.SessionValidationFailed(session.regNumber, "HMAC verification failed")
            )
            false
        }
    }

    /**
     * Update last accessed timestamp.
     */
    fun touchSession() {
        sharedPreferences.edit()
            .putLong(KEY_LAST_ACCESSED, System.currentTimeMillis())
            .apply()
    }

    /**
     * Clear the stored session.
     */
    fun clearSession() {
        val session = getSession()
        sharedPreferences.edit().clear().apply()

        session?.let {
            auditLogger.logSecurityEvent(
                SecurityEvent.SessionDestroyed(it.regNumber, "User logout or session cleared")
            )
        }
    }

    /**
     * Check if a session exists.
     */
    fun hasSession(): Boolean {
        return sharedPreferences.contains(KEY_REG_NUMBER)
    }

    /**
     * Get the device fingerprint associated with the session.
     */
    fun getDeviceFingerprint(): String? {
        return sharedPreferences.getString(KEY_DEVICE_FINGERPRINT, null)
    }

    private fun serializeCookies(cookies: Map<String, String>): String {
        return cookies.entries.joinToString(";") { "${it.key}=${it.value}" }
    }

    private fun deserializeCookies(cookiesString: String): Map<String, String> {
        if (cookiesString.isEmpty()) return emptyMap()
        return cookiesString.split(";")
            .mapNotNull { entry ->
                val parts = entry.split("=", limit = 2)
                if (parts.size == 2) parts[0].trim() to parts[1].trim() else null
            }
            .toMap()
    }
}