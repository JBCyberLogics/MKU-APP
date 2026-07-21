package ke.ac.mku.authcore.contracts.authentication;

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
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "", "publish", "", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "subscribe", "subscriber", "Lke/ac/mku/authcore/contracts/authentication/AuthEventSubscriber;", "unsubscribe", "replayEvents", "", "filter", "Lke/ac/mku/authcore/contracts/authentication/EventFilter;", "limit", "", "clearEvents", "getEventHistory", "Lke/ac/mku/authcore/contracts/authentication/AuthEventRecord;", "offset", "getMetrics", "Lke/ac/mku/authcore/contracts/authentication/AuthEventMetrics;", "app"})
public abstract interface IAuthenticationEventManager {
    
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
    public abstract void publish(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event);
    
    /**
     * Subscribe to authentication events.
     *
     * The subscriber will be notified of all events that pass through
     * the event gateway after processing.
     *
     * @param subscriber The subscriber to register
     */
    public abstract void subscribe(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.AuthEventSubscriber subscriber);
    
    /**
     * Unsubscribe from authentication events.
     *
     * @param subscriber The subscriber to remove
     */
    public abstract void unsubscribe(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.AuthEventSubscriber subscriber);
    
    /**
     * Replay stored authentication events.
     *
     * Useful for event sourcing, debugging, and recovery scenarios.
     *
     * @param filter Optional filter criteria (null for all events)
     * @param limit Maximum number of events to return
     * @return List of BootstrapEvent objects in chronological order
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.bootstrap.BootstrapEvent> replayEvents(@org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.contracts.authentication.EventFilter filter, int limit);
    
    /**
     * Clear all stored authentication events.
     *
     * Use with caution - this is typically only used for testing
     * or when a complete reset is required.
     */
    public abstract void clearEvents();
    
    /**
     * Get authentication event history with pagination.
     *
     * @param filter Optional filter criteria (null for all events)
     * @param limit Maximum number of events to return
     * @param offset Number of events to skip
     * @return List of AuthEventRecord objects
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.authentication.AuthEventRecord> getEventHistory(@org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.contracts.authentication.EventFilter filter, int limit, int offset);
    
    /**
     * Get event processing metrics.
     *
     * @return AuthEventMetrics with current statistics
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.authentication.AuthEventMetrics getMetrics();
}