package ke.ac.mku.authcore.contracts.service

/**
 * IServiceRegistry - CORE-012
 *
 * Contract for the ServiceRegistry.
 * Provides runtime service resolution and listing.
 */
interface IServiceRegistry {
    /**
     * Resolve a service by name.
     */
    fun resolve(serviceName: String): Any?

    /**
     * Resolve a service by name and type.
     */
    fun <T> resolve(serviceName: String, clazz: Class<T>): T?

    /**
     * Check if a service is registered.
     */
    fun exists(serviceName: String): Boolean

    /**
     * List all registered service names.
     */
    fun list(): List<String>

    /**
     * Get the number of registered services.
     */
    fun getRegistrySize(): Int

    /**
     * Check if the registry is initialized.
     */
    fun isInitialized(): Boolean
}