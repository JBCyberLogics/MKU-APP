package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.config.HealthMonitor
import ke.ac.mku.authcore.domain.repository.AuthRepository
import javax.inject.Inject
import javax.inject.Singleton

class AuthCoreManager constructor(
    val authRepository: AuthRepository,
    private val configManager: ConfigManager,
    private val healthMonitor: HealthMonitor
) {
    companion object {
        private const val TAG = "AuthCoreManager"
    }

    init {
        performStartupHealthCheck()
    }

    private fun performStartupHealthCheck() {
        val config = configManager.config
        if (config.logging.enabled && config.logging.logErrors) {
            val report = healthMonitor.performStartupValidation()
            if (report.isHealthy) {
                Log.i(TAG, "AuthCore started - Health check passed")
                if (config.logging.logAuth) {
                    Log.i(TAG, "Portal: ${config.portal.name}")
                    Log.i(TAG, "Auth type: ${config.portal.authType}")
                }
            } else {
                Log.w(TAG, "AuthCore started with warnings:")
                report.checks.filterNot { it.passed }.forEach { check ->
                    Log.w(TAG, "  - ${check.name}: ${check.message}")
                }
            }
        }
    }

    suspend fun isLoggedIn(): Boolean = authRepository.isLoggedIn()

    suspend fun getCurrentUser() = authRepository.getCurrentUser()

    suspend fun login(regNumber: String, password: String) =
        authRepository.login(regNumber, password)

    suspend fun logout() = authRepository.logout()

    fun getConfig() = configManager.config

    fun isConfigLoaded() = configManager.isLoaded
}