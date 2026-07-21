package ke.ac.mku.authcore.config;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0010\u00a8\u0006\u000f"}, d2 = {"Lke/ac/mku/authcore/config/HealthMonitor;", "Lke/ac/mku/authcore/config/Observer;", "configManager", "Lke/ac/mku/authcore/config/ConfigManager;", "<init>", "(Lke/ac/mku/authcore/config/ConfigManager;)V", "Ljavax/inject/Inject;", "isHealthy", "", "performStartupValidation", "Lke/ac/mku/authcore/config/HealthReport;", "onConfigurationEvent", "", "event", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "app", "Ljavax/inject/Singleton;"})
public final class HealthMonitor implements ke.ac.mku.authcore.config.Observer {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.config.ConfigManager configManager = null;
    private boolean isHealthy = false;
    
    @javax.inject.Inject()
    public HealthMonitor(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.ConfigManager configManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.config.HealthReport performStartupValidation() {
        return null;
    }
    
    @java.lang.Override()
    public void onConfigurationEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.ConfigurationEvent event) {
    }
    
    public final boolean isHealthy() {
        return false;
    }
}