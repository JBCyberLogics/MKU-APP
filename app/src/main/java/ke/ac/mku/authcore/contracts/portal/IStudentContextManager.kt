package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.domain.model.portal.ContextSnapshot
import ke.ac.mku.authcore.domain.model.portal.StudentContext

/**
 * IStudentContextManager - PROGRAM-011
 *
 * Interface for the unified student context engine.
 */
interface IStudentContextManager {

    /**
     * Return the current live student context.
     */
    fun getStudentContext(): StudentContext?

    /**
     * Trigger a manual refresh of the student context from the knowledge graph.
     */
    fun refreshContext()

    /**
     * Return a historical snapshot of the student context.
     */
    fun getContextSnapshot(): ContextSnapshot?

    /**
     * Clear the current context.
     */
    fun clearContext()
}
