package ke.ac.mku.authcore.registry

sealed class RegistryEvent {
    object RegistryInitialized : RegistryEvent()
    data class ServiceRegistered(val serviceName: String) : RegistryEvent()
    data class ServiceResolved(val serviceName: String) : RegistryEvent()
    object DependencyValidated : RegistryEvent()
    object RegistryReady : RegistryEvent()
    data class RegistryError(val error: String) : RegistryEvent()
}