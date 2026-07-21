package ke.ac.mku.authcore.config;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/config/ConfigManager;", "Lke/ac/mku/authcore/config/AbstractObservable;", "<init>", "()V", "_config", "Lke/ac/mku/authcore/config/ConfigModel;", "config", "getConfig", "()Lke/ac/mku/authcore/config/ConfigModel;", "isLoaded", "", "()Z", "load", "validate", "", "createProductionConfig", "app"})
public final class ConfigManager extends ke.ac.mku.authcore.config.AbstractObservable {
    @org.jetbrains.annotations.Nullable()
    private ke.ac.mku.authcore.config.ConfigModel _config;
    
    public ConfigManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.config.ConfigModel getConfig() {
        return null;
    }
    
    public final boolean isLoaded() {
        return false;
    }
    
    public final boolean load() {
        return false;
    }
    
    private final void validate() {
    }
    
    private final ke.ac.mku.authcore.config.ConfigModel createProductionConfig() {
        return null;
    }
}