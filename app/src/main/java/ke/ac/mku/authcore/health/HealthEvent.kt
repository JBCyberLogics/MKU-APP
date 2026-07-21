package ke.ac.mku.authcore.health

/**
 * Internal health events (not published through EventBus).
 * Used for internal HealthMonitor tracking and listener notifications.
 */
sealed class HealthEvent {
    object HealthMonitorReady : HealthEvent()
    object HealthStatusChanged : HealthEvent()
    data class ComponentFailed(val component: String, val error: String) : HealthEvent()
    data class ComponentRecovered(val component: String) : HealthEvent()
    object MemoryWarning : HealthEvent()
    object CpuWarning : HealthEvent()
    object NetworkWarning : HealthEvent()
    object AuthenticationWarning : HealthEvent()
    object RuntimeWarning : HealthEvent()
    object CriticalFailure : HealthEvent()
    object DiagnosticReportGenerated : HealthEvent()
}