package ke.ac.mku.authcore.contracts.config

import ke.ac.mku.authcore.config.ConfigModel

/**
 * IConfigManager - CORE-012
 *
 * Contract for ConfigManager.
 * Configuration loading and access.
 */
interface IConfigManager {
    /**
     * The loaded configuration model.
     */
    val config: ConfigModel

    /**
     * Whether configuration is loaded.
     */
    val isLoaded: Boolean

    /**
     * Load configuration.
     */
    fun load(): Boolean

    /**
     * Reload configuration.
     */
    fun reload(): Boolean
}