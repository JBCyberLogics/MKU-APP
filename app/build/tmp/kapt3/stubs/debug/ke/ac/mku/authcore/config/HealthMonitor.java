package ke.ac.mku.authcore.config;

import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/config/HealthMonitor;", "Lke/ac/mku/authcore/config/Observer;", "configManager", "Lke/ac/mku/authcore/config/ConfigManager;", "(Lke/ac/mku/authcore/config/ConfigManager;)V", "isHealthy", "", "onConfigurationEvent", "", "event", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "performStartupValidation", "Lke/ac/mku/authcore/config/HealthReport;", "app_debug"})
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