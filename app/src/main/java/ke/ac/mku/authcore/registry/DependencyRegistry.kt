package ke.ac.mku.authcore.registry

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DependencyRegistry @Inject constructor() {

    companion object {
        private const val TAG = "DependencyRegistry"
    }

    private val services = mutableMapOf<String, ServiceDescriptor>()
    private val observers = mutableListOf<RegistryObserver>()
    private var isInitialized = false
    private var isValidated = false

    fun addObserver(observer: RegistryObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: RegistryObserver) {
        observers.remove(observer)
    }

    private fun notifyObservers(event: RegistryEvent) {
        observers.forEach { it.onRegistryEvent(event) }
    }

    fun initialize(): Boolean {
        return try {
            notifyObservers(RegistryEvent.RegistryInitialized)
            Log.i(TAG, "Registry initialized")
            isInitialized = true
            true
        } catch (e: Exception) {
            notifyObservers(RegistryEvent.RegistryError(e.message ?: "Initialization failed"))
            Log.e(TAG, "Registry initialization failed: ${e.message}")
            false
        }
    }

    fun register(
        name: String,
        instance: Any,
        dependencies: List<String> = emptyList(),
        startupOrder: Int = 0,
        isRequired: Boolean = true
    ): Boolean {
        return try {
            if (services.containsKey(name)) {
                Log.w(TAG, "Service $name already registered, skipping")
                return false
            }

            val descriptor = ServiceDescriptor(
                name = name,
                instance = instance,
                dependencies = dependencies,
                startupOrder = startupOrder,
                isRequired = isRequired
            )

            services[name] = descriptor
            notifyObservers(RegistryEvent.ServiceRegistered(name))
            Log.d(TAG, "Registered service: $name (order: $startupOrder)")
            true
        } catch (e: Exception) {
            notifyObservers(RegistryEvent.RegistryError("Failed to register $name: ${e.message}"))
            Log.e(TAG, "Failed to register service $name: ${e.message}")
            false
        }
    }

    fun resolve(name: String): Any? {
        val descriptor = services[name]
        if (descriptor == null) {
            Log.w(TAG, "Service $name not found in registry")
            return null
        }

        descriptor.markResolved()
        notifyObservers(RegistryEvent.ServiceResolved(name))
        Log.d(TAG, "Resolved service: $name")
        return descriptor.instance
    }

    fun <T> resolve(name: String, clazz: Class<T>): T? {
        val instance = resolve(name)
        return if (clazz.isInstance(instance)) {
            @Suppress("UNCHECKED_CAST")
            instance as T
        } else {
            null
        }
    }

    fun exists(name: String): Boolean = services.containsKey(name)

    fun list(): List<String> = services.keys.toList()

    fun listByOrder(): List<ServiceDescriptor> = services.values.sortedBy { it.startupOrder }

    fun validate(): ValidationResult {
        val errors = mutableListOf<String>()

        // Check for missing dependencies
        services.values.forEach { descriptor ->
            descriptor.dependencies.forEach { dep ->
                if (!services.containsKey(dep)) {
                    errors.add("Service ${descriptor.name} depends on $dep which is not registered")
                }
            }
        }

        // Check for circular dependencies
        val circularDeps = findCircularDependencies()
        if (circularDeps.isNotEmpty()) {
            errors.add("Circular dependencies detected: ${circularDeps.joinToString(" -> ")}")
        }

        // Check startup order is valid
        val orders = services.values.map { it.startupOrder }
        if (orders.distinct().size != orders.size) {
            errors.add("Duplicate startup order values detected")
        }

        isValidated = errors.isEmpty()

        if (errors.isEmpty()) {
            notifyObservers(RegistryEvent.DependencyValidated)
            Log.i(TAG, "Dependency validation passed")
        } else {
            errors.forEach { Log.e(TAG, "Validation error: $it") }
        }

        return ValidationResult(
            isValid = errors.isEmpty(),
            errors = errors
        )
    }

    private fun findCircularDependencies(): List<String> {
        val visited = mutableSetOf<String>()
        val recursionStack = mutableSetOf<String>()
        val path = mutableListOf<String>()

        fun dfs(serviceName: String): Boolean {
            visited.add(serviceName)
            recursionStack.add(serviceName)
            path.add(serviceName)

            val descriptor = services[serviceName]
            descriptor?.dependencies?.forEach { dep ->
                if (!visited.contains(dep)) {
                    if (dfs(dep)) return true
                } else if (recursionStack.contains(dep)) {
                    path.add(dep)
                    return true
                }
            }

            recursionStack.remove(serviceName)
            path.removeAt(path.size - 1)
            return false
        }

        services.keys.forEach { name ->
            if (!visited.contains(name)) {
                if (dfs(name)) {
                    return path
                }
            }
        }

        return emptyList()
    }

    fun isReady(): Boolean = isInitialized && isValidated && services.isNotEmpty()

    fun getStartupSequence(): List<String> {
        return services.values
            .sortedBy { it.startupOrder }
            .map { it.name }
    }
}

data class ValidationResult(
    val isValid: Boolean,
    val errors: List<String>
)

interface RegistryObserver {
    fun onRegistryEvent(event: RegistryEvent)
}