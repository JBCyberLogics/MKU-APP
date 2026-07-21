package ke.ac.mku.authcore.contracts.registry

/**
 * IDependencyRegistry - CORE-012
 *
 * Contract for DependencyRegistry.
 * Service locator pattern for dependency resolution.
 */
interface IDependencyRegistry {
    /**
     * Initialize the registry.
     */
    fun initialize()

    /**
     * Register a service.
     */
    fun register(
        name: String,
        instance: Any,
        dependencies: List<String>,
        startupOrder: Int,
        isRequired: Boolean
    ): Boolean

    /**
     * Resolve a service by name.
     */
    fun resolve(name: String): Any?

    /**
     * Resolve a service by name and type.
     */
    fun <T> resolve(name: String, clazz: Class<T>): T?

    /**
     * Check if a service exists.
     */
    fun exists(name: String): Boolean

    /**
     * List all registered services.
     */
    fun list(): List<String>

    /**
     * List services in startup order.
     */
    fun listByOrder(): List<Any>

    /**
     * Validate the registry.
     */
    fun validate(): ValidationResult

    /**
     * Check if registry is ready.
     */
    fun isReady(): Boolean

    /**
     * Get the startup sequence.
     */
    fun getStartupSequence(): List<String>
}

/**
 * Validation result.
 */
data class ValidationResult(
    val isValid: Boolean,
    val errors: List<String>
)