package ke.ac.mku.authcore.registry;

import ke.ac.mku.authcore.config.ConfigManager;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/registry/SecurityLevel;", "", "(Ljava/lang/String;I)V", "MINIMAL", "STANDARD", "STRICT", "app_debug"})
public enum SecurityLevel {
    /*public static final*/ MINIMAL /* = new MINIMAL() */,
    /*public static final*/ STANDARD /* = new STANDARD() */,
    /*public static final*/ STRICT /* = new STRICT() */;
    
    SecurityLevel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.registry.SecurityLevel> getEntries() {
        return null;
    }
}