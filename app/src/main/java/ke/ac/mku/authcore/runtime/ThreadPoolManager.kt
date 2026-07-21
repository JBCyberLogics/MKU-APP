package ke.ac.mku.authcore.runtime

import android.util.Log
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manages thread pools for the Authentication Core.
 *
 * Thread pools:
 * - network_pool: 8 threads for network operations
 * - background_pool: 4 threads for background tasks
 * - computation_pool: CPU cores for CPU-intensive work
 */
@Singleton
class ThreadPoolManager @Inject constructor() {

    companion object {
        private const val TAG = "ThreadPoolManager"
        private const val NETWORK_POOL_SIZE = 8
        private const val BACKGROUND_POOL_SIZE = 4
        private const val SHUTDOWN_TIMEOUT_SECONDS = 30L
    }

    private var networkPool: ExecutorService? = null
    private var backgroundPool: ExecutorService? = null
    private var computationPool: ExecutorService? = null

    private var isInitialized = false

    /**
     * Initialize all thread pools.
     */
    fun initialize() {
        if (isInitialized) {
            Log.w(TAG, "Thread pools already initialized")
            return
        }

        Log.i(TAG, "Initializing thread pools...")

        networkPool = Executors.newFixedThreadPool(NETWORK_POOL_SIZE) { runnable ->
            Thread(runnable, "network-pool-${System.currentTimeMillis()}").apply {
                isDaemon = true
            }
        }

        backgroundPool = Executors.newFixedThreadPool(BACKGROUND_POOL_SIZE) { runnable ->
            Thread(runnable, "background-pool-${System.currentTimeMillis()}").apply {
                isDaemon = true
            }
        }

        val cpuCores = Runtime.getRuntime().availableProcessors()
        computationPool = Executors.newFixedThreadPool(cpuCores) { runnable ->
            Thread(runnable, "computation-pool-${System.currentTimeMillis()}").apply {
                isDaemon = true
            }
        }

        isInitialized = true
        Log.i(TAG, "Thread pools initialized: network=$NETWORK_POOL_SIZE, background=$BACKGROUND_POOL_SIZE, computation=$cpuCores")
    }

    /**
     * Get the network thread pool.
     */
    fun getNetworkPool(): ExecutorService {
        return networkPool ?: throw IllegalStateException("Thread pools not initialized. Call initialize() first.")
    }

    /**
     * Get the background thread pool.
     */
    fun getBackgroundPool(): ExecutorService {
        return backgroundPool ?: throw IllegalStateException("Thread pools not initialized. Call initialize() first.")
    }

    /**
     * Get the computation thread pool.
     */
    fun getComputationPool(): ExecutorService {
        return computationPool ?: throw IllegalStateException("Thread pools not initialized. Call initialize() first.")
    }

    /**
     * Get the number of active threads across all pools.
     */
    fun getActiveThreadCount(): Int {
        val networkActive = networkPool?.let { pool ->
            if (pool is java.util.concurrent.ThreadPoolExecutor) {
                pool.activeCount
            } else 0
        } ?: 0

        val backgroundActive = backgroundPool?.let { pool ->
            if (pool is java.util.concurrent.ThreadPoolExecutor) {
                pool.activeCount
            } else 0
        } ?: 0

        val computationActive = computationPool?.let { pool ->
            if (pool is java.util.concurrent.ThreadPoolExecutor) {
                pool.activeCount
            } else 0
        } ?: 0

        return networkActive + backgroundActive + computationActive
    }

    /**
     * Get the total number of threads across all pools.
     */
    fun getTotalThreadCount(): Int {
        return NETWORK_POOL_SIZE + BACKGROUND_POOL_SIZE + Runtime.getRuntime().availableProcessors()
    }

    /**
     * Shutdown all thread pools gracefully.
     */
    fun shutdown() {
        Log.i(TAG, "Shutting down thread pools...")

        listOf(networkPool, backgroundPool, computationPool).forEach { pool ->
            pool?.let {
                it.shutdown()
                try {
                    if (!it.awaitTermination(SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                        it.shutdownNow()
                        if (!it.awaitTermination(SHUTDOWN_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                            Log.e(TAG, "Thread pool did not terminate")
                        }
                    }
                } catch (e: InterruptedException) {
                    it.shutdownNow()
                    Thread.currentThread().interrupt()
                }
            }
        }

        isInitialized = false
        Log.i(TAG, "Thread pools shut down")
    }

    /**
     * Check if thread pools are initialized.
     */
    fun isInitialized(): Boolean = isInitialized
}