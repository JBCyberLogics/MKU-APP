package ke.ac.mku.authcore.lifecycle

/**
 * Lifecycle states for services managed by LifecycleManager.
 *
 * State transitions:
 * - REGISTERED -> INITIALIZED (via initializeServices)
 * - INITIALIZED -> STARTING -> RUNNING (via startServices)
 * - RUNNING -> PAUSED (via pauseServices)
 * - PAUSED -> RUNNING (via resumeServices)
 * - RUNNING -> STOPPING -> STOPPED (via stopServices)
 * - STOPPED -> RESTARTING -> RUNNING (via restartServices)
 * - Any state -> SHUTDOWN (via shutdownAll)
 * - Any state -> FAILED (on unrecoverable error)
 */
enum class LifecycleState {
    REGISTERED,
    INITIALIZED,
    STARTING,
    RUNNING,
    PAUSED,
    STOPPING,
    STOPPED,
    RESTARTING,
    SHUTDOWN,
    FAILED
}