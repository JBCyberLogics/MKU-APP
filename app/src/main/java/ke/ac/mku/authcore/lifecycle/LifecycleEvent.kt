package ke.ac.mku.authcore.lifecycle

/**
 * Internal lifecycle events for tracking service state changes.
 *
 * NOTE: These events are NOT published through EventBus (which only handles BootstrapEvent).
 * They are for internal LifecycleManager tracking and can be observed by other components
 * via direct method calls on LifecycleManager.
 */
sealed class LifecycleEvent {
    data class ServiceInitialized(val serviceName: String) : LifecycleEvent()
    data class ServiceStarted(val serviceName: String) : LifecycleEvent()
    data class ServicePaused(val serviceName: String) : LifecycleEvent()
    data class ServiceResumed(val serviceName: String) : LifecycleEvent()
    data class ServiceStopped(val serviceName: String) : LifecycleEvent()
    data class ServiceRestarted(val serviceName: String) : LifecycleEvent()
    data class ServiceShutdown(val serviceName: String) : LifecycleEvent()
    data class ServiceFailed(val serviceName: String, val error: String) : LifecycleEvent()
    object AllServicesReady : LifecycleEvent()
}