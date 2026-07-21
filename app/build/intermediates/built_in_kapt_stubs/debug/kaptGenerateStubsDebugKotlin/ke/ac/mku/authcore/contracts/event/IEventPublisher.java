package ke.ac.mku.authcore.contracts.event;

/**
 * IEventPublisher - CORE-012
 *
 * Contract for the EventBus system.
 * All event publishing goes through this interface.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H&J\b\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/event/IEventPublisher;", "", "subscribe", "", "subscriber", "unsubscribe", "publish", "event", "clear", "observerCount", "", "getObserverCount", "()I", "app"})
public abstract interface IEventPublisher {
    
    /**
     * Subscribe to events.
     */
    public abstract void subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.Object subscriber);
    
    /**
     * Unsubscribe from events.
     */
    public abstract void unsubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.Object subscriber);
    
    /**
     * Publish an event to all subscribers.
     */
    public abstract void publish(@org.jetbrains.annotations.NotNull()
    java.lang.Object event);
    
    /**
     * Clear all subscriptions.
     */
    public abstract void clear();
    
    /**
     * Get the number of active subscribers.
     */
    public abstract int getObserverCount();
}