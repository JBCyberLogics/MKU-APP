package ke.ac.mku.authcore.bootstrap;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/EventBus;", "", "()V", "observerCount", "", "getObserverCount", "()I", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "clear", "", "publish", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "subscribe", "observer", "unsubscribe", "app_debug"})
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