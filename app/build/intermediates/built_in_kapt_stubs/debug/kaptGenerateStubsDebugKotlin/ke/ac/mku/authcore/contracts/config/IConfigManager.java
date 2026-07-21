package ke.ac.mku.authcore.contracts.config;

/**
 * IConfigManager - CORE-012
 *
 * Contract for ConfigManager.
 * Configuration loading and access.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/config/IConfigManager;", "", "config", "Lke/ac/mku/authcore/config/ConfigModel;", "getConfig", "()Lke/ac/mku/authcore/config/ConfigModel;", "isLoaded", "", "()Z", "load", "reload", "app"})
public abstract interface IConfigManager {
    
    /**
     * The loaded configuration model.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.config.ConfigModel getConfig();
    
    /**
     * Whether configuration is loaded.
     */
    public abstract boolean isLoaded();
    
    /**
     * Load configuration.
     */
    public abstract boolean load();
    
    /**
     * Reload configuration.
     */
    public abstract boolean reload();
}