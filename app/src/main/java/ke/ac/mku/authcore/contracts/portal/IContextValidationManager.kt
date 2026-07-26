package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.DashboardReadiness
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.portal.ValidationResult

/**
 * IContextValidationManager - PROGRAM-015
 *
 * Interface for the single validation gateway for Student Context.
 */
interface IContextValidationManager {

    /**
     * Validate the complete Student Context.
     */
    fun validate(context: StudentContext): ValidationResult

    /**
     * Determine whether the current context is safe for UI rendering.
     */
    fun getReadinessReport(): DashboardReadiness

    /**
     * Automatically repair minor context inconsistencies.
     */
    fun repairContext(context: StudentContext): StudentContext

    /**
     * Return the report from the most recent validation.
     */
    fun getLatestResult(): ValidationResult?
}
