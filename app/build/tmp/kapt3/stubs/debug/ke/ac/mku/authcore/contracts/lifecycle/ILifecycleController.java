package ke.ac.mku.authcore.contracts.lifecycle;

import ke.ac.mku.authcore.lifecycle.LifecycleEvent;
import ke.ac.mku.authcore.lifecycle.LifecycleState;
import ke.ac.mku.authcore.lifecycle.ServiceLifecycle;

/**
 * ILifecycleController - CORE-012
 *
 * Contract for LifecycleManager.
 * Controls service lifecycle operations.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\bH&J\b\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\bH&J\b\u0010\u0016\u001a\u00020\bH&J\b\u0010\u0017\u001a\u00020\bH&J\b\u0010\u0018\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/contracts/lifecycle/ILifecycleController;", "", "serviceExecutionOrder", "", "", "getServiceExecutionOrder", "()Ljava/util/List;", "addLifecycleListener", "", "listener", "Lke/ac/mku/authcore/contracts/lifecycle/LifecycleListener;", "getAllLifecycles", "", "Lke/ac/mku/authcore/lifecycle/ServiceLifecycle;", "getServiceState", "Lke/ac/mku/authcore/lifecycle/LifecycleState;", "serviceName", "initializeServices", "pauseServices", "removeLifecycleListener", "restartServices", "resumeServices", "shutdownAll", "startServices", "stopServices", "app_debug"})
public abstract interface ILifecycleController {
    
    /**
     * Service execution order.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getServiceExecutionOrder();
    
    /**
     * Initialize all services.
     */
    public abstract void initializeServices();
    
    /**
     * Start all services.
     */
    public abstract void startServices();
    
    /**
     * Pause all services.
     */
    public abstract void pauseServices();
    
    /**
     * Resume all services.
     */
    public abstract void resumeServices();
    
    /**
     * Stop all services.
     */
    public abstract void stopServices();
    
    /**
     * Restart all services.
     */
    public abstract void restartServices();
    
    /**
     * Shutdown all services.
     */
    public abstract void shutdownAll();
    
    /**
     * Get the state of a service.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.lifecycle.LifecycleState getServiceState(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName);
    
    /**
     * Get all service lifecycles.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, ke.ac.mku.authcore.lifecycle.ServiceLifecycle> getAllLifecycles();
    
    /**
     * Add a lifecycle listener.
     */
    public abstract void addLifecycleListener(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.lifecycle.LifecycleListener listener);
    
    /**
     * Remove a lifecycle listener.
     */
    public abstract void removeLifecycleListener(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.lifecycle.LifecycleListener listener);
}