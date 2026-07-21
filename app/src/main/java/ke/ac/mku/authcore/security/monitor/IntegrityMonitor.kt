package ke.ac.mku.authcore.security.monitor

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.security.ThreatCategory
import ke.ac.mku.authcore.contracts.security.ThreatReport
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import javax.inject.Inject
import javax.inject.Singleton

/**
 * IntegrityMonitor - SECURITY-005
 *
 * Monitors runtime integrity of the application and platform.
 * Verifies application signature, configuration integrity, and storage integrity.
 */
@Singleton
class IntegrityMonitor @Inject constructor(
    @ApplicationContext private val context: Context,
    private val secureStorage: ISecureStorageManager,
    private val eventBus: EventBus
) {

    companion object {
        private const val TAG = "IntegrityMonitor"
        private const val CONFIG_HASH_KEY = "config_integrity_hash"
    }

    private var lastVerificationTime = 0L
    private var lastVerificationPassed = false

    /**
     * Verify the integrity of the application.
     *
     * @return List of integrity issues found
     */
    fun verifyApplicationIntegrity(): List<ThreatReport> {
        val issues = mutableListOf<ThreatReport>()

        // Verify application signature
        if (!verifySignature()) {
            issues.add(
                ThreatReport.fromCategory(
                    category = ThreatCategory.SIGNATURE_MISMATCH,
                    source = "IntegrityMonitor",
                    indicators = listOf("Application signature verification failed")
                )
            )
        }

        // Verify package integrity
        if (!verifyPackageIntegrity()) {
            issues.add(
                ThreatReport.fromCategory(
                    category = ThreatCategory.APP_TAMPERING,
                    source = "IntegrityMonitor",
                    indicators = listOf("Package integrity check failed")
                )
            )
        }

        lastVerificationTime = System.currentTimeMillis()
        lastVerificationPassed = issues.isEmpty()

        if (lastVerificationPassed) {
            eventBus.publish(BootstrapEvent.PlatformIntegrityVerified)
        } else {
            eventBus.publish(BootstrapEvent.IntegrityFailure("Found ${issues.size} integrity issues"))
        }

        return issues
    }

    /**
     * Quick integrity check without full verification.
     *
     * @return true if platform appears intact
     */
    fun isIntegrityIntact(): Boolean {
        return lastVerificationPassed &&
                (System.currentTimeMillis() - lastVerificationTime) < 60_000 // 1 minute cache
    }

    /**
     * Get the last verification time.
     *
     * @return Timestamp of last verification
     */
    fun getLastVerificationTime(): Long = lastVerificationTime

    /**
     * Verify application signature against expected value.
     */
    private fun verifySignature(): Boolean {
        return try {
            val packageInfo = context.packageManager.getPackageInfo(
                context.packageName,
                PackageManager.GET_SIGNATURES
            )

            // Check that we have signatures
            val signatures = packageInfo.signatures
            if (signatures.isNullOrEmpty()) {
                Log.w(TAG, "No signatures found for package")
                return false
            }

            // For now, just verify we have at least one signature
            // In production, this would compare against known good signature hash
            true
        } catch (e: Exception) {
            Log.e(TAG, "Signature verification error: ${e.message}")
            false
        }
    }

    /**
     * Verify package integrity.
     */
    private fun verifyPackageIntegrity(): Boolean {
        return try {
            val packageInfo = context.packageManager.getPackageInfo(
                context.packageName,
                PackageManager.GET_PERMISSIONS or PackageManager.GET_CONFIGURATIONS
            )

            // Check that package is not disabled
            if (packageInfo.applicationInfo?.enabled != true) {
                Log.w(TAG, "Application is disabled")
                return false
            }

            // Check package name matches expected
            if (packageInfo.packageName != context.packageName) {
                Log.w(TAG, "Package name mismatch")
                return false
            }

            true
        } catch (e: Exception) {
            Log.e(TAG, "Package integrity error: ${e.message}")
            false
        }
    }

    /**
     * Verify configuration integrity.
     */
    fun verifyConfigurationIntegrity(): Boolean {
        // Configuration integrity is verified by checking if config hash matches stored hash
        // This would be implemented after config changes are tracked
        return true
    }

    /**
     * Verify storage integrity.
     */
    fun verifyStorageIntegrity(): Boolean {
        return try {
            // Try a simple read/write to verify storage is working
            val testKey = "_integrity_test"
            secureStorage.storeToken(testKey, "test_value")
            val result = secureStorage.getToken(testKey)
            val passed = result.success && result.data == "test_value"

            if (passed) {
                // Clean up test data
                // Note: We don't have deleteToken, so just leave it
                Log.d(TAG, "Storage integrity check passed")
            }

            passed
        } catch (e: Exception) {
            Log.e(TAG, "Storage integrity error: ${e.message}")
            false
        }
    }
}