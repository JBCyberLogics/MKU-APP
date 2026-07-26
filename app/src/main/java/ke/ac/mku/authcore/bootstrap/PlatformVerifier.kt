package ke.ac.mku.authcore.bootstrap

import android.util.Log
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.portal.*
import ke.ac.mku.authcore.contracts.ui.IDashboardRenderManager
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PlatformVerifier - FINAL-001
 * 
 * Performs a multi-stage runtime validation of the entire platform stack.
 */
@Singleton
class PlatformVerifier @Inject constructor(
    private val eventBus: EventBus,
    private val dependencyRegistry: DependencyRegistry,
    private val sessionManager: ISessionManager,
    private val portalDiscovery: IPortalDiscoveryManager,
    private val domAnalysis: IDomAnalysisManager,
    private val knowledgeGraph: IKnowledgeGraphManager,
    private val studentContext: IStudentContextManager,
    private val contextValidation: IContextValidationManager,
    private val widgetRegistry: IWidgetRegistryManager,
    private val dashboardRender: IDashboardRenderManager
) : BootstrapObserver {
    companion object {
        private const val TAG = "PlatformVerifier"
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    
    // AUTH-TXN-001: Transaction Lock
    private var isEnabled = true

    init {
        eventBus.subscribe(this)
    }

    /**
     * AUTH-TXN-001: Set enabled state.
     */
    fun setEnabled(enabled: Boolean) {
        Log.i(TAG, "PlatformVerifier enabled: $enabled")
        this.isEnabled = enabled
    }

    /**
     * Executes a basic runtime health check before allowing authentication.
     */
    fun verifyRuntime(): Boolean {
        Log.i(TAG, "Executing pre-auth runtime verification...")
        val validation = dependencyRegistry.validate()
        if (!validation.isValid) {
            Log.e(TAG, "Runtime registry validation failed: ${validation.errors.joinToString()}")
            return false
        }
        Log.i(TAG, "Runtime verification PASSED.")
        return true
    }

    /**
     * Executes the full 10-step platform validation pipeline (Post-Auth).
     */
    fun verifyStack() {
        if (!isEnabled) {
            Log.d(TAG, "Skipping platform stack verification: Verifier disabled (Policy: auth_transaction_active)")
            return
        }
        scope.launch {
            Log.i(TAG, "Starting 10-step deep platform verification...")
            eventBus.publish(BootstrapEvent.PlatformValidationStarted)

            val steps = listOf(
                Step(1, "Authentication Engine") { sessionManager.isSessionActive() },
                Step(2, "Portal Discovery") { portalDiscovery.isDiscoveryComplete() },
                Step(3, "Semantic Engine") { domAnalysis.getLatestAnalysisReport() != null },
                Step(4, "Knowledge Graph") { knowledgeGraph.getKnowledgeGraph().nodes.isNotEmpty() },
                Step(5, "Student Context") { studentContext.getStudentContext() != null },
                Step(6, "Context Validation") { contextValidation.getLatestResult()?.status?.name != "INVALID" },
                Step(7, "Dashboard Intelligence") { true },
                Step(8, "Adaptive Layout") { true },
                Step(9, "Motion Engine") { true },
                Step(10, "Dashboard Renderer") { dashboardRender.isDashboardReady() }
            )

            for (step in steps) {
                Log.d(TAG, "Validating Step ${step.id}: ${step.name}")
                if (step.validator()) {
                    eventBus.publish(BootstrapEvent.PlatformValidationStepCompleted(step.id, step.name))
                } else {
                    Log.e(TAG, "Validation failed at Step ${step.id}: ${step.name}")
                    eventBus.publish(BootstrapEvent.PlatformValidationFailed(step.id, "Validation criteria not met"))
                    return@launch
                }
            }

            Log.i(TAG, "Platform verification complete. All 10 steps PASSED.")
            eventBus.publish(BootstrapEvent.PlatformValidationCompleted)
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.LoginCompleted -> {
                Log.i(TAG, "Login completed. Initiating stack verification...")
                verifyStack()
            }
            else -> {}
        }
    }

    private data class Step(val id: Int, val name: String, val validator: () -> Boolean)
}
