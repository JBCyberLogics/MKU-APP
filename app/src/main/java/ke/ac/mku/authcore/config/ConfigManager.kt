package ke.ac.mku.authcore.config

import javax.inject.Inject
import javax.inject.Singleton

class ConfigManager constructor() : AbstractObservable() {

    private var _config: ConfigModel? = null
    val config: ConfigModel
        get() = _config ?: throw IllegalStateException("Configuration not loaded")

    val isLoaded: Boolean
        get() = _config != null

    fun load(): Boolean {
        return try {
            _config = createProductionConfig()
            notifyObservers(ConfigurationEvent.ConfigurationLoaded)
            validate()
            notifyObservers(ConfigurationEvent.ConfigurationValidated)
            true
        } catch (e: Exception) {
            notifyObservers(ConfigurationEvent.ConfigurationFailed(e.message ?: "Unknown error"))
            false
        }
    }

    private fun validate() {
        val cfg = _config ?: throw IllegalStateException("Configuration not loaded")

        val failures = mutableListOf<String>()

        if (cfg.portal.baseUrl.isBlank()) {
            failures.add("portal.base_url is required")
        }
        if (cfg.network.connectionTimeout <= 0L) {
            failures.add("network.connection_timeout_seconds must be positive")
        }
        if (cfg.session.storageProvider.isBlank()) {
            failures.add("session.storage_provider is required")
        }
        if (!cfg.security.httpsOnly) {
            failures.add("security.https_only must be true")
        }

        if (failures.isNotEmpty()) {
            throw IllegalStateException("Configuration validation failed: ${failures.joinToString("; ")}")
        }
    }

    private fun createProductionConfig(): ConfigModel {
        return ConfigModel(
            portal = PortalConfig(
                name = "Mount Kenya University Student Portal",
                baseUrl = "https://login.mku.ac.ke/",
                followRedirects = true,
                verifySsl = true,
                authType = "ASP.NET Session Authentication"
            ),
            network = NetworkConfig(
                connectionTimeout = 30L,
                readTimeout = 30L,
                writeTimeout = 30L,
                retryAttempts = 3,
                autoRetry = true,
                retryDelayMs = 1000L
            ),
            session = SessionConfig(
                autoRestore = false,  // Login each time
                autoValidation = true,
                autoCleanup = true,
                encryptedStorage = true,
                storageProvider = "EncryptedSharedPreferences"
            ),
            security = SecurityConfig(
                httpsOnly = true,
                certValidation = true,
                hostnameVerification = true,
                allowSelfSigned = false,
                allowUntrusted = false
            ),
            logging = LoggingConfig(
                enabled = true,
                level = "INFO",
                logNetwork = true,
                logAuth = true,
                logErrors = true
            )
        )
    }
}