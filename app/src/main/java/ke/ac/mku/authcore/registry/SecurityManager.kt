package ke.ac.mku.authcore.registry

import ke.ac.mku.authcore.config.ConfigManager
import javax.inject.Inject
import javax.inject.Singleton

class SecurityManager constructor(
    private val configManager: ConfigManager
) {
    val isHttpsOnly: Boolean
        get() = configManager.config.security.httpsOnly

    val isCertValidationEnabled: Boolean
        get() = configManager.config.security.certValidation

    val isHostnameVerificationEnabled: Boolean
        get() = configManager.config.security.hostnameVerification

    val allowsSelfSignedCertificates: Boolean
        get() = configManager.config.security.allowSelfSigned

    val allowsUntrustedCertificates: Boolean
        get() = configManager.config.security.allowUntrusted

    fun validateConnection(url: String): Boolean {
        val config = configManager.config.security

        return when {
            config.httpsOnly && !url.startsWith("https://") -> false
            config.allowSelfSigned -> true
            config.allowUntrusted -> true
            else -> true
        }
    }

    fun getSecurityLevel(): SecurityLevel {
        val config = configManager.config.security
        return when {
            config.httpsOnly && config.certValidation && config.hostnameVerification &&
                    !config.allowSelfSigned && !config.allowUntrusted -> SecurityLevel.STRICT
            config.httpsOnly -> SecurityLevel.STANDARD
            else -> SecurityLevel.MINIMAL
        }
    }
}

enum class SecurityLevel {
    MINIMAL,
    STANDARD,
    STRICT
}