package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.bootstrap.BootstrapEvent

/**
 * IAuthenticationEventManager - AUTH-004, CORE-012
 *
 * Central event management contract for the Authentication Platform.
 * Serves as the single event gateway for all authentication lifecycle events.
 *
 * This interface is the mandatory pathway for ALL authentication events.
 * Authentication modules shall NEVER publish directly to BootstrapEvent.
 * AuthenticationEventManager validates, records, enriches, and forwards
 * events to BootstrapEvent (used as transport only).
 *
 * Event Flow (9 steps):
 * 1. Authentication module creates event
 * 2. Event sent to AuthenticationEventManager
 * 3. Validate event
 * 4. Deduplicate event
 * 5. Assign correlation identifier
 * 6. Persist encrypted event history
 * 7. Apply security validation
 * 8. Publish through BootstrapEvent
 * 9. Notify subscribers
 *
 * Contract Reference: CORE-012, AUTH-004
 */
interface IAuthenticationEventManager {

    // ==================== CORE EVENT OPERATIONS ====================

    /**
     * Publish an authentication event through the event gateway.
     *
     * This is the single entry point for all authentication events.
     * The event will be validated, deduplicated, enriched with correlation ID,
     * persisted to AUTH_EVENTS domain, security-checked, and then forwarded
     * to BootstrapEvent for distribution.
     *
     * @param event The BootstrapEvent to publish
     */
    fun publish(event: BootstrapEvent)

    /**
     * Subscribe to authentication events.
     *
     * The subscriber will be notified of all events that pass through
     * the event gateway after processing.
     *
     * @param subscriber The subscriber to register
     */
    fun subscribe(subscriber: AuthEventSubscriber)

    /**
     * Unsubscribe from authentication events.
     *
     * @param subscriber The subscriber to remove
     */
    fun unsubscribe(subscriber: AuthEventSubscriber)

    // ==================== EVENT REPLAY OPERATIONS ====================

    /**
     * Replay stored authentication events.
     *
     * Useful for event sourcing, debugging, and recovery scenarios.
     *
     * @param filter Optional filter criteria (null for all events)
     * @param limit Maximum number of events to return
     * @return List of BootstrapEvent objects in chronological order
     */
    fun replayEvents(filter: EventFilter?, limit: Int): List<BootstrapEvent>

    /**
     * Clear all stored authentication events.
     *
     * Use with caution - this is typically only used for testing
     * or when a complete reset is required.
     */
    fun clearEvents()

    // ==================== EVENT HISTORY OPERATIONS ====================

    /**
     * Get authentication event history with pagination.
     *
     * @param filter Optional filter criteria (null for all events)
     * @param limit Maximum number of events to return
     * @param offset Number of events to skip
     * @return List of AuthEventRecord objects
     */
    fun getEventHistory(filter: EventFilter?, limit: Int, offset: Int): List<AuthEventRecord>

    // ==================== METRICS OPERATIONS ====================

    /**
     * Get event processing metrics.
     *
     * @return AuthEventMetrics with current statistics
     */
    fun getMetrics(): AuthEventMetrics
}

// ==================== SUPPORTING DATA CLASSES ====================

/**
 * Auth event subscriber callback interface.
 *
 * Implementations receive notifications of authentication events
 * that pass through the event gateway.
 */
interface AuthEventSubscriber {
    /**
     * Called when an authentication event is published.
     *
     * @param event The BootstrapEvent that was published
     */
    fun onAuthEvent(event: BootstrapEvent)
}

/**
 * Record of a stored authentication event.
 *
 * @property timestamp When the event was recorded
 * @property eventType The type/class name of the event
 * @property correlationId Unique identifier for correlating related events
 * @property payload Serialized event data
 * @property archived Whether the event has been archived
 */
data class AuthEventRecord(
    val timestamp: Long,
    val eventType: String,
    val correlationId: String,
    val payload: String,
    val archived: Boolean = false
)

/**
 * Filter criteria for querying events.
 *
 * @property eventType Filter by event type (null for all types)
 * @property startTime Filter events after this timestamp (null for no start limit)
 * @property endTime Filter events before this timestamp (null for no end limit)
 * @property correlationId Filter by correlation ID (null for all)
 */
data class EventFilter(
    val eventType: String? = null,
    val startTime: Long? = null,
    val endTime: Long? = null,
    val correlationId: String? = null
)

/**
 * Metrics for authentication event processing.
 *
 * @property totalEvents Total events received
 * @property publishedEvents Events successfully published
 * @property failedEvents Events that failed processing
 * @property averageLatencyMs Average processing latency in milliseconds
 * @property deduplicatedCount Number of duplicate events filtered
 */
data class AuthEventMetrics(
    val totalEvents: Long,
    val publishedEvents: Long,
    val failedEvents: Long,
    val averageLatencyMs: Double,
    val deduplicatedCount: Long
)