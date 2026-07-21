package ke.ac.mku.authcore.security.detection;

/**
 * Result of a threat assessment.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatAssessment;", "", "level", "Lke/ac/mku/authcore/security/detection/ThreatLevel;", "threats", "", "Lke/ac/mku/authcore/security/detection/Threat;", "isDeviceCompromised", "", "timestamp", "", "<init>", "(Lke/ac/mku/authcore/security/detection/ThreatLevel;Ljava/util/List;ZJ)V", "getLevel", "()Lke/ac/mku/authcore/security/detection/ThreatLevel;", "getThreats", "()Ljava/util/List;", "()Z", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "app"})
public final class ThreatAssessment {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.security.detection.ThreatLevel level = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.security.detection.Threat> threats = null;
    private final boolean isDeviceCompromised = false;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.security.detection.ThreatAssessment.Companion Companion = null;
    
    public ThreatAssessment(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.detection.ThreatLevel level, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.security.detection.Threat> threats, boolean isDeviceCompromised, long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatLevel getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.security.detection.Threat> getThreats() {
        return null;
    }
    
    public final boolean isDeviceCompromised() {
        return false;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatLevel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.security.detection.Threat> component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatAssessment copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.detection.ThreatLevel level, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.security.detection.Threat> threats, boolean isDeviceCompromised, long timestamp) {
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
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/security/detection/ThreatAssessment$Companion;", "", "<init>", "()V", "safe", "Lke/ac/mku/authcore/security/detection/ThreatAssessment;", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.security.detection.ThreatAssessment safe() {
            return null;
        }
    }
}