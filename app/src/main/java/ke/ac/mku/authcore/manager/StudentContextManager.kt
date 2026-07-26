package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IKnowledgeGraphManager
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager
import ke.ac.mku.authcore.domain.model.portal.ContextSnapshot
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * StudentContextManager - PROGRAM-011
 *
 * Coordinates the complete student context lifecycle.
 */
@Singleton
class StudentContextManager @Inject constructor(
    private val graphManager: IKnowledgeGraphManager,
    private val contextBuilder: StudentContextBuilder,
    private val priorityEngine: PriorityEngine,
    private val authEventManager: IAuthenticationEventManager
) : IStudentContextManager, BootstrapObserver {

    private val moduleId = "PROGRAM-011"
    private val moduleName = "Student Context Core"

    companion object {
        private const val TAG = "StudentContext"
    }

    private var currentContext: StudentContext? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IStudentContextManager Implementation ====================

    override fun getStudentContext(): StudentContext? = currentContext

    override fun refreshContext() {
        Log.i(TAG, "Refreshing student context from knowledge base...")
        authEventManager.publish(BootstrapEvent.StudentContextStarted)

        try {
            val graph = graphManager.getKnowledgeGraph()
            
            // 1. Build initial context
            var context = contextBuilder.build(graph)
            
            // 2. Calculate Priorities
            val priorities = priorityEngine.calculatePriorities(context)
            context = context.copy(priorities = priorities)

            // 3. Update State
            currentContext = context
            
            // 4. Publish Events
            authEventManager.publish(BootstrapEvent.StudentContextUpdated)
            authEventManager.publish(BootstrapEvent.StudentContextReady)
            
            Log.i(TAG, "Student context refresh complete.")
            Log.i(TAG, "--- LAYER 3 (CONTEXT LAYER) STATUS: COMPLETE ---")

        } catch (e: Exception) {
            Log.e(TAG, "Failed to refresh student context: ${e.message}")
            authEventManager.publish(BootstrapEvent.StudentContextFailed(e.message ?: "Unknown error"))
        }
    }

    override fun getContextSnapshot(): ContextSnapshot? {
        return currentContext?.let {
            ContextSnapshot(
                contextId = "snapshot_${System.nanoTime()}",
                timestamp = System.currentTimeMillis(),
                context = it,
                reason = "Manual Snapshot"
            )
        }
    }

    override fun clearContext() {
        currentContext = null
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.KnowledgeGraphCompleted -> {
                Log.i(TAG, "Intelligence Layer ready. Building student context...")
                refreshContext()
            }
            else -> {}
        }
    }
}
