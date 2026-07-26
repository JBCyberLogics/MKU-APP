package ke.ac.mku.authcore.service

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.registry.DependencyRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ServiceRegistry - CORE-005
 *
 * Central registry for runtime services within the Authentication Core.
 * Delegated to DependencyRegistry for single source of truth.
 */
@Singleton
class ServiceRegistry @Inject constructor(
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry
) : BootstrapObserver {

    companion object {
        private const val TAG = "ServiceRegistry"
    }

    private var isInitialized = false

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "ServiceRegistry initialized, delegating to DependencyRegistry")
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        if (event is BootstrapEvent.BootstrapCompleted) {
            isInitialized = true
            eventBus.publish(BootstrapEvent.RegistryReady)
            Log.i(TAG, "Bootstrap completed, ServiceRegistry ready (delegated)")
        }
    }

    /**
     * Resolve a registered service by name.
     */
    fun resolve(serviceName: String): Any? {
        val instance = dependencyRegistry.resolve(serviceName)
        if (instance != null) {
            eventBus.publish(BootstrapEvent.ServiceResolved(serviceName))
        }
        return instance
    }

    /**
     * Resolve a registered service by name and type.
     */
    fun <T> resolve(serviceName: String, clazz: Class<T>): T? {
        return dependencyRegistry.resolve(serviceName, clazz)
    }

    /**
     * Check if a service is registered.
     */
    fun exists(serviceName: String): Boolean = dependencyRegistry.exists(serviceName)

    /**
     * List all registered service names.
     */
    fun list(): List<String> = dependencyRegistry.list()

    /**
     * Get the number of registered services.
     */
    fun getRegistrySize(): Int = dependencyRegistry.list().size

    /**
     * Check if the registry is initialized.
     */
    fun isInitialized(): Boolean = isInitialized
}
