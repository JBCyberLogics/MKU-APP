package ke.ac.mku.authcore.security.crypto

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * KeyRotationManager - SECURITY-002
 *
 * Manages automatic and manual key rotation for all cryptographic keys.
 * Automatic rotation occurs every 90 days by default.
 */
@Singleton
class KeyRotationManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val cryptoManager: ICryptoManager
) {
    companion object {
        private const val TAG = "KeyRotationManager"
        private const val ROTATION_CHECK_INTERVAL_MS = 24 * 60 * 60 * 1000L // 24 hours
        private const val DEFAULT_ROTATION_DAYS = 90L
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var isRunning = false

    // Rotation configuration per key alias
    private val rotationConfig = mutableMapOf<KeyAlias, RotationConfig>()

    data class RotationConfig(
        val keyAlias: KeyAlias,
        val rotationDays: Long = DEFAULT_ROTATION_DAYS,
        val autoRotate: Boolean = true,
        val lastNotifiedAt: Long = 0
    )

    init {
        // Initialize default rotation config for all key aliases
        KeyAlias.entries.forEach { alias ->
            rotationConfig[alias] = RotationConfig(alias)
        }
    }

    /**
     * Start the automatic rotation checker.
     */
    fun start() {
        if (isRunning) {
            Log.w(TAG, "KeyRotationManager already running")
            return
        }

        isRunning = true
        scope.launch {
            runRotationChecker()
        }
        Log.i(TAG, "KeyRotationManager started")
    }

    /**
     * Stop the automatic rotation checker.
     */
    fun stop() {
        isRunning = false
        Log.i(TAG, "KeyRotationManager stopped")
    }

    private suspend fun runRotationChecker() {
        while (isRunning) {
            try {
                checkAndRotateKeys()
            } catch (e: Exception) {
                Log.e(TAG, "Error during rotation check: ${e.message}")
            }
            delay(ROTATION_CHECK_INTERVAL_MS)
        }
    }

    /**
     * Check all keys and rotate if necessary.
     */
    suspend fun checkAndRotateKeys() {
        for (alias in KeyAlias.entries) {
            val config = rotationConfig[alias] ?: continue
            if (!config.autoRotate) continue

            val metadata = cryptoManager.getKeyMetadata(alias) ?: continue
            val daysSinceRotation = (System.currentTimeMillis() - metadata.lastRotated) / (24 * 60 * 60 * 1000L)

            if (daysSinceRotation >= config.rotationDays) {
                Log.i(TAG, "Auto-rotating key ${alias.name} (${daysSinceRotation} days since last rotation)")
                rotateKey(alias)
            }
        }
    }

    /**
     * Manually rotate a specific key.
     */
    suspend fun rotateKey(keyAlias: KeyAlias): Result<Unit> {
        return try {
            val success = cryptoManager.rotateKey(keyAlias)
            if (success) {
                Log.i(TAG, "Successfully rotated key: $keyAlias")
                Result.success(Unit)
            } else {
                Log.e(TAG, "Failed to rotate key: $keyAlias")
                Result.failure(SecurityException("Key rotation failed"))
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception rotating key $keyAlias: ${e.message}")
            Result.failure(e)
        }
    }

    /**
     * Manually rotate all keys.
     */
    suspend fun rotateAllKeys(): Map<KeyAlias, Boolean> {
        val results = mutableMapOf<KeyAlias, Boolean>()
        for (alias in KeyAlias.entries) {
            results[alias] = cryptoManager.rotateKey(alias)
        }
        return results
    }

    /**
     * Configure rotation for a specific key.
     */
    fun configureRotation(keyAlias: KeyAlias, rotationDays: Long, autoRotate: Boolean = true) {
        rotationConfig[keyAlias] = RotationConfig(
            keyAlias = keyAlias,
            rotationDays = rotationDays,
            autoRotate = autoRotate
        )
        Log.d(TAG, "Configured rotation for $keyAlias: ${rotationDays} days, auto=$autoRotate")
    }

    /**
     * Get rotation status for all keys.
     */
    fun getRotationStatus(): List<KeyRotationStatus> {
        return KeyAlias.entries.map { alias ->
            val metadata = cryptoManager.getKeyMetadata(alias)
            val config = rotationConfig[alias]
            val daysSinceRotation = metadata?.let {
                (System.currentTimeMillis() - it.lastRotated) / (24 * 60 * 60 * 1000L)
            } ?: -1
            val daysUntilRotation = config?.let {
                (it.rotationDays - daysSinceRotation).coerceAtLeast(0)
            } ?: -1

            KeyRotationStatus(
                keyAlias = alias,
                isValid = metadata != null,
                lastRotated = metadata?.lastRotated ?: 0,
                daysSinceRotation = daysSinceRotation,
                daysUntilRotation = daysUntilRotation,
                rotationCount = metadata?.rotationCount ?: 0,
                isHardwareBacked = metadata?.isHardwareBacked ?: false,
                autoRotate = config?.autoRotate ?: true,
                configuredRotationDays = config?.rotationDays ?: DEFAULT_ROTATION_DAYS
            )
        }
    }

    /**
     * Check if a specific key needs rotation.
     */
    fun needsRotation(keyAlias: KeyAlias): Boolean {
        val metadata = cryptoManager.getKeyMetadata(keyAlias) ?: return true
        val config = rotationConfig[keyAlias] ?: return false
        val daysSinceRotation = (System.currentTimeMillis() - metadata.lastRotated) / (24 * 60 * 60 * 1000L)
        return daysSinceRotation >= config.rotationDays
    }

    data class KeyRotationStatus(
        val keyAlias: KeyAlias,
        val isValid: Boolean,
        val lastRotated: Long,
        val daysSinceRotation: Long,
        val daysUntilRotation: Long,
        val rotationCount: Int,
        val isHardwareBacked: Boolean,
        val autoRotate: Boolean,
        val configuredRotationDays: Long
    )
}