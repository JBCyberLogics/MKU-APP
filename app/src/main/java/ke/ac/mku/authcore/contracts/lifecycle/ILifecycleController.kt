package ke.ac.mku.authcore.contracts.lifecycle

import ke.ac.mku.authcore.lifecycle.LifecycleEvent
import ke.ac.mku.authcore.lifecycle.LifecycleState
import ke.ac.mku.authcore.lifecycle.ServiceLifecycle

/**
 * ILifecycleController - CORE-012
 *
 * Contract for LifecycleManager.
 * Controls service lifecycle operations.
 */
interface ILifecycleController {
    /**
     * Service execution order.
     */
    val serviceExecutionOrder: List<String>

    /**
     * Initialize all services.
     */
    fun initializeServices()

    /**
     * Start all services.
     */
    fun startServices()

    /**
     * Pause all services.
     */
    fun pauseServices()

    /**
     * Resume all services.
     */
    fun resumeServices()

    /**
     * Stop all services.
     */
    fun stopServices()

    /**
     * Restart all services.
     */
    fun restartServices()

    /**
     * Shutdown all services.
     */
    fun shutdownAll()

    /**
     * Get the state of a service.
     */
    fun getServiceState(serviceName: String): LifecycleState?

    /**
     * Get all service lifecycles.
     */
    fun getAllLifecycles(): Map<String, ServiceLifecycle>

    /**
     * Add a lifecycle listener.
     */
    fun addLifecycleListener(listener: LifecycleListener)

    /**
     * Remove a lifecycle listener.
     */
    fun removeLifecycleListener(listener: LifecycleListener)
}

/**
 * Lifecycle listener interface.
 */
interface LifecycleListener {
    fun onLifecycleEvent(event: LifecycleEvent)
}