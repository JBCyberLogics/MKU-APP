package ke.ac.mku.authcore.manager.ui

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IStudentContextManager
import ke.ac.mku.authcore.contracts.ui.IWidgetRegistryManager
import ke.ac.mku.authcore.domain.model.ui.*
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * WidgetRegistryManager - PROGRAM-016
 *
 * Primary coordinator for the dynamic dashboard widget ecosystem.
 */
@Singleton
class WidgetRegistryManager @Inject constructor(
    private val contextManager: IStudentContextManager,
    private val factory: WidgetFactory,
    private val eligibilityEngine: WidgetEligibilityEngine,
    private val priorityManager: WidgetPriorityManager,
    private val authEventManager: IAuthenticationEventManager
) : IWidgetRegistryManager, BootstrapObserver {

    private val moduleId = "PROGRAM-016"
    private val moduleName = "Widget Registry"

    companion object {
        private const val TAG = "WidgetRegistry"
    }

    private val catalog = ConcurrentHashMap<String, WidgetMetadata>()

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
        initializeDefaultCatalog()
    }

    // ==================== IWidgetRegistryManager Implementation ====================

    override fun registerWidget(definition: WidgetDefinition) {
        val metadata = factory.createMetadata(definition)
        catalog[definition.widgetId] = metadata
        Log.d(TAG, "Registered widget: ${definition.name}")
        authEventManager.publish(BootstrapEvent.WidgetRegistered(definition.widgetId, definition.category.name))
    }

    override fun getDashboardBlueprint(): DashboardBlueprint {
        val context = contextManager.getStudentContext()
            ?: throw IllegalStateException("Student Context required for blueprint generation")

        val activeWidgets = catalog.values
            .filter { eligibilityEngine.isEligible(it, context) }
            .map { it.copy(currentPriority = priorityManager.calculatePriority(it, context)) }
            .sortedByDescending { it.currentPriority }

        authEventManager.publish(BootstrapEvent.DashboardBlueprintCreated)
        
        return DashboardBlueprint(
            blueprintId = "bp_${UUID.randomUUID()}",
            timestamp = System.currentTimeMillis(),
            widgets = activeWidgets
        )
    }

    override fun isWidgetActive(widgetId: String): Boolean = catalog.containsKey(widgetId)

    override fun resetRegistry() {
        catalog.clear()
        initializeDefaultCatalog()
    }

    // ==================== Private Helpers ====================

    private fun initializeDefaultCatalog() {
        Log.d(TAG, "Populating default widget catalog...")
        
        registerWidget(WidgetDefinition("w_profile", "My Profile", WidgetCategory.PROFILE, emptyList(), 100))
        registerWidget(WidgetDefinition("w_finance", "Fees & Payments", WidgetCategory.FEE_BALANCE, listOf("finance"), 90))
        registerWidget(WidgetDefinition("w_exams", "Exam Schedule", WidgetCategory.UPCOMING_EXAMS, listOf("learning"), 110))
        registerWidget(WidgetDefinition("w_units", "My Units", WidgetCategory.REGISTERED_UNITS, listOf("academic"), 80))
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.DashboardContextReady -> {
                Log.i(TAG, "Dashboard context ready. Finalizing widget registry...")
                authEventManager.publish(BootstrapEvent.WidgetRegistryCompleted)
                Log.i(TAG, "--- LAYER 4 (UI LAYER) STATUS: ACTIVE ---")
            }
            else -> {}
        }
    }
}
