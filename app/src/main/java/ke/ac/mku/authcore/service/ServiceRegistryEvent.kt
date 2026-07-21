package ke.ac.mku.authcore.service

/**
 * @deprecated Use [ke.ac.mku.authcore.bootstrap.BootstrapEvent] for service registry events.
 * This class is retained for backward compatibility and will be removed in a future version.
 */
@Deprecated("Use BootstrapEvent for service registry events", ReplaceWith("ke.ac.mku.authcore.bootstrap.BootstrapEvent"))
sealed class ServiceRegistryEvent {
    data class ServiceRegistered(val serviceName: String) : ServiceRegistryEvent()
    data class ServiceResolved(val serviceName: String) : ServiceRegistryEvent()
    data class ServiceRegistrationFailed(val serviceName: String, val error: String) : ServiceRegistryEvent()
    object RegistryReady : ServiceRegistryEvent()
}