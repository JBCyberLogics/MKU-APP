package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import ke.ac.mku.authcore.domain.model.portal.ValidationIssue
import ke.ac.mku.authcore.domain.model.portal.IssueSeverity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SchemaValidator - PROGRAM-015
 *
 * Ensures StudentContext matches expected internal structure.
 */
@Singleton
class SchemaValidator @Inject constructor() {

    fun validateSchema(context: StudentContext): List<ValidationIssue> {
        val issues = mutableListOf<ValidationIssue>()
        
        // 1. Mandatory Profile Fields
        if (context.student.registrationNumber.isBlank()) {
            issues.add(ValidationIssue("profile", "ERR_REG_MISSING", "Registration number is empty", IssueSeverity.CRITICAL))
        }
        
        // 2. mandatory Academic Fields
        if (context.academic.currentSemester.isBlank()) {
            issues.add(ValidationIssue("academic", "ERR_SEM_MISSING", "Semester information missing", IssueSeverity.HIGH))
        }

        return issues
    }
}
