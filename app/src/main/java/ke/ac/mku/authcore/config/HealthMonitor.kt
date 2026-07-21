package ke.ac.mku.authcore.config

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HealthMonitor @Inject constructor(
    private val configManager: ConfigManager
) : Observer {

    private var isHealthy = false

    init {
        configManager.addObserver(this)
    }

    fun performStartupValidation(): HealthReport {
        val config = try {
            configManager.config
        } catch (e: Exception) {
            return HealthReport(
                isHealthy = false,
                checks = listOf(
                    HealthCheck("configuration_load", false, e.message ?: "Failed to load config")
                )
            )
        }

        val checks = mutableListOf<HealthCheck>()

        // Check 1: Config loaded
        checks.add(
            HealthCheck(
                name = "configuration_load",
                passed = configManager.isLoaded,
                message = if (configManager.isLoaded) "Configuration loaded successfully" else "Configuration not loaded"
            )
        )

        // Check 2: Portal URL valid
        checks.add(
            HealthCheck(
                name = "portal_url",
                passed = config.portal.baseUrl.startsWith("https://"),
                message = "Portal URL: ${config.portal.baseUrl}"
            )
        )

        // Check 3: Network timeouts reasonable
        checks.add(
            HealthCheck(
                name = "network_timeouts",
                passed = config.network.connectionTimeout > 0 && config.network.readTimeout > 0,
                message = "Connection: ${config.network.connectionTimeout}s, Read: ${config.network.readTimeout}s"
            )
        )

        // Check 4: Security settings
        checks.add(
            HealthCheck(
                name = "security_https",
                passed = config.security.httpsOnly && config.security.certValidation,
                message = "HTTPS only: ${config.security.httpsOnly}, Cert validation: ${config.security.certValidation}"
            )
        )

        // Check 5: Session storage
        checks.add(
            HealthCheck(
                name = "session_storage",
                passed = config.session.encryptedStorage,
                message = "Encrypted storage: ${config.session.encryptedStorage}, Provider: ${config.session.storageProvider}"
            )
        )

        isHealthy = checks.all { it.passed }

        return HealthReport(
            isHealthy = isHealthy,
            checks = checks
        )
    }

    override fun onConfigurationEvent(event: ConfigurationEvent) {
        when (event) {
            is ConfigurationEvent.ConfigurationLoaded -> {
                isHealthy = true
            }
            is ConfigurationEvent.ConfigurationValidated -> {
                isHealthy = true
            }
            is ConfigurationEvent.ConfigurationFailed -> {
                isHealthy = false
            }
            is ConfigurationEvent.ConfigurationUpdated -> {
                // Re-validate on update
            }
        }
    }

    fun isHealthy(): Boolean = isHealthy
}

data class HealthReport(
    val isHealthy: Boolean,
    val checks: List<HealthCheck>
)

data class HealthCheck(
    val name: String,
    val passed: Boolean,
    val message: String
)