package ke.ac.mku.authcore.config;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0004R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/config/AbstractObservable;", "Lke/ac/mku/authcore/config/Observable;", "<init>", "()V", "observers", "", "Lke/ac/mku/authcore/config/Observer;", "addObserver", "", "observer", "removeObserver", "notifyObservers", "event", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "app"})
public abstract class AbstractObservable implements ke.ac.mku.authcore.config.Observable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.config.Observer> observers = null;
    
    public AbstractObservable() {
        super();
    }
    
    @java.lang.Override()
    public void addObserver(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.Observer observer) {
    }
    
    @java.lang.Override()
    public void removeObserver(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.Observer observer) {
    }
    
    protected final void notifyObservers(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.ConfigurationEvent event) {
    }
}