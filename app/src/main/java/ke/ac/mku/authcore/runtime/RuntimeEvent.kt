package ke.ac.mku.authcore.runtime

/**
 * Internal runtime events (not published through EventBus).
 * Used for internal RuntimeEnvironment tracking and listener notifications.
 */
sealed class RuntimeEvent {
    object RuntimeInitialized : RuntimeEvent()
    object RuntimeReady : RuntimeEvent()
    object RuntimeShutdown : RuntimeEvent()
    data class ResourceWarning(val message: String) : RuntimeEvent()
    object MemoryPressureDetected : RuntimeEvent()
    data class RuntimeFailure(val error: String) : RuntimeEvent()
}