package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextChangeDetector - PROGRAM-012
 *
 * Detects modifications within the Student Context.
 */
@Singleton
class ContextChangeDetector @Inject constructor() {

    fun detectChanges(old: StudentContext?, current: StudentContext): List<String> {
        if (old == null) return listOf("all")
        
        val changedDomains = mutableListOf<String>()
        
        // 1. Profile Check
        if (old.student != current.student) changedDomains.add("student_profile")
        
        // 2. Academic Check
        if (old.academic != current.academic) changedDomains.add("academic")
        
        // 3. Finance Check
        if (old.finance != current.finance) changedDomains.add("finance")
        
        Log.d("ChangeDetector", "Detected ${changedDomains.size} modified domains.")
        return changedDomains
    }
}
