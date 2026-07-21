package ke.ac.mku.authcore.config;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lke/ac/mku/authcore/config/ConfigurationEvent;", "", "<init>", "()V", "ConfigurationLoaded", "ConfigurationValidated", "ConfigurationFailed", "ConfigurationUpdated", "Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationFailed;", "Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationUpdated;", "Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationValidated;", "app"})
public abstract class ConfigurationEvent {
    
    private ConfigurationEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationFailed;", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ConfigurationFailed extends ke.ac.mku.authcore.config.ConfigurationEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public ConfigurationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.config.ConfigurationEvent.ConfigurationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "<init>", "()V", "app"})
    public static final class ConfigurationLoaded extends ke.ac.mku.authcore.config.ConfigurationEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.config.ConfigurationEvent.ConfigurationLoaded INSTANCE = null;
        
        private ConfigurationLoaded() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationUpdated;", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "<init>", "()V", "app"})
    public static final class ConfigurationUpdated extends ke.ac.mku.authcore.config.ConfigurationEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.config.ConfigurationEvent.ConfigurationUpdated INSTANCE = null;
        
        private ConfigurationUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/config/ConfigurationEvent$ConfigurationValidated;", "Lke/ac/mku/authcore/config/ConfigurationEvent;", "<init>", "()V", "app"})
    public static final class ConfigurationValidated extends ke.ac.mku.authcore.config.ConfigurationEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.config.ConfigurationEvent.ConfigurationValidated INSTANCE = null;
        
        private ConfigurationValidated() {
        }
    }
}