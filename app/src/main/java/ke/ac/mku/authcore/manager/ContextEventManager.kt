package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IContextEventManager
import ke.ac.mku.authcore.contracts.portal.IContextSynchronizationManager
import ke.ac.mku.authcore.domain.model.portal.EventAuditEntry
import ke.ac.mku.authcore.domain.model.portal.PriorityLevel
import ke.ac.mku.authcore.domain.model.portal.RefreshPlan
import java.util.concurrent.ConcurrentLinkedDeque
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextEventManager - PROGRAM-014
 *
 * Coordinates high-level context intelligence events.
 */
@Singleton
class ContextEventManager @Inject constructor(
    private val syncManager: IContextSynchronizationManager,
    private val activityDetector: StudentActivityDetector,
    private val refreshPlanner: DashboardRefreshPlanner,
    private val dispatcher: PriorityEventDispatcher,
    private val authEventManager: IAuthenticationEventManager
) : IContextEventManager, BootstrapObserver {

    private val moduleId = "PROGRAM-014"
    private val moduleName = "Context Event Engine"

    companion object {
        private const val TAG = "ContextEventEngine"
    }

    private val auditLog = ConcurrentLinkedDeque<EventAuditEntry>()

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IContextEventManager Implementation ====================

    override fun getEventHistory(limit: Int): List<EventAuditEntry> {
        return auditLog.toList().take(limit)
    }

    override fun calculateRefreshPlan(): RefreshPlan {
        val delta = syncManager.getLatestDelta()
            ?: throw IllegalStateException("No active delta available for planning")
        
        return refreshPlanner.planRefresh(delta)
    }

    override fun clearAuditLog() {
        auditLog.clear()
    }

    // ==================== Event Lifecycle ====================

    private fun processContextChange() {
        Log.i(TAG, "New context change detected. Starting high-level event transformation...")
        authEventManager.publish(BootstrapEvent.ContextEventCreated)

        try {
            val delta = syncManager.getLatestDelta() ?: return
            
            // 1. Detect Activity
            val intelligenceEvents = activityDetector.detectActivity(delta)
            
            // 2. Dispatch with Priority
            intelligenceEvents.forEach { event ->
                val priority = determinePriority(event)
                dispatcher.dispatch(event, priority)
                
                // Audit
                auditLog.addFirst(EventAuditEntry(
                    eventId = "evt_${System.nanoTime()}",
                    eventName = event.javaClass.simpleName,
                    timestamp = System.currentTimeMillis(),
                    priority = priority,
                    source = moduleId
                ))
            }

            // 3. Plan UI Refresh
            val plan = refreshPlanner.planRefresh(delta)
            authEventManager.publish(BootstrapEvent.DashboardRefreshPlanned)
            authEventManager.publish(BootstrapEvent.DashboardRefreshRequired(plan.targetScope.name))

            authEventManager.publish(BootstrapEvent.ContextEventCompleted)

        } catch (e: Exception) {
            Log.e(TAG, "Event processing failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.ContextEventFailed(e.message ?: "Unknown error"))
        }
    }

    private fun determinePriority(event: BootstrapEvent): PriorityLevel {
        return when (event) {
            is BootstrapEvent.FeeBalanceChanged -> PriorityLevel.HIGH
            is BootstrapEvent.PaymentRecorded -> PriorityLevel.MEDIUM
            else -> PriorityLevel.LOW
        }
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.ContextUpdated -> {
                Log.d(TAG, "Context updated trigger. Transforming events...")
                processContextChange()
            }
            else -> {}
        }
    }
}
