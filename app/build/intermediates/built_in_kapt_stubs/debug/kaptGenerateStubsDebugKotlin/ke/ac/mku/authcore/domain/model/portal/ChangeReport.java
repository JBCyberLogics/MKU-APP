package ke.ac.mku.authcore.domain.model.portal;

/**
 * PortalChangeModels - PORTAL-005
 *
 * Models for portal evolution detection and compatibility analysis.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\nH\u00c6\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lke/ac/mku/authcore/domain/model/portal/ChangeReport;", "", "monitorId", "", "timestamp", "", "changes", "", "Lke/ac/mku/authcore/domain/model/portal/PortalChange;", "overallImpact", "Lke/ac/mku/authcore/domain/model/portal/ChangeSeverity;", "<init>", "(Ljava/lang/String;JLjava/util/List;Lke/ac/mku/authcore/domain/model/portal/ChangeSeverity;)V", "getMonitorId", "()Ljava/lang/String;", "getTimestamp", "()J", "getChanges", "()Ljava/util/List;", "getOverallImpact", "()Lke/ac/mku/authcore/domain/model/portal/ChangeSeverity;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
public final class ChangeReport {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String monitorId = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalChange> changes = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.ChangeSeverity overallImpact = null;
    
    public ChangeReport(@org.jetbrains.annotations.NotNull()
    java.lang.String monitorId, long timestamp, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalChange> changes, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ChangeSeverity overallImpact) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonitorId() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalChange> getChanges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ChangeSeverity getOverallImpact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalChange> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ChangeSeverity component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ChangeReport copy(@org.jetbrains.annotations.NotNull()
    java.lang.String monitorId, long timestamp, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalChange> changes, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ChangeSeverity overallImpact) {
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