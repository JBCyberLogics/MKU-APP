package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.portal.IContextValidationManager
import ke.ac.mku.authcore.domain.model.portal.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextValidationManager - PROGRAM-015
 *
 * Single validation gateway for the Student Context.
 */
@Singleton
class ContextValidationManager @Inject constructor(
    private val schemaValidator: SchemaValidator,
    private val integrityValidator: IntegrityValidator,
    private val repairEngine: ContextRepairEngine,
    private val readinessEvaluator: DashboardReadinessEvaluator,
    private val authEventManager: IAuthenticationEventManager
) : IContextValidationManager, BootstrapObserver {

    private val moduleId = "PROGRAM-015"
    private val moduleName = "Context Validator"

    companion object {
        private const val TAG = "ContextValidator"
    }

    private var latestResult: ValidationResult? = null

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IContextValidationManager Implementation ====================

    override fun validate(context: StudentContext): ValidationResult {
        Log.i(TAG, "Starting context validation for student: ${context.student.registrationNumber}")
        authEventManager.publish(BootstrapEvent.ContextValidationStarted)

        try {
            // 1. Schema Validation
            val schemaIssues = schemaValidator.validateSchema(context)
            
            // 2. Integrity Analysis
            val integrityIssues = integrityValidator.checkIntegrity(context)
            
            val allIssues = schemaIssues + integrityIssues

            // 3. Repair (if needed)
            val (repairedContext, repairs) = if (allIssues.any { it.severity == IssueSeverity.HIGH }) {
                repairEngine.repair(context)
            } else {
                context to emptyList()
            }

            if (repairs.isNotEmpty()) {
                authEventManager.publish(BootstrapEvent.ContextRepaired("Automated Data Repair"))
            }

            // 4. Create Result
            val result = ValidationResult(
                validationId = "val_${System.nanoTime()}",
                status = if (allIssues.isEmpty()) ValidationStatus.VALID else ValidationStatus.WARNING,
                overallConfidence = context.healthScore,
                issues = allIssues,
                repairs = repairs,
                dashboardReady = false // Set by readiness check
            )

            // 5. Readiness check
            val readiness = readinessEvaluator.evaluate(result)
            val finalResult = result.copy(dashboardReady = readiness.isReady)

            latestResult = finalResult
            
            authEventManager.publish(BootstrapEvent.ValidationCompleted)
            if (finalResult.dashboardReady) {
                authEventManager.publish(BootstrapEvent.DashboardContextReady)
                authEventManager.publish(BootstrapEvent.LayerThreeCompleted)
                Log.i(TAG, "Context validated and dashboard ready.")
                Log.i(TAG, "--- LAYER 3 (CONTEXT LAYER) STATUS: COMPLETE ---")
            }

            return finalResult

        } catch (e: Exception) {
            Log.e(TAG, "Validation process failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.ContextValidationFailed(e.message ?: "Unknown error"))
            throw e
        }
    }

    override fun getReadinessReport(): DashboardReadiness {
        return latestResult?.let { readinessEvaluator.evaluate(it) } 
            ?: DashboardReadiness(false, emptyList(), 0f, "No validation result")
    }

    override fun repairContext(context: StudentContext): StudentContext {
        return repairEngine.repair(context).first
    }

    override fun getLatestResult(): ValidationResult? = latestResult

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.StudentContextUpdated -> {
                Log.d(TAG, "Context update trigger. Initiating validation...")
                // In a real scenario, this might retrieve the context from Manager
            }
            else -> {}
        }
    }
}
