package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.ContextDelta
import ke.ac.mku.authcore.domain.model.portal.StudentContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextMerger - PROGRAM-012
 *
 * Safely applies incremental updates to the student context.
 */
@Singleton
class ContextMerger @Inject constructor() {

    fun merge(current: StudentContext, delta: ContextDelta): StudentContext {
        Log.d("ContextMerger", "Merging delta ${delta.deltaId} into current context.")
        
        // In a real implementation, this would use reflection or a deep merge logic
        return current.copy(
            generatedAt = delta.timestamp
        )
    }
}
