package ke.ac.mku.authcore.bootstrap

import android.util.Log
import ke.ac.mku.authcore.registry.DependencyRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PlatformBootstrap - FINAL-001
 * 
 * Manages the dependency-driven bootstrap process of the platform.
 * Replaces hardcoded numeric startup orders with a Directed Acyclic Graph (DAG) traversal.
 */
@Singleton
class PlatformBootstrap @Inject constructor(
    private val dependencyRegistry: DependencyRegistry,
    private val eventBus: EventBus
) {
    companion object {
        private const val TAG = "PlatformBootstrap"
    }

    /**
     * Executes the bootstrap sequence in topological order.
     */
    fun executeSequence() {
        Log.i(TAG, "Initiating dependency-driven bootstrap sequence...")
        
        try {
            val sequence = dependencyRegistry.getTopologicalSort()
            Log.i(TAG, "Calculated startup sequence: ${sequence.joinToString(" -> ")}")

            sequence.forEach { serviceName ->
                Log.d(TAG, "Initializing service: $serviceName")
                dependencyRegistry.resolve(serviceName)
                eventBus.publish(BootstrapEvent.ServiceResolved(serviceName))
            }

            Log.i(TAG, "All registered services have been initialized in dependency order.")
        } catch (e: Exception) {
            Log.e(TAG, "Bootstrap sequence failed: ${e.message}", e)
            throw e
        }
    }
}
