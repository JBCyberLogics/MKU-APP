package ke.ac.mku.authcore.security.audit

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.concurrent.CopyOnWriteArrayList
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SecurityAuditLogger - SECURITY-001
 *
 * Logs security events for auditing purposes.
 * Stores events in memory with optional persistence capability.
 */
@Singleton
class SecurityAuditLogger @Inject constructor(
    @ApplicationContext private val context: Context
) {
    companion object {
        private const val TAG = "SecurityAuditLogger"
        private const val MAX_EVENTS_IN_MEMORY = 1000
    }

    private val _events = MutableStateFlow<List<SecurityEvent>>(emptyList())
    val events: StateFlow<List<SecurityEvent>> = _events.asStateFlow()

    private val eventList = CopyOnWriteArrayList<SecurityEvent>()

    /**
     * Log a security event.
     */
    fun logSecurityEvent(event: SecurityEvent) {
        eventList.add(event)

        // Trim if exceeds max
        while (eventList.size > MAX_EVENTS_IN_MEMORY) {
            eventList.removeAt(0)
        }

        // Update state
        _events.value = eventList.toList()

        // Log to Android log
        when (event) {
            is SecurityEvent.ThreatDetected -> {
                Log.w(TAG, "THREAT: ${event.threatType} (${event.threatLevel}): ${event.description}")
            }
            is SecurityEvent.ThreatBlocked -> {
                Log.e(TAG, "THREAT BLOCKED: ${event.threatType} - ${event.action}")
            }
            is SecurityEvent.SessionValidationFailed -> {
                Log.w(TAG, "SESSION VALIDATION FAILED: ${event.regNumber} - ${event.reason}")
            }
            is SecurityEvent.SecurityError -> {
                Log.e(TAG, "SECURITY ERROR: ${event.error}")
            }
            is SecurityEvent.SecurityWarning -> {
                Log.w(TAG, "SECURITY WARNING: ${event.warning}")
            }
            else -> {
                Log.d(TAG, "SECURITY EVENT: ${event::class.simpleName}")
            }
        }
    }

    /**
     * Get all logged events.
     */
    fun getEvents(): List<SecurityEvent> = eventList.toList()

    /**
     * Get events by type.
     */
    fun getEventsByType(eventType: Class<out SecurityEvent>): List<SecurityEvent> {
        return eventList.filter { eventType.isInstance(it) }
    }

    /**
     * Get events within a time range.
     */
    fun getEventsInRange(startTime: Long, endTime: Long): List<SecurityEvent> {
        return eventList.filter { it.timestamp in startTime..endTime }
    }

    /**
     * Get recent events.
     */
    fun getRecentEvents(count: Int): List<SecurityEvent> {
        return eventList.takeLast(count).reversed()
    }

    /**
     * Get session-related events.
     */
    fun getSessionEvents(): List<SecurityEvent> {
        return eventList.filter {
            it is SecurityEvent.SessionCreated ||
            it is SecurityEvent.SessionAccessed ||
            it is SecurityEvent.SessionDestroyed ||
            it is SecurityEvent.SessionValidationFailed
        }
    }

    /**
     * Get threat-related events.
     */
    fun getThreatEvents(): List<SecurityEvent> {
        return eventList.filter {
            it is SecurityEvent.ThreatDetected ||
            it is SecurityEvent.ThreatBlocked
        }
    }

    /**
     * Clear all events.
     */
    fun clearEvents() {
        eventList.clear()
        _events.value = emptyList()
    }

    /**
     * Get event count.
     */
    fun getEventCount(): Int = eventList.size

    /**
     * Check if there are any critical security events.
     */
    fun hasCriticalEvents(): Boolean {
        return eventList.any {
            it is SecurityEvent.ThreatBlocked ||
            it is SecurityEvent.SecurityError
        }
    }

    /**
     * Get security summary for debugging.
     */
    fun getSecuritySummary(): SecuritySummary {
        val sessionEvents = getSessionEvents()
        val threatEvents = getThreatEvents()

        return SecuritySummary(
            totalEvents = eventList.size,
            sessionEvents = sessionEvents.size,
            threatEvents = threatEvents.size,
            criticalEvents = eventList.count { it is SecurityEvent.ThreatBlocked },
            lastSessionCreated = sessionEvents.filterIsInstance<SecurityEvent.SessionCreated>().lastOrNull(),
            lastThreat = threatEvents.filterIsInstance<SecurityEvent.ThreatDetected>().lastOrNull()
        )
    }
}

/**
 * Summary of security events.
 */
data class SecuritySummary(
    val totalEvents: Int,
    val sessionEvents: Int,
    val threatEvents: Int,
    val criticalEvents: Int,
    val lastSessionCreated: SecurityEvent.SessionCreated?,
    val lastThreat: SecurityEvent.ThreatDetected?
)