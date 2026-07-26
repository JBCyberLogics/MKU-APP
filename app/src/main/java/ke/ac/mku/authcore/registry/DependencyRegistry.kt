package ke.ac.mku.authcore.registry

import android.util.Log
import ke.ac.mku.authcore.contracts.registry.IDependencyRegistry
import ke.ac.mku.authcore.contracts.registry.ValidationResult
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArrayList
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DependencyRegistry @Inject constructor() : IDependencyRegistry {

    companion object {
        private const val TAG = "DependencyRegistry"
    }

    private val services = ConcurrentHashMap<String, ServiceDescriptor>()
    private val observers = CopyOnWriteArrayList<RegistryObserver>()
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

    override fun initialize() {
        try {
            notifyObservers(RegistryEvent.RegistryInitialized)
            Log.i(TAG, "Registry initialized")
            isInitialized = true
        } catch (e: Exception) {
            notifyObservers(RegistryEvent.RegistryError(e.message ?: "Initialization failed"))
            Log.e(TAG, "Registry initialization failed: ${e.message}")
        }
    }

    override fun register(
        name: String,
        instance: Any,
        dependencies: List<String>,
        startupOrder: Int,
        isRequired: Boolean
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
            Log.d(TAG, "Registered service: $name with dependencies: $dependencies")
            true
        } catch (e: Exception) {
            notifyObservers(RegistryEvent.RegistryError("Failed to register $name: ${e.message}"))
            Log.e(TAG, "Failed to register service $name: ${e.message}")
            false
        }
    }

    override fun resolve(name: String): Any? {
        val descriptor = services[name]
        if (descriptor == null) {
            Log.w(TAG, "Service $name not found in registry")
            return null
        }

        descriptor.markResolved()
        notifyObservers(RegistryEvent.ServiceResolved(name))
        return descriptor.instance
    }

    override fun <T> resolve(name: String, clazz: Class<T>): T? {
        val instance = resolve(name)
        return if (clazz.isInstance(instance)) {
            @Suppress("UNCHECKED_CAST")
            instance as T
        } else {
            null
        }
    }

    override fun exists(name: String): Boolean = services.containsKey(name)

    override fun list(): List<String> = services.keys().toList()

    override fun listDescriptors(): List<ServiceDescriptor> = services.values.toList()

    override fun listByOrder(): List<Any> {
        return try {
            getTopologicalSort().mapNotNull { services[it]?.instance }
        } catch (e: Exception) {
            services.values.sortedBy { it.startupOrder }.map { it.instance }
        }
    }

    override fun validate(): ValidationResult {
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
        try {
            getTopologicalSort()
        } catch (e: IllegalStateException) {
            errors.add(e.message ?: "Circular dependency detected")
        }

        // REMOVED duplicate startupOrder check - using DAG instead

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

    override fun isReady(): Boolean = isInitialized && isValidated && services.isNotEmpty()

    override fun getStartupSequence(): List<String> {
        return getTopologicalSort()
    }

    fun getTopologicalSort(): List<String> {
        val sorted = mutableListOf<String>()
        val visited = mutableSetOf<String>()
        val temp = mutableSetOf<String>()

        fun visit(name: String) {
            if (name in temp) throw IllegalStateException("Circular dependency detected at $name")
            if (name !in visited) {
                temp.add(name)
                val descriptor = services[name]
                descriptor?.dependencies?.forEach { visit(it) }
                temp.remove(name)
                visited.add(name)
                sorted.add(name)
            }
        }

        // Sort keys to ensure deterministic output
        services.keys().toList().sorted().forEach { if (it !in visited) visit(it) }
        return sorted
    }
}
