package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.portal.ValidationIssue
import ke.ac.mku.authcore.domain.model.portal.IssueSeverity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * IntegrityValidator - PROGRAM-015
 *
 * Checks consistency between different context domains.
 */
@Singleton
class IntegrityValidator @Inject constructor() {

    fun checkIntegrity(context: StudentContext): List<ValidationIssue> {
        val issues = mutableListOf<ValidationIssue>()
        
        // Example: Check if fee balance is consistent with status
        if (context.finance.feeBalance > 0 && context.finance.financialStatus == "CLEARED") {
            issues.add(ValidationIssue("finance", "ERR_FIN_INCONSISTENT", "Fee balance > 0 but status is CLEARED", IssueSeverity.MEDIUM))
        }

        return issues
    }
}
