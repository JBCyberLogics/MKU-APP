package ke.ac.mku.authcore.bootstrap;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00ca\u0001\u0002\b\u0015\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/EventBus;", "", "<init>", "()V", "Ljavax/inject/Inject;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "subscribe", "", "observer", "unsubscribe", "publish", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "clear", "observerCount", "", "getObserverCount", "()I", "app", "Ljavax/inject/Singleton;"})
public final class EventBus {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<ke.ac.mku.authcore.bootstrap.BootstrapObserver> observers = null;
    
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
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    public final void clear() {
    }
    
    public final int getObserverCount() {
        return 0;
    }
}