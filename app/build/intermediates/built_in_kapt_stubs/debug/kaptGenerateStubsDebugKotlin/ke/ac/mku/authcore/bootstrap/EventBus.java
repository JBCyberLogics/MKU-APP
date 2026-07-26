package ke.ac.mku.authcore.bootstrap;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00ca\u0001\u0002\b\u001f\u00a8\u0006\u001e"}, d2 = {"Lke/ac/mku/authcore/bootstrap/EventBus;", "", "<init>", "()V", "Ljavax/inject/Inject;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "isQueuingEnabled", "", "eventQueue", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "eventsToQueue", "", "", "subscribe", "", "observer", "unsubscribe", "setQueuing", "enabled", "publish", "event", "shouldQueueEvent", "releaseQueuedEvents", "clear", "observerCount", "", "getObserverCount", "()I", "app", "Ljavax/inject/Singleton;"})
public final class EventBus {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<ke.ac.mku.authcore.bootstrap.BootstrapObserver> observers = null;
    private boolean isQueuingEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<ke.ac.mku.authcore.bootstrap.BootstrapEvent> eventQueue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> eventsToQueue = null;
    
    @javax.inject.Inject()
    public EventBus() {
        super();
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapObserver observer) {
    }
    
    public final void unsubscribe(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapObserver observer) {
    }
    
    /**
     * Set queuing state for the event bus.
     * When enabled, specific events will be buffered until disabled.
     */
    public final void setQueuing(boolean enabled) {
    }
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    private final boolean shouldQueueEvent(ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
        return false;
    }
    
    private final void releaseQueuedEvents() {
    }
    
    public final void clear() {
    }
    
    public final int getObserverCount() {
        return 0;
    }
}