package ke.ac.mku.authcore.contracts.security;

/**
 * AuditFilter - SECURITY-005
 *
 * Filter criteria for querying audit records.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003JT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u000bH\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006#"}, d2 = {"Lke/ac/mku/authcore/contracts/security/AuditFilter;", "", "startTime", "", "endTime", "levels", "", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "categories", "Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "limit", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Set;Ljava/util/Set;I)V", "getCategories", "()Ljava/util/Set;", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLevels", "getLimit", "()I", "getStartTime", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Set;Ljava/util/Set;I)Lke/ac/mku/authcore/contracts/security/AuditFilter;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class AuditFilter {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long startTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long endTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<ke.ac.mku.authcore.contracts.security.RiskLevel> levels = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<ke.ac.mku.authcore.contracts.security.ThreatCategory> categories = null;
    private final int limit = 0;
    
    public AuditFilter(@org.jetbrains.annotations.Nullable()
    java.lang.Long startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long endTime, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends ke.ac.mku.authcore.contracts.security.RiskLevel> levels, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends ke.ac.mku.authcore.contracts.security.ThreatCategory> categories, int limit) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEndTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<ke.ac.mku.authcore.contracts.security.RiskLevel> getLevels() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<ke.ac.mku.authcore.contracts.security.ThreatCategory> getCategories() {
        return null;
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public AuditFilter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<ke.ac.mku.authcore.contracts.security.RiskLevel> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<ke.ac.mku.authcore.contracts.security.ThreatCategory> component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.AuditFilter copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long endTime, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends ke.ac.mku.authcore.contracts.security.RiskLevel> levels, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends ke.ac.mku.authcore.contracts.security.ThreatCategory> categories, int limit) {
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