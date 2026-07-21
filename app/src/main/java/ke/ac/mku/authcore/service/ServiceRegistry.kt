package ke.ac.mku.authcore.service

import android.util.Log
import ke.ac.mku.authcore.bootstrap.AuthenticationCore
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapManager
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.config.HealthMonitor
import ke.ac.mku.authcore.manager.CookieManager
import ke.ac.mku.authcore.manager.SessionManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.registry.EndpointRegistry
import ke.ac.mku.authcore.registry.PortalDiscovery
import ke.ac.mku.authcore.registry.PortalSDK
import ke.ac.mku.authcore.registry.SecurityManager
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * ServiceRegistry - CORE-005
 *
 * Central registry for runtime services within the Authentication Core.
 * Subscribes to bootstrap_completed event and registers all core services.
 */
@Singleton
class ServiceRegistry @Inject constructor(
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry
) : BootstrapObserver {

    companion object {
        private const val TAG = "ServiceRegistry"
    }

    private val registeredServices = mutableMapOf<String, Any>()
    private var isInitialized = false

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "ServiceRegistry initialized, subscribed to bootstrap events")
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        if (event is BootstrapEvent.BootstrapCompleted) {
            Log.i(TAG, "Bootstrap completed, registering core services...")
            registerCoreServices()
        }
    }

    private fun registerCoreServices() {
        if (isInitialized) {
            Log.w(TAG, "Services already registered, skipping")
            return
        }

        try {
            // Register AuthenticationCore (resolved from DependencyRegistry)
            val authCore = resolveDependency<AuthenticationCore>("authentication_core")
            if (authCore != null) {
                registerService("authentication_core", authCore)
                eventBus.publish(BootstrapEvent.ServiceRegistered("authentication_core"))
            } else {
                Log.e(TAG, "Failed to resolve authentication_core from DependencyRegistry")
                eventBus.publish(BootstrapEvent.ServiceRegistrationFailed("authentication_core", "Failed to resolve from DependencyRegistry"))
            }

            // Resolve and register other core services from DependencyRegistry
            resolveDependency<ConfigManager>("configuration_manager")?.let {
                registerService("configuration_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("configuration_manager"))
            }

            resolveDependency<DependencyRegistry>("dependency_registry")?.let {
                registerService("dependency_registry", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("dependency_registry"))
            }

            resolveDependency<BootstrapManager>("bootstrap_manager")?.let {
                registerService("bootstrap_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("bootstrap_manager"))
            }

            resolveDependency<HealthMonitor>("health_monitor")?.let {
                registerService("health_monitor", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("health_monitor"))
            }

            resolveDependency<PortalSDK>("portal_sdk")?.let {
                registerService("portal_sdk", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("portal_sdk"))
            }

            resolveDependency<PortalDiscovery>("portal_discovery")?.let {
                registerService("portal_discovery", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("portal_discovery"))
            }

            resolveDependency<EndpointRegistry>("endpoint_registry")?.let {
                registerService("endpoint_registry", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("endpoint_registry"))
            }

            resolveDependency<SecurityManager>("security_manager")?.let {
                registerService("security_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("security_manager"))
            }

            resolveDependency<SessionManager>("session_manager")?.let {
                registerService("session_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("session_manager"))
            }

            resolveDependency<CookieManager>("cookie_manager")?.let {
                registerService("cookie_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("cookie_manager"))
            }

            resolveDependency<ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager>("session_recovery_manager")?.let {
                registerService("session_recovery_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("session_recovery_manager"))
            }

            resolveDependency<ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager>("cookie_synchronization_manager")?.let {
                registerService("cookie_synchronization_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("cookie_synchronization_manager"))
            }

            resolveDependency<ke.ac.mku.authcore.contracts.security.ICertificatePinningManager>("certificate_pinning_manager")?.let {
                registerService("certificate_pinning_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("certificate_pinning_manager"))
            }

            resolveDependency<ke.ac.mku.authcore.contracts.network.INetworkManager>("network_manager")?.let {
                registerService("network_manager", it)
                eventBus.publish(BootstrapEvent.ServiceRegistered("network_manager"))
            }

            isInitialized = true
            eventBus.publish(BootstrapEvent.RegistryReady)
            Log.i(TAG, "All core services registered, registry_ready")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to register services: ${e.message}", e)
            eventBus.publish(BootstrapEvent.ServiceRegistrationFailed("unknown", e.message ?: "Unknown error"))
        }
    }

    private inline fun <reified T : Any> resolveDependency(name: String): T? {
        return try {
            dependencyRegistry.resolve(name, T::class.java)
        } catch (e: Exception) {
            Log.w(TAG, "Could not resolve $name from DependencyRegistry: ${e.message}")
            null
        }
    }

    private fun registerService(name: String, instance: Any) {
        if (!registeredServices.containsKey(name)) {
            registeredServices[name] = instance
            Log.d(TAG, "Registered service: $name")
        } else {
            Log.w(TAG, "Service $name already registered, skipping")
        }
    }

    /**
     * Resolve a registered service by name.
     */
    fun resolve(serviceName: String): Any? {
        val instance = registeredServices[serviceName]
        if (instance == null) {
            Log.w(TAG, "Service $serviceName not found")
        } else {
            eventBus.publish(BootstrapEvent.ServiceResolved(serviceName))
        }
        return instance
    }

    /**
     * Resolve a registered service by name and type.
     */
    fun <T> resolve(serviceName: String, clazz: Class<T>): T? {
        val instance = resolve(serviceName)
        return if (clazz.isInstance(instance)) {
            @Suppress("UNCHECKED_CAST")
            instance as T
        } else {
            null
        }
    }

    /**
     * Check if a service is registered.
     */
    fun exists(serviceName: String): Boolean = registeredServices.containsKey(serviceName)

    /**
     * List all registered service names.
     */
    fun list(): List<String> = registeredServices.keys.toList()

    /**
     * Get the number of registered services.
     */
    fun getRegistrySize(): Int = registeredServices.size

    /**
     * Check if the registry is initialized.
     */
    fun isInitialized(): Boolean = isInitialized
}