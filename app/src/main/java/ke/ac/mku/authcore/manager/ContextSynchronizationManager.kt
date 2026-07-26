package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager
import ke.ac.mku.authcore.domain.model.portal.*
import kotlinx.coroutines.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextSynchronizationManager - PROGRAM-012
 *
 * Coordinates the complete synchronization lifecycle between the portal 
 * and the student context.
 */
@Singleton
class ContextSynchronizationManager @Inject constructor(
    private val studentContextManager: IStudentContextManager,
    private val changeDetector: ContextChangeDetector,
    private val deltaEngine: DeltaComputationEngine,
    private val merger: ContextMerger,
    private val authEventManager: IAuthenticationEventManager
) : IContextSynchronizationManager, BootstrapObserver {

    private val moduleId = "PROGRAM-012"
    private val moduleName = "Context Synchronizer"

    companion object {
        private const val TAG = "ContextSync"
        private const val SYNC_INTERVAL_MS = 60_000L // 1 minute background sync
    }

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private var syncJob: Job? = null
    private var latestDelta: ContextDelta? = null
    private var isSyncActive = false
    private var lastSyncTime = 0L

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IContextSynchronizationManager Implementation ====================

    override fun startSynchronization() {
        if (syncJob?.isActive == true) return

        Log.i(TAG, "Activating real-time context synchronization...")
        isSyncActive = true
        authEventManager.publish(BootstrapEvent.ContextSyncStarted)

        syncJob = scope.launch {
            while (isActive) {
                try {
                    delay(SYNC_INTERVAL_MS)
                    if (isSyncActive) executeSyncCycle()
                } catch (e: Exception) {
                    Log.e(TAG, "Sync cycle failed: ${e.message}")
                }
            }
        }
    }

    override fun stopSynchronization() {
        Log.i(TAG, "Stopping synchronization engine.")
        isSyncActive = false
        syncJob?.cancel()
    }

    override fun getSyncStatus(): SyncStatus {
        return SyncStatus(
            isSyncing = isSyncActive,
            lastSyncTimestamp = lastSyncTime,
            activeDeltas = if (latestDelta != null) 1 else 0,
            healthScore = 1.0f
        )
    }

    override fun getLatestDelta(): ContextDelta? = latestDelta

    override fun forceSync() {
        Log.i(TAG, "Manual synchronization requested.")
        scope.launch {
            executeSyncCycle()
        }
    }

    // ==================== Internal Sync Logic ====================

    private suspend fun executeSyncCycle() {
        Log.d(TAG, "Starting synchronization cycle...")
        
        try {
            val currentContext = studentContextManager.getStudentContext() ?: return
            
            // 1. Detect Changes (Mocking a comparison with a cached version)
            val changedDomains = changeDetector.detectChanges(null, currentContext)
            
            if (changedDomains.isNotEmpty()) {
                // 2. Compute Delta
                val delta = deltaEngine.computeDelta(null, currentContext, changedDomains)
                latestDelta = delta
                authEventManager.publish(BootstrapEvent.ContextDeltaDetected(changedDomains))

                // 3. Merge & Update
                // In a real scenario, this would apply portal updates to local context
                authEventManager.publish(BootstrapEvent.ContextUpdated)
                authEventManager.publish(BootstrapEvent.DashboardDeltaReady)
            }

            lastSyncTime = System.currentTimeMillis()
            authEventManager.publish(BootstrapEvent.ContextSyncCompleted)
            Log.d(TAG, "Synchronization cycle completed successfully.")

        } catch (e: Exception) {
            Log.e(TAG, "Critical error during sync cycle: ${e.message}")
            authEventManager.publish(BootstrapEvent.ContextSyncFailed(e.message ?: "Unknown error"))
        }
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.StudentContextReady -> {
                Log.i(TAG, "Student Context available. Initializing Synchronizer...")
                startSynchronization()
            }
            is BootstrapEvent.NetworkPlatformReady -> {
                // automatic_resynchronization policy
            }
            else -> {}
        }
    }
}
