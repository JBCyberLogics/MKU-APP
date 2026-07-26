package ke.ac.mku.authcore.bootstrap

import java.util.concurrent.CopyOnWriteArrayList
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventBus @Inject constructor() {

    private val observers = CopyOnWriteArrayList<BootstrapObserver>()
    
    // AUTH-TXN-001: Event Queuing logic
    private var isQueuingEnabled = false
    private val eventQueue = CopyOnWriteArrayList<BootstrapEvent>()
    private val eventsToQueue = setOf(
        "SessionValidationStarted",
        "SessionValidationFailed",
        "SessionRecoveryStarted",
        "SessionRecoveryFailed",
        "CookieValidationStarted",
        "CookieValidationFailed"
    )

    fun subscribe(observer: BootstrapObserver) {
        observers.add(observer)
    }

    fun unsubscribe(observer: BootstrapObserver) {
        observers.remove(observer)
    }

    /**
     * Set queuing state for the event bus.
     * When enabled, specific events will be buffered until disabled.
     */
    fun setQueuing(enabled: Boolean) {
        isQueuingEnabled = enabled
        if (!enabled) {
            releaseQueuedEvents()
        }
    }

    fun publish(event: BootstrapEvent) {
        if (isQueuingEnabled && shouldQueueEvent(event)) {
            android.util.Log.d("EventBus", "Queuing event: ${event.javaClass.simpleName}")
            eventQueue.add(event)
            return
        }

        observers.forEach { observer ->
            try {
                observer.onBootstrapEvent(event)
            } catch (e: Exception) {
                // Log but don't crash
                android.util.Log.e("EventBus", "Error notifying observer: ${e.message}")
            }
        }
    }

    private fun shouldQueueEvent(event: BootstrapEvent): Boolean {
        return eventsToQueue.contains(event.javaClass.simpleName)
    }

    private fun releaseQueuedEvents() {
        android.util.Log.d("EventBus", "Releasing ${eventQueue.size} queued events")
        val events = eventQueue.toList()
        eventQueue.clear()
        
        events.forEach { publish(it) }
    }

    fun clear() {
        observers.clear()
        eventQueue.clear()
    }

    val observerCount: Int
        get() = observers.size
}

interface BootstrapObserver {
    fun onBootstrapEvent(event: BootstrapEvent)
}