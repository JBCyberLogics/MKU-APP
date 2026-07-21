package ke.ac.mku.authcore.runtime

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Provides managed Coroutine Dispatchers for the Authentication Core.
 * All dispatchers are backed by standard Kotlin dispatchers.
 */
object DispatcherProvider {

    /**
     * Main dispatcher for UI operations.
     * WARNING: Should not be used for blocking operations.
     */
    val main: CoroutineDispatcher = Dispatchers.Main

    /**
     * IO dispatcher for network, database, and file operations.
     * Optimized for blocking IO tasks.
     */
    val io: CoroutineDispatcher = Dispatchers.IO

    /**
     * Default dispatcher for CPU-intensive operations.
     * Use for computation-heavy work that would block other tasks.
     */
    val `default`: CoroutineDispatcher = Dispatchers.Default

    /**
     * Unconfined dispatcher is disabled per security policy.
     * Using it could cause unpredictable execution behavior.
     */
    val unconfined: CoroutineDispatcher?
        get() = null  // Disabled - returns null to prevent usage

    /**
     * Check if a dispatcher is operational.
     */
    fun isAvailable(dispatcher: CoroutineDispatcher?): Boolean = dispatcher != null
}