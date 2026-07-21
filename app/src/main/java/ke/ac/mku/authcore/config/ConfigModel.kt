package ke.ac.mku.authcore.config

data class ConfigModel(
    val portal: PortalConfig,
    val network: NetworkConfig,
    val session: SessionConfig,
    val security: SecurityConfig,
    val logging: LoggingConfig
)

data class PortalConfig(
    val name: String,
    val baseUrl: String,
    val followRedirects: Boolean,
    val verifySsl: Boolean,
    val authType: String
)

data class NetworkConfig(
    val connectionTimeout: Long,
    val readTimeout: Long,
    val writeTimeout: Long,
    val retryAttempts: Int,
    val autoRetry: Boolean,
    val retryDelayMs: Long
)

data class SessionConfig(
    val autoRestore: Boolean,
    val autoValidation: Boolean,
    val autoCleanup: Boolean,
    val encryptedStorage: Boolean,
    val storageProvider: String
)

data class SecurityConfig(
    val httpsOnly: Boolean,
    val certValidation: Boolean,
    val hostnameVerification: Boolean,
    val allowSelfSigned: Boolean,
    val allowUntrusted: Boolean
)

data class LoggingConfig(
    val enabled: Boolean,
    val level: String,
    val logNetwork: Boolean,
    val logAuth: Boolean,
    val logErrors: Boolean
)