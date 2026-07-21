package ke.ac.mku.authcore.contracts.event

/**
 * IEventPublisher - CORE-012
 *
 * Contract for the EventBus system.
 * All event publishing goes through this interface.
 */
interface IEventPublisher {
    /**
     * Subscribe to events.
     */
    fun subscribe(subscriber: Any)

    /**
     * Unsubscribe from events.
     */
    fun unsubscribe(subscriber: Any)

    /**
     * Publish an event to all subscribers.
     */
    fun publish(event: Any)

    /**
     * Clear all subscriptions.
     */
    fun clear()

    /**
     * Get the number of active subscribers.
     */
    val observerCount: Int
}