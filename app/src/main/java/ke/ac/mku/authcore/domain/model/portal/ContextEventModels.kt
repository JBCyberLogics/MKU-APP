package ke.ac.mku.authcore.domain.model.portal

/**
 * ContextEventModels - PROGRAM-014
 *
 * Models for intelligent student events and dashboard refresh planning.
 */

data class EventAuditEntry(
    val eventId: String,
    val eventName: String,
    val timestamp: Long,
    val priority: PriorityLevel,
    val source: String,
    val metadata: Map<String, String> = emptyMap()
)

data class RefreshPlan(
    val planId: String,
    val timestamp: Long,
    val targetScope: RefreshScope,
    val affectedDomains: List<String>,
    val priority: PriorityLevel
)

enum class RefreshScope {
    SINGLE_WIDGET,
    SECTION,
    ENTIRE_DASHBOARD
}
