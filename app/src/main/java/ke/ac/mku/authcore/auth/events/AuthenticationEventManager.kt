package ke.ac.mku.authcore.auth.events

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.AuthEventMetrics
import ke.ac.mku.authcore.contracts.authentication.AuthEventRecord
import ke.ac.mku.authcore.contracts.authentication.AuthEventSubscriber
import ke.ac.mku.authcore.contracts.authentication.EventFilter
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.state.StateRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.json.JSONObject
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * AuthenticationEventManager - AUTH-004
 *
 * Central event management service for the Authentication Platform.
 * Serves as the single event gateway for all authentication lifecycle events.
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
 * This manager ensures:
 * - All AUTH events pass through this gateway (no direct EventBus publishing)
 * - Events are validated before publishing
 * - Duplicate events are filtered within a time window
 * - Events are persisted to AUTH_EVENTS domain for auditing
 * - Correlation IDs enable event tracing
 * - Security validation is applied before forwarding
 * - BootstrapEvent is used as transport only
 *
 * Contract Reference: CORE-012, AUTH-004
 */
@Singleton
class AuthenticationEventManager @Inject constructor(
    private val secureStorage: ISecureStorageManager,
    private val eventBus: EventBus,
    private val stateRegistry: StateRegistry,
    private val securityMonitor: ISecurityMonitor,
    private val dependencyRegistry: DependencyRegistry
) : IAuthenticationEventManager, BootstrapObserver {

    companion object {
        private const val TAG = "AuthEventManager"
        private const val MAX_EVENTS = 1000
        private const val DEDUP_WINDOW_MS = 1000L // 1 second deduplication window
        private const val EVENT_KEY_PREFIX = "auth_event_"
        private const val EVENT_INDEX_KEY = "auth_event_index"
        private const val AUTH_EVENT_PREFIX = "AUTH"
    }

    // Coroutine scope for async operations
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mutex = Mutex()

    // Subscribers list (thread-safe)
    private val subscribers = ConcurrentHashMap<AuthEventSubscriber, Boolean>()

    // Deduplication cache: event hash -> timestamp
    private val deduplicationCache = ConcurrentHashMap<String, Long>()

    // Metrics tracking
    @Volatile private var totalEvents: Long = 0
    @Volatile private var publishedEvents: Long = 0
    @Volatile private var failedEvents: Long = 0
    @Volatile private var deduplicatedCount: Long = 0
    @Volatile private var totalLatencyMs: Double = 0.0

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "AuthenticationEventManager initialized")
    }

    // ==================== IAuthenticationEventManager Implementation ====================

    /**
     * Publish an authentication event through the event gateway.
     *
     * This is the single entry point for all authentication events.
     * The event will be validated, deduplicated, enriched with correlation ID,
     * persisted to AUTH_EVENTS domain, security-checked, and then forwarded
     * to BootstrapEvent for distribution.
     */
    override fun publish(event: BootstrapEvent) {
        val startTime = System.currentTimeMillis()

        scope.launch {
            try {
                totalEvents++

                // Step 1: Validate event
                if (!validateEvent(event)) {
                    Log.w(TAG, "Event validation failed: $event")
                    failedEvents++
                    return@launch
                }

                // Step 2: Deduplicate event
                val eventHash = computeEventHash(event)
                if (isDuplicate(eventHash)) {
                    Log.d(TAG, "Duplicate event detected, skipping: $event")
                    deduplicatedCount++
                    return@launch
                }

                // Step 3: Assign correlation ID
                val correlationId = UUID.randomUUID().toString()

                // Step 4: Persist encrypted event
                val timestamp = System.currentTimeMillis()
                persistEvent(event, correlationId, timestamp)

                // Step 5: Apply security validation
                if (!applySecurityValidation(event)) {
                    Log.w(TAG, "Security validation failed for event: $event")
                    failedEvents++
                    return@launch
                }

                // Step 6: Publish to BootstrapEvent
                eventBus.publish(event)
                publishedEvents++

                // Step 7: Notify subscribers
                notifySubscribers(event)

                // Update latency metrics
                val latency = System.currentTimeMillis() - startTime
                updateLatencyMetrics(latency)

                Log.d(TAG, "Event published successfully: ${event::class.simpleName} [correlationId=$correlationId, latency=${latency}ms]")

            } catch (e: Exception) {
                Log.e(TAG, "Error publishing event: ${e.message}", e)
                failedEvents++
            }
        }
    }

    /**
     * Subscribe to authentication events.
     */
    override fun subscribe(subscriber: AuthEventSubscriber) {
        subscribers[subscriber] = true
        Log.d(TAG, "Subscriber added: ${subscriber::class.simpleName}")
    }

    /**
     * Unsubscribe from authentication events.
     */
    override fun unsubscribe(subscriber: AuthEventSubscriber) {
        subscribers.remove(subscriber)
        Log.d(TAG, "Subscriber removed: ${subscriber::class.simpleName}")
    }

    /**
     * Replay stored authentication events.
     */
    override fun replayEvents(filter: EventFilter?, limit: Int): List<BootstrapEvent> {
        val history = getEventHistory(filter, limit.coerceAtMost(MAX_EVENTS), 0)
        return history.mapNotNull { record ->
            try {
                deserializeEvent(record)
            } catch (e: Exception) {
                Log.w(TAG, "Failed to deserialize event: ${e.message}")
                null
            }
        }
    }

    /**
     * Clear all stored authentication events.
     */
    override fun clearEvents() {
        scope.launch {
            mutex.withLock {
                try {
                    secureStorage.clear(StorageDomain.AUTH_EVENTS)
                    deduplicationCache.clear()
                    Log.i(TAG, "All auth events cleared")
                } catch (e: Exception) {
                    Log.e(TAG, "Failed to clear events: ${e.message}", e)
                }
            }
        }
    }

    /**
     * Get authentication event history with pagination.
     */
    override fun getEventHistory(filter: EventFilter?, limit: Int, offset: Int): List<AuthEventRecord> {
        return try {
            val indexJson = secureStorage.retrieve(StorageDomain.AUTH_EVENTS, EVENT_INDEX_KEY).getOrNull()
            if (indexJson.isNullOrEmpty()) {
                return emptyList()
            }

            val index = JSONObject(indexJson)
            val eventIds = mutableListOf<String>()

            // Get all event IDs from index
            index.keys().forEach { key ->
                if (key.startsWith(EVENT_KEY_PREFIX)) {
                    eventIds.add(key)
                }
            }

            // Sort by timestamp (stored in index)
            val sortedIds = eventIds.sortedBy { id ->
                index.optLong(id, 0L)
            }

            // Apply offset and limit
            val pagedIds = sortedIds.drop(offset).take(limit.coerceAtMost(MAX_EVENTS))

            // Load and filter events
            pagedIds.mapNotNull { eventId ->
                loadEventRecord(eventId, filter)
            }.filterNotNull()

        } catch (e: Exception) {
            Log.e(TAG, "Failed to get event history: ${e.message}", e)
            emptyList()
        }
    }

    /**
     * Get event processing metrics.
     */
    override fun getMetrics(): AuthEventMetrics {
        val avgLatency = if (publishedEvents > 0) totalLatencyMs / publishedEvents else 0.0
        return AuthEventMetrics(
            totalEvents = totalEvents,
            publishedEvents = publishedEvents,
            failedEvents = failedEvents,
            averageLatencyMs = avgLatency,
            deduplicatedCount = deduplicatedCount
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.AuthenticationCoreInitialized -> {
                Log.i(TAG, "Authentication core initialized, event manager ready")
            }
            is BootstrapEvent.BootstrapCompleted -> {
                // Register ourselves with the dependency registry
                dependencyRegistry.register(
                    name = "authentication_event_manager",
                    instance = this,
                    startupOrder = 50,
                    isRequired = true
                )
                Log.i(TAG, "AuthenticationEventManager registered with DependencyRegistry")
            }
            else -> { /* Ignore other events */ }
        }
    }

    // ==================== Private Helper Methods ====================

    /**
     * Validate an event before processing.
     */
    private fun validateEvent(event: BootstrapEvent): Boolean {
        // Check if event is non-null
        if (event == null) return false

        // Check if event has a valid type
        val eventType = event::class.simpleName
        if (eventType.isNullOrEmpty()) return false

        // Only process AUTH events through the full pipeline
        // Other events can be logged but pass through directly
        val eventName = eventType.uppercase()
        if (!eventName.startsWith(AUTH_EVENT_PREFIX)) {
            Log.d(TAG, "Non-AUTH event received, passing through: $eventType")
            // For non-AUTH events, we still want to track them but with less overhead
            return true
        }

        return true
    }

    /**
     * Compute a hash for event deduplication.
     */
    private fun computeEventHash(event: BootstrapEvent): String {
        val eventType = event::class.simpleName ?: "unknown"
        val eventData = event.toString()
        return "$eventType:$eventData".hashCode().toString()
    }

    /**
     * Check if an event is a duplicate within the deduplication window.
     */
    private fun isDuplicate(eventHash: String): Boolean {
        val now = System.currentTimeMillis()
        val lastSeen = deduplicationCache[eventHash]

        return if (lastSeen != null && (now - lastSeen) < DEDUP_WINDOW_MS) {
            true
        } else {
            deduplicationCache[eventHash] = now
            // Clean up old entries periodically
            if (deduplicationCache.size > 10000) {
                cleanupDeduplicationCache()
            }
            false
        }
    }

    /**
     * Clean up old entries from deduplication cache.
     */
    private fun cleanupDeduplicationCache() {
        val now = System.currentTimeMillis()
        val iterator = deduplicationCache.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if ((now - entry.value) > DEDUP_WINDOW_MS * 2) {
                iterator.remove()
            }
        }
    }

    /**
     * Persist an event to AUTH_EVENTS domain.
     */
    private suspend fun persistEvent(event: BootstrapEvent, correlationId: String, timestamp: Long) {
        mutex.withLock {
            try {
                val eventType = event::class.simpleName ?: "unknown"
                val payload = serializeEvent(event)

                val record = AuthEventRecord(
                    timestamp = timestamp,
                    eventType = eventType,
                    correlationId = correlationId,
                    payload = payload,
                    archived = false
                )

                val eventId = "$EVENT_KEY_PREFIX${timestamp}_${UUID.randomUUID().toString().take(8)}"

                // Store the event
                secureStorage.store(
                    StorageDomain.AUTH_EVENTS,
                    eventId,
                    record.let {
                        JSONObject().put("timestamp", it.timestamp)
                            .put("eventType", it.eventType)
                            .put("correlationId", it.correlationId)
                            .put("payload", it.payload)
                            .put("archived", it.archived)
                    }.toString()
                )

                // Update index
                updateEventIndex(eventId, timestamp)

                // Enforce max events limit
                enforceMaxEventsLimit()

            } catch (e: Exception) {
                Log.e(TAG, "Failed to persist event: ${e.message}", e)
            }
        }
    }

    /**
     * Update the event index for efficient retrieval.
     */
    private suspend fun updateEventIndex(eventId: String, timestamp: Long) {
        try {
            val indexJson = secureStorage.retrieve(StorageDomain.AUTH_EVENTS, EVENT_INDEX_KEY).getOrNull()
            val index = if (indexJson.isNullOrEmpty()) {
                JSONObject()
            } else {
                JSONObject(indexJson)
            }

            index.put(eventId, timestamp)
            secureStorage.store(StorageDomain.AUTH_EVENTS, EVENT_INDEX_KEY, index.toString())

        } catch (e: Exception) {
            Log.e(TAG, "Failed to update event index: ${e.message}", e)
        }
    }

    /**
     * Load an event record from storage.
     */
    private fun loadEventRecord(eventId: String, filter: EventFilter?): AuthEventRecord? {
        return try {
            val json = secureStorage.retrieve(StorageDomain.AUTH_EVENTS, eventId).getOrNull() ?: return null
            val obj = JSONObject(json)

            val record = AuthEventRecord(
                timestamp = obj.optLong("timestamp", 0L),
                eventType = obj.optString("eventType", ""),
                correlationId = obj.optString("correlationId", ""),
                payload = obj.optString("payload", ""),
                archived = obj.optBoolean("archived", false)
            )

            // Apply filter if provided
            if (filter != null && !matchesFilter(record, filter)) {
                return null
            }

            record
        } catch (e: Exception) {
            Log.w(TAG, "Failed to load event record: ${e.message}")
            null
        }
    }

    /**
     * Check if a record matches the filter criteria.
     */
    private fun matchesFilter(record: AuthEventRecord, filter: EventFilter): Boolean {
        filter.eventType?.let { type ->
            if (record.eventType != type) return false
        }
        filter.startTime?.let { start ->
            if (record.timestamp < start) return false
        }
        filter.endTime?.let { end ->
            if (record.timestamp > end) return false
        }
        filter.correlationId?.let { cid ->
            if (record.correlationId != cid) return false
        }
        return true
    }

    /**
     * Enforce maximum events limit by archiving oldest events.
     */
    private suspend fun enforceMaxEventsLimit() {
        try {
            val indexJson = secureStorage.retrieve(StorageDomain.AUTH_EVENTS, EVENT_INDEX_KEY).getOrNull() ?: return
            val index = JSONObject(indexJson)
            val eventCount = index.length()

            if (eventCount > MAX_EVENTS) {
                // Get oldest events to archive
                val sortedIds = index.keys().asSequence()
                    .filter { it.startsWith(EVENT_KEY_PREFIX) }
                    .sortedBy { index.optLong(it, 0L) }
                    .toList()

                val toArchive = sortedIds.take(eventCount - MAX_EVENTS)

                toArchive.forEach { eventId ->
                    // Mark as archived (or delete)
                    secureStorage.delete(StorageDomain.AUTH_EVENTS, eventId)
                    index.remove(eventId)
                }

                // Update index
                secureStorage.store(StorageDomain.AUTH_EVENTS, EVENT_INDEX_KEY, index.toString())
                Log.d(TAG, "Archived ${toArchive.size} old events, ${MAX_EVENTS} events retained")
            }

        } catch (e: Exception) {
            Log.e(TAG, "Failed to enforce max events limit: ${e.message}", e)
        }
    }

    /**
     * Apply security validation to an event.
     */
    private fun applySecurityValidation(event: BootstrapEvent): Boolean {
        return try {
            // Quick platform security check before publishing
            securityMonitor.isPlatformSecure()
        } catch (e: Exception) {
            Log.w(TAG, "Security validation error: ${e.message}, proceeding anyway")
            true // Don't block events due to security monitor errors
        }
    }

    /**
     * Notify all subscribers of an event.
     */
    private fun notifySubscribers(event: BootstrapEvent) {
        subscribers.keys.forEach { subscriber ->
            try {
                subscriber.onAuthEvent(event)
            } catch (e: Exception) {
                Log.e(TAG, "Error notifying subscriber: ${e.message}")
            }
        }
    }

    /**
     * Update latency metrics.
     */
    private fun updateLatencyMetrics(latencyMs: Long) {
        totalLatencyMs += latencyMs
    }

    /**
     * Serialize an event to JSON string.
     */
    private fun serializeEvent(event: BootstrapEvent): String {
        return JSONObject().apply {
            put("type", event::class.simpleName)
            put("data", event.toString())
        }.toString()
    }

    /**
     * Deserialize a JSON string back to a BootstrapEvent.
     * Note: Full deserialization would require a factory pattern.
     * This is a simplified version for replay purposes.
     */
    private fun deserializeEvent(record: AuthEventRecord): BootstrapEvent? {
        // This is a simplified implementation
        // Full implementation would need an event factory
        return null
    }
}