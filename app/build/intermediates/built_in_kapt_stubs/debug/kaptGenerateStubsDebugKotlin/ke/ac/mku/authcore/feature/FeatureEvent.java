package ke.ac.mku.authcore.feature;

/**
 * Internal feature events (not published through EventBus).
 * Used for internal FeatureRegistry tracking and listener notifications.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent;", "", "<init>", "()V", "FeatureRegistered", "FeatureEnabled", "FeatureDisabled", "FeatureUpdated", "FeatureValidationFailed", "FeatureRegistryReady", "AllFeaturesDiscovered", "Lke/ac/mku/authcore/feature/FeatureEvent$AllFeaturesDiscovered;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureDisabled;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureEnabled;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureRegistered;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureUpdated;", "Lke/ac/mku/authcore/feature/FeatureEvent$FeatureValidationFailed;", "app"})
public abstract class FeatureEvent {
    
    private FeatureEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$AllFeaturesDiscovered;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "<init>", "()V", "app"})
    public static final class AllFeaturesDiscovered extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.feature.FeatureEvent.AllFeaturesDiscovered INSTANCE = null;
        
        private AllFeaturesDiscovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureDisabled;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureDisabled extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureDisabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.feature.FeatureEvent.FeatureDisabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureEnabled;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureEnabled extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureEnabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.feature.FeatureEvent.FeatureEnabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureRegistered;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureRegistered extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.feature.FeatureEvent.FeatureRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "<init>", "()V", "app"})
    public static final class FeatureRegistryReady extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.feature.FeatureEvent.FeatureRegistryReady INSTANCE = null;
        
        private FeatureRegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureUpdated;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureUpdated extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureUpdated(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.feature.FeatureEvent.FeatureUpdated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/feature/FeatureEvent$FeatureValidationFailed;", "Lke/ac/mku/authcore/feature/FeatureEvent;", "featureId", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureValidationFailed extends ke.ac.mku.authcore.feature.FeatureEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public FeatureValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.feature.FeatureEvent.FeatureValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
}